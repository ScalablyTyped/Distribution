package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtlableQueryBuilder extends StObject {
  
  def usingTTL(ttl: Double): this.type
  
  def usingTimestamp(timestamp: Double): this.type
}
object TtlableQueryBuilder {
  
  inline def apply(usingTTL: Double => TtlableQueryBuilder, usingTimestamp: Double => TtlableQueryBuilder): TtlableQueryBuilder = {
    val __obj = js.Dynamic.literal(usingTTL = js.Any.fromFunction1(usingTTL), usingTimestamp = js.Any.fromFunction1(usingTimestamp))
    __obj.asInstanceOf[TtlableQueryBuilder]
  }
  
  extension [Self <: TtlableQueryBuilder](x: Self) {
    
    inline def setUsingTTL(value: Double => TtlableQueryBuilder): Self = StObject.set(x, "usingTTL", js.Any.fromFunction1(value))
    
    inline def setUsingTimestamp(value: Double => TtlableQueryBuilder): Self = StObject.set(x, "usingTimestamp", js.Any.fromFunction1(value))
  }
}
