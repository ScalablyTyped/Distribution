package typings.bittorrentProtocol.mod

import org.scalablytyped.runtime.NumberDictionary
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
import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wire extends Duplex {
   // connection type
  val amChoking: Boolean = js.native
   // are we choking the peer?
  val amInterested: Boolean = js.native
  val extendedMapping: NumberDictionary[String] = js.native
   // are we interested in the peer?
  val peerChoking: Boolean = js.native
  val peerExtendedMapping: StringDictionary[Double] = js.native
  val peerId: String = js.native
   // remote peer id (hex string)
  val peerIdBuffer: Buffer = js.native
   // is the peer choking us?
  val peerInterested: Boolean = js.native
  val peerRequests: js.Array[Request] = js.native
   // is the peer interested in us?
  val requests: js.Array[Request] = js.native
   // remote peer id (Buffer)
  val `type`: webrtc | tcpIncoming | tcpOutgoing | webSeed = js.native
  def bitfield(bitfield: js.Any): Unit = js.native
  // TODO: bitfield can be also a bitfield instance
  def bitfield(bitfield: Buffer): Unit = js.native
  def cancel(index: Double, offset: Double, length: Double): Unit = js.native
  def choke(): Unit = js.native
  def extended(ext: String, obj: js.Any): Unit = js.native
  def extended(ext: Double, obj: js.Any): Unit = js.native
  def handshake(infoHash: String, peerId: String): Unit = js.native
  def handshake(infoHash: String, peerId: String, extensions: js.Any): Unit = js.native
  def handshake(infoHash: String, peerId: Buffer): Unit = js.native
  def handshake(infoHash: String, peerId: Buffer, extensions: js.Any): Unit = js.native
  def handshake(infoHash: Buffer, peerId: String): Unit = js.native
  def handshake(infoHash: Buffer, peerId: String, extensions: js.Any): Unit = js.native
  def handshake(infoHash: Buffer, peerId: Buffer): Unit = js.native
  def handshake(infoHash: Buffer, peerId: Buffer, extensions: js.Any): Unit = js.native
  def have(index: Double): Unit = js.native
  def interested(): Unit = js.native
  def on(event: extended, listener: js.Function2[/* ext */ handshake | String, /* buf */ js.Any, Unit]): Unit = js.native
  // TODO: bitfield is a bitfield instance
  @JSName("on")
  def on_bitfield(event: bitfield, listener: js.Function1[/* bitfield */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_cancel(
    event: cancel,
    listener: js.Function3[/* index */ Double, /* offset */ Double, /* length */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_choke(event: choke, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_download(event: download, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_handshake(
    event: handshake,
    listener: js.Function3[/* infoHash */ String, /* peerId */ String, /* extensions */ js.Array[Extension], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_have(event: have, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_interested(event: interested, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_keepalive(event: `keep-alive`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_piece(
    event: piece,
    listener: js.Function3[/* index */ Double, /* offset */ Double, /* buffer */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_port(event: port, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
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
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unchoke(event: unchoke, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_uninterested(event: uninterested, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unknownmessage(event: unknownmessage, listener: js.Function1[/* buffer */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_upload(event: upload, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
  def piece(index: Double, offset: Double, buffer: Buffer): Unit = js.native
  def port(port: Double): Unit = js.native
  def request[T /* <: js.Any */](index: Double, offset: Double, length: Double): T | Unit = js.native
  def request[T /* <: js.Any */](index: Double, offset: Double, length: Double, cb: js.Function1[/* err */ Error, T]): T | Unit = js.native
  def setKeepAlive(enable: Boolean): Unit = js.native
  def setTimeout(ms: Double): Unit = js.native
  def setTimeout(ms: Double, unref: Boolean): Unit = js.native
  def unchoke(): Unit = js.native
  def uninterested(): Unit = js.native
  def use(ext: ExtensionConstructor): Unit = js.native
}

