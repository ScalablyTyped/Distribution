package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashMetrics extends js.Object {
  
  def getBandwidthForRepresentation(representationId: String, periodIdx: Double): Double = js.native
  
  def getCurrentBufferLevel(metrics: MetricsList): Double = js.native
  
  def getCurrentDVRInfo(metrics: MetricsList): js.Array[IDVRInfo] = js.native
  
  def getCurrentDroppedFrames(metrics: MetricsList): IDroppedFrames = js.native
  
  def getCurrentHttpRequest(metrics: MetricsList): js.Object = js.native
  
  def getCurrentManifestUpdate(metrics: MetricsList): js.Any = js.native
  
  def getCurrentRepresentationSwitch(metrics: MetricsList): ICurrentRepresentationSwitch = js.native
  
  def getCurrentSchedulingInfo(metrics: MetricsList): js.Object = js.native
  
  def getHttpRequests(metrics: MetricsList): js.Array[js.Object] = js.native
  
  def getIndexForRepresentation(representationId: String, periodIdx: Double): Double = js.native
  
  def getLatestBufferLevelVO(metrics: MetricsList): ILatestBufferLevelVO = js.native
  
  def getLatestFragmentRequestHeaderValueByID(metrics: MetricsList, id: String): String = js.native
  
  def getLatestMPDRequestHeaderValueByID(metrics: MetricsList, id: String): String = js.native
  
  @JSName("getMaxIndexForBufferType")
  def getMaxIndexForBufferType_audio(bufferType: audio, periodIdx: Double): Double = js.native
  /**
    * This method returns the current max index based on what is defined in the MPD.
    *
    * @param bufferType String 'audio' or 'video',
    * @param periodIdx Make sure this is the period index not id
    */
  @JSName("getMaxIndexForBufferType")
  def getMaxIndexForBufferType_video(bufferType: video, periodIdx: Double): Double = js.native
  
  def getRequestsQueue(metrics: MetricsList): RequestsQueue | Null = js.native
}
