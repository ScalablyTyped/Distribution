package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thing extends js.Object {
  
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
  implicit class ThingOps[Self <: Thing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
}
