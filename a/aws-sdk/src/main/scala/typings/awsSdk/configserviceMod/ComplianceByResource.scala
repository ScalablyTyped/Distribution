package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceByResource extends StObject {
  
  /**
    * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
    */
  var Compliance: js.UndefOr[typings.awsSdk.configserviceMod.Compliance] = js.undefined
  
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object ComplianceByResource {
  
  @scala.inline
  def apply(): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByResource]
  }
  
  @scala.inline
  implicit class ComplianceByResourceMutableBuilder[Self <: ComplianceByResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
