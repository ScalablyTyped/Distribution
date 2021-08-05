package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGraphResponse extends StObject {
  
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.detectiveMod.GraphArn] = js.undefined
}
object CreateGraphResponse {
  
  inline def apply(): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphResponse]
  }
  
  extension [Self <: CreateGraphResponse](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
  }
}
