package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserMessage extends StObject {
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.elasticacheMod.UserId = js.native
}
object DeleteUserMessage {
  
  @scala.inline
  def apply(UserId: UserId): DeleteUserMessage = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserMessage]
  }
  
  @scala.inline
  implicit class DeleteUserMessageMutableBuilder[Self <: DeleteUserMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
