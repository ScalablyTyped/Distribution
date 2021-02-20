package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUri extends StObject {
  
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.glueMod.ResourceType] = js.native
  
  /**
    * The URI for accessing the resource.
    */
  var Uri: js.UndefOr[URI] = js.native
}
object ResourceUri {
  
  @scala.inline
  def apply(): ResourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUri]
  }
  
  @scala.inline
  implicit class ResourceUriMutableBuilder[Self <: ResourceUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "Uri", js.undefined)
  }
}
