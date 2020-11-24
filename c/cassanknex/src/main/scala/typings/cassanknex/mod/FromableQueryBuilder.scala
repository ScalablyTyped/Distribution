package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromableQueryBuilder extends js.Object {
  
  def from(table: String): this.type = js.native
}
object FromableQueryBuilder {
  
  @scala.inline
  def apply(from: String => FromableQueryBuilder): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[FromableQueryBuilder]
  }
  
  @scala.inline
  implicit class FromableQueryBuilderOps[Self <: FromableQueryBuilder] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String => FromableQueryBuilder): Self = this.set("from", js.Any.fromFunction1(value))
  }
}
