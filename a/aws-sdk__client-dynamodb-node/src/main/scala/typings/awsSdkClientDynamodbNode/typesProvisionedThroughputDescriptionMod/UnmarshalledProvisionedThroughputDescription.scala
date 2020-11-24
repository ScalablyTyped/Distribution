package typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledProvisionedThroughputDescription extends ProvisionedThroughputDescription {
  
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  @JSName("LastDecreaseDateTime")
  var LastDecreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.native
  
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  @JSName("LastIncreaseDateTime")
  var LastIncreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.native
}
object UnmarshalledProvisionedThroughputDescription {
  
  @scala.inline
  def apply(): UnmarshalledProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
  }
  
  @scala.inline
  implicit class UnmarshalledProvisionedThroughputDescriptionOps[Self <: UnmarshalledProvisionedThroughputDescription] (val x: Self) extends AnyVal {
    
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
    def setLastDecreaseDateTime(value: Date): Self = this.set("LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDecreaseDateTime: Self = this.set("LastDecreaseDateTime", js.undefined)
    
    @scala.inline
    def setLastIncreaseDateTime(value: Date): Self = this.set("LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIncreaseDateTime: Self = this.set("LastIncreaseDateTime", js.undefined)
  }
}
