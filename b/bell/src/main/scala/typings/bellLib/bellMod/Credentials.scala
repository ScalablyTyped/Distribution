package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * Varying data depending on provider.
    */
  var profile: js.UndefOr[js.Object] = js.undefined
  var provider: Provider | bellLib.bellLibStrings.custom
  var query: StringLikeMap
  var token: java.lang.String
}

