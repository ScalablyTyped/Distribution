package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.RTCIceCandidateInit
import typings.typescriptNn5FuAjk.RTCIceCandidateType
import typings.typescriptNn5FuAjk.RTCIceComponent
import typings.typescriptNn5FuAjk.RTCIceProtocol
import typings.typescriptNn5FuAjk.RTCIceTcpCandidateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCIceCandidate")
@js.native
open class RTCIceCandidate ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  
  /* CompleteClass */
  override val address: java.lang.String | Null = js.native
  
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  
  /* CompleteClass */
  override val component: RTCIceComponent | Null = js.native
  
  /* CompleteClass */
  override val foundation: java.lang.String | Null = js.native
  
  /* CompleteClass */
  override val port: Double | Null = js.native
  
  /* CompleteClass */
  override val priority: Double | Null = js.native
  
  /* CompleteClass */
  override val protocol: RTCIceProtocol | Null = js.native
  
  /* CompleteClass */
  override val relatedAddress: java.lang.String | Null = js.native
  
  /* CompleteClass */
  override val relatedPort: Double | Null = js.native
  
  /* CompleteClass */
  override val sdpMLineIndex: Double | Null = js.native
  
  /* CompleteClass */
  override val sdpMid: java.lang.String | Null = js.native
  
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | Null = js.native
  
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
  
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | Null = js.native
  
  /* CompleteClass */
  override val usernameFragment: java.lang.String | Null = js.native
}
