package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDimensionResponse extends js.Object {
  
  /**
    * The ARN (Amazon resource name) of the created dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.native
  
  /**
    * The date and time, in milliseconds since epoch, when the dimension was initially created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time, in milliseconds since epoch, when the dimension was most recently updated.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.native
  
  /**
    * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used to match the MQTT topic name.
    */
  var stringValues: js.UndefOr[DimensionStringValues] = js.native
  
  /**
    * The type of the dimension.
    */
  var `type`: js.UndefOr[DimensionType] = js.native
}
object UpdateDimensionResponse {
  
  @scala.inline
  def apply(): UpdateDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionResponse]
  }
  
  @scala.inline
  implicit class UpdateDimensionResponseOps[Self <: UpdateDimensionResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: DimensionArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: DimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = this.set("stringValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = this.set("stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValues: Self = this.set("stringValues", js.undefined)
    
    @scala.inline
    def setType(value: DimensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
