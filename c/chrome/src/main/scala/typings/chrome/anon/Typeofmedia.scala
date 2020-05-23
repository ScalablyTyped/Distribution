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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmedia extends js.Object {
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String
  var EditTracksInfoRequest: Instantiable2[
    js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
    js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
    typings.chrome.chrome.cast.media.EditTracksInfoRequest
  ]
  var GenericMediaMetadata: Instantiable0[typings.chrome.chrome.cast.media.GenericMediaMetadata]
  var GetStatusRequest: Instantiable0[typings.chrome.chrome.cast.media.GetStatusRequest]
  var LiveSeekableRange: Instantiable4[
    js.UndefOr[/* start */ Double], 
    js.UndefOr[/* end */ Double], 
    js.UndefOr[/* isMovingWindow */ Boolean], 
    js.UndefOr[/* isLiveDone */ Boolean], 
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
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeout: Typeoftimeout
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
    LiveSeekableRange: Instantiable4[
      js.UndefOr[/* start */ Double], 
      js.UndefOr[/* end */ Double], 
      js.UndefOr[/* isMovingWindow */ Boolean], 
      js.UndefOr[/* isLiveDone */ Boolean], 
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
}

