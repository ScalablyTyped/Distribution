package typings.contentfulManagement.roleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in contentful-management.contentful-management/dist/typings/entities/role.ConditionType ]: std.Array<contentful-management.contentful-management/dist/typings/entities/role.ConstraintType> | any} */
@js.native
trait ConstraintType extends js.Object {
  
  var and: js.Array[ConstraintType] | js.Any = js.native
  
  @JSName("equals")
  var equals_FConstraintType: js.Array[ConstraintType] | js.Any = js.native
  
  var not: js.Array[ConstraintType] | js.Any = js.native
  
  var or: js.Array[ConstraintType] | js.Any = js.native
}
object ConstraintType {
  
  @scala.inline
  def apply(
    and: js.Array[ConstraintType] | js.Any,
    equals: js.Array[ConstraintType] | js.Any,
    not: js.Array[ConstraintType] | js.Any,
    or: js.Array[ConstraintType] | js.Any
  ): ConstraintType = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], equals = equals.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintType]
  }
  
  @scala.inline
  implicit class ConstraintTypeOps[Self <: ConstraintType] (val x: Self) extends AnyVal {
    
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
    def setAndVarargs(value: ConstraintType*): Self = this.set("and", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: js.Array[ConstraintType] | js.Any): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsVarargs(value: ConstraintType*): Self = this.set("equals", js.Array(value :_*))
    
    @scala.inline
    def setEquals(value: js.Array[ConstraintType] | js.Any): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotVarargs(value: ConstraintType*): Self = this.set("not", js.Array(value :_*))
    
    @scala.inline
    def setNot(value: js.Array[ConstraintType] | js.Any): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrVarargs(value: ConstraintType*): Self = this.set("or", js.Array(value :_*))
    
    @scala.inline
    def setOr(value: js.Array[ConstraintType] | js.Any): Self = this.set("or", value.asInstanceOf[js.Any])
  }
}
