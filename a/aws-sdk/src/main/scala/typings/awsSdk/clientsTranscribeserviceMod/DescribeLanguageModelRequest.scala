package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLanguageModelRequest extends StObject {
  
  /**
    * The name of the custom language model you want information about. Model names are case sensitive.
    */
  var ModelName: typings.awsSdk.clientsTranscribeserviceMod.ModelName
}
object DescribeLanguageModelRequest {
  
  inline def apply(ModelName: ModelName): DescribeLanguageModelRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLanguageModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLanguageModelRequest] (val x: Self) extends AnyVal {
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
