package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceSummaryByResourceType extends StObject {
  
  /**
    * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.undefined
  
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object ComplianceSummaryByResourceType {
  
  @scala.inline
  def apply(): ComplianceSummaryByResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryByResourceType]
  }
  
  @scala.inline
  implicit class ComplianceSummaryByResourceTypeMutableBuilder[Self <: ComplianceSummaryByResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceSummary(value: ComplianceSummary): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
