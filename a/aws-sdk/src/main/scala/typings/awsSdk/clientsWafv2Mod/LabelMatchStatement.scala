package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelMatchStatement extends StObject {
  
  /**
    * The string to match against. The setting you provide for this depends on the match statement's Scope setting:    If the Scope indicates LABEL, then this specification must include the name and can include any number of preceding namespace specifications and prefix up to providing the fully qualified label name.    If the Scope indicates NAMESPACE, then this specification can include any number of contiguous namespace strings, and can include the entire label namespace prefix from the rule group or web ACL where the label originates.   Labels are case sensitive and components of a label must be separated by colon, for example NS1:NS2:name.
    */
  var Key: LabelMatchKey
  
  /**
    * Specify whether you want to match using the label name or just the namespace. 
    */
  var Scope: LabelMatchScope
}
object LabelMatchStatement {
  
  inline def apply(Key: LabelMatchKey, Scope: LabelMatchScope): LabelMatchStatement = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelMatchStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelMatchStatement] (val x: Self) extends AnyVal {
    
    inline def setKey(value: LabelMatchKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setScope(value: LabelMatchScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
