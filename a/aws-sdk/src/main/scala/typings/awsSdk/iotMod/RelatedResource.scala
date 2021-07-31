package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedResource extends StObject {
  
  /**
    * Other information about the resource.
    */
  var additionalInfo: js.UndefOr[StringMap] = js.undefined
  
  /**
    * Information that identifies the resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object RelatedResource {
  
  @scala.inline
  def apply(): RelatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResource]
  }
  
  @scala.inline
  implicit class RelatedResourceMutableBuilder[Self <: RelatedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInfo(value: StringMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
