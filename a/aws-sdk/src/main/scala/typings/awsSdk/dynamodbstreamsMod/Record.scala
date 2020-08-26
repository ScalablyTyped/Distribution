package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
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
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("awsRegion", js.undefined)
    @scala.inline
    def setDynamodb(value: StreamRecord): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setEventID(value: String): Self = this.set("eventID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventID: Self = this.set("eventID", js.undefined)
    @scala.inline
    def setEventName(value: OperationType): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSource: Self = this.set("eventSource", js.undefined)
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventVersion: Self = this.set("eventVersion", js.undefined)
    @scala.inline
    def setUserIdentity(value: Identity): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIdentity: Self = this.set("userIdentity", js.undefined)
  }
  
}

