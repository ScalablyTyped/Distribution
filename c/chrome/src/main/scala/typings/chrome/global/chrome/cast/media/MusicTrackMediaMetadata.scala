package typings.chrome.global.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MusicTrackMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MusicTrackMediaMetadata
  */
class MusicTrackMediaMetadata ()
  extends typings.chrome.chrome.cast.media.MusicTrackMediaMetadata {
  /* CompleteClass */
  override var albumArtist: String = js.native
  /* CompleteClass */
  override var albumName: String = js.native
  /* CompleteClass */
  override var artist: String = js.native
  /** @deprecated. Use artist instead. */
  /* CompleteClass */
  override var artistName: String = js.native
  /* CompleteClass */
  override var composer: String = js.native
  /* CompleteClass */
  override var discNumber: Double = js.native
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
  override var songName: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override var trackNumber: Double = js.native
  /** @deprecated. Use metadataType instead. */
  /* CompleteClass */
  override var `type`: typings.chrome.chrome.cast.media.MetadataType = js.native
}

