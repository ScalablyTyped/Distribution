package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
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
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    @scala.inline
    def setStreamLabel(value: String): Self = StObject.set(x, "StreamLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamLabelUndefined: Self = StObject.set(x, "StreamLabel", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
