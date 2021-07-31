package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLanguageModelRequest extends StObject {
  
  /**
    * The name of the custom language model you submit to get more information.
    */
  var ModelName: typings.awsSdk.transcribeserviceMod.ModelName
}
object DescribeLanguageModelRequest {
  
  @scala.inline
  def apply(ModelName: ModelName): DescribeLanguageModelRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLanguageModelRequest]
  }
  
  @scala.inline
  implicit class DescribeLanguageModelRequestMutableBuilder[Self <: DescribeLanguageModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
