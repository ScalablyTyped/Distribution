package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyGroupRequest extends StObject {
  
  /**
    * The identifier of the key group that you are getting. To get the identifier, use ListKeyGroups.
    */
  var Id: String = js.native
}
object GetKeyGroupRequest {
  
  @scala.inline
  def apply(Id: String): GetKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyGroupRequest]
  }
  
  @scala.inline
  implicit class GetKeyGroupRequestMutableBuilder[Self <: GetKeyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
