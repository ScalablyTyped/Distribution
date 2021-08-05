package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleUpdate extends StObject {
  
  /**
    * Specify INSERT to add a Predicate to a Rule. Use DELETE to remove a Predicate from a Rule.
    */
  var Action: ChangeAction
  
  /**
    * The ID of the Predicate (such as an IPSet) that you want to add to a Rule.
    */
  var Predicate: typings.awsSdk.wafMod.Predicate
}
object RuleUpdate {
  
  inline def apply(Action: ChangeAction, Predicate: Predicate): RuleUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleUpdate]
  }
  
  extension [Self <: RuleUpdate](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: Predicate): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
  }
}
