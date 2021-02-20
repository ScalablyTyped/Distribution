package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionLayer extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Integer] = js.native
}
object AwsLambdaFunctionLayer {
  
  @scala.inline
  def apply(): AwsLambdaFunctionLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionLayer]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionLayerMutableBuilder[Self <: AwsLambdaFunctionLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCodeSize(value: Integer): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
  }
}
