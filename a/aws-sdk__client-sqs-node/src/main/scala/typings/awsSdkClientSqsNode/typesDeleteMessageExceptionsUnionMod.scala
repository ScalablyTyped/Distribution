package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat
    - typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait DeleteMessageExceptionsUnion extends StObject
  object DeleteMessageExceptionsUnion {
    
    inline def InvalidIdFormat(): typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat = {
      val __obj = js.Dynamic.literal(name = "InvalidIdFormat")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat]
    }
    
    inline def ReceiptHandleIsInvalid(): typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = "ReceiptHandleIsInvalid")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
