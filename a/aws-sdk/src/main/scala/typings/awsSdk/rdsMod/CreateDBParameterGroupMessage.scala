package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBParameterGroupMessage extends StObject {
  
  /**
    * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter group family, and can be applied only to a DB instance running a database engine and engine version compatible with that DB parameter group family. To list all of the available parameter group families, use the following command:  aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"   The output contains duplicates. 
    */
  var DBParameterGroupFamily: String
  
  /**
    * The name of the DB parameter group. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
    */
  var DBParameterGroupName: String
  
  /**
    * The description for the DB parameter group.
    */
  var Description: String
  
  /**
    * Tags to assign to the DB parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBParameterGroupMessage {
  
  inline def apply(DBParameterGroupFamily: String, DBParameterGroupName: String, Description: String): CreateDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBParameterGroupMessage]
  }
  
  extension [Self <: CreateDBParameterGroupMessage](x: Self) {
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
