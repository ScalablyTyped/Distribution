package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time.
     */
/**
     * Details of the script or CSS to inject.
     * Either the code or the file property must be set,
     * but both may not be set at the same time.
     **/

trait InjectDetails extends js.Object {
  /**
           * JavaScript or CSS code to inject.
           *
           * **Warning**
           * Be careful using the *code* parameter.
           * Incorrect use of it may open your app to
           * cross site scripting attacks.
           * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
           */
  /**
           * JavaScript or CSS code to inject.
           * Warning: Be careful using the code parameter.
           * Incorrect use of it may open your app to xss attacks.
           */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
           * JavaScript or CSS file to inject.
           */
  /** JavaScript or CSS file to inject. */
  var file: js.UndefOr[java.lang.String] = js.undefined
}

