package typings.configYaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<config-yaml.config-yaml.Options> */
trait PartialOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(encoding: String = null): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

