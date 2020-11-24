package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableStreamSpecification extends js.Object {
  
  /**
    * Indicates whether DynamoDB Streams is enabled on the table.
    */
  var StreamEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines the information that is written to the table.
    */
  var StreamViewType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableStreamSpecification {
  
  @scala.inline
  def apply(): AwsDynamoDbTableStreamSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableStreamSpecification]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableStreamSpecificationOps[Self <: AwsDynamoDbTableStreamSpecification] (val x: Self) extends AnyVal {
    
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
    def setStreamEnabled(value: Boolean): Self = this.set("StreamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamEnabled: Self = this.set("StreamEnabled", js.undefined)
    
    @scala.inline
    def setStreamViewType(value: NonEmptyString): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
  }
}
