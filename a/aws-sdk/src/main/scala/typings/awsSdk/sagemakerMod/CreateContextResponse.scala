package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContextResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the context.
    */
  var ContextArn: js.UndefOr[typings.awsSdk.sagemakerMod.ContextArn] = js.undefined
}
object CreateContextResponse {
  
  inline def apply(): CreateContextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContextResponse]
  }
  
  extension [Self <: CreateContextResponse](x: Self) {
    
    inline def setContextArn(value: ContextArn): Self = StObject.set(x, "ContextArn", value.asInstanceOf[js.Any])
    
    inline def setContextArnUndefined: Self = StObject.set(x, "ContextArn", js.undefined)
  }
}
