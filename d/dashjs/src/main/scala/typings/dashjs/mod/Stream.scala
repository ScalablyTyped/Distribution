package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.image
import typings.dashjs.dashjsStrings.video
import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  def activate(MediaSource: MediaSource): Unit = js.native
  
  def deactivate(): Unit = js.native
  
  @JSName("getBitrateListFor")
  def getBitrateListFor_audio(`type`: audio): js.Array[BitrateInfo] = js.native
  @JSName("getBitrateListFor")
  def getBitrateListFor_image(`type`: image): js.Array[BitrateInfo] = js.native
  @JSName("getBitrateListFor")
  def getBitrateListFor_video(`type`: video): js.Array[BitrateInfo] = js.native
  
  def getDuration(): Double = js.native
  
  def getId(): String = js.native
  
  def getStartTime(): Double = js.native
  
  def getStreamInfo(): StreamInfo | Null = js.native
  
  def initialize(streamInfo: StreamInfo, protectionController: ProtectionController): Unit = js.native
  
  def reset(): Unit = js.native
  
  def updateData(updatedStreamInfo: StreamInfo): Unit = js.native
}
