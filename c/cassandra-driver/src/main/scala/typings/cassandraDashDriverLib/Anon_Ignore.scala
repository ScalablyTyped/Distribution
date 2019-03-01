package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ignore extends js.Object {
  var ignore: scala.Double
  var rethrow: scala.Double
  var retry: scala.Double
}

object Anon_Ignore {
  @scala.inline
  def apply(ignore: scala.Double, rethrow: scala.Double, retry: scala.Double): Anon_Ignore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignore")(ignore)
    __obj.updateDynamic("rethrow")(rethrow)
    __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[Anon_Ignore]
  }
}

