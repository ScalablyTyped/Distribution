package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CamlBuilder.CamlValues")
@js.native
class CamlValues () extends js.Object

/* static members */
@JSGlobal("CamlBuilder.CamlValues")
@js.native
object CamlValues extends js.Object {
  /** Dynamic value that represents a property of the current list */
  var ListProperty: camljsLib.Anon_Created = js.native
  var Now: java.lang.String = js.native
  /** Dynamic value that represents a property of the current SPWeb */
  var ProjectProperty: camljsLib.Anon_BlogCategoryTitle = js.native
  /** Dynamic value that represents current date */
  var Today: java.lang.String = js.native
  /** Dynamic value that represents Id of the current user */
  var UserID: java.lang.String = js.native
  /** Dynamic value that represents current date with specified offset (may be negative) */
  def TodayWithOffset(offsetDays: scala.Double): java.lang.String = js.native
}

