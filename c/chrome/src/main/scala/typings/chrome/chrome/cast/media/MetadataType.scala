package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
  /* 0 */ @js.native
  object GENERIC extends TopLevel[GENERIC with Double]
  
  /* 2 */ @js.native
  object MOVIE extends TopLevel[MOVIE with Double]
  
  /* 3 */ @js.native
  object MUSIC_TRACK extends TopLevel[MUSIC_TRACK with Double]
  
  /* 4 */ @js.native
  object PHOTO extends TopLevel[PHOTO with Double]
  
  /* 1 */ @js.native
  object TV_SHOW extends TopLevel[TV_SHOW with Double]
  
}

