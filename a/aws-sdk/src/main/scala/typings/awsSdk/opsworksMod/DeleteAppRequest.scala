package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: String = js.native
}
object DeleteAppRequest {
  
  @scala.inline
  def apply(AppId: String): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppRequest]
  }
  
  @scala.inline
  implicit class DeleteAppRequestMutableBuilder[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
  }
}
