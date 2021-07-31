package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trigger extends StObject {
  
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}
object Trigger {
  
  @scala.inline
  def apply(): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
