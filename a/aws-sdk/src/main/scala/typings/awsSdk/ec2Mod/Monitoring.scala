package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Monitoring extends StObject {
  
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var State: js.UndefOr[MonitoringState] = js.native
}
object Monitoring {
  
  @scala.inline
  def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  
  @scala.inline
  implicit class MonitoringMutableBuilder[Self <: Monitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: MonitoringState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
