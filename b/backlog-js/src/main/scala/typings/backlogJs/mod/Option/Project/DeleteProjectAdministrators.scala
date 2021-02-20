package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectAdministrators extends StObject {
  
  var userId: Double = js.native
}
object DeleteProjectAdministrators {
  
  @scala.inline
  def apply(userId: Double): DeleteProjectAdministrators = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectAdministrators]
  }
  
  @scala.inline
  implicit class DeleteProjectAdministratorsMutableBuilder[Self <: DeleteProjectAdministrators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
