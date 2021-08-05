package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait ExecutionArgs extends StObject {
  
  var contextValue: js.UndefOr[js.Any] = js.undefined
  
  var document: js.Any
  
  var fieldResolver: js.UndefOr[js.Any] = js.undefined
  
  var operationName: js.UndefOr[String] = js.undefined
  
  var rootValue: js.UndefOr[js.Any] = js.undefined
  
  var schema: js.Any
  
  var typeResolver: js.UndefOr[js.Any] = js.undefined
  
  var variableValues: js.UndefOr[js.Any] = js.undefined
}
object ExecutionArgs {
  
  inline def apply(document: js.Any, schema: js.Any): ExecutionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
  
  extension [Self <: ExecutionArgs](x: Self) {
    
    inline def setContextValue(value: js.Any): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    inline def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    inline def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setFieldResolver(value: js.Any): Self = StObject.set(x, "fieldResolver", value.asInstanceOf[js.Any])
    
    inline def setFieldResolverUndefined: Self = StObject.set(x, "fieldResolver", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    inline def setRootValue(value: js.Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
    
    inline def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTypeResolver(value: js.Any): Self = StObject.set(x, "typeResolver", value.asInstanceOf[js.Any])
    
    inline def setTypeResolverUndefined: Self = StObject.set(x, "typeResolver", js.undefined)
    
    inline def setVariableValues(value: js.Any): Self = StObject.set(x, "variableValues", value.asInstanceOf[js.Any])
    
    inline def setVariableValuesUndefined: Self = StObject.set(x, "variableValues", js.undefined)
  }
}
