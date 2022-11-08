package typings.babelJsxUtils

import typings.babelJsxUtils.babelJsxUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Confident[T] extends StObject {
    
    var confident: Boolean
    
    var value: T | `true`
  }
  object Confident {
    
    inline def apply[T](confident: Boolean, value: T | `true`): Confident[T] = {
      val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confident[T]]
    }
    
    extension [Self <: Confident[?], T](x: Self & Confident[T]) {
      
      inline def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T | `true`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
