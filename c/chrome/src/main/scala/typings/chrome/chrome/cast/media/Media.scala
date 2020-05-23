package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Error
import typings.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var activeTrackIds: js.Array[Double]
  var currentItemId: Double
  /** @deprecated. Use getEstimatedTime instead */
  var currentTime: Double
  var customData: js.Object
  var idleReason: IdleReason
  var items: js.Array[QueueItem]
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.undefined
  var loadingItemId: Double
  var media: MediaInfo
  var mediaSessionId: Double
  var playbackRate: Double
  var playerState: PlayerState
  var preloadedItemId: Double
  var repeatMode: RepeatMode
  var sessionId: String
  var supportedMediaCommands: js.Array[MediaCommand]
  var volume: Volume
  /**
    * @param {function(boolean)} listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit
  /**
    * @param {!chrome.cast.media.EditTracksInfoRequest} editTracksInfoRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def editTracksInfo(
    editTracksInfoRequest: EditTracksInfoRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @return {number}
    * @suppress {deprecated} Uses currentTime member to compute estimated time.
    */
  def getEstimatedTime(): Double
  /**
    * @param {chrome.cast.media.GetStatusRequest} getStatusRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def getStatus(
    getStatusRequest: GetStatusRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {chrome.cast.media.PauseRequest} pauseRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def pause(
    pauseRequest: PauseRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {chrome.cast.media.PlayRequest} playRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def play(
    playRequest: PlayRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.QueueItem} item
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueAppendItem(
    item: QueueItem,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.QueueInsertItemsRequest} queueInsertItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueInsertItems(
    queueInsertItemsRequest: QueueInsertItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueJumpToItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
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
  ): Unit
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueNext(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queuePrev(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueRemoveItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  /**
    * @param {!chrome.cast.media.QueueReorderItemsRequest} queueReorderItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueReorderItems(
    queueReorderItemsRequest: QueueReorderItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.RepeatMode} repeatMode
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueSetRepeatMode(
    repeatMode: RepeatMode,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.QueueUpdateItemsRequest} queueUpdateItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueUpdateItems(
    queueUpdateItemsRequest: QueueUpdateItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {function(boolean)} listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit
  /**
    * @param {!chrome.cast.media.SeekRequest} seekRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def seek(
    seekRequest: SeekRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.VolumeRequest} volumeRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def setVolume(
    volumeRequest: VolumeRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {chrome.cast.media.StopRequest} stopRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def stop(
    stopRequest: StopRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  /**
    * @param {!chrome.cast.media.MediaCommand} command
    * @return {boolean}
    */
  def supportsCommand(command: MediaCommand): Boolean
}

object Media {
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Double],
    addUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Unit,
    currentItemId: Double,
    currentTime: Double,
    customData: js.Object,
    editTracksInfo: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    getEstimatedTime: () => Double,
    getStatus: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    idleReason: IdleReason,
    items: js.Array[QueueItem],
    loadingItemId: Double,
    media: MediaInfo,
    mediaSessionId: Double,
    pause: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    play: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    playbackRate: Double,
    playerState: PlayerState,
    preloadedItemId: Double,
    queueAppendItem: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueInsertItems: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueJumpToItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueMoveItemToNewIndex: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueNext: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queuePrev: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueRemoveItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueReorderItems: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueSetRepeatMode: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueUpdateItems: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    removeUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Unit,
    repeatMode: RepeatMode,
    seek: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    sessionId: String,
    setVolume: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    stop: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    supportedMediaCommands: js.Array[MediaCommand],
    supportsCommand: MediaCommand => Boolean,
    volume: Volume,
    liveSeekableRange: LiveSeekableRange = null
  ): Media = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], addUpdateListener = js.Any.fromFunction1(addUpdateListener), currentItemId = currentItemId.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], editTracksInfo = js.Any.fromFunction3(editTracksInfo), getEstimatedTime = js.Any.fromFunction0(getEstimatedTime), getStatus = js.Any.fromFunction3(getStatus), idleReason = idleReason.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], loadingItemId = loadingItemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mediaSessionId = mediaSessionId.asInstanceOf[js.Any], pause = js.Any.fromFunction3(pause), play = js.Any.fromFunction3(play), playbackRate = playbackRate.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], preloadedItemId = preloadedItemId.asInstanceOf[js.Any], queueAppendItem = js.Any.fromFunction3(queueAppendItem), queueInsertItems = js.Any.fromFunction3(queueInsertItems), queueJumpToItem = js.Any.fromFunction3(queueJumpToItem), queueMoveItemToNewIndex = js.Any.fromFunction4(queueMoveItemToNewIndex), queueNext = js.Any.fromFunction2(queueNext), queuePrev = js.Any.fromFunction2(queuePrev), queueRemoveItem = js.Any.fromFunction3(queueRemoveItem), queueReorderItems = js.Any.fromFunction3(queueReorderItems), queueSetRepeatMode = js.Any.fromFunction3(queueSetRepeatMode), queueUpdateItems = js.Any.fromFunction3(queueUpdateItems), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), repeatMode = repeatMode.asInstanceOf[js.Any], seek = js.Any.fromFunction3(seek), sessionId = sessionId.asInstanceOf[js.Any], setVolume = js.Any.fromFunction3(setVolume), stop = js.Any.fromFunction3(stop), supportedMediaCommands = supportedMediaCommands.asInstanceOf[js.Any], supportsCommand = js.Any.fromFunction1(supportsCommand), volume = volume.asInstanceOf[js.Any])
    if (liveSeekableRange != null) __obj.updateDynamic("liveSeekableRange")(liveSeekableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

