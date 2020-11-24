package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typings.awsSdk.guarddutyMod.Eq] = js.native
  
  /**
    * Represents an equal  condition to be applied to a single field when querying for findings.
    */
  var Equals: js.UndefOr[typings.awsSdk.guarddutyMod.Equals] = js.native
  
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.native
  
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.native
  
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.native
  
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.native
  
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.native
  
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.native
  
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.native
  
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.native
  
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typings.awsSdk.guarddutyMod.Neq] = js.native
  
  /**
    * Represents a not equal  condition to be applied to a single field when querying for findings.
    */
  var NotEquals: js.UndefOr[typings.awsSdk.guarddutyMod.NotEquals] = js.native
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEqVarargs(value: String*): Self = this.set("Eq", js.Array(value :_*))
    
    @scala.inline
    def setEq(value: Eq): Self = this.set("Eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEq: Self = this.set("Eq", js.undefined)
    
    @scala.inline
    def setEqualsVarargs(value: String*): Self = this.set("Equals", js.Array(value :_*))
    
    @scala.inline
    def setEquals(value: Equals): Self = this.set("Equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("Equals", js.undefined)
    
    @scala.inline
    def setGreaterThan(value: Long): Self = this.set("GreaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThan: Self = this.set("GreaterThan", js.undefined)
    
    @scala.inline
    def setGreaterThanOrEqual(value: Long): Self = this.set("GreaterThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThanOrEqual: Self = this.set("GreaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setGt(value: Integer): Self = this.set("Gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("Gt", js.undefined)
    
    @scala.inline
    def setGte(value: Integer): Self = this.set("Gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGte: Self = this.set("Gte", js.undefined)
    
    @scala.inline
    def setLessThan(value: Long): Self = this.set("LessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThan: Self = this.set("LessThan", js.undefined)
    
    @scala.inline
    def setLessThanOrEqual(value: Long): Self = this.set("LessThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThanOrEqual: Self = this.set("LessThanOrEqual", js.undefined)
    
    @scala.inline
    def setLt(value: Integer): Self = this.set("Lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("Lt", js.undefined)
    
    @scala.inline
    def setLte(value: Integer): Self = this.set("Lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLte: Self = this.set("Lte", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: String*): Self = this.set("Neq", js.Array(value :_*))
    
    @scala.inline
    def setNeq(value: Neq): Self = this.set("Neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeq: Self = this.set("Neq", js.undefined)
    
    @scala.inline
    def setNotEqualsVarargs(value: String*): Self = this.set("NotEquals", js.Array(value :_*))
    
    @scala.inline
    def setNotEquals(value: NotEquals): Self = this.set("NotEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotEquals: Self = this.set("NotEquals", js.undefined)
  }
}
