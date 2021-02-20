package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNodeDetails extends StObject {
  
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.native
}
object TriggerNodeDetails {
  
  @scala.inline
  def apply(): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerNodeDetails]
  }
  
  @scala.inline
  implicit class TriggerNodeDetailsMutableBuilder[Self <: TriggerNodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
