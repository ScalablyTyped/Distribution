package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameType extends js.Object {
  var name: String
  var `type`: Anon_Code
}

object Anon_NameType {
  @scala.inline
  def apply(name: String, `type`: Anon_Code): Anon_NameType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameType]
  }
}

