package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionGroup extends StObject {
  
  /**
    * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that all of the dimensions in the group were requested, or are present in the response. Valid values for elements in the Dimensions array are:   db.user.id   db.user.name   db.host.id   db.host.name   db.sql.id   db.sql.db_id   db.sql.statement   db.sql.tokenized_id   db.sql_tokenized.id   db.sql_tokenized.db_id   db.sql_tokenized.statement   db.wait_event.name   db.wait_event.type   db.wait_event_type.name  
    */
  var Dimensions: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of the dimension group. Valid values are:    db.user     db.host     db.sql     db.sql_tokenized     db.wait_event     db.wait_event_type   
    */
  var Group: String
  
  /**
    * The maximum number of items to fetch for this dimension group.
    */
  var Limit: js.UndefOr[typings.awsSdk.piMod.Limit] = js.undefined
}
object DimensionGroup {
  
  @scala.inline
  def apply(Group: String): DimensionGroup = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionGroup]
  }
  
  @scala.inline
  implicit class DimensionGroupMutableBuilder[Self <: DimensionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: StringList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
