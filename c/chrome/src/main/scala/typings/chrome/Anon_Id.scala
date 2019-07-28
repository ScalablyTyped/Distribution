package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var minimum_version: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String, minimum_version: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
    if (minimum_version != null) __obj.updateDynamic("minimum_version")(minimum_version)
    __obj.asInstanceOf[Anon_Id]
  }
}

