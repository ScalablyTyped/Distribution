package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thing extends StObject {
  
  /**
    * The ARN of the thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object Thing {
  
  @scala.inline
  def apply(): Thing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thing]
  }
  
  @scala.inline
  implicit class ThingMutableBuilder[Self <: Thing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
