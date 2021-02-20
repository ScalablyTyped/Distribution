package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteKeyGroupRequest extends StObject {
  
  /**
    * The identifier of the key group that you are deleting. To get the identifier, use ListKeyGroups.
    */
  var Id: String = js.native
  
  /**
    * The version of the key group that you are deleting. The version is the key group’s ETag value. To get the ETag, use GetKeyGroup or GetKeyGroupConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object DeleteKeyGroupRequest {
  
  @scala.inline
  def apply(Id: String): DeleteKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteKeyGroupRequestMutableBuilder[Self <: DeleteKeyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
