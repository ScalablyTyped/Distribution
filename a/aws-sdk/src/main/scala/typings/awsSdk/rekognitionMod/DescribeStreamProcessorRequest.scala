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
  
  inline def apply(Name: StreamProcessorName): DescribeStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamProcessorRequest]
  }
  
  extension [Self <: DescribeStreamProcessorRequest](x: Self) {
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
