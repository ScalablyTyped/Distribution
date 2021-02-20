package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeveritySummary extends StObject {
  
  /**
    * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.native
}
object SeveritySummary {
  
  @scala.inline
  def apply(): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeveritySummary]
  }
  
  @scala.inline
  implicit class SeveritySummaryMutableBuilder[Self <: SeveritySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriticalCount(value: ComplianceSummaryCount): Self = StObject.set(x, "CriticalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalCountUndefined: Self = StObject.set(x, "CriticalCount", js.undefined)
    
    @scala.inline
    def setHighCount(value: ComplianceSummaryCount): Self = StObject.set(x, "HighCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighCountUndefined: Self = StObject.set(x, "HighCount", js.undefined)
    
    @scala.inline
    def setInformationalCount(value: ComplianceSummaryCount): Self = StObject.set(x, "InformationalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationalCountUndefined: Self = StObject.set(x, "InformationalCount", js.undefined)
    
    @scala.inline
    def setLowCount(value: ComplianceSummaryCount): Self = StObject.set(x, "LowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowCountUndefined: Self = StObject.set(x, "LowCount", js.undefined)
    
    @scala.inline
    def setMediumCount(value: ComplianceSummaryCount): Self = StObject.set(x, "MediumCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumCountUndefined: Self = StObject.set(x, "MediumCount", js.undefined)
    
    @scala.inline
    def setUnspecifiedCount(value: ComplianceSummaryCount): Self = StObject.set(x, "UnspecifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnspecifiedCountUndefined: Self = StObject.set(x, "UnspecifiedCount", js.undefined)
  }
}
