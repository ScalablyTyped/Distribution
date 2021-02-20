package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyGroupConfigRequest extends StObject {
  
  /**
    * The identifier of the key group whose configuration you are getting. To get the identifier, use ListKeyGroups.
    */
  var Id: String = js.native
}
object GetKeyGroupConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetKeyGroupConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyGroupConfigRequest]
  }
  
  @scala.inline
  implicit class GetKeyGroupConfigRequestMutableBuilder[Self <: GetKeyGroupConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
