package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformJobStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
    */
  var Arn: js.UndefOr[TransformJobArn] = js.undefined
}
object TransformJobStepMetadata {
  
  inline def apply(): TransformJobStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformJobStepMetadata]
  }
  
  extension [Self <: TransformJobStepMetadata](x: Self) {
    
    inline def setArn(value: TransformJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
