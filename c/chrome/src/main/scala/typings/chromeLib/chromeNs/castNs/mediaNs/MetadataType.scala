package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataType extends js.Object

@JSGlobal("chrome.cast.media.MetadataType")
@js.native
object MetadataType extends js.Object {
  @js.native
  sealed trait GENERIC
    extends chromeLib.chromeNs.castNs.mediaNs.MetadataType
  
  @js.native
  sealed trait MOVIE
    extends chromeLib.chromeNs.castNs.mediaNs.MetadataType
  
  @js.native
  sealed trait MUSIC_TRACK
    extends chromeLib.chromeNs.castNs.mediaNs.MetadataType
  
  @js.native
  sealed trait PHOTO
    extends chromeLib.chromeNs.castNs.mediaNs.MetadataType
  
  @js.native
  sealed trait TV_SHOW
    extends chromeLib.chromeNs.castNs.mediaNs.MetadataType
  
  /* 0 */ val GENERIC: GENERIC with scala.Double = js.native
  /* 2 */ val MOVIE: MOVIE with scala.Double = js.native
  /* 3 */ val MUSIC_TRACK: MUSIC_TRACK with scala.Double = js.native
  /* 4 */ val PHOTO: PHOTO with scala.Double = js.native
  /* 1 */ val TV_SHOW: TV_SHOW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.MetadataType with scala.Double] = js.native
}

