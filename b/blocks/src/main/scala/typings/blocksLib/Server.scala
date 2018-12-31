package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
  	 * Caches pages result instead of executing them each time.
    * Disabling cache could impact performance.
  	 */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The port at which your application will be run
  	 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The folder where your application files like .html; .js and .css are going to be.
    * The value is passed to express.static() middleware.
  	 */
  var static: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Provide an express middleware function or an array of middleware functions.
  	 * Use: [compression(); bodyParser()]
  	 */
  var use: js.UndefOr[js.Any] = js.undefined
}

