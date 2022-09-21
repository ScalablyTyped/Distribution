package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActionRequest extends StObject {
  
  /**
    * The name of the action to describe.
    */
  var ActionName: ExperimentEntityName
}
object DescribeActionRequest {
  
  inline def apply(ActionName: ExperimentEntityName): DescribeActionRequest = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActionRequest]
  }
  
  extension [Self <: DescribeActionRequest](x: Self) {
    
    inline def setActionName(value: ExperimentEntityName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
  }
}
