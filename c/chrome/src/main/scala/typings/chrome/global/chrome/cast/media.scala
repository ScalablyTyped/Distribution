package typings.chrome.global.chrome.cast

import typings.chrome.chrome.cast.media.IdleReason
import typings.chrome.chrome.cast.media.MediaCommand
import typings.chrome.chrome.cast.media.MetadataType
import typings.chrome.chrome.cast.media.PlayerState
import typings.chrome.chrome.cast.media.RepeatMode
import typings.chrome.chrome.cast.media.ResumeState
import typings.chrome.chrome.cast.media.StreamType
import typings.chrome.chrome.cast.media.TextTrackEdgeType
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily
import typings.chrome.chrome.cast.media.TextTrackFontStyle
import typings.chrome.chrome.cast.media.TextTrackType
import typings.chrome.chrome.cast.media.TextTrackWindowType
import typings.chrome.chrome.cast.media.TrackType
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  @JSGlobal("chrome.cast.media")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.cast.media.DEFAULT_MEDIA_RECEIVER_APP_ID")
  @js.native
  def DEFAULT_MEDIA_RECEIVER_APP_ID: String = js.native
  inline def DEFAULT_MEDIA_RECEIVER_APP_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MEDIA_RECEIVER_APP_ID")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.cast.media.EditTracksInfoRequest")
  @js.native
  /**
    * @param opt_activeTrackIds
    * @param opt_textTrackStyle
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.EditTracksInfoRequest
    */
  open class EditTracksInfoRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.EditTracksInfoRequest {
    def this(activeTrackIds: js.Array[Double]) = this()
    def this(activeTrackIds: js.Array[Double], textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle) = this()
    def this(activeTrackIds: Unit, textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle) = this()
    
    /* CompleteClass */
    var activeTrackIds: js.Array[Double] = js.native
    
    /* CompleteClass */
    var textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle = js.native
  }
  
  @JSGlobal("chrome.cast.media.GenericMediaMetadata")
  @js.native
  open class GenericMediaMetadata ()
    extends StObject
       with typings.chrome.chrome.cast.media.GenericMediaMetadata {
    
    /* CompleteClass */
    var images: js.Array[typings.chrome.chrome.cast.Image] = js.native
    
    /* CompleteClass */
    var metadataType: MetadataType = js.native
    
    /* CompleteClass */
    var releaseDate: String = js.native
    
    /** @deprecated. Use releaseDate instead. */
    /* CompleteClass */
    var releaseYear: Double = js.native
    
    /* CompleteClass */
    var subtitle: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /** @deprecated. Use metadataType instead. */
    /* CompleteClass */
    var `type`: MetadataType = js.native
  }
  
  @JSGlobal("chrome.cast.media.GetStatusRequest")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.GetStatusRequest
    */
  open class GetStatusRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.GetStatusRequest {
    
    /* CompleteClass */
    var customData: js.Object = js.native
  }
  
  @JSGlobal("chrome.cast.media.IdleReason")
  @js.native
  object IdleReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.IdleReason & String] = js.native
    
    /* "CANCELLED" */ val CANCELLED: typings.chrome.chrome.cast.media.IdleReason.CANCELLED & String = js.native
    
    /* "ERROR" */ val ERROR: typings.chrome.chrome.cast.media.IdleReason.ERROR & String = js.native
    
    /* "FINISHED" */ val FINISHED: typings.chrome.chrome.cast.media.IdleReason.FINISHED & String = js.native
    
    /* "INTERRUPTED" */ val INTERRUPTED: typings.chrome.chrome.cast.media.IdleReason.INTERRUPTED & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.LiveSeekableRange")
  @js.native
  /**
    * @param start
    * @param end
    * @param isMovingWindow
    * @param isLiveDone
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LiveSeekableRange
    */
  open class LiveSeekableRange ()
    extends StObject
       with typings.chrome.chrome.cast.media.LiveSeekableRange {
    def this(start: Double) = this()
    def this(start: Double, end: Double) = this()
    def this(start: Unit, end: Double) = this()
    def this(start: Double, end: Double, isMovingWindow: Boolean) = this()
    def this(start: Double, end: Unit, isMovingWindow: Boolean) = this()
    def this(start: Unit, end: Double, isMovingWindow: Boolean) = this()
    def this(start: Unit, end: Unit, isMovingWindow: Boolean) = this()
    def this(start: Double, end: Double, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(start: Double, end: Double, isMovingWindow: Unit, isLiveDone: Boolean) = this()
    def this(start: Double, end: Unit, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(start: Double, end: Unit, isMovingWindow: Unit, isLiveDone: Boolean) = this()
    def this(start: Unit, end: Double, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(start: Unit, end: Double, isMovingWindow: Unit, isLiveDone: Boolean) = this()
    def this(start: Unit, end: Unit, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(start: Unit, end: Unit, isMovingWindow: Unit, isLiveDone: Boolean) = this()
  }
  
  @JSGlobal("chrome.cast.media.LoadRequest")
  @js.native
  open class LoadRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.LoadRequest {
    /**
      * @param mediaInfo
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LoadRequest
      */
    def this(mediaInfo: typings.chrome.chrome.cast.media.MediaInfo) = this()
    
    /* CompleteClass */
    var activeTrackIds: js.Array[Double] = js.native
    
    /* CompleteClass */
    var autoplay: Boolean = js.native
    
    /* CompleteClass */
    var currentTime: Double = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var media: typings.chrome.chrome.cast.media.MediaInfo = js.native
  }
  
  @JSGlobal("chrome.cast.media.Media")
  @js.native
  open class Media protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.Media {
    /**
      * @param sessionId
      * @param mediaSessionId
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Media
      */
    def this(sessionId: String, mediaSessionId: Double) = this()
    
    /* CompleteClass */
    var activeTrackIds: js.Array[Double] = js.native
    
    /**
      * @param listener
      */
    /* CompleteClass */
    override def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var currentItemId: Double = js.native
    
    /** @deprecated. Use getEstimatedTime instead */
    /* CompleteClass */
    var currentTime: Double = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /**
      * @param editTracksInfoRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def editTracksInfo(
      editTracksInfoRequest: typings.chrome.chrome.cast.media.EditTracksInfoRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @return
      * @suppress {deprecated} Uses currentTime member to compute estimated time.
      */
    /* CompleteClass */
    override def getEstimatedTime(): Double = js.native
    
    /**
      * @param getStatusRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def getStatus(
      getStatusRequest: typings.chrome.chrome.cast.media.GetStatusRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var idleReason: IdleReason | Null = js.native
    
    /* CompleteClass */
    var items: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
    
    /* CompleteClass */
    var loadingItemId: Double = js.native
    
    /* CompleteClass */
    var media: typings.chrome.chrome.cast.media.MediaInfo = js.native
    
    /* CompleteClass */
    var mediaSessionId: Double = js.native
    
    /**
      * @param pauseRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def pause(
      pauseRequest: typings.chrome.chrome.cast.media.PauseRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param playRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def play(
      playRequest: typings.chrome.chrome.cast.media.PlayRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var playbackRate: Double = js.native
    
    /* CompleteClass */
    var playerState: PlayerState = js.native
    
    /* CompleteClass */
    var preloadedItemId: Double = js.native
    
    /**
      * @param item
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueAppendItem(
      item: typings.chrome.chrome.cast.media.QueueItem,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param queueInsertItemsRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueInsertItems(
      queueInsertItemsRequest: typings.chrome.chrome.cast.media.QueueInsertItemsRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param itemId
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueJumpToItem(
      itemId: Double,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param itemId
      * @param newIndex
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueMoveItemToNewIndex(
      itemId: Double,
      newIndex: Double,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueNext(
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queuePrev(
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param itemId
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueRemoveItem(
      itemId: Double,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param queueReorderItemsRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueReorderItems(
      queueReorderItemsRequest: typings.chrome.chrome.cast.media.QueueReorderItemsRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param repeatMode
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueSetRepeatMode(
      repeatMode: RepeatMode,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param queueUpdateItemsRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def queueUpdateItems(
      queueUpdateItemsRequest: typings.chrome.chrome.cast.media.QueueUpdateItemsRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param listener
      */
    /* CompleteClass */
    override def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var repeatMode: RepeatMode = js.native
    
    /**
      * @param seekRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def seek(
      seekRequest: typings.chrome.chrome.cast.media.SeekRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var sessionId: String = js.native
    
    /**
      * @param volumeRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def setVolume(
      volumeRequest: typings.chrome.chrome.cast.media.VolumeRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /**
      * @param stopRequest
      * @param successCallback
      * @param errorCallback
      */
    /* CompleteClass */
    override def stop(
      stopRequest: typings.chrome.chrome.cast.media.StopRequest,
      successCallback: js.Function,
      errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var supportedMediaCommands: js.Array[MediaCommand] = js.native
    
    /**
      * @param command
      * @return whether or not the receiver supports the given chrome.cast.media.MediaCommand
      */
    /* CompleteClass */
    override def supportsCommand(command: MediaCommand): Boolean = js.native
    
    /* CompleteClass */
    var volume: typings.chrome.chrome.cast.Volume = js.native
  }
  
  @JSGlobal("chrome.cast.media.MediaCommand")
  @js.native
  object MediaCommand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.MediaCommand & String] = js.native
    
    /* "pause" */ val PAUSE: typings.chrome.chrome.cast.media.MediaCommand.PAUSE & String = js.native
    
    /* "seek" */ val SEEK: typings.chrome.chrome.cast.media.MediaCommand.SEEK & String = js.native
    
    /* "stream_mute" */ val STREAM_MUTE: typings.chrome.chrome.cast.media.MediaCommand.STREAM_MUTE & String = js.native
    
    /* "stream_volume" */ val STREAM_VOLUME: typings.chrome.chrome.cast.media.MediaCommand.STREAM_VOLUME & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.MediaInfo")
  @js.native
  open class MediaInfo protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.MediaInfo {
    /**
      * @param contentId
      * @param contentType
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MediaInfo
      */
    def this(contentId: String, contentType: String) = this()
    
    /* CompleteClass */
    var contentId: String = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var duration: Double = js.native
    
    /* CompleteClass */
    var metadata: Any = js.native
    
    /* CompleteClass */
    var streamType: StreamType = js.native
    
    /* CompleteClass */
    var textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle = js.native
    
    /* CompleteClass */
    var tracks: js.Array[typings.chrome.chrome.cast.media.Track] = js.native
  }
  
  @JSGlobal("chrome.cast.media.MetadataType")
  @js.native
  object MetadataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chrome.chrome.cast.media.MetadataType & Double] = js.native
    
    /* 0 */ val GENERIC: typings.chrome.chrome.cast.media.MetadataType.GENERIC & Double = js.native
    
    /* 2 */ val MOVIE: typings.chrome.chrome.cast.media.MetadataType.MOVIE & Double = js.native
    
    /* 3 */ val MUSIC_TRACK: typings.chrome.chrome.cast.media.MetadataType.MUSIC_TRACK & Double = js.native
    
    /* 4 */ val PHOTO: typings.chrome.chrome.cast.media.MetadataType.PHOTO & Double = js.native
    
    /* 1 */ val TV_SHOW: typings.chrome.chrome.cast.media.MetadataType.TV_SHOW & Double = js.native
  }
  
  @JSGlobal("chrome.cast.media.MovieMediaMetadata")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MovieMediaMetadata
    */
  open class MovieMediaMetadata ()
    extends StObject
       with typings.chrome.chrome.cast.media.MovieMediaMetadata {
    
    /* CompleteClass */
    var images: js.Array[typings.chrome.chrome.cast.Image] = js.native
    
    /* CompleteClass */
    var metadataType: MetadataType = js.native
    
    /* CompleteClass */
    var releaseDate: String = js.native
    
    /** @deprecated. Use releaseDate instead. */
    /* CompleteClass */
    var releaseYear: Double = js.native
    
    /* CompleteClass */
    var studio: String = js.native
    
    /* CompleteClass */
    var subtitle: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /** @deprecated. Use metadataType instead. */
    /* CompleteClass */
    var `type`: MetadataType = js.native
  }
  
  @JSGlobal("chrome.cast.media.MusicTrackMediaMetadata")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MusicTrackMediaMetadata
    */
  open class MusicTrackMediaMetadata ()
    extends StObject
       with typings.chrome.chrome.cast.media.MusicTrackMediaMetadata {
    
    /* CompleteClass */
    var albumArtist: String = js.native
    
    /* CompleteClass */
    var albumName: String = js.native
    
    /* CompleteClass */
    var artist: String = js.native
    
    /** @deprecated. Use artist instead. */
    /* CompleteClass */
    var artistName: String = js.native
    
    /* CompleteClass */
    var composer: String = js.native
    
    /* CompleteClass */
    var discNumber: Double = js.native
    
    /* CompleteClass */
    var images: js.Array[typings.chrome.chrome.cast.Image] = js.native
    
    /* CompleteClass */
    var metadataType: MetadataType = js.native
    
    /* CompleteClass */
    var releaseDate: String = js.native
    
    /** @deprecated. Use releaseDate instead. */
    /* CompleteClass */
    var releaseYear: Double = js.native
    
    /* CompleteClass */
    var songName: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var trackNumber: Double = js.native
    
    /** @deprecated. Use metadataType instead. */
    /* CompleteClass */
    var `type`: MetadataType = js.native
  }
  
  @JSGlobal("chrome.cast.media.PauseRequest")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PauseRequest
    */
  open class PauseRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.PauseRequest {
    
    /* CompleteClass */
    var customData: js.Object = js.native
  }
  
  @JSGlobal("chrome.cast.media.PhotoMediaMetadata")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PhotoMediaMetadata
    */
  open class PhotoMediaMetadata ()
    extends StObject
       with typings.chrome.chrome.cast.media.PhotoMediaMetadata {
    
    /* CompleteClass */
    var artist: String = js.native
    
    /* CompleteClass */
    var creationDateTime: String = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var images: js.Array[typings.chrome.chrome.cast.Image] = js.native
    
    /* CompleteClass */
    var latitude: Double = js.native
    
    /* CompleteClass */
    var location: String = js.native
    
    /* CompleteClass */
    var longitude: Double = js.native
    
    /* CompleteClass */
    var metadataType: MetadataType = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /** @deprecated. Use metadataType instead. */
    /* CompleteClass */
    var `type`: MetadataType = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("chrome.cast.media.PlayRequest")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PlayRequest
    */
  open class PlayRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.PlayRequest {
    
    /* CompleteClass */
    var customData: js.Object = js.native
  }
  
  @JSGlobal("chrome.cast.media.PlayerState")
  @js.native
  object PlayerState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.PlayerState & String] = js.native
    
    /* "BUFFERING" */ val BUFFERING: typings.chrome.chrome.cast.media.PlayerState.BUFFERING & String = js.native
    
    /* "IDLE" */ val IDLE: typings.chrome.chrome.cast.media.PlayerState.IDLE & String = js.native
    
    /* "PAUSED" */ val PAUSED: typings.chrome.chrome.cast.media.PlayerState.PAUSED & String = js.native
    
    /* "PLAYING" */ val PLAYING: typings.chrome.chrome.cast.media.PlayerState.PLAYING & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueInsertItemsRequest")
  @js.native
  open class QueueInsertItemsRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueInsertItemsRequest {
    /**
      * @param itemsToInsert
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueInsertItemsRequest
      */
    def this(itemsToInsert: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var insertBefore: Double = js.native
    
    /* CompleteClass */
    var items: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueItem")
  @js.native
  open class QueueItem protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueItem {
    /**
      * @param mediaInfo
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueItem
      */
    def this(mediaInfo: typings.chrome.chrome.cast.media.MediaInfo) = this()
    
    /* CompleteClass */
    var activeTrackIds: js.Array[Number] = js.native
    
    /* CompleteClass */
    var autoplay: Boolean = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var itemId: Double = js.native
    
    /* CompleteClass */
    var media: typings.chrome.chrome.cast.media.MediaInfo = js.native
    
    /* CompleteClass */
    var preloadTime: Double = js.native
    
    /* CompleteClass */
    var startTime: Double = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueLoadRequest")
  @js.native
  open class QueueLoadRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueLoadRequest {
    /**
      * @param items
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueLoadRequest
      */
    def this(items: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var items: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
    
    /* CompleteClass */
    var repeatMode: RepeatMode = js.native
    
    /* CompleteClass */
    var startIndex: Double = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueRemoveItemsRequest")
  @js.native
  open class QueueRemoveItemsRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueRemoveItemsRequest {
    /**
      * @param itemIdsToRemove
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueRemoveItemsRequest
      */
    def this(itemIdsToRemove: js.Array[Double]) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var itemIds: js.Array[Double] = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueReorderItemsRequest")
  @js.native
  open class QueueReorderItemsRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueReorderItemsRequest {
    /**
      * @param itemIdsToReorder
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueReorderItemsRequest
      */
    def this(itemIdsToReorder: js.Array[Double]) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var insertBefore: Double = js.native
    
    /* CompleteClass */
    var itemIds: js.Array[Double] = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueUpdateItemsRequest")
  @js.native
  open class QueueUpdateItemsRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.QueueUpdateItemsRequest {
    /**
      * @param itemsToUpdate
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueUpdateItemsRequest
      */
    def this(itemsToUpdate: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var item: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
  }
  
  @JSGlobal("chrome.cast.media.RepeatMode")
  @js.native
  object RepeatMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.RepeatMode & String] = js.native
    
    /* "REPEAT_ALL" */ val ALL: typings.chrome.chrome.cast.media.RepeatMode.ALL & String = js.native
    
    /* "REPEAT_ALL_AND_SHUFFLE" */ val ALL_AND_SHUFFLE: typings.chrome.chrome.cast.media.RepeatMode.ALL_AND_SHUFFLE & String = js.native
    
    /* "REPEAT_OFF" */ val OFF: typings.chrome.chrome.cast.media.RepeatMode.OFF & String = js.native
    
    /* "REPEAT_SINGLE" */ val SINGLE: typings.chrome.chrome.cast.media.RepeatMode.SINGLE & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.ResumeState")
  @js.native
  object ResumeState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.ResumeState & String] = js.native
    
    /* "PLAYBACK_PAUSE" */ val PLAYBACK_PAUSE: typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_PAUSE & String = js.native
    
    /* "PLAYBACK_START" */ val PLAYBACK_START: typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_START & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.SeekRequest")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.SeekRequest
    */
  open class SeekRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.SeekRequest {
    
    /* CompleteClass */
    var currentTime: Double = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var resumeState: ResumeState = js.native
  }
  
  @JSGlobal("chrome.cast.media.StopRequest")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.StopRequest
    */
  open class StopRequest ()
    extends StObject
       with typings.chrome.chrome.cast.media.StopRequest {
    
    /* CompleteClass */
    var customData: js.Object = js.native
  }
  
  @JSGlobal("chrome.cast.media.StreamType")
  @js.native
  object StreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.StreamType & String] = js.native
    
    /* "BUFFERED" */ val BUFFERED: typings.chrome.chrome.cast.media.StreamType.BUFFERED & String = js.native
    
    /* "LIVE" */ val LIVE: typings.chrome.chrome.cast.media.StreamType.LIVE & String = js.native
    
    /* "OTHER" */ val OTHER: typings.chrome.chrome.cast.media.StreamType.OTHER & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackEdgeType")
  @js.native
  object TextTrackEdgeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackEdgeType & String] = js.native
    
    /* "DEPRESSED" */ val DEPRESSED: typings.chrome.chrome.cast.media.TextTrackEdgeType.DEPRESSED & String = js.native
    
    /* "DROP_SHADOW" */ val DROP_SHADOW: typings.chrome.chrome.cast.media.TextTrackEdgeType.DROP_SHADOW & String = js.native
    
    /* "NONE" */ val NONE: typings.chrome.chrome.cast.media.TextTrackEdgeType.NONE & String = js.native
    
    /* "OUTLINE" */ val OUTLINE: typings.chrome.chrome.cast.media.TextTrackEdgeType.OUTLINE & String = js.native
    
    /* "RAISED" */ val RAISED: typings.chrome.chrome.cast.media.TextTrackEdgeType.RAISED & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackFontGenericFamily")
  @js.native
  object TextTrackFontGenericFamily extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackFontGenericFamily & String] = js.native
    
    /* "CASUAL" */ val CASUAL: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CASUAL & String = js.native
    
    /* "CURSIVE" */ val CURSIVE: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CURSIVE & String = js.native
    
    /* "MONOSPACED_SANS_SERIF" */ val MONOSPACED_SANS_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SANS_SERIF & String = js.native
    
    /* "MONOSPACED_SERIF" */ val MONOSPACED_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SERIF & String = js.native
    
    /* "SANS_SERIF" */ val SANS_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SANS_SERIF & String = js.native
    
    /* "SERIF" */ val SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SERIF & String = js.native
    
    /* "SMALL_CAPITALS" */ val SMALL_CAPITALS: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SMALL_CAPITALS & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackFontStyle")
  @js.native
  object TextTrackFontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackFontStyle & String] = js.native
    
    /* "BOLD" */ val BOLD: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD & String = js.native
    
    /* "BOLD_ITALIC" */ val BOLD_ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD_ITALIC & String = js.native
    
    /* "ITALIC" */ val ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.ITALIC & String = js.native
    
    /* "NORMAL" */ val NORMAL: typings.chrome.chrome.cast.media.TextTrackFontStyle.NORMAL & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackStyle")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TextTrackStyle
    */
  open class TextTrackStyle ()
    extends StObject
       with typings.chrome.chrome.cast.media.TextTrackStyle {
    
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var edgeColor: String = js.native
    
    /* CompleteClass */
    var edgeType: TextTrackEdgeType = js.native
    
    /* CompleteClass */
    var fontFamily: String = js.native
    
    /* CompleteClass */
    var fontGenericFamily: TextTrackFontGenericFamily = js.native
    
    /* CompleteClass */
    var fontScale: Double = js.native
    
    /* CompleteClass */
    var fontStyle: TextTrackFontStyle = js.native
    
    /* CompleteClass */
    var foregroundColor: String = js.native
    
    /* CompleteClass */
    var windowColor: String = js.native
    
    /* CompleteClass */
    var windowRoundedCornerRadius: Double = js.native
    
    /* CompleteClass */
    var windowType: TextTrackWindowType = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackType")
  @js.native
  object TextTrackType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackType & String] = js.native
    
    /* "CAPTIONS" */ val CAPTIONS: typings.chrome.chrome.cast.media.TextTrackType.CAPTIONS & String = js.native
    
    /* "CHAPTERS" */ val CHAPTERS: typings.chrome.chrome.cast.media.TextTrackType.CHAPTERS & String = js.native
    
    /* "DESCRIPTIONS" */ val DESCRIPTIONS: typings.chrome.chrome.cast.media.TextTrackType.DESCRIPTIONS & String = js.native
    
    /* "METADATA" */ val METADATA: typings.chrome.chrome.cast.media.TextTrackType.METADATA & String = js.native
    
    /* "SUBTITLES" */ val SUBTITLES: typings.chrome.chrome.cast.media.TextTrackType.SUBTITLES & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackWindowType")
  @js.native
  object TextTrackWindowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackWindowType & String] = js.native
    
    /* "NONE" */ val NONE: typings.chrome.chrome.cast.media.TextTrackWindowType.NONE & String = js.native
    
    /* "NORMAL" */ val NORMAL: typings.chrome.chrome.cast.media.TextTrackWindowType.NORMAL & String = js.native
    
    /* "ROUNDED_CORNERS" */ val ROUNDED_CORNERS: typings.chrome.chrome.cast.media.TextTrackWindowType.ROUNDED_CORNERS & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.Track")
  @js.native
  open class Track protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.Track {
    /**
      * @param trackId
      * @param trackType
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Track
      */
    def this(trackId: Double, trackType: TrackType) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var subtype: TextTrackType = js.native
    
    /* CompleteClass */
    var trackContentId: String = js.native
    
    /* CompleteClass */
    var trackContentType: String = js.native
    
    /* CompleteClass */
    var trackId: Double = js.native
    
    /* CompleteClass */
    var `type`: TrackType = js.native
  }
  
  @JSGlobal("chrome.cast.media.TrackType")
  @js.native
  object TrackType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TrackType & String] = js.native
    
    /* "AUDIO" */ val AUDIO: typings.chrome.chrome.cast.media.TrackType.AUDIO & String = js.native
    
    /* "TEXT" */ val TEXT: typings.chrome.chrome.cast.media.TrackType.TEXT & String = js.native
    
    /* "VIDEO" */ val VIDEO: typings.chrome.chrome.cast.media.TrackType.VIDEO & String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TvShowMediaMetadata")
  @js.native
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TvShowMediaMetadata
    */
  open class TvShowMediaMetadata ()
    extends StObject
       with typings.chrome.chrome.cast.media.TvShowMediaMetadata {
    
    /* CompleteClass */
    var episode: Double = js.native
    
    /** @deprecated. Use episode instead. */
    /* CompleteClass */
    var episodeNumber: Double = js.native
    
    /** @deprecated. Use title instead. */
    /* CompleteClass */
    var episodeTitle: String = js.native
    
    /* CompleteClass */
    var images: js.Array[typings.chrome.chrome.cast.Image] = js.native
    
    /* CompleteClass */
    var metadataType: MetadataType = js.native
    
    /* CompleteClass */
    var originalAirdate: String = js.native
    
    /** @deprecated. Use originalAirdate instead. */
    /* CompleteClass */
    var releaseYear: Double = js.native
    
    /* CompleteClass */
    var season: Double = js.native
    
    /** @deprecated. Use season instead. */
    /* CompleteClass */
    var seasonNumber: Double = js.native
    
    /* CompleteClass */
    var seriesTitle: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /** @deprecated. Use metadataType instead. */
    /* CompleteClass */
    var `type`: MetadataType = js.native
  }
  
  @JSGlobal("chrome.cast.media.VolumeRequest")
  @js.native
  open class VolumeRequest protected ()
    extends StObject
       with typings.chrome.chrome.cast.media.VolumeRequest {
    /**
      * @param volume
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.VolumeRequest
      */
    def this(volume: typings.chrome.chrome.cast.Volume) = this()
    
    /* CompleteClass */
    var customData: js.Object = js.native
    
    /* CompleteClass */
    var volume: typings.chrome.chrome.cast.Volume = js.native
  }
  
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  object timeout {
    
    @JSGlobal("chrome.cast.media.timeout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.cast.media.timeout.editTracksInfo")
    @js.native
    def editTracksInfo: Double = js.native
    inline def editTracksInfo_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editTracksInfo")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.getStatus")
    @js.native
    def getStatus: Double = js.native
    inline def getStatus_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.load")
    @js.native
    def load: Double = js.native
    inline def load_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("load")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.pause")
    @js.native
    def pause: Double = js.native
    inline def pause_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pause")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.play")
    @js.native
    def play: Double = js.native
    inline def play_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("play")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueInsert")
    @js.native
    def queueInsert: Double = js.native
    inline def queueInsert_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueInsert")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueLoad")
    @js.native
    def queueLoad: Double = js.native
    inline def queueLoad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueLoad")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueRemove")
    @js.native
    def queueRemove: Double = js.native
    inline def queueRemove_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueRemove")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueReorder")
    @js.native
    def queueReorder: Double = js.native
    inline def queueReorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueReorder")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueUpdate")
    @js.native
    def queueUpdate: Double = js.native
    inline def queueUpdate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueUpdate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.seek")
    @js.native
    def seek: Double = js.native
    inline def seek_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seek")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.setVolume")
    @js.native
    def setVolume: Double = js.native
    inline def setVolume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.stop")
    @js.native
    def stop: Double = js.native
    inline def stop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
  }
}
