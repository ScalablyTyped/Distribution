package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  @JSName("$pad")
  var $pad: Boolean
}
object Pad {
  
  inline def apply($pad: Boolean): Pad = {
    val __obj = js.Dynamic.literal($pad = $pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
    
    inline def set$pad(value: Boolean): Self = StObject.set(x, "$pad", value.asInstanceOf[js.Any])
  }
}
