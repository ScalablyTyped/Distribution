package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete a ByteMatchTuple.
    */
  var Action: ChangeAction
  
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF to search for. If you specify DELETE for the value of Action, the ByteMatchTuple values must exactly match the values in the ByteMatchTuple that you want to delete from the ByteMatchSet.
    */
  var ByteMatchTuple: typings.awsSdk.clientsWafregionalMod.ByteMatchTuple
}
object ByteMatchSetUpdate {
  
  inline def apply(Action: ChangeAction, ByteMatchTuple: ByteMatchTuple): ByteMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ByteMatchTuple = ByteMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ByteMatchSetUpdate] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setByteMatchTuple(value: ByteMatchTuple): Self = StObject.set(x, "ByteMatchTuple", value.asInstanceOf[js.Any])
  }
}
