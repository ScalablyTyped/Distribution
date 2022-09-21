package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableResponse extends StObject {
  
  /**
    * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
    */
  var resourceArn: ARN
}
object CreateTableResponse {
  
  inline def apply(resourceArn: ARN): CreateTableResponse = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableResponse]
  }
  
  extension [Self <: CreateTableResponse](x: Self) {
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
