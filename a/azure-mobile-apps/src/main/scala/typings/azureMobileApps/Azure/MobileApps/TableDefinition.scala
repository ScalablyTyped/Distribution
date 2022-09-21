package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDefinition extends StObject {
  
  var access: js.UndefOr[AccessType] = js.undefined
  
  var authorize: js.UndefOr[Boolean] = js.undefined
  
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  var columns: js.UndefOr[Any] = js.undefined
  
  var databaseTableName: js.UndefOr[String] = js.undefined
  
  var dynamicSchema: js.UndefOr[Boolean] = js.undefined
  
  var filters: js.UndefOr[
    js.Array[js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs]]
  ] = js.undefined
  
  var hooks: js.UndefOr[js.Array[js.Function2[/* results */ Any, /* context */ Context, Unit]]] = js.undefined
  
  var maxTop: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var perUser: js.UndefOr[Boolean] = js.undefined
  
  var recordsExpire: js.UndefOr[Duration] = js.undefined
  
  var schema: js.UndefOr[String] = js.undefined
  
  var softDelete: js.UndefOr[Boolean] = js.undefined
  
  var transforms: js.UndefOr[js.Array[js.Function2[/* item */ Any, /* context */ Context, Unit | Any]]] = js.undefined
  
  var userIdColumn: js.UndefOr[String] = js.undefined
  
  var webhook: js.UndefOr[Webhook | Boolean] = js.undefined
}
object TableDefinition {
  
  inline def apply(): TableDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDefinition]
  }
  
  extension [Self <: TableDefinition](x: Self) {
    
    inline def setAccess(value: AccessType): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAuthorize(value: Boolean): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeUndefined: Self = StObject.set(x, "authorize", js.undefined)
    
    inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setDatabaseTableName(value: String): Self = StObject.set(x, "databaseTableName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTableNameUndefined: Self = StObject.set(x, "databaseTableName", js.undefined)
    
    inline def setDynamicSchema(value: Boolean): Self = StObject.set(x, "dynamicSchema", value.asInstanceOf[js.Any])
    
    inline def setDynamicSchemaUndefined: Self = StObject.set(x, "dynamicSchema", js.undefined)
    
    inline def setFilters(value: js.Array[js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: (js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs])*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setHooks(value: js.Array[js.Function2[/* results */ Any, /* context */ Context, Unit]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setHooksVarargs(value: (js.Function2[/* results */ Any, /* context */ Context, Unit])*): Self = StObject.set(x, "hooks", js.Array(value*))
    
    inline def setMaxTop(value: Double): Self = StObject.set(x, "maxTop", value.asInstanceOf[js.Any])
    
    inline def setMaxTopUndefined: Self = StObject.set(x, "maxTop", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPerUser(value: Boolean): Self = StObject.set(x, "perUser", value.asInstanceOf[js.Any])
    
    inline def setPerUserUndefined: Self = StObject.set(x, "perUser", js.undefined)
    
    inline def setRecordsExpire(value: Duration): Self = StObject.set(x, "recordsExpire", value.asInstanceOf[js.Any])
    
    inline def setRecordsExpireUndefined: Self = StObject.set(x, "recordsExpire", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSoftDelete(value: Boolean): Self = StObject.set(x, "softDelete", value.asInstanceOf[js.Any])
    
    inline def setSoftDeleteUndefined: Self = StObject.set(x, "softDelete", js.undefined)
    
    inline def setTransforms(value: js.Array[js.Function2[/* item */ Any, /* context */ Context, Unit | Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setTransformsVarargs(value: (js.Function2[/* item */ Any, /* context */ Context, Unit | Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
    
    inline def setUserIdColumn(value: String): Self = StObject.set(x, "userIdColumn", value.asInstanceOf[js.Any])
    
    inline def setUserIdColumnUndefined: Self = StObject.set(x, "userIdColumn", js.undefined)
    
    inline def setWebhook(value: Webhook | Boolean): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
