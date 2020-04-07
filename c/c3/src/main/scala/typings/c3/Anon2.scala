package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var max: js.UndefOr[Double | keyinAxisNamenumberX] = js.undefined
  var min: js.UndefOr[Double | keyinAxisNamenumberX] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(max: Double | keyinAxisNamenumberX = null, min: Double | keyinAxisNamenumberX = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

