package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB cluster parameter group. Constraints:   Must match the name of an existing DB cluster parameter group.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String = js.native
  
  /**
    * The DB cluster parameter group family name. A DB cluster parameter group can be associated with one and only one DB cluster parameter group family, and can be applied only to a DB cluster running a database engine and engine version compatible with that DB cluster parameter group family.  Aurora MySQL  Example: aurora5.6, aurora-mysql5.7   Aurora PostgreSQL  Example: aurora-postgresql9.6 
    */
  var DBParameterGroupFamily: String = js.native
  
  /**
    * The description for the DB cluster parameter group.
    */
  var Description: String = js.native
  
  /**
    * Tags to assign to the DB cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
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
