package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputDeviceThumbnailRequest extends StObject {
  
  /**
    * The HTTP Accept header. Indicates the requested type for the thumbnail.
    */
  var Accept: AcceptHeader
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object DescribeInputDeviceThumbnailRequest {
  
  inline def apply(Accept: AcceptHeader, InputDeviceId: string): DescribeInputDeviceThumbnailRequest = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputDeviceThumbnailRequest]
  }
  
  extension [Self <: DescribeInputDeviceThumbnailRequest](x: Self) {
    
    inline def setAccept(value: AcceptHeader): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
