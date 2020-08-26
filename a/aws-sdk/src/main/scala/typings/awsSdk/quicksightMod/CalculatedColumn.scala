package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedColumn extends js.Object {
  /**
    * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
    */
  var ColumnId: typings.awsSdk.quicksightMod.ColumnId = js.native
  /**
    * Column name.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  /**
    * An expression that defines the calculated column.
    */
  var Expression: typings.awsSdk.quicksightMod.Expression = js.native
}

object CalculatedColumn {
  @scala.inline
  def apply(ColumnId: ColumnId, ColumnName: ColumnName, Expression: Expression): CalculatedColumn = {
    val __obj = js.Dynamic.literal(ColumnId = ColumnId.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedColumn]
  }
  @scala.inline
  implicit class CalculatedColumnOps[Self <: CalculatedColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnId(value: ColumnId): Self = this.set("ColumnId", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnName(value: ColumnName): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Expression): Self = this.set("Expression", value.asInstanceOf[js.Any])
  }
  
}

