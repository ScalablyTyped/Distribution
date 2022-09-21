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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmedia extends StObject {
  
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String
  
  var EditTracksInfoRequest: Instantiable2[
    /* activeTrackIds */ js.UndefOr[js.Array[Double]], 
    /* textTrackStyle */ js.UndefOr[TextTrackStyle], 
    typings.chrome.chrome.cast.media.EditTracksInfoRequest
  ]
  
  var GenericMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.GenericMediaMetadata]
  
  var GetStatusRequest: Instantiable0[typings.chrome.chrome.cast.media.GetStatusRequest]
  
  var LiveSeekableRange: Instantiable4[
    /* start */ js.UndefOr[Double], 
    /* end */ js.UndefOr[Double], 
    /* isMovingWindow */ js.UndefOr[Boolean], 
    /* isLiveDone */ js.UndefOr[Boolean], 
    typings.chrome.chrome.cast.media.LiveSeekableRange
  ]
  
  var LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chrome.cast.media.LoadRequest]
  
  var Media: Instantiable2[
    /* sessionId */ String, 
    /* mediaSessionId */ Double, 
    typings.chrome.chrome.cast.media.Media
  ]
  
  var MediaInfo: Instantiable2[
    /* contentId */ String, 
    /* contentType */ String, 
    typings.chrome.chrome.cast.media.MediaInfo
  ]
  
  var MovieMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.MovieMediaMetadata]
  
  var MusicTrackMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.MusicTrackMediaMetadata]
  
  var PauseRequest: Instantiable0[typings.chrome.chrome.cast.media.PauseRequest]
  
  var PhotoMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.PhotoMediaMetadata]
  
  var PlayRequest: Instantiable0[typings.chrome.chrome.cast.media.PlayRequest]
  
  var QueueInsertItemsRequest: Instantiable1[
    /* itemsToInsert */ js.Array[QueueItem], 
    typings.chrome.chrome.cast.media.QueueInsertItemsRequest
  ]
  
  var QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chrome.cast.media.QueueItem]
  
  var QueueLoadRequest: Instantiable1[/* items */ js.Array[QueueItem], typings.chrome.chrome.cast.media.QueueLoadRequest]
  
  var QueueRemoveItemsRequest: Instantiable1[
    /* itemIdsToRemove */ js.Array[Double], 
    typings.chrome.chrome.cast.media.QueueRemoveItemsRequest
  ]
  
  var QueueReorderItemsRequest: Instantiable1[
    /* itemIdsToReorder */ js.Array[Double], 
    typings.chrome.chrome.cast.media.QueueReorderItemsRequest
  ]
  
  var QueueUpdateItemsRequest: Instantiable1[
    /* itemsToUpdate */ js.Array[QueueItem], 
    typings.chrome.chrome.cast.media.QueueUpdateItemsRequest
  ]
  
  var SeekRequest: Instantiable0[typings.chrome.chrome.cast.media.SeekRequest]
  
  var StopRequest: Instantiable0[typings.chrome.chrome.cast.media.StopRequest]
  
  var TextTrackStyle: Instantiable0[typings.chrome.chrome.cast.media.TextTrackStyle]
  
  var Track: Instantiable2[
    /* trackId */ Double, 
    /* trackType */ TrackType, 
    typings.chrome.chrome.cast.media.Track
  ]
  
  var TvShowMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.TvShowMediaMetadata]
  
  var VolumeRequest: Instantiable1[/* volume */ Volume, typings.chrome.chrome.cast.media.VolumeRequest]
  
  /**
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeout: Typeoftimeout
}
object Typeofmedia {
  
  inline def apply(
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
  
  extension [Self <: Typeofmedia](x: Self) {
    
    inline def setDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = StObject.set(x, "DEFAULT_MEDIA_RECEIVER_APP_ID", value.asInstanceOf[js.Any])
    
    inline def setEditTracksInfoRequest(
      value: Instantiable2[
          /* activeTrackIds */ js.UndefOr[js.Array[Double]], 
          /* textTrackStyle */ js.UndefOr[TextTrackStyle], 
          EditTracksInfoRequest
        ]
    ): Self = StObject.set(x, "EditTracksInfoRequest", value.asInstanceOf[js.Any])
    
    inline def setGenericMediaMetadata(value: Instantiable0[GenericMediaMetadata]): Self = StObject.set(x, "GenericMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetStatusRequest(value: Instantiable0[GetStatusRequest]): Self = StObject.set(x, "GetStatusRequest", value.asInstanceOf[js.Any])
    
    inline def setLiveSeekableRange(
      value: Instantiable4[
          /* start */ js.UndefOr[Double], 
          /* end */ js.UndefOr[Double], 
          /* isMovingWindow */ js.UndefOr[Boolean], 
          /* isLiveDone */ js.UndefOr[Boolean], 
          LiveSeekableRange
        ]
    ): Self = StObject.set(x, "LiveSeekableRange", value.asInstanceOf[js.Any])
    
    inline def setLoadRequest(value: Instantiable1[/* mediaInfo */ MediaInfo, LoadRequest]): Self = StObject.set(x, "LoadRequest", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Instantiable2[/* sessionId */ String, /* mediaSessionId */ Double, Media]): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setMediaInfo(value: Instantiable2[/* contentId */ String, /* contentType */ String, MediaInfo]): Self = StObject.set(x, "MediaInfo", value.asInstanceOf[js.Any])
    
    inline def setMovieMediaMetadata(value: Instantiable0[MovieMediaMetadata]): Self = StObject.set(x, "MovieMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setMusicTrackMediaMetadata(value: Instantiable0[MusicTrackMediaMetadata]): Self = StObject.set(x, "MusicTrackMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setPauseRequest(value: Instantiable0[PauseRequest]): Self = StObject.set(x, "PauseRequest", value.asInstanceOf[js.Any])
    
    inline def setPhotoMediaMetadata(value: Instantiable0[PhotoMediaMetadata]): Self = StObject.set(x, "PhotoMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setPlayRequest(value: Instantiable0[PlayRequest]): Self = StObject.set(x, "PlayRequest", value.asInstanceOf[js.Any])
    
    inline def setQueueInsertItemsRequest(value: Instantiable1[/* itemsToInsert */ js.Array[QueueItem], QueueInsertItemsRequest]): Self = StObject.set(x, "QueueInsertItemsRequest", value.asInstanceOf[js.Any])
    
    inline def setQueueItem(value: Instantiable1[/* mediaInfo */ MediaInfo, QueueItem]): Self = StObject.set(x, "QueueItem", value.asInstanceOf[js.Any])
    
    inline def setQueueLoadRequest(value: Instantiable1[/* items */ js.Array[QueueItem], QueueLoadRequest]): Self = StObject.set(x, "QueueLoadRequest", value.asInstanceOf[js.Any])
    
    inline def setQueueRemoveItemsRequest(value: Instantiable1[/* itemIdsToRemove */ js.Array[Double], QueueRemoveItemsRequest]): Self = StObject.set(x, "QueueRemoveItemsRequest", value.asInstanceOf[js.Any])
    
    inline def setQueueReorderItemsRequest(value: Instantiable1[/* itemIdsToReorder */ js.Array[Double], QueueReorderItemsRequest]): Self = StObject.set(x, "QueueReorderItemsRequest", value.asInstanceOf[js.Any])
    
    inline def setQueueUpdateItemsRequest(value: Instantiable1[/* itemsToUpdate */ js.Array[QueueItem], QueueUpdateItemsRequest]): Self = StObject.set(x, "QueueUpdateItemsRequest", value.asInstanceOf[js.Any])
    
    inline def setSeekRequest(value: Instantiable0[SeekRequest]): Self = StObject.set(x, "SeekRequest", value.asInstanceOf[js.Any])
    
    inline def setStopRequest(value: Instantiable0[StopRequest]): Self = StObject.set(x, "StopRequest", value.asInstanceOf[js.Any])
    
    inline def setTextTrackStyle(value: Instantiable0[TextTrackStyle]): Self = StObject.set(x, "TextTrackStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Typeoftimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: Instantiable2[/* trackId */ Double, /* trackType */ TrackType, Track]): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    
    inline def setTvShowMediaMetadata(value: Instantiable0[TvShowMediaMetadata]): Self = StObject.set(x, "TvShowMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setVolumeRequest(value: Instantiable1[/* volume */ Volume, VolumeRequest]): Self = StObject.set(x, "VolumeRequest", value.asInstanceOf[js.Any])
  }
}
