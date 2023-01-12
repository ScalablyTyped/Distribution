package typings.bittorrentProtocol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.bittorrentProtocol.bittorrentProtocolStrings.`keep-alive`
import typings.bittorrentProtocol.bittorrentProtocolStrings.bitfield
import typings.bittorrentProtocol.bittorrentProtocolStrings.cancel
import typings.bittorrentProtocol.bittorrentProtocolStrings.choke
import typings.bittorrentProtocol.bittorrentProtocolStrings.download
import typings.bittorrentProtocol.bittorrentProtocolStrings.extended
import typings.bittorrentProtocol.bittorrentProtocolStrings.handshake
import typings.bittorrentProtocol.bittorrentProtocolStrings.have
import typings.bittorrentProtocol.bittorrentProtocolStrings.interested
import typings.bittorrentProtocol.bittorrentProtocolStrings.piece
import typings.bittorrentProtocol.bittorrentProtocolStrings.port
import typings.bittorrentProtocol.bittorrentProtocolStrings.request
import typings.bittorrentProtocol.bittorrentProtocolStrings.tcpIncoming
import typings.bittorrentProtocol.bittorrentProtocolStrings.tcpOutgoing
import typings.bittorrentProtocol.bittorrentProtocolStrings.timeout
import typings.bittorrentProtocol.bittorrentProtocolStrings.unchoke
import typings.bittorrentProtocol.bittorrentProtocolStrings.uninterested
import typings.bittorrentProtocol.bittorrentProtocolStrings.unknownmessage
import typings.bittorrentProtocol.bittorrentProtocolStrings.upload
import typings.bittorrentProtocol.bittorrentProtocolStrings.webSeed
import typings.bittorrentProtocol.bittorrentProtocolStrings.webrtc
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bittorrent-protocol", JSImport.Namespace)
  @js.native
  open class ^ () extends Wire
  @JSImport("bittorrent-protocol", JSImport.Namespace)
  @js.native
  val ^ : BittorrentProtocol = js.native
  
  @js.native
  trait BittorrentProtocol
    extends StObject
       with Instantiable0[Wire] {
    
    def apply(): Wire = js.native
  }
  
  trait Extension extends StObject {
    
    var name: String
    
    var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[Any], Unit]] = js.undefined
    
    var onHandshake: js.UndefOr[
        js.Function3[
          /* infoHash */ String, 
          /* peerId */ String, 
          /* extensions */ StringDictionary[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.undefined
  }
  object Extension {
    
    inline def apply(name: String): Extension = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnExtendedHandshake(value: /* handshake */ StringDictionary[Any] => Unit): Self = StObject.set(x, "onExtendedHandshake", js.Any.fromFunction1(value))
      
      inline def setOnExtendedHandshakeUndefined: Self = StObject.set(x, "onExtendedHandshake", js.undefined)
      
      inline def setOnHandshake(
        value: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Unit
      ): Self = StObject.set(x, "onHandshake", js.Any.fromFunction3(value))
      
      inline def setOnHandshakeUndefined: Self = StObject.set(x, "onHandshake", js.undefined)
      
      inline def setOnMessage(value: /* buf */ Buffer => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    }
  }
  
  @js.native
  trait ExtensionConstructor
    extends StObject
       with Instantiable1[/* wire */ Wire, Extension]
  
  trait Request extends StObject {
    
    def callback(): Unit
    
    var length: Double
    
    var offset: Double
    
    var piece: Double
  }
  object Request {
    
    inline def apply(callback: () => Unit, length: Double, offset: Double, piece: Double): Request = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPiece(value: Double): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait Wire extends Duplex {
    
    // connection type
    val amChoking: Boolean = js.native
    
    // are we choking the peer?
    val amInterested: Boolean = js.native
    
    def bitfield(bitfield: Any): Unit = js.native
    // TODO: bitfield can be also a bitfield instance
    def bitfield(bitfield: Buffer): Unit = js.native
    
    def cancel(index: Double, offset: Double, length: Double): Unit = js.native
    
    def choke(): Unit = js.native
    
    def destroy(): Any = js.native
    
    def extended(ext: String, obj: Any): Unit = js.native
    def extended(ext: Double, obj: Any): Unit = js.native
    
    val extendedMapping: NumberDictionary[String] = js.native
    
    def handshake(infoHash: String, peerId: String): Unit = js.native
    def handshake(infoHash: String, peerId: String, extensions: Any): Unit = js.native
    def handshake(infoHash: String, peerId: Buffer): Unit = js.native
    def handshake(infoHash: String, peerId: Buffer, extensions: Any): Unit = js.native
    def handshake(infoHash: Buffer, peerId: String): Unit = js.native
    def handshake(infoHash: Buffer, peerId: String, extensions: Any): Unit = js.native
    def handshake(infoHash: Buffer, peerId: Buffer): Unit = js.native
    def handshake(infoHash: Buffer, peerId: Buffer, extensions: Any): Unit = js.native
    
    def have(index: Double): Unit = js.native
    
    def interested(): Unit = js.native
    
    def on(
      event: `keep-alive` | choke | unchoke | interested | uninterested | timeout,
      listener: js.Function0[Unit]
    ): this.type = js.native
    def on(event: upload | have | download | port, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: extended, listener: js.Function2[/* ext */ handshake | String, /* buf */ Any, Unit]): Unit = js.native
    // TODO: bitfield is a bitfield instance
    @JSName("on")
    def on_bitfield(event: bitfield, listener: js.Function1[/* bitfield */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_cancel(
      event: cancel,
      listener: js.Function3[/* index */ Double, /* offset */ Double, /* length */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_handshake(
      event: handshake,
      listener: js.Function3[/* infoHash */ String, /* peerId */ String, /* extensions */ js.Array[Extension], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_piece(
      event: piece,
      listener: js.Function3[/* index */ Double, /* offset */ Double, /* buffer */ Buffer, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_request(
      event: request,
      listener: js.Function4[
          /* index */ Double, 
          /* offset */ Double, 
          /* length */ Double, 
          /* respond */ js.Function0[Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_unknownmessage(event: unknownmessage, listener: js.Function1[/* buffer */ Buffer, Unit]): this.type = js.native
    
    // are we interested in the peer?
    val peerChoking: Boolean = js.native
    
    val peerExtendedMapping: StringDictionary[Double] = js.native
    
    val peerId: String = js.native
    
    // remote peer id (hex string)
    val peerIdBuffer: Buffer = js.native
    
    // is the peer choking us?
    val peerInterested: Boolean = js.native
    
    val peerRequests: js.Array[Request] = js.native
    
    def piece(index: Double, offset: Double, buffer: Buffer): Unit = js.native
    
    def port(port: Double): Unit = js.native
    
    def request[T /* <: Any */](index: Double, offset: Double, length: Double): T | Unit = js.native
    def request[T /* <: Any */](index: Double, offset: Double, length: Double, cb: js.Function1[/* err */ js.Error, T]): T | Unit = js.native
    
    // is the peer interested in us?
    val requests: js.Array[Request] = js.native
    
    def setKeepAlive(enable: Boolean): Unit = js.native
    
    def setTimeout(ms: Double): Unit = js.native
    def setTimeout(ms: Double, unref: Boolean): Unit = js.native
    
    // remote peer id (Buffer)
    val `type`: webrtc | tcpIncoming | tcpOutgoing | webSeed = js.native
    
    def unchoke(): Unit = js.native
    
    def uninterested(): Unit = js.native
    
    def use(ext: ExtensionConstructor): Unit = js.native
  }
  
  type _To = BittorrentProtocol
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BittorrentProtocol = ^
}
