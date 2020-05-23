package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var kerningBias: js.UndefOr[Double] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(kerningBias: js.UndefOr[Double] = js.undefined): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kerningBias)) __obj.updateDynamic("kerningBias")(kerningBias.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

