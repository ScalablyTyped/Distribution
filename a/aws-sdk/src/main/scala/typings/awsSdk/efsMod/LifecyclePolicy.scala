package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicy extends StObject {
  
  /**
    *  A value that describes the period of time that a file is not accessed, after which it transitions to the IA storage class. Metadata operations such as listing the contents of a directory don't count as file access events.
    */
  var TransitionToIA: js.UndefOr[TransitionToIARules] = js.native
}
object LifecyclePolicy {
  
  @scala.inline
  def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  
  @scala.inline
  implicit class LifecyclePolicyMutableBuilder[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitionToIA(value: TransitionToIARules): Self = StObject.set(x, "TransitionToIA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionToIAUndefined: Self = StObject.set(x, "TransitionToIA", js.undefined)
  }
}
