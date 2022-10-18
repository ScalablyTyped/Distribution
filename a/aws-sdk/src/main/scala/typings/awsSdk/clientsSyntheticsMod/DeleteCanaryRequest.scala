package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCanaryRequest extends StObject {
  
  /**
    * Specifies whether to also delete the Lambda functions and layers used by this canary. The default is false. Type: Boolean
    */
  var DeleteLambda: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the canary that you want to delete. To find the names of your canaries, use DescribeCanaries.
    */
  var Name: CanaryName
}
object DeleteCanaryRequest {
  
  inline def apply(Name: CanaryName): DeleteCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCanaryRequest]
  }
  
  extension [Self <: DeleteCanaryRequest](x: Self) {
    
    inline def setDeleteLambda(value: Boolean): Self = StObject.set(x, "DeleteLambda", value.asInstanceOf[js.Any])
    
    inline def setDeleteLambdaUndefined: Self = StObject.set(x, "DeleteLambda", js.undefined)
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
