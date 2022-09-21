package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for TodoCommentRequest request.
  */
trait TodoCommentRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Array of target TodoCommentDescriptors that describes TODO comments to be found
    */
  var descriptors: Array[TodoCommentDescriptor]
}
object TodoCommentRequestArgs {
  
  inline def apply(descriptors: Array[TodoCommentDescriptor], file: String): TodoCommentRequestArgs = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoCommentRequestArgs]
  }
  
  extension [Self <: TodoCommentRequestArgs](x: Self) {
    
    inline def setDescriptors(value: Array[TodoCommentDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
  }
}
