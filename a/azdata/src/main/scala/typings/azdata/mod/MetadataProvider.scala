package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataProvider
  extends StObject
     with DataProvider {
  
  def getDatabases(connectionUri: String): Thenable[js.Array[DatabaseInfo | String]]
  
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata]
  
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
  
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
}
object MetadataProvider {
  
  inline def apply(
    getDatabases: String => Thenable[js.Array[DatabaseInfo | String]],
    getMetadata: String => Thenable[ProviderMetadata],
    getTableInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    getViewInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    providerId: String
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(getDatabases = js.Any.fromFunction1(getDatabases), getMetadata = js.Any.fromFunction1(getMetadata), getTableInfo = js.Any.fromFunction2(getTableInfo), getViewInfo = js.Any.fromFunction2(getViewInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
  
  extension [Self <: MetadataProvider](x: Self) {
    
    inline def setGetDatabases(value: String => Thenable[js.Array[DatabaseInfo | String]]): Self = StObject.set(x, "getDatabases", js.Any.fromFunction1(value))
    
    inline def setGetMetadata(value: String => Thenable[ProviderMetadata]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
    
    inline def setGetTableInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = StObject.set(x, "getTableInfo", js.Any.fromFunction2(value))
    
    inline def setGetViewInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = StObject.set(x, "getViewInfo", js.Any.fromFunction2(value))
  }
}
