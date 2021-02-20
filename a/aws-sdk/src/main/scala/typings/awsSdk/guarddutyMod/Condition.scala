package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
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
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEq(value: Eq): Self = StObject.set(x, "Eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqUndefined: Self = StObject.set(x, "Eq", js.undefined)
    
    @scala.inline
    def setEqVarargs(value: String*): Self = StObject.set(x, "Eq", js.Array(value :_*))
    
    @scala.inline
    def setEquals(value: Equals): Self = StObject.set(x, "Equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsUndefined: Self = StObject.set(x, "Equals", js.undefined)
    
    @scala.inline
    def setEqualsVarargs(value: String*): Self = StObject.set(x, "Equals", js.Array(value :_*))
    
    @scala.inline
    def setGreaterThan(value: Long): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThanOrEqual(value: Long): Self = StObject.set(x, "GreaterThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThanOrEqualUndefined: Self = StObject.set(x, "GreaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setGreaterThanUndefined: Self = StObject.set(x, "GreaterThan", js.undefined)
    
    @scala.inline
    def setGt(value: Integer): Self = StObject.set(x, "Gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "Gt", js.undefined)
    
    @scala.inline
    def setGte(value: Integer): Self = StObject.set(x, "Gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGteUndefined: Self = StObject.set(x, "Gte", js.undefined)
    
    @scala.inline
    def setLessThan(value: Long): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanOrEqual(value: Long): Self = StObject.set(x, "LessThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanOrEqualUndefined: Self = StObject.set(x, "LessThanOrEqual", js.undefined)
    
    @scala.inline
    def setLessThanUndefined: Self = StObject.set(x, "LessThan", js.undefined)
    
    @scala.inline
    def setLt(value: Integer): Self = StObject.set(x, "Lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "Lt", js.undefined)
    
    @scala.inline
    def setLte(value: Integer): Self = StObject.set(x, "Lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLteUndefined: Self = StObject.set(x, "Lte", js.undefined)
    
    @scala.inline
    def setNeq(value: Neq): Self = StObject.set(x, "Neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "Neq", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: String*): Self = StObject.set(x, "Neq", js.Array(value :_*))
    
    @scala.inline
    def setNotEquals(value: NotEquals): Self = StObject.set(x, "NotEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotEqualsUndefined: Self = StObject.set(x, "NotEquals", js.undefined)
    
    @scala.inline
    def setNotEqualsVarargs(value: String*): Self = StObject.set(x, "NotEquals", js.Array(value :_*))
  }
}
