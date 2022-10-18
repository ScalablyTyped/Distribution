package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInjectionMatchSetUpdate extends StObject {
  
  /**
    * Specify INSERT to add a SqlInjectionMatchSetUpdate to a SqlInjectionMatchSet. Use DELETE to remove a SqlInjectionMatchSetUpdate from a SqlInjectionMatchSet.
    */
  var Action: ChangeAction
  
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var SqlInjectionMatchTuple: typings.awsSdk.clientsWafMod.SqlInjectionMatchTuple
}
object SqlInjectionMatchSetUpdate {
  
  inline def apply(Action: ChangeAction, SqlInjectionMatchTuple: SqlInjectionMatchTuple): SqlInjectionMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], SqlInjectionMatchTuple = SqlInjectionMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetUpdate]
  }
  
  extension [Self <: SqlInjectionMatchSetUpdate](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchTuple(value: SqlInjectionMatchTuple): Self = StObject.set(x, "SqlInjectionMatchTuple", value.asInstanceOf[js.Any])
  }
}
