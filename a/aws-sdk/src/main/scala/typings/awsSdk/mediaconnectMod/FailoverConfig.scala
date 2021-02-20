package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverConfig extends StObject {
  
  /**
    * Search window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.native
  
  var State: js.UndefOr[typings.awsSdk.mediaconnectMod.State] = js.native
}
object FailoverConfig {
  
  @scala.inline
  def apply(): FailoverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConfig]
  }
  
  @scala.inline
  implicit class FailoverConfigMutableBuilder[Self <: FailoverConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecoveryWindow(value: integer): Self = StObject.set(x, "RecoveryWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryWindowUndefined: Self = StObject.set(x, "RecoveryWindow", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
