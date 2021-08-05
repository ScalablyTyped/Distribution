package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEntityTypesResult extends StObject {
  
  /**
    * An array of entity types.
    */
  var entityTypes: js.UndefOr[entityTypeList] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetEntityTypesResult {
  
  inline def apply(): GetEntityTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntityTypesResult]
  }
  
  extension [Self <: GetEntityTypesResult](x: Self) {
    
    inline def setEntityTypes(value: entityTypeList): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
