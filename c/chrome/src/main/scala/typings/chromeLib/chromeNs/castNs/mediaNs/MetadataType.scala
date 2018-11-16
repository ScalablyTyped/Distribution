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
  
  val GENERIC: GENERIC with java.lang.String = js.native
  val MOVIE: MOVIE with java.lang.String = js.native
  val MUSIC_TRACK: MUSIC_TRACK with java.lang.String = js.native
  val PHOTO: PHOTO with java.lang.String = js.native
  val TV_SHOW: TV_SHOW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.MetadataType with java.lang.String] = js.native
}

