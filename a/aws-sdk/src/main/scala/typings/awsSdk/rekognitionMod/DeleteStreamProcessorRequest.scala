package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamProcessorRequest extends StObject {
  
  /**
    * The name of the stream processor you want to delete.
    */
  var Name: StreamProcessorName
}
object DeleteStreamProcessorRequest {
  
  inline def apply(Name: StreamProcessorName): DeleteStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamProcessorRequest]
  }
  
  extension [Self <: DeleteStreamProcessorRequest](x: Self) {
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
