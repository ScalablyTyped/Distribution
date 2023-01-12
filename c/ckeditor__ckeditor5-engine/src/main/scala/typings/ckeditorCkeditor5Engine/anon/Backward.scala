package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backward extends StObject {
  
  var backward: js.UndefOr[Boolean] = js.undefined
}
object Backward {
  
  inline def apply(): Backward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backward] (val x: Self) extends AnyVal {
    
    inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    inline def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
  }
}
