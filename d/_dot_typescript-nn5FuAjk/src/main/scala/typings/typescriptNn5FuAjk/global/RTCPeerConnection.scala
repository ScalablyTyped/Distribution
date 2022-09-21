package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.AlgorithmIdentifier
import typings.typescriptNn5FuAjk.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCPeerConnection")
@js.native
open class RTCPeerConnection ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}
object RTCPeerConnection {
  
  @JSGlobal("RTCPeerConnection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.RTCCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCertificate")(keygenAlgorithm.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.RTCCertificate]]
}
