package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host
  extends StObject
     with Node
     with AtRule {
  
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
}
object Host {
  
  @scala.inline
  def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[Rule | Comment | AtRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: (Rule | Comment | AtRule)*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
