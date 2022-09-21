package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashMetrics extends StObject {
  
  def getCurrentBufferLevel(`type`: MediaType): Double = js.native
  
  def getCurrentBufferState(`type`: MediaType): IBufferState = js.native
  
  def getCurrentDVRInfo(): IDVRInfo = js.native
  def getCurrentDVRInfo(`type`: MediaType): IDVRInfo = js.native
  
  def getCurrentDroppedFrames(): IDroppedFrames = js.native
  
  def getCurrentHttpRequest(`type`: MediaType): js.Object = js.native
  
  def getCurrentManifestUpdate(): Any = js.native
  
  def getCurrentRepresentationSwitch(`type`: MediaType): ICurrentRepresentationSwitch = js.native
  
  def getCurrentSchedulingInfo(`type`: MediaType): js.Object = js.native
  
  def getHttpRequests(`type`: MediaType): js.Array[js.Object] = js.native
  
  def getLatestFragmentRequestHeaderValueByID(id: String): String = js.native
  
  def getLatestMPDRequestHeaderValueByID(`type`: MediaType, id: String): String = js.native
}
