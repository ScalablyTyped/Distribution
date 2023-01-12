package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectAdministrators extends StObject {
  
  var userId: Double
}
object DeleteProjectAdministrators {
  
  inline def apply(userId: Double): DeleteProjectAdministrators = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectAdministrators]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProjectAdministrators] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
