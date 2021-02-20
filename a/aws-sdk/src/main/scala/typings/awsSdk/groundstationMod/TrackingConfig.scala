package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingConfig extends StObject {
  
  /**
    * Current setting for autotrack.
    */
  var autotrack: Criticality = js.native
}
object TrackingConfig {
  
  @scala.inline
  def apply(autotrack: Criticality): TrackingConfig = {
    val __obj = js.Dynamic.literal(autotrack = autotrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingConfig]
  }
  
  @scala.inline
  implicit class TrackingConfigMutableBuilder[Self <: TrackingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutotrack(value: Criticality): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
  }
}
