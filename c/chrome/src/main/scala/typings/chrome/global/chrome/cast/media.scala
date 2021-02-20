package typings.chrome.global.chrome.cast

import typings.chrome.chrome.cast.media.TrackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  @JSGlobal("chrome.cast.media")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.cast.media.DEFAULT_MEDIA_RECEIVER_APP_ID")
  @js.native
  def DEFAULT_MEDIA_RECEIVER_APP_ID: String = js.native
  @scala.inline
  def DEFAULT_MEDIA_RECEIVER_APP_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MEDIA_RECEIVER_APP_ID")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.cast.media.EditTracksInfoRequest")
  @js.native
  /**
    * @param {Array<number>=} opt_activeTrackIds
    * @param {chrome.cast.media.TextTrackStyle=} opt_textTrackStyle
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.EditTracksInfoRequest
    */
  class EditTracksInfoRequest ()
    extends typings.chrome.chrome.cast.media.EditTracksInfoRequest {
    def this(activeTrackIds: js.Array[Double]) = this()
    def this(
      activeTrackIds: js.UndefOr[scala.Nothing],
      textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle
    ) = this()
    def this(activeTrackIds: js.Array[Double], textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle) = this()
  }
  
  @JSGlobal("chrome.cast.media.GenericMediaMetadata")
  @js.native
  class GenericMediaMetadata ()
    extends typings.chrome.chrome.cast.media.GenericMediaMetadata
  
  @JSGlobal("chrome.cast.media.GetStatusRequest")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.GetStatusRequest
    */
  class GetStatusRequest ()
    extends typings.chrome.chrome.cast.media.GetStatusRequest
  
  @JSGlobal("chrome.cast.media.IdleReason")
  @js.native
  object IdleReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.IdleReason with String] = js.native
    
    /* "CANCELLED" */ val CANCELLED: typings.chrome.chrome.cast.media.IdleReason.CANCELLED with String = js.native
    
    /* "ERROR" */ val ERROR: typings.chrome.chrome.cast.media.IdleReason.ERROR with String = js.native
    
    /* "FINISHED" */ val FINISHED: typings.chrome.chrome.cast.media.IdleReason.FINISHED with String = js.native
    
    /* "INTERRUPTED" */ val INTERRUPTED: typings.chrome.chrome.cast.media.IdleReason.INTERRUPTED with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.LiveSeekableRange")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LiveSeekableRange
    */
  class LiveSeekableRange ()
    extends typings.chrome.chrome.cast.media.LiveSeekableRange {
    def this(start: Double) = this()
    def this(start: js.UndefOr[scala.Nothing], end: Double) = this()
    def this(start: Double, end: Double) = this()
    def this(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], isMovingWindow: Boolean) = this()
    def this(start: js.UndefOr[scala.Nothing], end: Double, isMovingWindow: Boolean) = this()
    def this(start: Double, end: js.UndefOr[scala.Nothing], isMovingWindow: Boolean) = this()
    def this(start: Double, end: Double, isMovingWindow: Boolean) = this()
    def this(
      start: js.UndefOr[scala.Nothing],
      end: js.UndefOr[scala.Nothing],
      isMovingWindow: js.UndefOr[scala.Nothing],
      isLiveDone: Boolean
    ) = this()
    def this(
      start: js.UndefOr[scala.Nothing],
      end: js.UndefOr[scala.Nothing],
      isMovingWindow: Boolean,
      isLiveDone: Boolean
    ) = this()
    def this(
      start: js.UndefOr[scala.Nothing],
      end: Double,
      isMovingWindow: js.UndefOr[scala.Nothing],
      isLiveDone: Boolean
    ) = this()
    def this(start: js.UndefOr[scala.Nothing], end: Double, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(
      start: Double,
      end: js.UndefOr[scala.Nothing],
      isMovingWindow: js.UndefOr[scala.Nothing],
      isLiveDone: Boolean
    ) = this()
    def this(start: Double, end: js.UndefOr[scala.Nothing], isMovingWindow: Boolean, isLiveDone: Boolean) = this()
    def this(start: Double, end: Double, isMovingWindow: js.UndefOr[scala.Nothing], isLiveDone: Boolean) = this()
    def this(start: Double, end: Double, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
  }
  
  @JSGlobal("chrome.cast.media.LoadRequest")
  @js.native
  class LoadRequest protected ()
    extends typings.chrome.chrome.cast.media.LoadRequest {
    /**
      * @param {!chrome.cast.media.MediaInfo} mediaInfo
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LoadRequest
      */
    def this(mediaInfo: typings.chrome.chrome.cast.media.MediaInfo) = this()
  }
  
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
  }
  
  @JSGlobal("chrome.cast.media.MediaCommand")
  @js.native
  object MediaCommand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.MediaCommand with String] = js.native
    
    /* "pause" */ val PAUSE: typings.chrome.chrome.cast.media.MediaCommand.PAUSE with String = js.native
    
    /* "seek" */ val SEEK: typings.chrome.chrome.cast.media.MediaCommand.SEEK with String = js.native
    
    /* "stream_mute" */ val STREAM_MUTE: typings.chrome.chrome.cast.media.MediaCommand.STREAM_MUTE with String = js.native
    
    /* "stream_volume" */ val STREAM_VOLUME: typings.chrome.chrome.cast.media.MediaCommand.STREAM_VOLUME with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.MediaInfo")
  @js.native
  class MediaInfo protected ()
    extends typings.chrome.chrome.cast.media.MediaInfo {
    /**
      * @param {string} contentId
      * @param {string} contentType
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MediaInfo
      */
    def this(contentId: String, contentType: String) = this()
  }
  
  @JSGlobal("chrome.cast.media.MetadataType")
  @js.native
  object MetadataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chrome.chrome.cast.media.MetadataType with Double] = js.native
    
    /* 0 */ val GENERIC: typings.chrome.chrome.cast.media.MetadataType.GENERIC with Double = js.native
    
    /* 2 */ val MOVIE: typings.chrome.chrome.cast.media.MetadataType.MOVIE with Double = js.native
    
    /* 3 */ val MUSIC_TRACK: typings.chrome.chrome.cast.media.MetadataType.MUSIC_TRACK with Double = js.native
    
    /* 4 */ val PHOTO: typings.chrome.chrome.cast.media.MetadataType.PHOTO with Double = js.native
    
    /* 1 */ val TV_SHOW: typings.chrome.chrome.cast.media.MetadataType.TV_SHOW with Double = js.native
  }
  
  @JSGlobal("chrome.cast.media.MovieMediaMetadata")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MovieMediaMetadata
    */
  class MovieMediaMetadata ()
    extends typings.chrome.chrome.cast.media.MovieMediaMetadata
  
  @JSGlobal("chrome.cast.media.MusicTrackMediaMetadata")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MusicTrackMediaMetadata
    */
  class MusicTrackMediaMetadata ()
    extends typings.chrome.chrome.cast.media.MusicTrackMediaMetadata
  
  @JSGlobal("chrome.cast.media.PauseRequest")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PauseRequest
    */
  class PauseRequest ()
    extends typings.chrome.chrome.cast.media.PauseRequest
  
  @JSGlobal("chrome.cast.media.PhotoMediaMetadata")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PhotoMediaMetadata
    */
  class PhotoMediaMetadata ()
    extends typings.chrome.chrome.cast.media.PhotoMediaMetadata
  
  @JSGlobal("chrome.cast.media.PlayRequest")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PlayRequest
    */
  class PlayRequest ()
    extends typings.chrome.chrome.cast.media.PlayRequest
  
  @JSGlobal("chrome.cast.media.PlayerState")
  @js.native
  object PlayerState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.PlayerState with String] = js.native
    
    /* "BUFFERING" */ val BUFFERING: typings.chrome.chrome.cast.media.PlayerState.BUFFERING with String = js.native
    
    /* "IDLE" */ val IDLE: typings.chrome.chrome.cast.media.PlayerState.IDLE with String = js.native
    
    /* "PAUSED" */ val PAUSED: typings.chrome.chrome.cast.media.PlayerState.PAUSED with String = js.native
    
    /* "PLAYING" */ val PLAYING: typings.chrome.chrome.cast.media.PlayerState.PLAYING with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.QueueInsertItemsRequest")
  @js.native
  class QueueInsertItemsRequest protected ()
    extends typings.chrome.chrome.cast.media.QueueInsertItemsRequest {
    /**
      * @param {!Array<chrome.cast.media.QueueItem>}
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueInsertItemsRequest
      */
    def this(itemsToInsert: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
  }
  
  @JSGlobal("chrome.cast.media.QueueItem")
  @js.native
  class QueueItem protected ()
    extends typings.chrome.chrome.cast.media.QueueItem {
    /**
      * @param {!chrome.cast.media.MediaInfo} mediaInfo
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueItem
      */
    def this(mediaInfo: typings.chrome.chrome.cast.media.MediaInfo) = this()
  }
  
  @JSGlobal("chrome.cast.media.QueueLoadRequest")
  @js.native
  class QueueLoadRequest protected ()
    extends typings.chrome.chrome.cast.media.QueueLoadRequest {
    /**
      * @param {!Array<chrome.cast.media.QueueItem>} items
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueLoadRequest
      */
    def this(items: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
  }
  
  @JSGlobal("chrome.cast.media.QueueRemoveItemsRequest")
  @js.native
  class QueueRemoveItemsRequest protected ()
    extends typings.chrome.chrome.cast.media.QueueRemoveItemsRequest {
    /**
      * @param {!Array<number>}
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueRemoveItemsRequest
      */
    def this(itemIdsToRemove: js.Array[Double]) = this()
  }
  
  @JSGlobal("chrome.cast.media.QueueReorderItemsRequest")
  @js.native
  class QueueReorderItemsRequest protected ()
    extends typings.chrome.chrome.cast.media.QueueReorderItemsRequest {
    /**
      * @param {!Array<number>}
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueReorderItemsRequest
      */
    def this(itemIdsToReorder: js.Array[Double]) = this()
  }
  
  @JSGlobal("chrome.cast.media.QueueUpdateItemsRequest")
  @js.native
  class QueueUpdateItemsRequest protected ()
    extends typings.chrome.chrome.cast.media.QueueUpdateItemsRequest {
    /**
      * @param {!Array<chrome.cast.media.QueueItem>}
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueUpdateItemsRequest
      */
    def this(itemsToUpdate: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
  }
  
  @JSGlobal("chrome.cast.media.RepeatMode")
  @js.native
  object RepeatMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.RepeatMode with String] = js.native
    
    /* "REPEAT_ALL" */ val ALL: typings.chrome.chrome.cast.media.RepeatMode.ALL with String = js.native
    
    /* "REPEAT_ALL_AND_SHUFFLE" */ val ALL_AND_SHUFFLE: typings.chrome.chrome.cast.media.RepeatMode.ALL_AND_SHUFFLE with String = js.native
    
    /* "REPEAT_OFF" */ val OFF: typings.chrome.chrome.cast.media.RepeatMode.OFF with String = js.native
    
    /* "REPEAT_SINGLE" */ val SINGLE: typings.chrome.chrome.cast.media.RepeatMode.SINGLE with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.ResumeState")
  @js.native
  object ResumeState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.ResumeState with String] = js.native
    
    /* "PLAYBACK_PAUSE" */ val PLAYBACK_PAUSE: typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_PAUSE with String = js.native
    
    /* "PLAYBACK_START" */ val PLAYBACK_START: typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_START with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.SeekRequest")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.SeekRequest
    */
  class SeekRequest ()
    extends typings.chrome.chrome.cast.media.SeekRequest
  
  @JSGlobal("chrome.cast.media.StopRequest")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.StopRequest
    */
  class StopRequest ()
    extends typings.chrome.chrome.cast.media.StopRequest
  
  @JSGlobal("chrome.cast.media.StreamType")
  @js.native
  object StreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.StreamType with String] = js.native
    
    /* "BUFFERED" */ val BUFFERED: typings.chrome.chrome.cast.media.StreamType.BUFFERED with String = js.native
    
    /* "LIVE" */ val LIVE: typings.chrome.chrome.cast.media.StreamType.LIVE with String = js.native
    
    /* "OTHER" */ val OTHER: typings.chrome.chrome.cast.media.StreamType.OTHER with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackEdgeType")
  @js.native
  object TextTrackEdgeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackEdgeType with String] = js.native
    
    /* "DEPRESSED" */ val DEPRESSED: typings.chrome.chrome.cast.media.TextTrackEdgeType.DEPRESSED with String = js.native
    
    /* "DROP_SHADOW" */ val DROP_SHADOW: typings.chrome.chrome.cast.media.TextTrackEdgeType.DROP_SHADOW with String = js.native
    
    /* "NONE" */ val NONE: typings.chrome.chrome.cast.media.TextTrackEdgeType.NONE with String = js.native
    
    /* "OUTLINE" */ val OUTLINE: typings.chrome.chrome.cast.media.TextTrackEdgeType.OUTLINE with String = js.native
    
    /* "RAISED" */ val RAISED: typings.chrome.chrome.cast.media.TextTrackEdgeType.RAISED with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackFontGenericFamily")
  @js.native
  object TextTrackFontGenericFamily extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackFontGenericFamily with String] = js.native
    
    /* "CASUAL" */ val CASUAL: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CASUAL with String = js.native
    
    /* "CURSIVE" */ val CURSIVE: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CURSIVE with String = js.native
    
    /* "MONOSPACED_SANS_SERIF" */ val MONOSPACED_SANS_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SANS_SERIF with String = js.native
    
    /* "MONOSPACED_SERIF" */ val MONOSPACED_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SERIF with String = js.native
    
    /* "SANS_SERIF" */ val SANS_SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SANS_SERIF with String = js.native
    
    /* "SERIF" */ val SERIF: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SERIF with String = js.native
    
    /* "SMALL_CAPITALS" */ val SMALL_CAPITALS: typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SMALL_CAPITALS with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackFontStyle")
  @js.native
  object TextTrackFontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackFontStyle with String] = js.native
    
    /* "BOLD" */ val BOLD: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD with String = js.native
    
    /* "BOLD_ITALIC" */ val BOLD_ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD_ITALIC with String = js.native
    
    /* "ITALIC" */ val ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.ITALIC with String = js.native
    
    /* "NORMAL" */ val NORMAL: typings.chrome.chrome.cast.media.TextTrackFontStyle.NORMAL with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackStyle")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TextTrackStyle
    */
  class TextTrackStyle ()
    extends typings.chrome.chrome.cast.media.TextTrackStyle
  
  @JSGlobal("chrome.cast.media.TextTrackType")
  @js.native
  object TextTrackType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackType with String] = js.native
    
    /* "CAPTIONS" */ val CAPTIONS: typings.chrome.chrome.cast.media.TextTrackType.CAPTIONS with String = js.native
    
    /* "CHAPTERS" */ val CHAPTERS: typings.chrome.chrome.cast.media.TextTrackType.CHAPTERS with String = js.native
    
    /* "DESCRIPTIONS" */ val DESCRIPTIONS: typings.chrome.chrome.cast.media.TextTrackType.DESCRIPTIONS with String = js.native
    
    /* "METADATA" */ val METADATA: typings.chrome.chrome.cast.media.TextTrackType.METADATA with String = js.native
    
    /* "SUBTITLES" */ val SUBTITLES: typings.chrome.chrome.cast.media.TextTrackType.SUBTITLES with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TextTrackWindowType")
  @js.native
  object TextTrackWindowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TextTrackWindowType with String] = js.native
    
    /* "NONE" */ val NONE: typings.chrome.chrome.cast.media.TextTrackWindowType.NONE with String = js.native
    
    /* "NORMAL" */ val NORMAL: typings.chrome.chrome.cast.media.TextTrackWindowType.NORMAL with String = js.native
    
    /* "ROUNDED_CORNERS" */ val ROUNDED_CORNERS: typings.chrome.chrome.cast.media.TextTrackWindowType.ROUNDED_CORNERS with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.Track")
  @js.native
  class Track protected ()
    extends typings.chrome.chrome.cast.media.Track {
    /**
      * @param {number} trackId
      * @param {!chrome.cast.media.TrackType} trackType
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Track
      */
    def this(trackId: Double, trackType: TrackType) = this()
  }
  
  @JSGlobal("chrome.cast.media.TrackType")
  @js.native
  object TrackType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.TrackType with String] = js.native
    
    /* "AUDIO" */ val AUDIO: typings.chrome.chrome.cast.media.TrackType.AUDIO with String = js.native
    
    /* "TEXT" */ val TEXT: typings.chrome.chrome.cast.media.TrackType.TEXT with String = js.native
    
    /* "VIDEO" */ val VIDEO: typings.chrome.chrome.cast.media.TrackType.VIDEO with String = js.native
  }
  
  @JSGlobal("chrome.cast.media.TvShowMediaMetadata")
  @js.native
  /**
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TvShowMediaMetadata
    */
  class TvShowMediaMetadata ()
    extends typings.chrome.chrome.cast.media.TvShowMediaMetadata
  
  @JSGlobal("chrome.cast.media.VolumeRequest")
  @js.native
  class VolumeRequest protected ()
    extends typings.chrome.chrome.cast.media.VolumeRequest {
    /**
      * @param {!chrome.cast.Volume} volume
      * @constructor
      * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.VolumeRequest
      */
    def this(volume: typings.chrome.chrome.cast.Volume) = this()
  }
  
  /**
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  object timeout {
    
    @JSGlobal("chrome.cast.media.timeout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.cast.media.timeout.editTracksInfo")
    @js.native
    def editTracksInfo: Double = js.native
    @scala.inline
    def editTracksInfo_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editTracksInfo")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.getStatus")
    @js.native
    def getStatus: Double = js.native
    @scala.inline
    def getStatus_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.load")
    @js.native
    def load: Double = js.native
    @scala.inline
    def load_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("load")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.pause")
    @js.native
    def pause: Double = js.native
    @scala.inline
    def pause_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pause")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.play")
    @js.native
    def play: Double = js.native
    @scala.inline
    def play_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("play")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueInsert")
    @js.native
    def queueInsert: Double = js.native
    @scala.inline
    def queueInsert_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueInsert")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueLoad")
    @js.native
    def queueLoad: Double = js.native
    @scala.inline
    def queueLoad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueLoad")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueRemove")
    @js.native
    def queueRemove: Double = js.native
    @scala.inline
    def queueRemove_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueRemove")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueReorder")
    @js.native
    def queueReorder: Double = js.native
    @scala.inline
    def queueReorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueReorder")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.queueUpdate")
    @js.native
    def queueUpdate: Double = js.native
    @scala.inline
    def queueUpdate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueUpdate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.seek")
    @js.native
    def seek: Double = js.native
    @scala.inline
    def seek_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seek")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.setVolume")
    @js.native
    def setVolume: Double = js.native
    @scala.inline
    def setVolume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.cast.media.timeout.stop")
    @js.native
    def stop: Double = js.native
    @scala.inline
    def stop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
  }
}
