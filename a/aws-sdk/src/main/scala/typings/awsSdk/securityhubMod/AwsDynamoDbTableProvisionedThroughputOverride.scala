package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableProvisionedThroughputOverride extends js.Object {
  
  /**
    * The read capacity units for the replica.
    */
  var ReadCapacityUnits: js.UndefOr[Integer] = js.native
}
object AwsDynamoDbTableProvisionedThroughputOverride {
  
  @scala.inline
  def apply(): AwsDynamoDbTableProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughputOverride]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableProvisionedThroughputOverrideOps[Self <: AwsDynamoDbTableProvisionedThroughputOverride] (val x: Self) extends AnyVal {
    
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
    def setReadCapacityUnits(value: Integer): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
  }
}
