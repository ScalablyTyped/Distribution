package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCloudFormationCollectionFilter extends StObject {
  
  /**
    *  An array of the names of the Amazon Web Services CloudFormation stacks to update. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  var StackNames: js.UndefOr[UpdateStackNames] = js.undefined
}
object UpdateCloudFormationCollectionFilter {
  
  inline def apply(): UpdateCloudFormationCollectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCloudFormationCollectionFilter]
  }
  
  extension [Self <: UpdateCloudFormationCollectionFilter](x: Self) {
    
    inline def setStackNames(value: UpdateStackNames): Self = StObject.set(x, "StackNames", value.asInstanceOf[js.Any])
    
    inline def setStackNamesUndefined: Self = StObject.set(x, "StackNames", js.undefined)
    
    inline def setStackNamesVarargs(value: StackName*): Self = StObject.set(x, "StackNames", js.Array(value*))
  }
}
