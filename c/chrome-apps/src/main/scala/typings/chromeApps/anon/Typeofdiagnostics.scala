package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdiagnostics extends StObject {
  
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit
}
object Typeofdiagnostics {
  
  @scala.inline
  def apply(sendPacket: (js.Object, js.Function0[Unit]) => Unit): Typeofdiagnostics = {
    val __obj = js.Dynamic.literal(sendPacket = js.Any.fromFunction2(sendPacket))
    __obj.asInstanceOf[Typeofdiagnostics]
  }
  
  @scala.inline
  implicit class TypeofdiagnosticsMutableBuilder[Self <: Typeofdiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendPacket(value: (js.Object, js.Function0[Unit]) => Unit): Self = StObject.set(x, "sendPacket", js.Any.fromFunction2(value))
  }
}
