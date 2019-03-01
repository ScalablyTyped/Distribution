package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawQuery extends js.Object {
  def ModifyWhere(): IRawQueryModify
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression
}

object IRawQuery {
  @scala.inline
  def apply(ModifyWhere: js.Function0[IRawQueryModify], ReplaceWhere: js.Function0[IFieldExpression]): IRawQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ModifyWhere")(ModifyWhere)
    __obj.updateDynamic("ReplaceWhere")(ReplaceWhere)
    __obj.asInstanceOf[IRawQuery]
  }
}

