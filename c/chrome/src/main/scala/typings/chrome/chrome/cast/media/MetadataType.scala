package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSGlobal("chrome.cast.media.MetadataType")
@js.native
object MetadataType extends StObject {
  
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
