package typings.deferToConnect

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("defer-to-connect", JSImport.Default)
  @js.native
  def default(socket: Socket, fn: js.Function0[Unit]): Unit = js.native
  @JSImport("defer-to-connect", JSImport.Default)
  @js.native
  def default(socket: Socket, fn: Listeners): Unit = js.native
  @JSImport("defer-to-connect", JSImport.Default)
  @js.native
  def default(socket: TLSSocket, fn: js.Function0[Unit]): Unit = js.native
  @JSImport("defer-to-connect", JSImport.Default)
  @js.native
  def default(socket: TLSSocket, fn: Listeners): Unit = js.native
  
  @js.native
  trait Listeners extends StObject {
    
    var close: js.UndefOr[js.Function1[/* hadError */ Boolean, Unit]] = js.native
    
    var connect: js.UndefOr[js.Function0[Unit]] = js.native
    
    var secureConnect: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Listeners {
    
    @scala.inline
    def apply(): Listeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Listeners]
    }
    
    @scala.inline
    implicit class ListenersMutableBuilder[Self <: Listeners] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: /* hadError */ Boolean => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setSecureConnect(value: () => Unit): Self = StObject.set(x, "secureConnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecureConnectUndefined: Self = StObject.set(x, "secureConnect", js.undefined)
    }
  }
}
