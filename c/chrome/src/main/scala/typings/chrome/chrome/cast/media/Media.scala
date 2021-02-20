package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Error
import typings.chrome.chrome.cast.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Media extends StObject {
  
  var activeTrackIds: js.Array[Double] = js.native
  
  /**
    * @param {function(boolean)} listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  
  var currentItemId: Double = js.native
  
  /** @deprecated. Use getEstimatedTime instead */
  var currentTime: Double = js.native
  
  var customData: js.Object = js.native
  
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
  
  var idleReason: IdleReason | Null = js.native
  
  var items: js.Array[QueueItem] = js.native
  
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.native
  
  var loadingItemId: Double = js.native
  
  var media: MediaInfo = js.native
  
  var mediaSessionId: Double = js.native
  
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
  
  var playbackRate: Double = js.native
  
  var playerState: PlayerState = js.native
  
  var preloadedItemId: Double = js.native
  
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
  
  var repeatMode: RepeatMode = js.native
  
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
  
  var sessionId: String = js.native
  
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
  
  var supportedMediaCommands: js.Array[MediaCommand] = js.native
  
  /**
    * @param {!chrome.cast.media.MediaCommand} command
    * @return {boolean}
    */
  def supportsCommand(command: MediaCommand): Boolean = js.native
  
  var volume: Volume = js.native
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
    volume: Volume
  ): Media = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], addUpdateListener = js.Any.fromFunction1(addUpdateListener), currentItemId = currentItemId.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], editTracksInfo = js.Any.fromFunction3(editTracksInfo), getEstimatedTime = js.Any.fromFunction0(getEstimatedTime), getStatus = js.Any.fromFunction3(getStatus), items = items.asInstanceOf[js.Any], loadingItemId = loadingItemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mediaSessionId = mediaSessionId.asInstanceOf[js.Any], pause = js.Any.fromFunction3(pause), play = js.Any.fromFunction3(play), playbackRate = playbackRate.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], preloadedItemId = preloadedItemId.asInstanceOf[js.Any], queueAppendItem = js.Any.fromFunction3(queueAppendItem), queueInsertItems = js.Any.fromFunction3(queueInsertItems), queueJumpToItem = js.Any.fromFunction3(queueJumpToItem), queueMoveItemToNewIndex = js.Any.fromFunction4(queueMoveItemToNewIndex), queueNext = js.Any.fromFunction2(queueNext), queuePrev = js.Any.fromFunction2(queuePrev), queueRemoveItem = js.Any.fromFunction3(queueRemoveItem), queueReorderItems = js.Any.fromFunction3(queueReorderItems), queueSetRepeatMode = js.Any.fromFunction3(queueSetRepeatMode), queueUpdateItems = js.Any.fromFunction3(queueUpdateItems), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), repeatMode = repeatMode.asInstanceOf[js.Any], seek = js.Any.fromFunction3(seek), sessionId = sessionId.asInstanceOf[js.Any], setVolume = js.Any.fromFunction3(setVolume), stop = js.Any.fromFunction3(stop), supportedMediaCommands = supportedMediaCommands.asInstanceOf[js.Any], supportsCommand = js.Any.fromFunction1(supportsCommand), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit class MediaMutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTrackIds(value: js.Array[Double]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrackIdsVarargs(value: Double*): Self = StObject.set(x, "activeTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setAddUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Unit): Self = StObject.set(x, "addUpdateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentItemId(value: Double): Self = StObject.set(x, "currentItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTracksInfo(value: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "editTracksInfo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetEstimatedTime(value: () => Double): Self = StObject.set(x, "getEstimatedTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatus(value: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "getStatus", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIdleReason(value: IdleReason): Self = StObject.set(x, "idleReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleReasonNull: Self = StObject.set(x, "idleReason", null)
    
    @scala.inline
    def setItems(value: js.Array[QueueItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: QueueItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLiveSeekableRange(value: LiveSeekableRange): Self = StObject.set(x, "liveSeekableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSeekableRangeUndefined: Self = StObject.set(x, "liveSeekableRange", js.undefined)
    
    @scala.inline
    def setLoadingItemId(value: Double): Self = StObject.set(x, "loadingItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSessionId(value: Double): Self = StObject.set(x, "mediaSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPlay(value: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "play", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerState(value: PlayerState): Self = StObject.set(x, "playerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedItemId(value: Double): Self = StObject.set(x, "preloadedItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueAppendItem(value: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueAppendItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueInsertItems(value: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueInsertItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueJumpToItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueJumpToItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueMoveItemToNewIndex(value: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueMoveItemToNewIndex", js.Any.fromFunction4(value))
    
    @scala.inline
    def setQueueNext(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueNext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueuePrev(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queuePrev", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueueRemoveItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueRemoveItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueReorderItems(value: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueReorderItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueSetRepeatMode(value: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueSetRepeatMode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueueUpdateItems(value: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "queueUpdateItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Unit): Self = StObject.set(x, "removeUpdateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRepeatMode(value: RepeatMode): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVolume(value: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStop(value: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSupportedMediaCommands(value: js.Array[MediaCommand]): Self = StObject.set(x, "supportedMediaCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedMediaCommandsVarargs(value: MediaCommand*): Self = StObject.set(x, "supportedMediaCommands", js.Array(value :_*))
    
    @scala.inline
    def setSupportsCommand(value: MediaCommand => Boolean): Self = StObject.set(x, "supportsCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVolume(value: Volume): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
