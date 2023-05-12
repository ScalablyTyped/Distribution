package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSpecification extends StObject {
  
  /**
    * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
    */
  var StreamEnabled: typings.awsSdk2Types.clientsDynamodbMod.StreamEnabled
  
  /**
    *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.StreamViewType] = js.undefined
}
object StreamSpecification {
  
  inline def apply(StreamEnabled: StreamEnabled): StreamSpecification = {
    val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamSpecification] (val x: Self) extends AnyVal {
    
    inline def setStreamEnabled(value: StreamEnabled): Self = StObject.set(x, "StreamEnabled", value.asInstanceOf[js.Any])
    
    inline def setStreamViewType(value: StreamViewType): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    
    inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
  }
}
