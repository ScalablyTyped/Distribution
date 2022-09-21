package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLambdaContentTransformation extends StObject {
  
  /**
    * A container for an Lambda function.
    */
  var AwsLambda: js.UndefOr[AwsLambdaTransformation] = js.undefined
}
object ObjectLambdaContentTransformation {
  
  inline def apply(): ObjectLambdaContentTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLambdaContentTransformation]
  }
  
  extension [Self <: ObjectLambdaContentTransformation](x: Self) {
    
    inline def setAwsLambda(value: AwsLambdaTransformation): Self = StObject.set(x, "AwsLambda", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaUndefined: Self = StObject.set(x, "AwsLambda", js.undefined)
  }
}
