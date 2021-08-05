package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph extends StObject {
  
  /**
    * The ARN of the behavior graph.
    */
  var Arn: js.UndefOr[GraphArn] = js.undefined
  
  /**
    * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
}
object Graph {
  
  inline def apply(): Graph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph]
  }
  
  extension [Self <: Graph](x: Self) {
    
    inline def setArn(value: GraphArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: Timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
  }
}
