package typings.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.chrome.chromeNs.castNs.Volume
import typings.chrome.chromeNs.castNs.mediaNs.EditTracksInfoRequest
import typings.chrome.chromeNs.castNs.mediaNs.GenericMediaMetadata
import typings.chrome.chromeNs.castNs.mediaNs.GetStatusRequest
import typings.chrome.chromeNs.castNs.mediaNs.LoadRequest
import typings.chrome.chromeNs.castNs.mediaNs.Media
import typings.chrome.chromeNs.castNs.mediaNs.MediaInfo
import typings.chrome.chromeNs.castNs.mediaNs.MovieMediaMetadata
import typings.chrome.chromeNs.castNs.mediaNs.MusicTrackMediaMetadata
import typings.chrome.chromeNs.castNs.mediaNs.PauseRequest
import typings.chrome.chromeNs.castNs.mediaNs.PhotoMediaMetadata
import typings.chrome.chromeNs.castNs.mediaNs.PlayRequest
import typings.chrome.chromeNs.castNs.mediaNs.QueueInsertItemsRequest
import typings.chrome.chromeNs.castNs.mediaNs.QueueItem
import typings.chrome.chromeNs.castNs.mediaNs.QueueLoadRequest
import typings.chrome.chromeNs.castNs.mediaNs.QueueRemoveItemsRequest
import typings.chrome.chromeNs.castNs.mediaNs.QueueReorderItemsRequest
import typings.chrome.chromeNs.castNs.mediaNs.QueueUpdateItemsRequest
import typings.chrome.chromeNs.castNs.mediaNs.SeekRequest
import typings.chrome.chromeNs.castNs.mediaNs.StopRequest
import typings.chrome.chromeNs.castNs.mediaNs.TextTrackStyle
import typings.chrome.chromeNs.castNs.mediaNs.Track
import typings.chrome.chromeNs.castNs.mediaNs.TrackType
import typings.chrome.chromeNs.castNs.mediaNs.TvShowMediaMetadata
import typings.chrome.chromeNs.castNs.mediaNs.VolumeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmedia extends js.Object {
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String
  var EditTracksInfoRequest: Instantiable2[
    js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
    js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
    typings.chrome.chromeNs.castNs.mediaNs.EditTracksInfoRequest
  ]
  var GenericMediaMetadata: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.GenericMediaMetadata]
  var GetStatusRequest: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.GetStatusRequest]
  var LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chromeNs.castNs.mediaNs.LoadRequest]
  var Media: Instantiable2[
    /* sessionId */ String, 
    /* mediaSessionId */ Double, 
    typings.chrome.chromeNs.castNs.mediaNs.Media
  ]
  var MediaInfo: Instantiable2[
    /* contentId */ String, 
    /* contentType */ String, 
    typings.chrome.chromeNs.castNs.mediaNs.MediaInfo
  ]
  var MovieMediaMetadata: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.MovieMediaMetadata]
  var MusicTrackMediaMetadata: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.MusicTrackMediaMetadata]
  var PauseRequest: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.PauseRequest]
  var PhotoMediaMetadata: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.PhotoMediaMetadata]
  var PlayRequest: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.PlayRequest]
  var QueueInsertItemsRequest: Instantiable1[
    /* itemsToInsert */ js.Array[QueueItem], 
    typings.chrome.chromeNs.castNs.mediaNs.QueueInsertItemsRequest
  ]
  var QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, typings.chrome.chromeNs.castNs.mediaNs.QueueItem]
  var QueueLoadRequest: Instantiable1[
    /* items */ js.Array[QueueItem], 
    typings.chrome.chromeNs.castNs.mediaNs.QueueLoadRequest
  ]
  var QueueRemoveItemsRequest: Instantiable1[
    /* itemIdsToRemove */ js.Array[Double], 
    typings.chrome.chromeNs.castNs.mediaNs.QueueRemoveItemsRequest
  ]
  var QueueReorderItemsRequest: Instantiable1[
    /* itemIdsToReorder */ js.Array[Double], 
    typings.chrome.chromeNs.castNs.mediaNs.QueueReorderItemsRequest
  ]
  var QueueUpdateItemsRequest: Instantiable1[
    /* itemsToUpdate */ js.Array[QueueItem], 
    typings.chrome.chromeNs.castNs.mediaNs.QueueUpdateItemsRequest
  ]
  var SeekRequest: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.SeekRequest]
  var StopRequest: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.StopRequest]
  var TextTrackStyle: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.TextTrackStyle]
  var Track: Instantiable2[
    /* trackId */ Double, 
    /* trackType */ TrackType, 
    typings.chrome.chromeNs.castNs.mediaNs.Track
  ]
  var TvShowMediaMetadata: Instantiable0[typings.chrome.chromeNs.castNs.mediaNs.TvShowMediaMetadata]
  var VolumeRequest: Instantiable1[/* volume */ Volume, typings.chrome.chromeNs.castNs.mediaNs.VolumeRequest]
  /**
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeoutNs: Typeoftimeout
}

object Typeofmedia {
  @scala.inline
  def apply(
    DEFAULT_MEDIA_RECEIVER_APP_ID: String,
    EditTracksInfoRequest: Instantiable2[
      js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
      js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
      EditTracksInfoRequest
    ],
    GenericMediaMetadata: Instantiable0[GenericMediaMetadata],
    GetStatusRequest: Instantiable0[GetStatusRequest],
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
    timeoutNs: Typeoftimeout
  ): Typeofmedia = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID, EditTracksInfoRequest = EditTracksInfoRequest, GenericMediaMetadata = GenericMediaMetadata, GetStatusRequest = GetStatusRequest, LoadRequest = LoadRequest, Media = Media, MediaInfo = MediaInfo, MovieMediaMetadata = MovieMediaMetadata, MusicTrackMediaMetadata = MusicTrackMediaMetadata, PauseRequest = PauseRequest, PhotoMediaMetadata = PhotoMediaMetadata, PlayRequest = PlayRequest, QueueInsertItemsRequest = QueueInsertItemsRequest, QueueItem = QueueItem, QueueLoadRequest = QueueLoadRequest, QueueRemoveItemsRequest = QueueRemoveItemsRequest, QueueReorderItemsRequest = QueueReorderItemsRequest, QueueUpdateItemsRequest = QueueUpdateItemsRequest, SeekRequest = SeekRequest, StopRequest = StopRequest, TextTrackStyle = TextTrackStyle, Track = Track, TvShowMediaMetadata = TvShowMediaMetadata, VolumeRequest = VolumeRequest, timeoutNs = timeoutNs)
  
    __obj.asInstanceOf[Typeofmedia]
  }
}

