package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnershipControls extends StObject {
  
  /**
    * The container element for an ownership control rule.
    */
  var Rules: OwnershipControlsRules
}
object OwnershipControls {
  
  inline def apply(Rules: OwnershipControlsRules): OwnershipControls = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControls]
  }
  
  extension [Self <: OwnershipControls](x: Self) {
    
    inline def setRules(value: OwnershipControlsRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: OwnershipControlsRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
