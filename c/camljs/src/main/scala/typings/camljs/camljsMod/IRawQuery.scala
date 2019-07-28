package typings.camljs.camljsMod

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
  def apply(ModifyWhere: () => IRawQueryModify, ReplaceWhere: () => IFieldExpression): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = js.Any.fromFunction0(ModifyWhere), ReplaceWhere = js.Any.fromFunction0(ReplaceWhere))
  
    __obj.asInstanceOf[IRawQuery]
  }
}

