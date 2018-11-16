package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CFB$CommonOptions extends js.Object {
  /** If true, throw errors when features are not understood */
  var WTF: js.UndefOr[scala.Boolean] = js.undefined
  /** Input data encoding */
  var `type`: js.UndefOr[
    cfbLib.cfbLibStrings.base64 | cfbLib.cfbLibStrings.binary | cfbLib.cfbLibStrings.buffer | cfbLib.cfbLibStrings.file | cfbLib.cfbLibStrings.array
  ] = js.undefined
}

