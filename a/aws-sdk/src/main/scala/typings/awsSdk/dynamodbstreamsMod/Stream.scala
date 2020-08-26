package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.native
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.TableName] = js.native
}

object Stream {
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setStreamArn(value: StreamArn): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamArn: Self = this.set("StreamArn", js.undefined)
    @scala.inline
    def setStreamLabel(value: String): Self = this.set("StreamLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamLabel: Self = this.set("StreamLabel", js.undefined)
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

