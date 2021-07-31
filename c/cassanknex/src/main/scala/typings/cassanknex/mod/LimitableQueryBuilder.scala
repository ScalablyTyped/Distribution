package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitableQueryBuilder extends StObject {
  
  def limit(limit: Double): this.type
  
  def limitPerPartition(limit: Double): this.type
}
object LimitableQueryBuilder {
  
  @scala.inline
  def apply(limit: Double => LimitableQueryBuilder, limitPerPartition: Double => LimitableQueryBuilder): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction1(limit), limitPerPartition = js.Any.fromFunction1(limitPerPartition))
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
  
  @scala.inline
  implicit class LimitableQueryBuilderMutableBuilder[Self <: LimitableQueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double => LimitableQueryBuilder): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLimitPerPartition(value: Double => LimitableQueryBuilder): Self = StObject.set(x, "limitPerPartition", js.Any.fromFunction1(value))
  }
}
