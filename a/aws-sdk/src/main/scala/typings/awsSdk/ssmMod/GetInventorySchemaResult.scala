package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInventorySchemaResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * Inventory schemas returned by the request.
    */
  var Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined
}
object GetInventorySchemaResult {
  
  inline def apply(): GetInventorySchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventorySchemaResult]
  }
  
  extension [Self <: GetInventorySchemaResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemas(value: InventoryItemSchemaResultList): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    inline def setSchemasVarargs(value: InventoryItemSchema*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
