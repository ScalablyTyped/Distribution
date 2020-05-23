package typings.chrome.global.chrome.cast.media

import typings.chrome.chrome.cast.Error
import typings.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.Media")
@js.native
class Media protected ()
  extends typings.chrome.chrome.cast.media.Media {
  /**
    * @param {string} sessionId
    * @param {number} mediaSessionId
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Media
    */
  def this(sessionId: String, mediaSessionId: Double) = this()
  /* CompleteClass */
  override var activeTrackIds: js.Array[Double] = js.native
  /* CompleteClass */
  override var currentItemId: Double = js.native
  /** @deprecated. Use getEstimatedTime instead */
  /* CompleteClass */
  override var currentTime: Double = js.native
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var idleReason: typings.chrome.chrome.cast.media.IdleReason = js.native
  /* CompleteClass */
  override var items: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
  /* CompleteClass */
  override var loadingItemId: Double = js.native
  /* CompleteClass */
  override var media: typings.chrome.chrome.cast.media.MediaInfo = js.native
  /* CompleteClass */
  override var mediaSessionId: Double = js.native
  /* CompleteClass */
  override var playbackRate: Double = js.native
  /* CompleteClass */
  override var playerState: typings.chrome.chrome.cast.media.PlayerState = js.native
  /* CompleteClass */
  override var preloadedItemId: Double = js.native
  /* CompleteClass */
  override var repeatMode: typings.chrome.chrome.cast.media.RepeatMode = js.native
  /* CompleteClass */
  override var sessionId: String = js.native
  /* CompleteClass */
  override var supportedMediaCommands: js.Array[typings.chrome.chrome.cast.media.MediaCommand] = js.native
  /* CompleteClass */
  override var volume: Volume = js.native
  /**
    * @param {function(boolean)} listener
    */
  /* CompleteClass */
  override def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.EditTracksInfoRequest} editTracksInfoRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def editTracksInfo(
    editTracksInfoRequest: typings.chrome.chrome.cast.media.EditTracksInfoRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @return {number}
    * @suppress {deprecated} Uses currentTime member to compute estimated time.
    */
  /* CompleteClass */
  override def getEstimatedTime(): Double = js.native
  /**
    * @param {chrome.cast.media.GetStatusRequest} getStatusRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def getStatus(
    getStatusRequest: typings.chrome.chrome.cast.media.GetStatusRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PauseRequest} pauseRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def pause(
    pauseRequest: typings.chrome.chrome.cast.media.PauseRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PlayRequest} playRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def play(
    playRequest: typings.chrome.chrome.cast.media.PlayRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueItem} item
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueAppendItem(
    item: typings.chrome.chrome.cast.media.QueueItem,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueInsertItemsRequest} queueInsertItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueInsertItems(
    queueInsertItemsRequest: typings.chrome.chrome.cast.media.QueueInsertItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueJumpToItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {!number} newIndex
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueMoveItemToNewIndex(
    itemId: Double,
    newIndex: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueNext(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queuePrev(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueRemoveItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueReorderItemsRequest} queueReorderItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueReorderItems(
    queueReorderItemsRequest: typings.chrome.chrome.cast.media.QueueReorderItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.RepeatMode} repeatMode
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueSetRepeatMode(
    repeatMode: typings.chrome.chrome.cast.media.RepeatMode,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueUpdateItemsRequest} queueUpdateItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def queueUpdateItems(
    queueUpdateItemsRequest: typings.chrome.chrome.cast.media.QueueUpdateItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function(boolean)} listener
    */
  /* CompleteClass */
  override def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.SeekRequest} seekRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def seek(
    seekRequest: typings.chrome.chrome.cast.media.SeekRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.VolumeRequest} volumeRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def setVolume(
    volumeRequest: typings.chrome.chrome.cast.media.VolumeRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.StopRequest} stopRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  /* CompleteClass */
  override def stop(
    stopRequest: typings.chrome.chrome.cast.media.StopRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.MediaCommand} command
    * @return {boolean}
    */
  /* CompleteClass */
  override def supportsCommand(command: typings.chrome.chrome.cast.media.MediaCommand): Boolean = js.native
}

