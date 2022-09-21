package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.basicRead
import typings.consumerDataStandards.consumerDataStandardsStrings.intervalRead
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicRead
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Mandatory if readUType is set to basicRead
    */
  var basicRead: js.UndefOr[Quality | Null] = js.undefined
  
  /**
    * Indicates whether the energy recorded by this register is created under a Controlled Load regime
    */
  var controlledLoad: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mandatory if readUType is set to intervalRead
    */
  var intervalRead: js.UndefOr[AggregateValue | Null] = js.undefined
  
  /**
    * Meter id/serial number as it appears in customer’s bill. ID permanence rules do not apply.
    */
  var meterID: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date time when the meter reads end.  If absent then assumed to be equal to readStartDate.  In this case the entry represents data for a single date specified by readStartDate
    */
  var readEndDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date time when the meter reads start
    */
  var readStartDate: String
  
  /**
    * Specify the type of the meter read data
    */
  var readUType: basicRead | intervalRead
  
  /**
    * Register ID of the meter register where the meter reads are obtained
    */
  var registerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Register suffix of the meter register where the meter reads are obtained
    */
  var registerSuffix: String
  
  /**
    * The independent ID of the service point, known in the industry as the National Meter Identifier (NMI). Note that the servicePointId will be replaced with NMI for all interactions between Data Holder and AEMO.
    */
  var servicePointId: String
  
  /**
    * Unit of measure of the meter reads. Refer to Appendix B of <a href='https://www.aemo.com.au/-/media/files/stakeholder_consultation/consultations/nem-consultations/2019/5ms-metering-package-2/final-determination/mdff-specification-nem12-nem13-v21-final-determination-clean.pdf?la=en&hash=03FCBA0D60E091DE00F2361AE76206EA'>MDFF Specification NEM12 NEM13 v2.1</a> for a list of possible values
    */
  var unitOfMeasure: js.UndefOr[String | Null] = js.undefined
}
object BasicRead {
  
  inline def apply(
    readStartDate: String,
    readUType: basicRead | intervalRead,
    registerSuffix: String,
    servicePointId: String
  ): BasicRead = {
    val __obj = js.Dynamic.literal(readStartDate = readStartDate.asInstanceOf[js.Any], readUType = readUType.asInstanceOf[js.Any], registerSuffix = registerSuffix.asInstanceOf[js.Any], servicePointId = servicePointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicRead]
  }
  
  extension [Self <: BasicRead](x: Self) {
    
    inline def setBasicRead(value: Quality): Self = StObject.set(x, "basicRead", value.asInstanceOf[js.Any])
    
    inline def setBasicReadNull: Self = StObject.set(x, "basicRead", null)
    
    inline def setBasicReadUndefined: Self = StObject.set(x, "basicRead", js.undefined)
    
    inline def setControlledLoad(value: Boolean): Self = StObject.set(x, "controlledLoad", value.asInstanceOf[js.Any])
    
    inline def setControlledLoadNull: Self = StObject.set(x, "controlledLoad", null)
    
    inline def setControlledLoadUndefined: Self = StObject.set(x, "controlledLoad", js.undefined)
    
    inline def setIntervalRead(value: AggregateValue): Self = StObject.set(x, "intervalRead", value.asInstanceOf[js.Any])
    
    inline def setIntervalReadNull: Self = StObject.set(x, "intervalRead", null)
    
    inline def setIntervalReadUndefined: Self = StObject.set(x, "intervalRead", js.undefined)
    
    inline def setMeterID(value: String): Self = StObject.set(x, "meterID", value.asInstanceOf[js.Any])
    
    inline def setMeterIDNull: Self = StObject.set(x, "meterID", null)
    
    inline def setMeterIDUndefined: Self = StObject.set(x, "meterID", js.undefined)
    
    inline def setReadEndDate(value: String): Self = StObject.set(x, "readEndDate", value.asInstanceOf[js.Any])
    
    inline def setReadEndDateNull: Self = StObject.set(x, "readEndDate", null)
    
    inline def setReadEndDateUndefined: Self = StObject.set(x, "readEndDate", js.undefined)
    
    inline def setReadStartDate(value: String): Self = StObject.set(x, "readStartDate", value.asInstanceOf[js.Any])
    
    inline def setReadUType(value: basicRead | intervalRead): Self = StObject.set(x, "readUType", value.asInstanceOf[js.Any])
    
    inline def setRegisterId(value: String): Self = StObject.set(x, "registerId", value.asInstanceOf[js.Any])
    
    inline def setRegisterIdNull: Self = StObject.set(x, "registerId", null)
    
    inline def setRegisterIdUndefined: Self = StObject.set(x, "registerId", js.undefined)
    
    inline def setRegisterSuffix(value: String): Self = StObject.set(x, "registerSuffix", value.asInstanceOf[js.Any])
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureNull: Self = StObject.set(x, "unitOfMeasure", null)
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
  }
}
