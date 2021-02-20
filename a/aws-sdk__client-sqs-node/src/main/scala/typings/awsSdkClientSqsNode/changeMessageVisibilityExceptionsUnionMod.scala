package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
    - typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait ChangeMessageVisibilityExceptionsUnion extends StObject
  object ChangeMessageVisibilityExceptionsUnion {
    
    @scala.inline
    def MessageNotInflight(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight]
    }
    
    @scala.inline
    def ReceiptHandleIsInvalid(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
