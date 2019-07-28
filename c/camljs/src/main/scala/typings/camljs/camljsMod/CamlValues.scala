package typings.camljs.camljsMod

import typings.camljs.Anon_BlogCategoryTitle
import typings.camljs.Anon_Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camljs", "CamlValues")
@js.native
class CamlValues () extends js.Object

/* static members */
@JSImport("camljs", "CamlValues")
@js.native
object CamlValues extends js.Object {
  /** Dynamic value that represents a property of the current list */
  var ListProperty: Anon_Created = js.native
  var Now: String = js.native
  /** Dynamic value that represents a property of the current SPWeb */
  var ProjectProperty: Anon_BlogCategoryTitle = js.native
  /** Dynamic value that represents current date */
  var Today: String = js.native
  /** Dynamic value that represents Id of the current user */
  var UserID: String = js.native
  /** Dynamic value that represents current date with specified offset (may be negative) */
  def TodayWithOffset(offsetDays: Double): String = js.native
}

