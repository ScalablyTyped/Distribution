package typings.chrome.chromeNs.castNs.mediaNs

import typings.chrome.chromeNs.castNs.Error
import typings.chrome.chromeNs.castNs.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.Media")
@js.native
class Media protected () extends js.Object {
  /**
    * @param {string} sessionId
    * @param {number} mediaSessionId
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Media
    */
  def this(sessionId: String, mediaSessionId: Double) = this()
  var activeTrackIds: js.Array[Double] = js.native
  var currentItemId: Double = js.native
  /** @deprecated. Use getEstimatedTime instead */
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var idleReason: IdleReason = js.native
  var items: js.Array[QueueItem] = js.native
  var loadingItemId: Double = js.native
  var media: MediaInfo = js.native
  var mediaSessionId: Double = js.native
  var playbackRate: Double = js.native
  var playerState: PlayerState = js.native
  var preloadedItemId: Double = js.native
  var repeatMode: RepeatMode = js.native
  var sessionId: String = js.native
  var supportedMediaCommands: js.Array[MediaCommand] = js.native
  var volume: Volume = js.native
  /**
    * @param {function(boolean)} listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.EditTracksInfoRequest} editTracksInfoRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def editTracksInfo(
    editTracksInfoRequest: EditTracksInfoRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @return {number}
    * @suppress {deprecated} Uses currentTime member to compute estimated time.
    */
  def getEstimatedTime(): Double = js.native
  /**
    * @param {chrome.cast.media.GetStatusRequest} getStatusRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def getStatus(
    getStatusRequest: GetStatusRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PauseRequest} pauseRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def pause(
    pauseRequest: PauseRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PlayRequest} playRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def play(
    playRequest: PlayRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueItem} item
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueAppendItem(
    item: QueueItem,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueInsertItemsRequest} queueInsertItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueInsertItems(
    queueInsertItemsRequest: QueueInsertItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueJumpToItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {!number} newIndex
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueMoveItemToNewIndex(
    itemId: Double,
    newIndex: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueNext(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queuePrev(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueRemoveItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueReorderItemsRequest} queueReorderItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueReorderItems(
    queueReorderItemsRequest: QueueReorderItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.RepeatMode} repeatMode
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueSetRepeatMode(
    repeatMode: RepeatMode,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueUpdateItemsRequest} queueUpdateItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueUpdateItems(
    queueUpdateItemsRequest: QueueUpdateItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function(boolean)} listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.SeekRequest} seekRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def seek(
    seekRequest: SeekRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.VolumeRequest} volumeRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def setVolume(
    volumeRequest: VolumeRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.StopRequest} stopRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def stop(
    stopRequest: StopRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.MediaCommand} command
    * @return {boolean}
    */
  def supportsCommand(command: MediaCommand): Boolean = js.native
}

