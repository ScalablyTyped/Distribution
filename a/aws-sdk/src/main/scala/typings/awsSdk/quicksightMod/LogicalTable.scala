package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalTable extends js.Object {
  
  /**
    * A display name for the logical table.
    */
  var Alias: LogicalTableAlias = js.native
  
  /**
    * Transform operations that act on this logical table.
    */
  var DataTransforms: js.UndefOr[TransformOperationList] = js.native
  
  /**
    * Source of this logical table.
    */
  var Source: LogicalTableSource = js.native
}
object LogicalTable {
  
  @scala.inline
  def apply(Alias: LogicalTableAlias, Source: LogicalTableSource): LogicalTable = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalTable]
  }
  
  @scala.inline
  implicit class LogicalTableOps[Self <: LogicalTable] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: LogicalTableAlias): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: LogicalTableSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransformsVarargs(value: TransformOperation*): Self = this.set("DataTransforms", js.Array(value :_*))
    
    @scala.inline
    def setDataTransforms(value: TransformOperationList): Self = this.set("DataTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTransforms: Self = this.set("DataTransforms", js.undefined)
  }
}
