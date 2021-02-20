package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends StObject {
  
  /**
    * The region in which the GetRecords request was received.
    */
  var awsRegion: js.UndefOr[String] = js.native
  
  /**
    * The main body of the stream record, containing all of the DynamoDB-specific fields.
    */
  var dynamodb: js.UndefOr[StreamRecord] = js.native
  
  /**
    * A globally unique identifier for the event that was recorded in this stream record.
    */
  var eventID: js.UndefOr[String] = js.native
  
  /**
    * The type of data modification that was performed on the DynamoDB table:    INSERT - a new item was added to the table.    MODIFY - one or more of an existing item's attributes were modified.    REMOVE - the item was deleted from the table  
    */
  var eventName: js.UndefOr[OperationType] = js.native
  
  /**
    * The AWS service from which the stream record originated. For DynamoDB Streams, this is aws:dynamodb.
    */
  var eventSource: js.UndefOr[String] = js.native
  
  /**
    * The version number of the stream record format. This number is updated whenever the structure of Record is modified. Client applications must not assume that eventVersion will remain at a particular value, as this number is subject to change at any time. In general, eventVersion will only increase as the low-level DynamoDB Streams API evolves.
    */
  var eventVersion: js.UndefOr[String] = js.native
  
  /**
    * Items that are deleted by the Time to Live process after expiration have the following fields:    Records[].userIdentity.type "Service"   Records[].userIdentity.principalId "dynamodb.amazonaws.com"  
    */
  var userIdentity: js.UndefOr[Identity] = js.native
}
object Record {
  
  @scala.inline
  def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    @scala.inline
    def setDynamodb(value: StreamRecord): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIDUndefined: Self = StObject.set(x, "eventID", js.undefined)
    
    @scala.inline
    def setEventName(value: OperationType): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
    
    @scala.inline
    def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVersionUndefined: Self = StObject.set(x, "eventVersion", js.undefined)
    
    @scala.inline
    def setUserIdentity(value: Identity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
  }
}
