package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEntitiesResponse extends StObject {
  
  /**
    * An array of descriptions for the specified entities.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.native
}
object GetEntitiesResponse {
  
  @scala.inline
  def apply(): GetEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitiesResponse]
  }
  
  @scala.inline
  implicit class GetEntitiesResponseMutableBuilder[Self <: GetEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(value: EntityDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: EntityDescription*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
  }
}
