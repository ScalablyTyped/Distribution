package typings.chromeDashApps.chrome.mediaGalleries

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a media gallery is changed or a gallery watch is dropped
  * @since Chrome 38.
  */
@JSGlobal("chrome.mediaGalleries.onGalleryChanged")
@js.native
object onGalleryChanged
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* args */ GalleryChangedEventArgs, Unit]]
    ]

