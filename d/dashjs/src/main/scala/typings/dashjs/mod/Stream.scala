package typings.dashjs.mod

import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  def activate(mediaSource: MediaSource, previousBufferSinks: js.Array[Any]): Unit = js.native
  
  def deactivate(keepBuffers: Boolean): Unit = js.native
  
  def getAdapter(): DashAdapter = js.native
  
  def getBitrateListFor(`type`: MediaType): js.Array[BitrateInfo] = js.native
  
  def getDuration(): Double = js.native
  
  def getHasAudioTrack(): Boolean = js.native
  
  def getHasFinishedBuffering(): Boolean = js.native
  
  def getHasVideoTrack(): Boolean = js.native
  
  def getId(): String = js.native
  
  def getIsActive(): Boolean = js.native
  
  def getIsEndedEventSignaled(): Boolean = js.native
  
  def getPreloaded(): Boolean = js.native
  
  def getProcessors(): js.Array[Any] = js.native
  
  def getStartTime(): Double = js.native
  
  def getStreamId(): String = js.native
  
  def getStreamInfo(): StreamInfo | Null = js.native
  
  def getThumbnailController(): js.Object = js.native
  
  def initialize(streamInfo: StreamInfo, protectionController: ProtectionController): Unit = js.native
  
  def isMediaCodecCompatible(newStream: Stream): Boolean = js.native
  def isMediaCodecCompatible(newStream: Stream, previousStream: Stream): Boolean = js.native
  
  def isProtectionCompatible(newStream: Stream): Boolean = js.native
  
  def prepareQualityChange(e: js.Object): Unit = js.native
  
  def prepareTrackChange(e: js.Object): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setIsEndedEventSignaled(value: Boolean): Unit = js.native
  
  def setMediaSource(mediaSource: MediaSource): Unit = js.native
  
  def setPreloaded(value: Boolean): Unit = js.native
  
  def startPreloading(mediaSource: MediaSource, previousBuffers: js.Array[Any]): Unit = js.native
  
  def startScheduleControllers(): Unit = js.native
  
  def updateData(updatedStreamInfo: StreamInfo): Unit = js.native
}
