package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.RTCRtpCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCRtpSender")
@js.native
open class RTCRtpSender ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCRtpSender
object RTCRtpSender {
  
  @JSGlobal("RTCRtpSender")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")(kind.asInstanceOf[js.Any]).asInstanceOf[RTCRtpCapabilities | Null]
}
