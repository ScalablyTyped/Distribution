package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer. */
@js.native
trait RTCRtpSender extends StObject {
  
  val dtmf: RTCDTMFSender | Null = js.native
  
  def getParameters(): RTCRtpSendParameters = js.native
  
  def getStats(): Promise[RTCStatsReport] = js.native
  
  def replaceTrack(): Promise[Unit] = js.native
  def replaceTrack(withTrack: MediaStreamTrack): Promise[Unit] = js.native
  
  def setParameters(parameters: RTCRtpSendParameters): Promise[Unit] = js.native
  
  def setStreams(streams: MediaStream*): Unit = js.native
  
  val track: MediaStreamTrack | Null = js.native
  
  val transport: RTCDtlsTransport | Null = js.native
}
