package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.MediaImage
import typings.typescriptNn5FuAjk.MediaMetadataInit
import typings.typescriptNn5FuAjk.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaMetadata")
@js.native
open class MediaMetadata ()
  extends StObject
     with typings.typescriptNn5FuAjk.MediaMetadata {
  def this(init: MediaMetadataInit) = this()
  
  /* CompleteClass */
  var album: java.lang.String = js.native
  
  /* CompleteClass */
  var artist: java.lang.String = js.native
  
  /* CompleteClass */
  var artwork: ReadonlyArray[MediaImage] = js.native
  
  /* CompleteClass */
  var title: java.lang.String = js.native
}
