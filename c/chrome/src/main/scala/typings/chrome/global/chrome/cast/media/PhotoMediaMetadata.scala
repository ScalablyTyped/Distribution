package typings.chrome.global.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.PhotoMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PhotoMediaMetadata
  */
class PhotoMediaMetadata ()
  extends typings.chrome.chrome.cast.media.PhotoMediaMetadata {
  /* CompleteClass */
  override var artist: String = js.native
  /* CompleteClass */
  override var creationDateTime: String = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var images: js.Array[Image] = js.native
  /* CompleteClass */
  override var latitude: Double = js.native
  /* CompleteClass */
  override var location: String = js.native
  /* CompleteClass */
  override var longitude: Double = js.native
  /* CompleteClass */
  override var metadataType: typings.chrome.chrome.cast.media.MetadataType = js.native
  /* CompleteClass */
  override var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  /* CompleteClass */
  override var `type`: typings.chrome.chrome.cast.media.MetadataType = js.native
  /* CompleteClass */
  override var width: Double = js.native
}

