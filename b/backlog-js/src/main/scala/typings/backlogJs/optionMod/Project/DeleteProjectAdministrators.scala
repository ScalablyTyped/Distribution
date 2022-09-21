package typings.backlogJs.optionMod.Project

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
  
  extension [Self <: DeleteProjectAdministrators](x: Self) {
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
