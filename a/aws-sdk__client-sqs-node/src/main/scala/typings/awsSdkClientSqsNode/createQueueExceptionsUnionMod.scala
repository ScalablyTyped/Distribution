package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
    - typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
  */
  trait CreateQueueExceptionsUnion extends StObject
  object CreateQueueExceptionsUnion {
    
    @scala.inline
    def QueueDeletedRecently(): typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently = {
      val __obj = js.Dynamic.literal(name = "QueueDeletedRecently")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently]
    }
    
    @scala.inline
    def QueueNameExists(): typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists = {
      val __obj = js.Dynamic.literal(name = "QueueNameExists")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists]
    }
  }
}
