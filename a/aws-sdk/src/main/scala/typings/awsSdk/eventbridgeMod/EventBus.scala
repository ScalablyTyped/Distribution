package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBus extends StObject {
  
  /**
    * The ARN of the event bus.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The name of the event bus.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
    */
  var Policy: js.UndefOr[String] = js.native
}
object EventBus {
  
  @scala.inline
  def apply(): EventBus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBus]
  }
  
  @scala.inline
  implicit class EventBusMutableBuilder[Self <: EventBus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
