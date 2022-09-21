package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nested extends StObject {
  
  @JSName("$nested")
  var $nested: Boolean
}
object Nested {
  
  inline def apply($nested: Boolean): Nested = {
    val __obj = js.Dynamic.literal($nested = $nested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nested]
  }
  
  extension [Self <: Nested](x: Self) {
    
    inline def set$nested(value: Boolean): Self = StObject.set(x, "$nested", value.asInstanceOf[js.Any])
  }
}
