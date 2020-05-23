package typings.chrome.global.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.GenericMediaMetadata")
@js.native
class GenericMediaMetadata ()
  extends typings.chrome.chrome.cast.media.GenericMediaMetadata {
  /* CompleteClass */
  override var images: js.Array[Image] = js.native
  /* CompleteClass */
  override var metadataType: typings.chrome.chrome.cast.media.MetadataType = js.native
  /* CompleteClass */
  override var releaseDate: String = js.native
  /** @deprecated. Use releaseDate instead. */
  /* CompleteClass */
  override var releaseYear: Double = js.native
  /* CompleteClass */
  override var subtitle: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  /* CompleteClass */
  override var `type`: typings.chrome.chrome.cast.media.MetadataType = js.native
}

