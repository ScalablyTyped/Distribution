package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamProcessorRequest extends StObject {
  
  /**
    * Name of the stream processor for which you want information.
    */
  var Name: StreamProcessorName
}
object DescribeStreamProcessorRequest {
  
  @scala.inline
  def apply(Name: StreamProcessorName): DescribeStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamProcessorRequest]
  }
  
  @scala.inline
  implicit class DescribeStreamProcessorRequestMutableBuilder[Self <: DescribeStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
