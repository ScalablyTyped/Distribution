package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataType extends js.Object

@JSGlobal("chrome.cast.media.MetadataType")
@js.native
object MetadataType extends js.Object {
  @js.native
  sealed trait GENERIC extends MetadataType
  
  @js.native
  sealed trait MOVIE extends MetadataType
  
  @js.native
  sealed trait MUSIC_TRACK extends MetadataType
  
  @js.native
  sealed trait PHOTO extends MetadataType
  
  @js.native
  sealed trait TV_SHOW extends MetadataType
  
}

