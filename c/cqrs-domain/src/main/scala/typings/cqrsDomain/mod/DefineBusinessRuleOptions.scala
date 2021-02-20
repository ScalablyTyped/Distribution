package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineBusinessRule
@js.native
trait DefineBusinessRuleOptions extends StObject {
  
  /**
    * optional
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * optional, default Infinity, all business rules will be sorted by this value
    */
  var priority: js.UndefOr[Double] = js.native
}
object DefineBusinessRuleOptions {
  
  @scala.inline
  def apply(): DefineBusinessRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineBusinessRuleOptions]
  }
  
  @scala.inline
  implicit class DefineBusinessRuleOptionsMutableBuilder[Self <: DefineBusinessRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
