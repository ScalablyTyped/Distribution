package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContextRequest extends StObject {
  
  /**
    * The name of the context to describe.
    */
  var ContextName: ExperimentEntityNameOrArn
}
object DescribeContextRequest {
  
  inline def apply(ContextName: ExperimentEntityNameOrArn): DescribeContextRequest = {
    val __obj = js.Dynamic.literal(ContextName = ContextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContextRequest]
  }
  
  extension [Self <: DescribeContextRequest](x: Self) {
    
    inline def setContextName(value: ExperimentEntityNameOrArn): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
  }
}
