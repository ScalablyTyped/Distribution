package typings.backlogJs.optionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostStatusParams extends StObject {
  
  var color: ProjectStatusColor
  
  var name: String
}
object PostStatusParams {
  
  inline def apply(color: ProjectStatusColor, name: String): PostStatusParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostStatusParams]
  }
  
  extension [Self <: PostStatusParams](x: Self) {
    
    inline def setColor(value: ProjectStatusColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
