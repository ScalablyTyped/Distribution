package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnershipControls extends StObject {
  
  /**
    * The container element for an ownership control rule.
    */
  var Rules: OwnershipControlsRules = js.native
}
object OwnershipControls {
  
  @scala.inline
  def apply(Rules: OwnershipControlsRules): OwnershipControls = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControls]
  }
  
  @scala.inline
  implicit class OwnershipControlsMutableBuilder[Self <: OwnershipControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: OwnershipControlsRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: OwnershipControlsRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
