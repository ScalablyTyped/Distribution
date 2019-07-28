package typings.braftDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var `type`: String
  var url: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, `type`: String, url: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

