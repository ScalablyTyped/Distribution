package typings
package chromeLib.chromeNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginTypes extends js.Object {
  /** Optional. Extensions and packaged applications a user has installed (be _really_ careful!).  */
  var extension: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Websites that have been installed as hosted applications (be careful!).  */
  var protectedWeb: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Normal websites.  */
  var unprotectedWeb: js.UndefOr[scala.Boolean] = js.undefined
}

