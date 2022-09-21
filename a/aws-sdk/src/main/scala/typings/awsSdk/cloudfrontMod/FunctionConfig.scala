package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfig extends StObject {
  
  /**
    * A comment to describe the function.
    */
  var Comment: String
  
  /**
    * The function’s runtime environment. The only valid value is cloudfront-js-1.0.
    */
  var Runtime: FunctionRuntime
}
object FunctionConfig {
  
  inline def apply(Comment: String, Runtime: FunctionRuntime): FunctionConfig = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionConfig]
  }
  
  extension [Self <: FunctionConfig](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: FunctionRuntime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
  }
}
