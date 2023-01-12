package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Voices extends StObject {
  
  var voices: js.Array[Eventtypes]
}
object Voices {
  
  inline def apply(voices: js.Array[Eventtypes]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Voices] (val x: Self) extends AnyVal {
    
    inline def setVoices(value: js.Array[Eventtypes]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    inline def setVoicesVarargs(value: Eventtypes*): Self = StObject.set(x, "voices", js.Array(value*))
  }
}
