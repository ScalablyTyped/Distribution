package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDefinition extends StObject {
  
  var access: js.UndefOr[AccessType] = js.undefined
  
  var authorize: js.UndefOr[Boolean] = js.undefined
  
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  var columns: js.UndefOr[js.Any] = js.undefined
  
  var databaseTableName: js.UndefOr[String] = js.undefined
  
  var dynamicSchema: js.UndefOr[Boolean] = js.undefined
  
  var filters: js.UndefOr[
    js.Array[js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs]]
  ] = js.undefined
  
  var hooks: js.UndefOr[js.Array[js.Function2[/* results */ js.Any, /* context */ Context, Unit]]] = js.undefined
  
  var maxTop: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var perUser: js.UndefOr[Boolean] = js.undefined
  
  var recordsExpire: js.UndefOr[Duration] = js.undefined
  
  var schema: js.UndefOr[String] = js.undefined
  
  var softDelete: js.UndefOr[Boolean] = js.undefined
  
  var transforms: js.UndefOr[js.Array[js.Function2[/* item */ js.Any, /* context */ Context, Unit | js.Any]]] = js.undefined
  
  var userIdColumn: js.UndefOr[String] = js.undefined
  
  var webhook: js.UndefOr[Webhook | Boolean] = js.undefined
}
object TableDefinition {
  
  @scala.inline
  def apply(): TableDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDefinition]
  }
  
  @scala.inline
  implicit class TableDefinitionMutableBuilder[Self <: TableDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: AccessType): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setAuthorize(value: Boolean): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizeUndefined: Self = StObject.set(x, "authorize", js.undefined)
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setDatabaseTableName(value: String): Self = StObject.set(x, "databaseTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseTableNameUndefined: Self = StObject.set(x, "databaseTableName", js.undefined)
    
    @scala.inline
    def setDynamicSchema(value: Boolean): Self = StObject.set(x, "dynamicSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSchemaUndefined: Self = StObject.set(x, "dynamicSchema", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: (js.Function2[/* query */ QueryJs, /* context */ Context, Unit | QueryJs])*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setHooks(value: js.Array[js.Function2[/* results */ js.Any, /* context */ Context, Unit]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setHooksVarargs(value: (js.Function2[/* results */ js.Any, /* context */ Context, Unit])*): Self = StObject.set(x, "hooks", js.Array(value :_*))
    
    @scala.inline
    def setMaxTop(value: Double): Self = StObject.set(x, "maxTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTopUndefined: Self = StObject.set(x, "maxTop", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPerUser(value: Boolean): Self = StObject.set(x, "perUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerUserUndefined: Self = StObject.set(x, "perUser", js.undefined)
    
    @scala.inline
    def setRecordsExpire(value: Duration): Self = StObject.set(x, "recordsExpire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsExpireUndefined: Self = StObject.set(x, "recordsExpire", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSoftDelete(value: Boolean): Self = StObject.set(x, "softDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftDeleteUndefined: Self = StObject.set(x, "softDelete", js.undefined)
    
    @scala.inline
    def setTransforms(value: js.Array[js.Function2[/* item */ js.Any, /* context */ Context, Unit | js.Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: (js.Function2[/* item */ js.Any, /* context */ Context, Unit | js.Any])*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    
    @scala.inline
    def setUserIdColumn(value: String): Self = StObject.set(x, "userIdColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdColumnUndefined: Self = StObject.set(x, "userIdColumn", js.undefined)
    
    @scala.inline
    def setWebhook(value: Webhook | Boolean): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
