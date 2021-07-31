package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents
    - typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
  */
  trait SendMessageExceptionsUnion extends StObject
  object SendMessageExceptionsUnion {
    
    @scala.inline
    def InvalidMessageContents(): typings.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents = {
      val __obj = js.Dynamic.literal(name = "InvalidMessageContents")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents]
    }
    
    @scala.inline
    def UnsupportedOperation(): typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
