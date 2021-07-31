package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSGlobal("chrome.cast.media.MetadataType")
@js.native
object MetadataType extends StObject {
  
  @js.native
  sealed trait GENERIC
    extends StObject
       with MetadataType
  
  @js.native
  sealed trait MOVIE
    extends StObject
       with MetadataType
  
  @js.native
  sealed trait MUSIC_TRACK
    extends StObject
       with MetadataType
  
  @js.native
  sealed trait PHOTO
    extends StObject
       with MetadataType
  
  @js.native
  sealed trait TV_SHOW
    extends StObject
       with MetadataType
}
