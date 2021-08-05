package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromableQueryBuilder extends StObject {
  
  def from(table: String): this.type
}
object FromableQueryBuilder {
  
  inline def apply(from: String => FromableQueryBuilder): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[FromableQueryBuilder]
  }
  
  extension [Self <: FromableQueryBuilder](x: Self) {
    
    inline def setFrom(value: String => FromableQueryBuilder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
  }
}
