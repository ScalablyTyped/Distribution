package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryJs extends StObject {
  
  // these are properties added by the SDK
  var id: js.UndefOr[String | Double] = js.undefined
  
  def includeDeleted(): QueryJs
  
  def includeTotalCount(): QueryJs
  
  def orderBy(properties: String): QueryJs
  
  def orderByDescending(properties: String): QueryJs
  
  def select(properties: String): QueryJs
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  def skip(count: Double): QueryJs
  
  def take(count: Double): QueryJs
  
  def where(filter: js.Any): QueryJs
}
object QueryJs {
  
  inline def apply(
    includeDeleted: () => QueryJs,
    includeTotalCount: () => QueryJs,
    orderBy: String => QueryJs,
    orderByDescending: String => QueryJs,
    select: String => QueryJs,
    skip: Double => QueryJs,
    take: Double => QueryJs,
    where: js.Any => QueryJs
  ): QueryJs = {
    val __obj = js.Dynamic.literal(includeDeleted = js.Any.fromFunction0(includeDeleted), includeTotalCount = js.Any.fromFunction0(includeTotalCount), orderBy = js.Any.fromFunction1(orderBy), orderByDescending = js.Any.fromFunction1(orderByDescending), select = js.Any.fromFunction1(select), skip = js.Any.fromFunction1(skip), take = js.Any.fromFunction1(take), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[QueryJs]
  }
  
  extension [Self <: QueryJs](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncludeDeleted(value: () => QueryJs): Self = StObject.set(x, "includeDeleted", js.Any.fromFunction0(value))
    
    inline def setIncludeTotalCount(value: () => QueryJs): Self = StObject.set(x, "includeTotalCount", js.Any.fromFunction0(value))
    
    inline def setOrderBy(value: String => QueryJs): Self = StObject.set(x, "orderBy", js.Any.fromFunction1(value))
    
    inline def setOrderByDescending(value: String => QueryJs): Self = StObject.set(x, "orderByDescending", js.Any.fromFunction1(value))
    
    inline def setSelect(value: String => QueryJs): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setSkip(value: Double => QueryJs): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setTake(value: Double => QueryJs): Self = StObject.set(x, "take", js.Any.fromFunction1(value))
    
    inline def setWhere(value: js.Any => QueryJs): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}
