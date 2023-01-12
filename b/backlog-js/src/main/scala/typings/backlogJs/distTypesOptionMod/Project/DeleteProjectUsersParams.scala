package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectUsersParams extends StObject {
  
  var userId: Double
}
object DeleteProjectUsersParams {
  
  inline def apply(userId: Double): DeleteProjectUsersParams = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectUsersParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProjectUsersParams] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
