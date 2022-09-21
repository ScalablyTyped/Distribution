package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Existence extends StObject {
  
  var content: Items
  
  var existence: Items
}
object Existence {
  
  inline def apply(content: Items, existence: Items): Existence = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existence]
  }
  
  extension [Self <: Existence](x: Self) {
    
    inline def setContent(value: Items): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExistence(value: Items): Self = StObject.set(x, "existence", value.asInstanceOf[js.Any])
  }
}
