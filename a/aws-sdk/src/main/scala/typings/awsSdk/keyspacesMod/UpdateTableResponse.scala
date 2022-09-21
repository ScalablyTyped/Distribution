package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the modified table.
    */
  var resourceArn: ARN
}
object UpdateTableResponse {
  
  inline def apply(resourceArn: ARN): UpdateTableResponse = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableResponse]
  }
  
  extension [Self <: UpdateTableResponse](x: Self) {
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
