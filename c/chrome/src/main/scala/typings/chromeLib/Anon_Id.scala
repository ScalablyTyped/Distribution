package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var minimum_version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, minimum_version: java.lang.String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (minimum_version != null) __obj.updateDynamic("minimum_version")(minimum_version)
    __obj.asInstanceOf[Anon_Id]
  }
}

