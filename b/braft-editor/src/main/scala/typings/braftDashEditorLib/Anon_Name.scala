package typings
package braftDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, url: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

