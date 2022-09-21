package typings.baseui.anon

import typings.baseui.baseuiStrings.`flex-end`
import typings.baseui.baseuiStrings.`flex-start`
import typings.baseui.baseuiStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  @JSName("$align")
  var $align: `flex-end` | `flex-start` | center
}
object Align {
  
  inline def apply($align: `flex-end` | `flex-start` | center): Align = {
    val __obj = js.Dynamic.literal($align = $align.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def set$align(value: `flex-end` | `flex-start` | center): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
  }
}
