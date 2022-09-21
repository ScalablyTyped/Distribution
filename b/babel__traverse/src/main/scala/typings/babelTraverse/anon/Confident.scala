package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confident extends StObject {
  
  var confident: Boolean
  
  var value: Any
}
object Confident {
  
  inline def apply(confident: Boolean, value: Any): Confident = {
    val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confident]
  }
  
  extension [Self <: Confident](x: Self) {
    
    inline def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
