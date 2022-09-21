package typings.backlogJs.optionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostProjectAdministrators extends StObject {
  
  var userId: Double
}
object PostProjectAdministrators {
  
  inline def apply(userId: Double): PostProjectAdministrators = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectAdministrators]
  }
  
  extension [Self <: PostProjectAdministrators](x: Self) {
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
