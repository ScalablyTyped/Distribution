package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var isOpening: Boolean
}
object Dictkey {
  
  inline def apply(isOpening: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(isOpening = isOpening.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setIsOpening(value: Boolean): Self = StObject.set(x, "isOpening", value.asInstanceOf[js.Any])
  }
}
