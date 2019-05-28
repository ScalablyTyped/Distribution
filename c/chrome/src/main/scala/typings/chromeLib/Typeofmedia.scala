package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmedia extends js.Object {
  var DEFAULT_MEDIA_RECEIVER_APP_ID: java.lang.String
  var EditTracksInfoRequest: org.scalablytyped.runtime.Instantiable2[
    /* activeTrackIds */ js.UndefOr[/* activeTrackIds */ js.Array[scala.Double]], 
    /* textTrackStyle */ js.UndefOr[/* textTrackStyle */ chromeLib.chromeNs.castNs.mediaNs.TextTrackStyle], 
    chromeLib.chromeNs.castNs.mediaNs.EditTracksInfoRequest
  ]
  var GenericMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.GenericMediaMetadata]
  var GetStatusRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.GetStatusRequest]
  var LoadRequest: org.scalablytyped.runtime.Instantiable1[
    /* mediaInfo */ chromeLib.chromeNs.castNs.mediaNs.MediaInfo, 
    chromeLib.chromeNs.castNs.mediaNs.LoadRequest
  ]
  var Media: org.scalablytyped.runtime.Instantiable2[
    /* sessionId */ java.lang.String, 
    /* mediaSessionId */ scala.Double, 
    chromeLib.chromeNs.castNs.mediaNs.Media
  ]
  var MediaInfo: org.scalablytyped.runtime.Instantiable2[
    /* contentId */ java.lang.String, 
    /* contentType */ java.lang.String, 
    chromeLib.chromeNs.castNs.mediaNs.MediaInfo
  ]
  var MovieMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.MovieMediaMetadata]
  var MusicTrackMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.MusicTrackMediaMetadata]
  var PauseRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PauseRequest]
  var PhotoMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PhotoMediaMetadata]
  var PlayRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PlayRequest]
  var QueueInsertItemsRequest: org.scalablytyped.runtime.Instantiable1[
    /* itemsToInsert */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
    chromeLib.chromeNs.castNs.mediaNs.QueueInsertItemsRequest
  ]
  var QueueItem: org.scalablytyped.runtime.Instantiable1[
    /* mediaInfo */ chromeLib.chromeNs.castNs.mediaNs.MediaInfo, 
    chromeLib.chromeNs.castNs.mediaNs.QueueItem
  ]
  var QueueLoadRequest: org.scalablytyped.runtime.Instantiable1[
    /* items */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
    chromeLib.chromeNs.castNs.mediaNs.QueueLoadRequest
  ]
  var QueueRemoveItemsRequest: org.scalablytyped.runtime.Instantiable1[
    /* itemIdsToRemove */ js.Array[scala.Double], 
    chromeLib.chromeNs.castNs.mediaNs.QueueRemoveItemsRequest
  ]
  var QueueReorderItemsRequest: org.scalablytyped.runtime.Instantiable1[
    /* itemIdsToReorder */ js.Array[scala.Double], 
    chromeLib.chromeNs.castNs.mediaNs.QueueReorderItemsRequest
  ]
  var QueueUpdateItemsRequest: org.scalablytyped.runtime.Instantiable1[
    /* itemsToUpdate */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
    chromeLib.chromeNs.castNs.mediaNs.QueueUpdateItemsRequest
  ]
  var SeekRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.SeekRequest]
  var StopRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.StopRequest]
  var TextTrackStyle: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.TextTrackStyle]
  var Track: org.scalablytyped.runtime.Instantiable2[
    /* trackId */ scala.Double, 
    /* trackType */ chromeLib.chromeNs.castNs.mediaNs.TrackType, 
    chromeLib.chromeNs.castNs.mediaNs.Track
  ]
  var TvShowMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.TvShowMediaMetadata]
  var VolumeRequest: org.scalablytyped.runtime.Instantiable1[
    /* volume */ chromeLib.chromeNs.castNs.Volume, 
    chromeLib.chromeNs.castNs.mediaNs.VolumeRequest
  ]
  /**
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeoutNs: Typeoftimeout
}

object Typeofmedia {
  @scala.inline
  def apply(
    DEFAULT_MEDIA_RECEIVER_APP_ID: java.lang.String,
    EditTracksInfoRequest: org.scalablytyped.runtime.Instantiable2[
      /* activeTrackIds */ js.UndefOr[/* activeTrackIds */ js.Array[scala.Double]], 
      /* textTrackStyle */ js.UndefOr[/* textTrackStyle */ chromeLib.chromeNs.castNs.mediaNs.TextTrackStyle], 
      chromeLib.chromeNs.castNs.mediaNs.EditTracksInfoRequest
    ],
    GenericMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.GenericMediaMetadata],
    GetStatusRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.GetStatusRequest],
    LoadRequest: org.scalablytyped.runtime.Instantiable1[
      /* mediaInfo */ chromeLib.chromeNs.castNs.mediaNs.MediaInfo, 
      chromeLib.chromeNs.castNs.mediaNs.LoadRequest
    ],
    Media: org.scalablytyped.runtime.Instantiable2[
      /* sessionId */ java.lang.String, 
      /* mediaSessionId */ scala.Double, 
      chromeLib.chromeNs.castNs.mediaNs.Media
    ],
    MediaInfo: org.scalablytyped.runtime.Instantiable2[
      /* contentId */ java.lang.String, 
      /* contentType */ java.lang.String, 
      chromeLib.chromeNs.castNs.mediaNs.MediaInfo
    ],
    MovieMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.MovieMediaMetadata],
    MusicTrackMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.MusicTrackMediaMetadata],
    PauseRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PauseRequest],
    PhotoMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PhotoMediaMetadata],
    PlayRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.PlayRequest],
    QueueInsertItemsRequest: org.scalablytyped.runtime.Instantiable1[
      /* itemsToInsert */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
      chromeLib.chromeNs.castNs.mediaNs.QueueInsertItemsRequest
    ],
    QueueItem: org.scalablytyped.runtime.Instantiable1[
      /* mediaInfo */ chromeLib.chromeNs.castNs.mediaNs.MediaInfo, 
      chromeLib.chromeNs.castNs.mediaNs.QueueItem
    ],
    QueueLoadRequest: org.scalablytyped.runtime.Instantiable1[
      /* items */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
      chromeLib.chromeNs.castNs.mediaNs.QueueLoadRequest
    ],
    QueueRemoveItemsRequest: org.scalablytyped.runtime.Instantiable1[
      /* itemIdsToRemove */ js.Array[scala.Double], 
      chromeLib.chromeNs.castNs.mediaNs.QueueRemoveItemsRequest
    ],
    QueueReorderItemsRequest: org.scalablytyped.runtime.Instantiable1[
      /* itemIdsToReorder */ js.Array[scala.Double], 
      chromeLib.chromeNs.castNs.mediaNs.QueueReorderItemsRequest
    ],
    QueueUpdateItemsRequest: org.scalablytyped.runtime.Instantiable1[
      /* itemsToUpdate */ js.Array[chromeLib.chromeNs.castNs.mediaNs.QueueItem], 
      chromeLib.chromeNs.castNs.mediaNs.QueueUpdateItemsRequest
    ],
    SeekRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.SeekRequest],
    StopRequest: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.StopRequest],
    TextTrackStyle: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.TextTrackStyle],
    Track: org.scalablytyped.runtime.Instantiable2[
      /* trackId */ scala.Double, 
      /* trackType */ chromeLib.chromeNs.castNs.mediaNs.TrackType, 
      chromeLib.chromeNs.castNs.mediaNs.Track
    ],
    TvShowMediaMetadata: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.castNs.mediaNs.TvShowMediaMetadata],
    VolumeRequest: org.scalablytyped.runtime.Instantiable1[
      /* volume */ chromeLib.chromeNs.castNs.Volume, 
      chromeLib.chromeNs.castNs.mediaNs.VolumeRequest
    ],
    timeoutNs: Typeoftimeout
  ): Typeofmedia = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID, EditTracksInfoRequest = EditTracksInfoRequest, GenericMediaMetadata = GenericMediaMetadata, GetStatusRequest = GetStatusRequest, LoadRequest = LoadRequest, Media = Media, MediaInfo = MediaInfo, MovieMediaMetadata = MovieMediaMetadata, MusicTrackMediaMetadata = MusicTrackMediaMetadata, PauseRequest = PauseRequest, PhotoMediaMetadata = PhotoMediaMetadata, PlayRequest = PlayRequest, QueueInsertItemsRequest = QueueInsertItemsRequest, QueueItem = QueueItem, QueueLoadRequest = QueueLoadRequest, QueueRemoveItemsRequest = QueueRemoveItemsRequest, QueueReorderItemsRequest = QueueReorderItemsRequest, QueueUpdateItemsRequest = QueueUpdateItemsRequest, SeekRequest = SeekRequest, StopRequest = StopRequest, TextTrackStyle = TextTrackStyle, Track = Track, TvShowMediaMetadata = TvShowMediaMetadata, VolumeRequest = VolumeRequest, timeoutNs = timeoutNs)
  
    __obj.asInstanceOf[Typeofmedia]
  }
}

