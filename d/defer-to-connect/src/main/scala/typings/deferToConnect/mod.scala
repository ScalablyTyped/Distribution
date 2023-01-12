package typings.deferToConnect

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("defer-to-connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: Socket, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(socket: Socket, fn: Listeners): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(socket: TLSSocket, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(socket: TLSSocket, fn: Listeners): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Listeners extends StObject {
    
    var close: js.UndefOr[js.Function1[/* hadError */ Boolean, Unit]] = js.undefined
    
    var connect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secureConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Listeners {
    
    inline def apply(): Listeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Listeners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listeners] (val x: Self) extends AnyVal {
      
      inline def setClose(value: /* hadError */ Boolean => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setSecureConnect(value: () => Unit): Self = StObject.set(x, "secureConnect", js.Any.fromFunction0(value))
      
      inline def setSecureConnectUndefined: Self = StObject.set(x, "secureConnect", js.undefined)
    }
  }
}
