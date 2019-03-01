package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var kerningBias: js.UndefOr[scala.Double] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(kerningBias: scala.Int | scala.Double = null): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (kerningBias != null) __obj.updateDynamic("kerningBias")(kerningBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

