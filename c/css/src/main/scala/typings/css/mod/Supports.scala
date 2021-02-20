package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Supports
  extends Node
     with AtRule {
  
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.native
  
  /** The part following @supports. */
  var supports: js.UndefOr[String] = js.native
}
object Supports {
  
  @scala.inline
  def apply(): Supports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supports]
  }
  
  @scala.inline
  implicit class SupportsMutableBuilder[Self <: Supports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[Rule | Comment | AtRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: (Rule | Comment | AtRule)*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
  }
}
