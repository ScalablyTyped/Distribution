package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawQueryModify extends js.Object {
  def AppendAnd(): IFieldExpression
  def AppendOr(): IFieldExpression
}

object IRawQueryModify {
  @scala.inline
  def apply(AppendAnd: () => IFieldExpression, AppendOr: () => IFieldExpression): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = js.Any.fromFunction0(AppendAnd), AppendOr = js.Any.fromFunction0(AppendOr))
    __obj.asInstanceOf[IRawQueryModify]
  }
}

