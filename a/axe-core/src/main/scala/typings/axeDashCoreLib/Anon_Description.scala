package typings
package axeDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: java.lang.String
  var help: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(description: java.lang.String, help: java.lang.String): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("help")(help)
    __obj.asInstanceOf[Anon_Description]
  }
}

