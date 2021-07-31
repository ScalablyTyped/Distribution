package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceResponse extends StObject {
  
  /**
    * The identifier of the new resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.workmailMod.ResourceId] = js.undefined
}
object CreateResourceResponse {
  
  @scala.inline
  def apply(): CreateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceResponse]
  }
  
  @scala.inline
  implicit class CreateResourceResponseMutableBuilder[Self <: CreateResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
