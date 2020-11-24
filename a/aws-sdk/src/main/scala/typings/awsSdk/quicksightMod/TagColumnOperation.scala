package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagColumnOperation extends js.Object {
  
  /**
    * The column that this operation acts on.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  
  /**
    * The dataset column tag, currently only used for geospatial type tagging. .  This is not tags for the AWS tagging feature. . 
    */
  var Tags: ColumnTagList = js.native
}
object TagColumnOperation {
  
  @scala.inline
  def apply(ColumnName: ColumnName, Tags: ColumnTagList): TagColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagColumnOperation]
  }
  
  @scala.inline
  implicit class TagColumnOperationOps[Self <: TagColumnOperation] (val x: Self) extends AnyVal {
    
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
    def setColumnName(value: ColumnName): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: ColumnTag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: ColumnTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
}
