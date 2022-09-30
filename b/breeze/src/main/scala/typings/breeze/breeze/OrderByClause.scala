package typings.breeze.breeze

import typings.breeze.breezeInts.`-1`
import typings.breeze.breezeInts.`0`
import typings.breeze.breezeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderByClause extends StObject {
  
  def getComparer(entityType: EntityType): js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`]
  
  var items: js.Array[OrderByItem]
  
  def toFunction(config: js.Object): js.Function1[/* entity */ Entity, js.Object]
  
  def toJSONExt(context: js.Object): js.Array[String]
  
  def validate(entityType: EntityType): Unit
}
object OrderByClause {
  
  inline def apply(
    getComparer: EntityType => js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`],
    items: js.Array[OrderByItem],
    toFunction: js.Object => js.Function1[/* entity */ Entity, js.Object],
    toJSONExt: js.Object => js.Array[String],
    validate: EntityType => Unit
  ): OrderByClause = {
    val __obj = js.Dynamic.literal(getComparer = js.Any.fromFunction1(getComparer), items = items.asInstanceOf[js.Any], toFunction = js.Any.fromFunction1(toFunction), toJSONExt = js.Any.fromFunction1(toJSONExt), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[OrderByClause]
  }
  
  extension [Self <: OrderByClause](x: Self) {
    
    inline def setGetComparer(value: EntityType => js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`]): Self = StObject.set(x, "getComparer", js.Any.fromFunction1(value))
    
    inline def setItems(value: js.Array[OrderByItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: OrderByItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setToFunction(value: js.Object => js.Function1[/* entity */ Entity, js.Object]): Self = StObject.set(x, "toFunction", js.Any.fromFunction1(value))
    
    inline def setToJSONExt(value: js.Object => js.Array[String]): Self = StObject.set(x, "toJSONExt", js.Any.fromFunction1(value))
    
    inline def setValidate(value: EntityType => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
