package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.EmailOptions> */
trait PartialEmailOptions extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object PartialEmailOptions {
  @scala.inline
  def apply(domain: String = null, length: Int | Double = null): PartialEmailOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEmailOptions]
  }
}

