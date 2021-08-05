package typings.azure.mod

import typings.azure.anon.Database
import typings.azure.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCreationOptions extends StObject {
  
  var additionalStorageAccounts: js.UndefOr[js.Array[Key]] = js.undefined
  
  var defaultStorageAccountKey: String
  
  var defaultStorageAccountName: String
  
  var defaultStorageContainer: String
  
  var hiveMetastore: js.UndefOr[Database] = js.undefined
  
  var location: String
  
  var name: String
  
  var nodes: Double
  
  var oozieMetastore: js.UndefOr[Database] = js.undefined
  
  var password: String
  
  var user: String
}
object ClusterCreationOptions {
  
  inline def apply(
    defaultStorageAccountKey: String,
    defaultStorageAccountName: String,
    defaultStorageContainer: String,
    location: String,
    name: String,
    nodes: Double,
    password: String,
    user: String
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey.asInstanceOf[js.Any], defaultStorageAccountName = defaultStorageAccountName.asInstanceOf[js.Any], defaultStorageContainer = defaultStorageContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCreationOptions]
  }
  
  extension [Self <: ClusterCreationOptions](x: Self) {
    
    inline def setAdditionalStorageAccounts(value: js.Array[Key]): Self = StObject.set(x, "additionalStorageAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalStorageAccountsUndefined: Self = StObject.set(x, "additionalStorageAccounts", js.undefined)
    
    inline def setAdditionalStorageAccountsVarargs(value: Key*): Self = StObject.set(x, "additionalStorageAccounts", js.Array(value :_*))
    
    inline def setDefaultStorageAccountKey(value: String): Self = StObject.set(x, "defaultStorageAccountKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageAccountName(value: String): Self = StObject.set(x, "defaultStorageAccountName", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageContainer(value: String): Self = StObject.set(x, "defaultStorageContainer", value.asInstanceOf[js.Any])
    
    inline def setHiveMetastore(value: Database): Self = StObject.set(x, "hiveMetastore", value.asInstanceOf[js.Any])
    
    inline def setHiveMetastoreUndefined: Self = StObject.set(x, "hiveMetastore", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setOozieMetastore(value: Database): Self = StObject.set(x, "oozieMetastore", value.asInstanceOf[js.Any])
    
    inline def setOozieMetastoreUndefined: Self = StObject.set(x, "oozieMetastore", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
