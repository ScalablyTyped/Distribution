package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BASIC
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS1
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS2
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS3
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS4
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS4C
import typings.consumerDataStandards.consumerDataStandardsStrings.COMMS4D
import typings.consumerDataStandards.consumerDataStandardsStrings.CURRENT
import typings.consumerDataStandards.consumerDataStandardsStrings.DISCONNECTED
import typings.consumerDataStandards.consumerDataStandardsStrings.MRAM
import typings.consumerDataStandards.consumerDataStandardsStrings.MRIM
import typings.consumerDataStandards.consumerDataStandardsStrings.NCOLNUML
import typings.consumerDataStandards.consumerDataStandardsStrings.PROF
import typings.consumerDataStandards.consumerDataStandardsStrings.SAMPLE
import typings.consumerDataStandards.consumerDataStandardsStrings.UMCP
import typings.consumerDataStandards.consumerDataStandardsStrings.VICAMI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The metering Installation type code indicates whether the metering installation has to be manually read. Note the details of enumeration values below: <ul><li>**BASIC** - Accumulation Meter – Type 6</li><li>**COMMS1** - Interval Meter with communications – Type 1</li><li>**COMMS2** - Interval Meter with communications – Type 2</li><li>**COMMS3** - Interval Meter with communications – Type 3</li><li>**COMMS4** - Interval Meter with communications – Type 4</li><li>**COMMS4C** - CT connected metering installation that meets the minimum services specifications</li><li>**COMMS4D** - Whole current metering installation that meets the minimum services specifications</li><li>**MRAM** - Small customer metering installation – Type 4A</li><li>**MRIM** - Manually Read Interval Meter – Type 5</li><li>**UMCP** - Unmetered Supply – Type 7</li><li>**VICAMI** - A relevant metering installation as defined in clause 9.9C of the NER</li><li>**NCONUML** - Non-contestable unmeter load - Introduced as part of Global Settlement</li></ul>
    */
  var installationType: BASIC | COMMS1 | COMMS2 | COMMS3 | COMMS4 | COMMS4C | COMMS4D | MRAM | MRIM | PROF | SAMPLE | UMCP | VICAMI | NCOLNUML
  
  /**
    * Free text field to identify the manufacturer of the installed meter
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * Free text field to identify the meter manufacturer’s designation for the meter model
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * This date is the next scheduled meter read date (NSRD) if a manual Meter Reading is required
    */
  var nextScheduledReadDate: js.UndefOr[String] = js.undefined
  
  /**
    * Code to denote the method and frequency of Meter Reading. The value is formatted as follows: <ul><li>First Character = Remote (R) or Manual (M)</li><li>Second Character = Mode: T = telephone W = wireless P = powerline I = infra-red G = galvanic V = visual </li><li>Third Character = Frequency of Scheduled Meter Readings: 1 = Twelve times per year 2 = Six times per year 3 = Four times per year D = Daily or weekly</li><li>Optional Fourth Character = to identify what interval length the meter is capable of reading. This includes five, 15 and 30 minute granularity as the following: A – 5 minute B – 15 minute C – 30 minute D – Cannot convert to 5 minute (i.e. due to metering installation de-energised) M - Manually Read Accumulation Meter</li></ul> For example, <ul><li>MV3 = Manual, Visual, Quarterly</li> <li>MV3M = Manual, Visual, Quarterly, Manually Read Accumulation Meter</li> <li>RWDC = Remote, Wireless, Daily, 30 minutes interval</li></ul>
    */
  var readType: js.UndefOr[String] = js.undefined
  
  /**
    * A code to denote the status of the meter. Note the details of enumeration values below: <ul><li>**CURRENT** -Applies when a meter is current and not disconnected</li><li>**DISCONNECTED** - Applies when a meter is present but has been remotely disconnected</li></ul>
    */
  var status: CURRENT | DISCONNECTED
}
object InstallationType {
  
  inline def apply(
    installationType: BASIC | COMMS1 | COMMS2 | COMMS3 | COMMS4 | COMMS4C | COMMS4D | MRAM | MRIM | PROF | SAMPLE | UMCP | VICAMI | NCOLNUML,
    status: CURRENT | DISCONNECTED
  ): InstallationType = {
    val __obj = js.Dynamic.literal(installationType = installationType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationType]
  }
  
  extension [Self <: InstallationType](x: Self) {
    
    inline def setInstallationType(
      value: BASIC | COMMS1 | COMMS2 | COMMS3 | COMMS4 | COMMS4C | COMMS4D | MRAM | MRIM | PROF | SAMPLE | UMCP | VICAMI | NCOLNUML
    ): Self = StObject.set(x, "installationType", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNextScheduledReadDate(value: String): Self = StObject.set(x, "nextScheduledReadDate", value.asInstanceOf[js.Any])
    
    inline def setNextScheduledReadDateUndefined: Self = StObject.set(x, "nextScheduledReadDate", js.undefined)
    
    inline def setReadType(value: String): Self = StObject.set(x, "readType", value.asInstanceOf[js.Any])
    
    inline def setReadTypeUndefined: Self = StObject.set(x, "readType", js.undefined)
    
    inline def setStatus(value: CURRENT | DISCONNECTED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
