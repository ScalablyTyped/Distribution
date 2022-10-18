package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
    - typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait ChangeMessageVisibilityExceptionsUnion extends StObject
  object ChangeMessageVisibilityExceptionsUnion {
    
    inline def MessageNotInflight(): typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = "MessageNotInflight")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight]
    }
    
    inline def ReceiptHandleIsInvalid(): typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = "ReceiptHandleIsInvalid")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
