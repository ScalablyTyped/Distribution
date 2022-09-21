package typings.baseui.anon

import typings.baseui.baseuiStrings.`calcLeftparenthesis$LeftcurlybracketstringRightcurlybracket - Dot5pxRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{[x: string] : any,   width :'calc(${string} - .5px)',   marginBottom :any}> */
trait Readonlyxstringanywidthca extends StObject {
  
  val marginBottom: Any
  
  val width: `calcLeftparenthesis$LeftcurlybracketstringRightcurlybracket - Dot5pxRightparenthesis`
}
object Readonlyxstringanywidthca {
  
  inline def apply(marginBottom: Any): Readonlyxstringanywidthca = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], width = "calc(${string} - .5px)")
    __obj.asInstanceOf[Readonlyxstringanywidthca]
  }
  
  extension [Self <: Readonlyxstringanywidthca](x: Self) {
    
    inline def setMarginBottom(value: Any): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `calcLeftparenthesis$LeftcurlybracketstringRightcurlybracket - Dot5pxRightparenthesis`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
