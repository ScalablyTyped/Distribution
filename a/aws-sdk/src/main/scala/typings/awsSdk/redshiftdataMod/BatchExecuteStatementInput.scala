package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementInput extends StObject {
  
  /**
    * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: js.UndefOr[Location] = js.undefined
  
  /**
    * The name of the database. This parameter is required when authenticating using either Secrets Manager or temporary credentials. 
    */
  var Database: String
  
  /**
    * The database user name. This parameter is required when connecting to a cluster and authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.redshiftdataMod.SecretArn] = js.undefined
  
  /**
    * One or more SQL statements to run. 
    */
  var Sqls: SqlList
  
  /**
    * The name of the SQL statements. You can name the SQL statements when you create them to identify the query. 
    */
  var StatementName: js.UndefOr[StatementNameString] = js.undefined
  
  /**
    * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run. 
    */
  var WithEvent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and authenticating using either Secrets Manager or temporary credentials.
    */
  var WorkgroupName: js.UndefOr[WorkgroupNameString] = js.undefined
}
object BatchExecuteStatementInput {
  
  inline def apply(Database: String, Sqls: SqlList): BatchExecuteStatementInput = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Sqls = Sqls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementInput]
  }
  
  extension [Self <: BatchExecuteStatementInput](x: Self) {
    
    inline def setClusterIdentifier(value: Location): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setSqls(value: SqlList): Self = StObject.set(x, "Sqls", value.asInstanceOf[js.Any])
    
    inline def setSqlsVarargs(value: StatementString*): Self = StObject.set(x, "Sqls", js.Array(value*))
    
    inline def setStatementName(value: StatementNameString): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    inline def setWithEvent(value: Boolean): Self = StObject.set(x, "WithEvent", value.asInstanceOf[js.Any])
    
    inline def setWithEventUndefined: Self = StObject.set(x, "WithEvent", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupNameString): Self = StObject.set(x, "WorkgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "WorkgroupName", js.undefined)
  }
}
