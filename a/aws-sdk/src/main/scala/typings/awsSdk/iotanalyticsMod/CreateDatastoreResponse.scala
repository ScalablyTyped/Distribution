package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatastoreResponse extends StObject {
  
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
  implicit class CreateDatastoreResponseMutableBuilder[Self <: CreateDatastoreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreArn(value: DatastoreArn): Self = StObject.set(x, "datastoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreArnUndefined: Self = StObject.set(x, "datastoreArn", js.undefined)
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreNameUndefined: Self = StObject.set(x, "datastoreName", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
