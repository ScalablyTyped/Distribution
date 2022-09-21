package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasSuffix extends StObject {
  
  @JSName("$hasSuffix")
  var $hasSuffix: Boolean
}
object HasSuffix {
  
  inline def apply($hasSuffix: Boolean): HasSuffix = {
    val __obj = js.Dynamic.literal($hasSuffix = $hasSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasSuffix]
  }
  
  extension [Self <: HasSuffix](x: Self) {
    
    inline def set$hasSuffix(value: Boolean): Self = StObject.set(x, "$hasSuffix", value.asInstanceOf[js.Any])
  }
}
