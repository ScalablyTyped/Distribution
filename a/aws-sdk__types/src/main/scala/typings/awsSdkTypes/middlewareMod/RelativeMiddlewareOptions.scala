package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/types.@aws-sdk/types/dist/cjs/middleware.RelativeLocation & std.Omit<@aws-sdk/types.@aws-sdk/types/dist/cjs/middleware.HandlerOptions, 'step'> */
trait RelativeMiddlewareOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the relation to be before or after a know middleware.
    */
  var relation: Relation
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A known middleware name to indicate inserting middleware's location.
    */
  var toMiddleware: String
}
object RelativeMiddlewareOptions {
  
  inline def apply(relation: Relation, toMiddleware: String): RelativeMiddlewareOptions = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], toMiddleware = toMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeMiddlewareOptions]
  }
  
  extension [Self <: RelativeMiddlewareOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelation(value: Relation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setToMiddleware(value: String): Self = StObject.set(x, "toMiddleware", value.asInstanceOf[js.Any])
  }
}
