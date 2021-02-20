package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectUsersParams extends StObject {
  
  var userId: Double = js.native
}
object DeleteProjectUsersParams {
  
  @scala.inline
  def apply(userId: Double): DeleteProjectUsersParams = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectUsersParams]
  }
  
  @scala.inline
  implicit class DeleteProjectUsersParamsMutableBuilder[Self <: DeleteProjectUsersParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
