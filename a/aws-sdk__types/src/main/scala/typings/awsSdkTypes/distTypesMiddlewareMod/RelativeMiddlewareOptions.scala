package typings.awsSdkTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/types.@aws-sdk/types/dist-types/middleware.RelativeLocation & std.Omit<@aws-sdk/types.@aws-sdk/types/dist-types/middleware.HandlerOptions, 'step'> */
trait RelativeMiddlewareOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeMiddlewareOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setRelation(value: Relation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setToMiddleware(value: String): Self = StObject.set(x, "toMiddleware", value.asInstanceOf[js.Any])
  }
}
