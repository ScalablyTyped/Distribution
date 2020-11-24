package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtlableQueryBuilder extends js.Object {
  
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
  implicit class TtlableQueryBuilderOps[Self <: TtlableQueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUsingTTL(value: Double => TtlableQueryBuilder): Self = this.set("usingTTL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsingTimestamp(value: Double => TtlableQueryBuilder): Self = this.set("usingTimestamp", js.Any.fromFunction1(value))
  }
}
