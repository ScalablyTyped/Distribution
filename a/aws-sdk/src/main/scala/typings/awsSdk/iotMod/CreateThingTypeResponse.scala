package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThingTypeResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}
object CreateThingTypeResponse {
  
  @scala.inline
  def apply(): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
  
  @scala.inline
  implicit class CreateThingTypeResponseOps[Self <: CreateThingTypeResponse] (val x: Self) extends AnyVal {
    
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
    def setThingTypeArn(value: ThingTypeArn): Self = this.set("thingTypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingTypeArn: Self = this.set("thingTypeArn", js.undefined)
    
    @scala.inline
    def setThingTypeId(value: ThingTypeId): Self = this.set("thingTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingTypeId: Self = this.set("thingTypeId", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
  }
}
