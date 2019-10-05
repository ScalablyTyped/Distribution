package typings.chromeDashApps.chrome.mediaGalleries

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
  * The pending media scan has changed state. See details for more information.
  */
@JSGlobal("chrome.mediaGalleries.onScanProgress")
@js.native
object onScanProgress
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* args */ ScanProgressEventArgs, Unit]]
    ]

