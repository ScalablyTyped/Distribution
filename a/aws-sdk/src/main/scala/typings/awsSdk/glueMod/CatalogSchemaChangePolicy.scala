package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogSchemaChangePolicy extends StObject {
  
  /**
    * Whether to use the specified update behavior when the crawler finds a changed schema.
    */
  var EnableUpdateCatalog: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[UpdateCatalogBehavior] = js.undefined
}
object CatalogSchemaChangePolicy {
  
  inline def apply(): CatalogSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogSchemaChangePolicy]
  }
  
  extension [Self <: CatalogSchemaChangePolicy](x: Self) {
    
    inline def setEnableUpdateCatalog(value: BoxedBoolean): Self = StObject.set(x, "EnableUpdateCatalog", value.asInstanceOf[js.Any])
    
    inline def setEnableUpdateCatalogUndefined: Self = StObject.set(x, "EnableUpdateCatalog", js.undefined)
    
    inline def setUpdateBehavior(value: UpdateCatalogBehavior): Self = StObject.set(x, "UpdateBehavior", value.asInstanceOf[js.Any])
    
    inline def setUpdateBehaviorUndefined: Self = StObject.set(x, "UpdateBehavior", js.undefined)
  }
}
