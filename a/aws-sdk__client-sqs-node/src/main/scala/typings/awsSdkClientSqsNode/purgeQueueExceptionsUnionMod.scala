package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
    - typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
  */
  trait PurgeQueueExceptionsUnion extends StObject
  object PurgeQueueExceptionsUnion {
    
    inline def PurgeQueueInProgress(): typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress = {
      val __obj = js.Dynamic.literal(name = "PurgeQueueInProgress")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress]
    }
    
    inline def QueueDoesNotExist(): typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = "QueueDoesNotExist")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist]
    }
  }
}
