package typings.typescriptNn5FuAjk.global

import typings.std.RTCRtpReceiveParameters
import typings.std.RTCRtpSynchronizationSource
import typings.typescriptNn5FuAjk.RTCRtpCapabilities
import typings.typescriptNn5FuAjk.RTCRtpContributingSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCRtpReceiver")
@js.native
open class RTCRtpReceiver ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCRtpReceiver {
  
  /* CompleteClass */
  override def getContributingSources(): typings.typescriptNn5FuAjk.Array[RTCRtpContributingSource] = js.native
  
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  
  /* CompleteClass */
  override def getStats(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.RTCStatsReport] = js.native
  
  /* CompleteClass */
  override def getSynchronizationSources(): typings.typescriptNn5FuAjk.Array[RTCRtpSynchronizationSource] = js.native
  
  /* CompleteClass */
  override val track: typings.typescriptNn5FuAjk.MediaStreamTrack = js.native
  
  /* CompleteClass */
  override val transport: typings.typescriptNn5FuAjk.RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @JSGlobal("RTCRtpReceiver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")(kind.asInstanceOf[js.Any]).asInstanceOf[RTCRtpCapabilities | Null]
}
