package typings
package bittorrentDashProtocolLib.bittorrentDashProtocolMod.BittorrentProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wire
  extends nodeLib.streamMod.Duplex {
   // connection type
  val amChoking: scala.Boolean = js.native
   // are we choking the peer?
  val amInterested: scala.Boolean = js.native
  val extendedMapping: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = js.native
   // are we interested in the peer?
  val peerChoking: scala.Boolean = js.native
  val peerExtendedMapping: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  val peerId: java.lang.String = js.native
   // remote peer id (hex string)
  val peerIdBuffer: nodeLib.Buffer = js.native
   // is the peer choking us?
  val peerInterested: scala.Boolean = js.native
  val peerRequests: js.Array[Request] = js.native
   // is the peer interested in us?
  val requests: js.Array[Request] = js.native
   // remote peer id (Buffer)
  val `type`: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.webrtc | bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.tcpIncoming | bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.tcpOutgoing | bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.webSeed = js.native
  def bitfield(bitfield: js.Any): scala.Unit = js.native
  // TODO: bitfield can be also a bitfield instance
  def bitfield(bitfield: nodeLib.Buffer): scala.Unit = js.native
  def cancel(index: scala.Double, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  def choke(): scala.Unit = js.native
  def extend(ext: java.lang.String, obj: js.Any): scala.Unit = js.native
  def extend(ext: scala.Double, obj: js.Any): scala.Unit = js.native
  def handshake(infoHash: java.lang.String, peerId: java.lang.String): scala.Unit = js.native
  def handshake(infoHash: java.lang.String, peerId: java.lang.String, extensions: js.Any): scala.Unit = js.native
  def handshake(infoHash: java.lang.String, peerId: nodeLib.Buffer): scala.Unit = js.native
  def handshake(infoHash: java.lang.String, peerId: nodeLib.Buffer, extensions: js.Any): scala.Unit = js.native
  def handshake(infoHash: nodeLib.Buffer, peerId: java.lang.String): scala.Unit = js.native
  def handshake(infoHash: nodeLib.Buffer, peerId: java.lang.String, extensions: js.Any): scala.Unit = js.native
  def handshake(infoHash: nodeLib.Buffer, peerId: nodeLib.Buffer): scala.Unit = js.native
  def handshake(infoHash: nodeLib.Buffer, peerId: nodeLib.Buffer, extensions: js.Any): scala.Unit = js.native
  def have(index: scala.Double): scala.Unit = js.native
  def interested(): scala.Unit = js.native
  def on(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.extended,
    listener: js.Function2[
      /* ext */ bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.handshake | java.lang.String, 
      /* buf */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // TODO: bitfield is a bitfield instance
  @JSName("on")
  def on_bitfield(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.bitfield,
    listener: js.Function1[/* bitfield */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cancel(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.cancel,
    listener: js.Function3[
      /* index */ scala.Double, 
      /* offset */ scala.Double, 
      /* length */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_choke(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.choke,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_download(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.download,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_handshake(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.handshake,
    listener: js.Function3[
      /* infoHash */ java.lang.String, 
      /* peerId */ java.lang.String, 
      /* extensions */ js.Array[Extension], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_have(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.have,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_interested(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.interested,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_keep-alive`(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.`keep-alive`,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_piece(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.piece,
    listener: js.Function3[
      /* index */ scala.Double, 
      /* offset */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_port(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.port,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.request,
    listener: js.Function4[
      /* index */ scala.Double, 
      /* offset */ scala.Double, 
      /* length */ scala.Double, 
      /* respond */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.timeout,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unchoke(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.unchoke,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_uninterested(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.uninterested,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unknownmessage(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.unknownmessage,
    listener: js.Function1[/* buffer */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_upload(
    event: bittorrentDashProtocolLib.bittorrentDashProtocolLibStrings.upload,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  def piece(index: scala.Double, offset: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  def port(port: scala.Double): scala.Unit = js.native
  def request[T /* <: js.Any */](index: scala.Double, offset: scala.Double, length: scala.Double): T | scala.Unit = js.native
  def request[T /* <: js.Any */](
    index: scala.Double,
    offset: scala.Double,
    length: scala.Double,
    cb: js.Function1[/* err */ stdLib.Error, T]
  ): T | scala.Unit = js.native
  def setKeepAlive(enable: scala.Boolean): scala.Unit = js.native
  def setTimeot(ms: scala.Double): scala.Unit = js.native
  def setTimeot(ms: scala.Double, unref: scala.Boolean): scala.Unit = js.native
  def unchoke(): scala.Unit = js.native
  def uninterested(): scala.Unit = js.native
  def use(ext: ExtensionConstructor): scala.Unit = js.native
}

