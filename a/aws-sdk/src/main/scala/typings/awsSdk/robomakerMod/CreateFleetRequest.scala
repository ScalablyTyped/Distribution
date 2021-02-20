package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var name: Name = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the fleet.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateFleetRequest {
  
  @scala.inline
  def apply(name: Name): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  
  @scala.inline
  implicit class CreateFleetRequestMutableBuilder[Self <: CreateFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
