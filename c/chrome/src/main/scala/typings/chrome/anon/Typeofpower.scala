package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpower extends StObject {
  
  def releaseKeepAwake(): Unit = js.native
  
  def requestKeepAwake(level: String): Unit = js.native
}
object Typeofpower {
  
  @scala.inline
  def apply(releaseKeepAwake: () => Unit, requestKeepAwake: String => Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  
  @scala.inline
  implicit class TypeofpowerMutableBuilder[Self <: Typeofpower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReleaseKeepAwake(value: () => Unit): Self = StObject.set(x, "releaseKeepAwake", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestKeepAwake(value: String => Unit): Self = StObject.set(x, "requestKeepAwake", js.Any.fromFunction1(value))
  }
}
