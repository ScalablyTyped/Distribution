package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{[x: string] : any,   width :/ * template literal string: calc(${string} - .5px) * / string,   marginBottom :any}> */
trait Readonlyxstringanywidthst extends StObject {
  
  val marginBottom: Any
  
  val width: /* template literal string: calc(${string} - .5px) */ String
}
object Readonlyxstringanywidthst {
  
  inline def apply(marginBottom: Any, width: /* template literal string: calc(${string} - .5px) */ String): Readonlyxstringanywidthst = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyxstringanywidthst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyxstringanywidthst] (val x: Self) extends AnyVal {
    
    inline def setMarginBottom(value: Any): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: /* template literal string: calc(${string} - .5px) */ String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
