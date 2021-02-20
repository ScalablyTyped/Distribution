package typings.chrome.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.chrome.chrome.cast.Volume
import typings.chrome.chrome.cast.media.EditTracksInfoRequest
import typings.chrome.chrome.cast.media.GenericMediaMetadata
import typings.chrome.chrome.cast.media.GetStatusRequest
import typings.chrome.chrome.cast.media.LiveSeekableRange
import typings.chrome.chrome.cast.media.LoadRequest
import typings.chrome.chrome.cast.media.Media
import typings.chrome.chrome.cast.media.MediaInfo
import typings.chrome.chrome.cast.media.MovieMediaMetadata
import typings.chrome.chrome.cast.media.MusicTrackMediaMetadata
import typings.chrome.chrome.cast.media.PauseRequest
import typings.chrome.chrome.cast.media.PhotoMediaMetadata
import typings.chrome.chrome.cast.media.PlayRequest
import typings.chrome.chrome.cast.media.QueueInsertItemsRequest
import typings.chrome.chrome.cast.media.QueueItem
import typings.chrome.chrome.cast.media.QueueLoadRequest
import typings.chrome.chrome.cast.media.QueueRemoveItemsRequest
import typings.chrome.chrome.cast.media.QueueReorderItemsRequest
import typings.chrome.chrome.cast.media.QueueUpdateItemsRequest
import typings.chrome.chrome.cast.media.SeekRequest
import typings.chrome.chrome.cast.media.StopRequest
import typings.chrome.chrome.cast.media.TextTrackStyle
import typings.chrome.chrome.cast.media.Track
import typings.chrome.chrome.cast.media.TrackType
import typings.chrome.chrome.cast.media.TvShowMediaMetadata
import typings.chrome.chrome.cast.media.VolumeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmedia extends StObject {
  
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String = js.native
  
  var EditTracksInfoRequest: Instantiable2[
    /* activeTrackIds */ js.UndefOr[js.Array[Double]], 
    /* textTrackStyle */ js.UndefOr[TextTrackStyle], 
    typings.chrome.chrome.cast.media.EditTracksInfoRequest
  ] = js.native
  
  var GenericMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.GenericMediaMetadata] = js.native
  
  var GetStatusRequest: Instantiable0[typings.chrome.chrome.cast.media.GetStatusRequest] = js.native
  
  var LiveSeekableRange: Instantiable4[
    /* start */ js.UndefOr[Double], 
    /* end */ js.UndefOr[Double], 
    /* isMovingWindow */ js.UndefOr[Boolean], 
    /* isLiveDone */ js.UndefOr[Boolean], 
    typings.chrome.chrome.cast.media.LiveSeekableRange
  ] = js.native
  
  var LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chrome.cast.media.LoadRequest] = js.native
  
  var Media: Instantiable2[
    /* sessionId */ String, 
    /* mediaSessionId */ Double, 
    typings.chrome.chrome.cast.media.Media
  ] = js.native
  
  var MediaInfo: Instantiable2[
    /* contentId */ String, 
    /* contentType */ String, 
    typings.chrome.chrome.cast.media.MediaInfo
  ] = js.native
  
  var MovieMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.MovieMediaMetadata] = js.native
  
  var MusicTrackMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.MusicTrackMediaMetadata] = js.native
  
  var PauseRequest: Instantiable0[typings.chrome.chrome.cast.media.PauseRequest] = js.native
  
  var PhotoMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.PhotoMediaMetadata] = js.native
  
  var PlayRequest: Instantiable0[typings.chrome.chrome.cast.media.PlayRequest] = js.native
  
  var QueueInsertItemsRequest: Instantiable1[
    /* itemsToInsert */ js.Array[QueueItem], 
    typings.chrome.chrome.cast.media.QueueInsertItemsRequest
  ] = js.native
  
  var QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chrome.cast.media.QueueItem] = js.native
  
  var QueueLoadRequest: Instantiable1[/* items */ js.Array[QueueItem], typings.chrome.chrome.cast.media.QueueLoadRequest] = js.native
  
  var QueueRemoveItemsRequest: Instantiable1[
    /* itemIdsToRemove */ js.Array[Double], 
    typings.chrome.chrome.cast.media.QueueRemoveItemsRequest
  ] = js.native
  
  var QueueReorderItemsRequest: Instantiable1[
    /* itemIdsToReorder */ js.Array[Double], 
    typings.chrome.chrome.cast.media.QueueReorderItemsRequest
  ] = js.native
  
  var QueueUpdateItemsRequest: Instantiable1[
    /* itemsToUpdate */ js.Array[QueueItem], 
    typings.chrome.chrome.cast.media.QueueUpdateItemsRequest
  ] = js.native
  
  var SeekRequest: Instantiable0[typings.chrome.chrome.cast.media.SeekRequest] = js.native
  
  var StopRequest: Instantiable0[typings.chrome.chrome.cast.media.StopRequest] = js.native
  
  var TextTrackStyle: Instantiable0[typings.chrome.chrome.cast.media.TextTrackStyle] = js.native
  
  var Track: Instantiable2[
    /* trackId */ Double, 
    /* trackType */ TrackType, 
    typings.chrome.chrome.cast.media.Track
  ] = js.native
  
  var TvShowMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.TvShowMediaMetadata] = js.native
  
  var VolumeRequest: Instantiable1[/* volume */ Volume, typings.chrome.chrome.cast.media.VolumeRequest] = js.native
  
  /**
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeout: Typeoftimeout = js.native
}
object Typeofmedia {
  
  @scala.inline
  def apply(
    DEFAULT_MEDIA_RECEIVER_APP_ID: String,
    EditTracksInfoRequest: Instantiable2[
      /* activeTrackIds */ js.UndefOr[js.Array[Double]], 
      /* textTrackStyle */ js.UndefOr[TextTrackStyle], 
      EditTracksInfoRequest
    ],
    GenericMediaMetadata: Instantiable0[GenericMediaMetadata],
    GetStatusRequest: Instantiable0[GetStatusRequest],
    LiveSeekableRange: Instantiable4[
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      /* isMovingWindow */ js.UndefOr[Boolean], 
      /* isLiveDone */ js.UndefOr[Boolean], 
      LiveSeekableRange
    ],
    LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, LoadRequest],
    Media: Instantiable2[/* sessionId */ String, /* mediaSessionId */ Double, Media],
    MediaInfo: Instantiable2[/* contentId */ String, /* contentType */ String, MediaInfo],
    MovieMediaMetadata: Instantiable0[MovieMediaMetadata],
    MusicTrackMediaMetadata: Instantiable0[MusicTrackMediaMetadata],
    PauseRequest: Instantiable0[PauseRequest],
    PhotoMediaMetadata: Instantiable0[PhotoMediaMetadata],
    PlayRequest: Instantiable0[PlayRequest],
    QueueInsertItemsRequest: Instantiable1[/* itemsToInsert */ js.Array[QueueItem], QueueInsertItemsRequest],
    QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, QueueItem],
    QueueLoadRequest: Instantiable1[/* items */ js.Array[QueueItem], QueueLoadRequest],
    QueueRemoveItemsRequest: Instantiable1[/* itemIdsToRemove */ js.Array[Double], QueueRemoveItemsRequest],
    QueueReorderItemsRequest: Instantiable1[/* itemIdsToReorder */ js.Array[Double], QueueReorderItemsRequest],
    QueueUpdateItemsRequest: Instantiable1[/* itemsToUpdate */ js.Array[QueueItem], QueueUpdateItemsRequest],
    SeekRequest: Instantiable0[SeekRequest],
    StopRequest: Instantiable0[StopRequest],
    TextTrackStyle: Instantiable0[TextTrackStyle],
    Track: Instantiable2[/* trackId */ Double, /* trackType */ TrackType, Track],
    TvShowMediaMetadata: Instantiable0[TvShowMediaMetadata],
    VolumeRequest: Instantiable1[/* volume */ Volume, VolumeRequest],
    timeout: Typeoftimeout
  ): Typeofmedia = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID.asInstanceOf[js.Any], EditTracksInfoRequest = EditTracksInfoRequest.asInstanceOf[js.Any], GenericMediaMetadata = GenericMediaMetadata.asInstanceOf[js.Any], GetStatusRequest = GetStatusRequest.asInstanceOf[js.Any], LiveSeekableRange = LiveSeekableRange.asInstanceOf[js.Any], LoadRequest = LoadRequest.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], MediaInfo = MediaInfo.asInstanceOf[js.Any], MovieMediaMetadata = MovieMediaMetadata.asInstanceOf[js.Any], MusicTrackMediaMetadata = MusicTrackMediaMetadata.asInstanceOf[js.Any], PauseRequest = PauseRequest.asInstanceOf[js.Any], PhotoMediaMetadata = PhotoMediaMetadata.asInstanceOf[js.Any], PlayRequest = PlayRequest.asInstanceOf[js.Any], QueueInsertItemsRequest = QueueInsertItemsRequest.asInstanceOf[js.Any], QueueItem = QueueItem.asInstanceOf[js.Any], QueueLoadRequest = QueueLoadRequest.asInstanceOf[js.Any], QueueRemoveItemsRequest = QueueRemoveItemsRequest.asInstanceOf[js.Any], QueueReorderItemsRequest = QueueReorderItemsRequest.asInstanceOf[js.Any], QueueUpdateItemsRequest = QueueUpdateItemsRequest.asInstanceOf[js.Any], SeekRequest = SeekRequest.asInstanceOf[js.Any], StopRequest = StopRequest.asInstanceOf[js.Any], TextTrackStyle = TextTrackStyle.asInstanceOf[js.Any], Track = Track.asInstanceOf[js.Any], TvShowMediaMetadata = TvShowMediaMetadata.asInstanceOf[js.Any], VolumeRequest = VolumeRequest.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmedia]
  }
  
  @scala.inline
  implicit class TypeofmediaMutableBuilder[Self <: Typeofmedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = StObject.set(x, "DEFAULT_MEDIA_RECEIVER_APP_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTracksInfoRequest(
      value: Instantiable2[
          /* activeTrackIds */ js.UndefOr[js.Array[Double]], 
          /* textTrackStyle */ js.UndefOr[TextTrackStyle], 
          EditTracksInfoRequest
        ]
    ): Self = StObject.set(x, "EditTracksInfoRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericMediaMetadata(value: Instantiable0[GenericMediaMetadata]): Self = StObject.set(x, "GenericMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatusRequest(value: Instantiable0[GetStatusRequest]): Self = StObject.set(x, "GetStatusRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSeekableRange(
      value: Instantiable4[
          /* start */ js.UndefOr[Double], 
          /* end */ js.UndefOr[Double], 
          /* isMovingWindow */ js.UndefOr[Boolean], 
          /* isLiveDone */ js.UndefOr[Boolean], 
          LiveSeekableRange
        ]
    ): Self = StObject.set(x, "LiveSeekableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadRequest(value: Instantiable1[/* mediaInfo */ MediaInfo, LoadRequest]): Self = StObject.set(x, "LoadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Instantiable2[/* sessionId */ String, /* mediaSessionId */ Double, Media]): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfo(value: Instantiable2[/* contentId */ String, /* contentType */ String, MediaInfo]): Self = StObject.set(x, "MediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieMediaMetadata(value: Instantiable0[MovieMediaMetadata]): Self = StObject.set(x, "MovieMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicTrackMediaMetadata(value: Instantiable0[MusicTrackMediaMetadata]): Self = StObject.set(x, "MusicTrackMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseRequest(value: Instantiable0[PauseRequest]): Self = StObject.set(x, "PauseRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoMediaMetadata(value: Instantiable0[PhotoMediaMetadata]): Self = StObject.set(x, "PhotoMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayRequest(value: Instantiable0[PlayRequest]): Self = StObject.set(x, "PlayRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueInsertItemsRequest(value: Instantiable1[/* itemsToInsert */ js.Array[QueueItem], QueueInsertItemsRequest]): Self = StObject.set(x, "QueueInsertItemsRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueItem(value: Instantiable1[/* mediaInfo */ MediaInfo, QueueItem]): Self = StObject.set(x, "QueueItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueLoadRequest(value: Instantiable1[/* items */ js.Array[QueueItem], QueueLoadRequest]): Self = StObject.set(x, "QueueLoadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueRemoveItemsRequest(value: Instantiable1[/* itemIdsToRemove */ js.Array[Double], QueueRemoveItemsRequest]): Self = StObject.set(x, "QueueRemoveItemsRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueReorderItemsRequest(value: Instantiable1[/* itemIdsToReorder */ js.Array[Double], QueueReorderItemsRequest]): Self = StObject.set(x, "QueueReorderItemsRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUpdateItemsRequest(value: Instantiable1[/* itemsToUpdate */ js.Array[QueueItem], QueueUpdateItemsRequest]): Self = StObject.set(x, "QueueUpdateItemsRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekRequest(value: Instantiable0[SeekRequest]): Self = StObject.set(x, "SeekRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopRequest(value: Instantiable0[StopRequest]): Self = StObject.set(x, "StopRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTrackStyle(value: Instantiable0[TextTrackStyle]): Self = StObject.set(x, "TextTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Typeoftimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: Instantiable2[/* trackId */ Double, /* trackType */ TrackType, Track]): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvShowMediaMetadata(value: Instantiable0[TvShowMediaMetadata]): Self = StObject.set(x, "TvShowMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeRequest(value: Instantiable1[/* volume */ Volume, VolumeRequest]): Self = StObject.set(x, "VolumeRequest", value.asInstanceOf[js.Any])
  }
}
