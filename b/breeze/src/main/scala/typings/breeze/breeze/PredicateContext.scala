package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredicateContext extends StObject {
  
  var entityType: EntityType
  
  var prefix: js.UndefOr[String] = js.undefined
}
object PredicateContext {
  
  inline def apply(entityType: EntityType): PredicateContext = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredicateContext] (val x: Self) extends AnyVal {
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
