package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
    - typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
  */
  trait PurgeQueueExceptionsUnion extends StObject
  object PurgeQueueExceptionsUnion {
    
    @scala.inline
    def PurgeQueueInProgress(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress): typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress]
    }
    
    @scala.inline
    def QueueDoesNotExist(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist]
    }
  }
}
