package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatastoreResponse extends js.Object {
  
  /**
    * The ARN of the data store.
    */
  var datastoreArn: js.UndefOr[DatastoreArn] = js.native
  
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}
object CreateDatastoreResponse {
  
  @scala.inline
  def apply(): CreateDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatastoreResponse]
  }
  
  @scala.inline
  implicit class CreateDatastoreResponseOps[Self <: CreateDatastoreResponse] (val x: Self) extends AnyVal {
    
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
    def setDatastoreArn(value: DatastoreArn): Self = this.set("datastoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreArn: Self = this.set("datastoreArn", js.undefined)
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = this.set("datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreName: Self = this.set("datastoreName", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
  }
}
