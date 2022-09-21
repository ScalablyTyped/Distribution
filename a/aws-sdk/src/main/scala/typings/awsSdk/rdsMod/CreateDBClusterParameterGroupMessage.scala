package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB cluster parameter group. Constraints:   Must not match the name of an existing DB cluster parameter group.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String
  
  /**
    * The DB cluster parameter group family name. A DB cluster parameter group can be associated with one and only one DB cluster parameter group family, and can be applied only to a DB cluster running a database engine and engine version compatible with that DB cluster parameter group family.  Aurora MySQL  Example: aurora5.6, aurora-mysql5.7, aurora-mysql8.0   Aurora PostgreSQL  Example: aurora-postgresql9.6   RDS for MySQL  Example: mysql8.0   RDS for PostgreSQL  Example: postgres12  To list all of the available parameter group families for a DB engine, use the following command:  aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;  For example, to list all of the available parameter group families for the Aurora PostgreSQL DB engine, use the following command:  aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily" --engine aurora-postgresql   The output contains duplicates.  The following are the valid DB engine values:    aurora (for MySQL 5.6-compatible Aurora)    aurora-mysql (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)    aurora-postgresql     mysql     postgres   
    */
  var DBParameterGroupFamily: String
  
  /**
    * The description for the DB cluster parameter group.
    */
  var Description: String
  
  /**
    * Tags to assign to the DB cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBClusterParameterGroupMessage {
  
  inline def apply(DBClusterParameterGroupName: String, DBParameterGroupFamily: String, Description: String): CreateDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
  }
  
  extension [Self <: CreateDBClusterParameterGroupMessage](x: Self) {
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
