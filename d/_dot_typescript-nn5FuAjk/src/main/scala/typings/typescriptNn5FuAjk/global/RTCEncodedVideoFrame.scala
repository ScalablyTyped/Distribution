package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.RTCEncodedVideoFrameMetadata
import typings.typescriptNn5FuAjk.RTCEncodedVideoFrameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCEncodedVideoFrame")
@js.native
open class RTCEncodedVideoFrame ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCEncodedVideoFrame {
  
  /* CompleteClass */
  var data: typings.typescriptNn5FuAjk.ArrayBuffer = js.native
  
  /* CompleteClass */
  override def getMetadata(): RTCEncodedVideoFrameMetadata = js.native
  
  /* CompleteClass */
  override val timestamp: Double = js.native
  
  /* CompleteClass */
  override val `type`: RTCEncodedVideoFrameType = js.native
}
