package typings.chrome.anon

import typings.chrome.chrome.serial.onReceive.OnReceiveInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofonReceive extends StObject {
  
  def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit
}
object TypeofonReceive {
  
  @scala.inline
  def apply(addListener: js.Function1[/* info */ OnReceiveInfo, Unit] => Unit): TypeofonReceive = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[TypeofonReceive]
  }
  
  @scala.inline
  implicit class TypeofonReceiveMutableBuilder[Self <: TypeofonReceive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: js.Function1[/* info */ OnReceiveInfo, Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
  }
}
