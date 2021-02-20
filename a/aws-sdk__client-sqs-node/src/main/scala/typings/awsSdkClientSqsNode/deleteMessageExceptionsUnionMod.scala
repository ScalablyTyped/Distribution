package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat
    - typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait DeleteMessageExceptionsUnion extends StObject
  object DeleteMessageExceptionsUnion {
    
    @scala.inline
    def InvalidIdFormat(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat]
    }
    
    @scala.inline
    def ReceiptHandleIsInvalid(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
