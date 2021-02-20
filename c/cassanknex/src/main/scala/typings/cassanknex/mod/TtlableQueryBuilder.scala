package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtlableQueryBuilder extends StObject {
  
  def usingTTL(ttl: Double): this.type = js.native
  
  def usingTimestamp(timestamp: Double): this.type = js.native
}
object TtlableQueryBuilder {
  
  @scala.inline
  def apply(usingTTL: Double => TtlableQueryBuilder, usingTimestamp: Double => TtlableQueryBuilder): TtlableQueryBuilder = {
    val __obj = js.Dynamic.literal(usingTTL = js.Any.fromFunction1(usingTTL), usingTimestamp = js.Any.fromFunction1(usingTimestamp))
    __obj.asInstanceOf[TtlableQueryBuilder]
  }
  
  @scala.inline
  implicit class TtlableQueryBuilderMutableBuilder[Self <: TtlableQueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsingTTL(value: Double => TtlableQueryBuilder): Self = StObject.set(x, "usingTTL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsingTimestamp(value: Double => TtlableQueryBuilder): Self = StObject.set(x, "usingTimestamp", js.Any.fromFunction1(value))
  }
}
