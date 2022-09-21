package typings.babelTypes.anon

import typings.babelTypes.libMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Each extends StObject {
  
  var each: Validator
}
object Each {
  
  inline def apply(each: Validator): Each = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any])
    __obj.asInstanceOf[Each]
  }
  
  extension [Self <: Each](x: Self) {
    
    inline def setEach(value: Validator): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
  }
}
