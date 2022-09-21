package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeveritySummary extends StObject {
  
  /**
    * The total number of resources or compliance items that have a severity level of Critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
}
object SeveritySummary {
  
  inline def apply(): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeveritySummary]
  }
  
  extension [Self <: SeveritySummary](x: Self) {
    
    inline def setCriticalCount(value: ComplianceSummaryCount): Self = StObject.set(x, "CriticalCount", value.asInstanceOf[js.Any])
    
    inline def setCriticalCountUndefined: Self = StObject.set(x, "CriticalCount", js.undefined)
    
    inline def setHighCount(value: ComplianceSummaryCount): Self = StObject.set(x, "HighCount", value.asInstanceOf[js.Any])
    
    inline def setHighCountUndefined: Self = StObject.set(x, "HighCount", js.undefined)
    
    inline def setInformationalCount(value: ComplianceSummaryCount): Self = StObject.set(x, "InformationalCount", value.asInstanceOf[js.Any])
    
    inline def setInformationalCountUndefined: Self = StObject.set(x, "InformationalCount", js.undefined)
    
    inline def setLowCount(value: ComplianceSummaryCount): Self = StObject.set(x, "LowCount", value.asInstanceOf[js.Any])
    
    inline def setLowCountUndefined: Self = StObject.set(x, "LowCount", js.undefined)
    
    inline def setMediumCount(value: ComplianceSummaryCount): Self = StObject.set(x, "MediumCount", value.asInstanceOf[js.Any])
    
    inline def setMediumCountUndefined: Self = StObject.set(x, "MediumCount", js.undefined)
    
    inline def setUnspecifiedCount(value: ComplianceSummaryCount): Self = StObject.set(x, "UnspecifiedCount", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedCountUndefined: Self = StObject.set(x, "UnspecifiedCount", js.undefined)
  }
}
