package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$WritingOptions extends CFB$CommonOptions {
  /** Enable compression (ZIP only) */
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  /** Output file type */
  var fileType: js.UndefOr[cfbLib.cfbLibStrings.cfb | cfbLib.cfbLibStrings.zip] = js.undefined
  /** Override default root entry name (CFB only) */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

