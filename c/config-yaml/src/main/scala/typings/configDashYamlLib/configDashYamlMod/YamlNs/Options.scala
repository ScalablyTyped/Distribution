package typings
package configDashYamlLib.configDashYamlMod.YamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: java.lang.String
}

object Options {
  @scala.inline
  def apply(encoding: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Options]
  }
}

