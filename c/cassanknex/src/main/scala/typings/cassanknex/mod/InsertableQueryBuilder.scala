package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertableQueryBuilder extends StObject {
  
  def ifNotExists(): this.type
  
  def into(table: String): this.type
}
object InsertableQueryBuilder {
  
  inline def apply(ifNotExists: () => InsertableQueryBuilder, into: String => InsertableQueryBuilder): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertableQueryBuilder] (val x: Self) extends AnyVal {
    
    inline def setIfNotExists(value: () => InsertableQueryBuilder): Self = StObject.set(x, "ifNotExists", js.Any.fromFunction0(value))
    
    inline def setInto(value: String => InsertableQueryBuilder): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
