package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An HTTP Header, represented as an object containing a key and either a value or a binaryValue. */
trait HttpHeader extends js.Object {
  var binaryValue: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

