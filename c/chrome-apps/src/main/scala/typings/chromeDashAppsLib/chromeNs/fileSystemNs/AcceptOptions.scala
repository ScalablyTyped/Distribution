package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /**
    * This is the optional text description for this option.
    * If not present, a description will be automatically generated;
    * typically containing an expanded list of valid extensions (e.g. 'text/html' may expand to '*.html, *.htm').
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extensions to accept, e.g. 'jpg', 'gif', 'crx'.
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Mime-types to accept, e.g. 'image/jpeg' or 'audio/ *'. One of mimeTypess must contain at least one valid element.
    */
  var mimeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

