package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleUpdate extends StObject {
  
  /**
    * Specify INSERT to add a Predicate to a Rule. Use DELETE to remove a Predicate from a Rule.
    */
  var Action: ChangeAction = js.native
  
  /**
    * The ID of the Predicate (such as an IPSet) that you want to add to a Rule.
    */
  var Predicate: typings.awsSdk.wafregionalMod.Predicate = js.native
}
object RuleUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, Predicate: Predicate): RuleUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleUpdate]
  }
  
  @scala.inline
  implicit class RuleUpdateMutableBuilder[Self <: RuleUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: Predicate): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
  }
}
