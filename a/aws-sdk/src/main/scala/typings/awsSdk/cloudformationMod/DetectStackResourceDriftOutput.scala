package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackResourceDriftOutput extends StObject {
  
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: typings.awsSdk.cloudformationMod.StackResourceDrift = js.native
}
object DetectStackResourceDriftOutput {
  
  @scala.inline
  def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
  
  @scala.inline
  implicit class DetectStackResourceDriftOutputMutableBuilder[Self <: DetectStackResourceDriftOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackResourceDrift(value: StackResourceDrift): Self = StObject.set(x, "StackResourceDrift", value.asInstanceOf[js.Any])
  }
}
