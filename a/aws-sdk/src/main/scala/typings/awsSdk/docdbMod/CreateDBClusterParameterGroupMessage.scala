package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the cluster parameter group. Constraints:   Must not match the name of an existing DBClusterParameterGroup.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String
  
  /**
    * The cluster parameter group family name.
    */
  var DBParameterGroupFamily: String
  
  /**
    * The description for the cluster parameter group.
    */
  var Description: String
  
  /**
    * The tags to be assigned to the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBClusterParameterGroupMessage {
  
  @scala.inline
  def apply(DBClusterParameterGroupName: String, DBParameterGroupFamily: String, Description: String): CreateDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class CreateDBClusterParameterGroupMessageMutableBuilder[Self <: CreateDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
