package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityKey extends js.Object {
  
  var entityType: EntityType = js.native
  
  def equals(entityKey: EntityKey): Boolean = js.native
  
  var values: js.Array[_] = js.native
}
object EntityKey {
  
  @scala.inline
  def apply(entityType: EntityType, equals: EntityKey => Boolean, values: js.Array[_]): EntityKey = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityKey]
  }
  
  @scala.inline
  implicit class EntityKeyOps[Self <: EntityKey] (val x: Self) extends AnyVal {
    
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
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: EntityKey => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
