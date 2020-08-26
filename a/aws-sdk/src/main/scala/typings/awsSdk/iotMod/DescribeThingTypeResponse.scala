package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingTypeResponse extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The ThingTypeProperties contains information about the thing type including description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}

object DescribeThingTypeResponse {
  @scala.inline
  def apply(): DescribeThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingTypeResponse]
  }
  @scala.inline
  implicit class DescribeThingTypeResponseOps[Self <: DescribeThingTypeResponse] (val x: Self) extends AnyVal {
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
    def setThingTypeMetadata(value: ThingTypeMetadata): Self = this.set("thingTypeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeMetadata: Self = this.set("thingTypeMetadata", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
    @scala.inline
    def setThingTypeProperties(value: ThingTypeProperties): Self = this.set("thingTypeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeProperties: Self = this.set("thingTypeProperties", js.undefined)
  }
  
}

