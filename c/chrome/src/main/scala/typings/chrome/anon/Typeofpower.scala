package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpower extends StObject {
  
  def releaseKeepAwake(): Unit
  
  def requestKeepAwake(level: String): Unit
}
object Typeofpower {
  
  inline def apply(releaseKeepAwake: () => Unit, requestKeepAwake: String => Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofpower] (val x: Self) extends AnyVal {
    
    inline def setReleaseKeepAwake(value: () => Unit): Self = StObject.set(x, "releaseKeepAwake", js.Any.fromFunction0(value))
    
    inline def setRequestKeepAwake(value: String => Unit): Self = StObject.set(x, "requestKeepAwake", js.Any.fromFunction1(value))
  }
}
