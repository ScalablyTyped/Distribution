package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineActivity extends js.Object {
  
  /**
    * Adds other attributes based on existing attributes in the message.
    */
  var addAttributes: js.UndefOr[AddAttributesActivity] = js.native
  
  /**
    * Determines the source of the messages to be processed.
    */
  var channel: js.UndefOr[ChannelActivity] = js.native
  
  /**
    * Specifies where to store the processed message data.
    */
  var datastore: js.UndefOr[DatastoreActivity] = js.native
  
  /**
    * Adds data from the AWS IoT device registry to your message.
    */
  var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.native
  
  /**
    * Adds information from the AWS IoT Device Shadow service to a message.
    */
  var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.native
  
  /**
    * Filters a message based on its attributes.
    */
  var filter: js.UndefOr[FilterActivity] = js.native
  
  /**
    * Runs a Lambda function to modify the message.
    */
  var lambda: js.UndefOr[LambdaActivity] = js.native
  
  /**
    * Computes an arithmetic expression using the message's attributes and adds it to the message.
    */
  var math: js.UndefOr[MathActivity] = js.native
  
  /**
    * Removes attributes from a message.
    */
  var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.native
  
  /**
    * Creates a new message using only the specified attributes from the original message. 
    */
  var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.native
}
object PipelineActivity {
  
  @scala.inline
  def apply(): PipelineActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineActivity]
  }
  
  @scala.inline
  implicit class PipelineActivityOps[Self <: PipelineActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddAttributes(value: AddAttributesActivity): Self = this.set("addAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAttributes: Self = this.set("addAttributes", js.undefined)
    
    @scala.inline
    def setChannel(value: ChannelActivity): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setDatastore(value: DatastoreActivity): Self = this.set("datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastore: Self = this.set("datastore", js.undefined)
    
    @scala.inline
    def setDeviceRegistryEnrich(value: DeviceRegistryEnrichActivity): Self = this.set("deviceRegistryEnrich", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceRegistryEnrich: Self = this.set("deviceRegistryEnrich", js.undefined)
    
    @scala.inline
    def setDeviceShadowEnrich(value: DeviceShadowEnrichActivity): Self = this.set("deviceShadowEnrich", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceShadowEnrich: Self = this.set("deviceShadowEnrich", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterActivity): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLambda(value: LambdaActivity): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    
    @scala.inline
    def setMath(value: MathActivity): Self = this.set("math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMath: Self = this.set("math", js.undefined)
    
    @scala.inline
    def setRemoveAttributes(value: RemoveAttributesActivity): Self = this.set("removeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAttributes: Self = this.set("removeAttributes", js.undefined)
    
    @scala.inline
    def setSelectAttributes(value: SelectAttributesActivity): Self = this.set("selectAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAttributes: Self = this.set("selectAttributes", js.undefined)
  }
}
