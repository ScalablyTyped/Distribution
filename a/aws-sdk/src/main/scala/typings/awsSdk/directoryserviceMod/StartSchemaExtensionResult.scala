package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSchemaExtensionResult extends StObject {
  
  /**
    * The identifier of the schema extension that will be applied.
    */
  var SchemaExtensionId: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionId] = js.undefined
}
object StartSchemaExtensionResult {
  
  inline def apply(): StartSchemaExtensionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSchemaExtensionResult]
  }
  
  extension [Self <: StartSchemaExtensionResult](x: Self) {
    
    inline def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionIdUndefined: Self = StObject.set(x, "SchemaExtensionId", js.undefined)
  }
}
