package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypesNs {
  /**
           * @since Chrome 66.
           * @description The origin of injected CSS.
           **/
  type CSSOrigin = chromeDashAppsLib.chromeDashAppsLibStrings.author | chromeDashAppsLib.chromeDashAppsLibStrings.user
  /**
           * Details about the format and quality of an image.
           */
  type ImageDetails = ImageDetailsJpeg | ImageDetailsPng
  /**
           * The soonest that the JavaScript or CSS will be injected into the tab.
           **/
  type RunAt = chromeDashAppsLib.chromeDashAppsLibStrings.document_start | chromeDashAppsLib.chromeDashAppsLibStrings.document_end | chromeDashAppsLib.chromeDashAppsLibStrings.document_idle
}
