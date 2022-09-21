package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  /**
    * The username of the administrator for the first database created in the namespace.
    */
  var adminUsername: js.UndefOr[DbUser] = js.undefined
  
  /**
    * The date of when the namespace was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the first database created in the namespace.
    */
  var dbName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
    */
  var defaultIamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of IAM roles to associate with the namespace.
    */
  var iamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The types of logs the namespace can export. Available export types are User log, Connection log, and User activity log.
    */
  var logExports: js.UndefOr[LogExportList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with a namespace.
    */
  var namespaceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of a namespace.
    */
  var namespaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The status of the namespace.
    */
  var status: js.UndefOr[NamespaceStatus] = js.undefined
}
object Namespace {
  
  inline def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setAdminUsername(value: DbUser): Self = StObject.set(x, "adminUsername", value.asInstanceOf[js.Any])
    
    inline def setAdminUsernameUndefined: Self = StObject.set(x, "adminUsername", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setDefaultIamRoleArn(value: String): Self = StObject.set(x, "defaultIamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultIamRoleArnUndefined: Self = StObject.set(x, "defaultIamRoleArn", js.undefined)
    
    inline def setIamRoles(value: IamRoleArnList): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
    
    inline def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
    
    inline def setIamRolesVarargs(value: IamRoleArn*): Self = StObject.set(x, "iamRoles", js.Array(value*))
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLogExports(value: LogExportList): Self = StObject.set(x, "logExports", value.asInstanceOf[js.Any])
    
    inline def setLogExportsUndefined: Self = StObject.set(x, "logExports", js.undefined)
    
    inline def setLogExportsVarargs(value: LogExport*): Self = StObject.set(x, "logExports", js.Array(value*))
    
    inline def setNamespaceArn(value: String): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setStatus(value: NamespaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
