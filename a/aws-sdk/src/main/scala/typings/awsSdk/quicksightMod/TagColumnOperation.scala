package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagColumnOperation extends StObject {
  
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
  implicit class TagColumnOperationMutableBuilder[Self <: TagColumnOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: ColumnTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: ColumnTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
