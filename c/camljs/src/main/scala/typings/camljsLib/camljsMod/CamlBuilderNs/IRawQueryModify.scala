package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawQueryModify extends js.Object {
  def AppendAnd(): IFieldExpression
  def AppendOr(): IFieldExpression
}

object IRawQueryModify {
  @scala.inline
  def apply(AppendAnd: js.Function0[IFieldExpression], AppendOr: js.Function0[IFieldExpression]): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = AppendAnd, AppendOr = AppendOr)
  
    __obj.asInstanceOf[IRawQueryModify]
  }
}

