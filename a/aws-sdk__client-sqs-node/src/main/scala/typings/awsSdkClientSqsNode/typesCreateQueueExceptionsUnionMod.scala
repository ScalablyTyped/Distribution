package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
    - typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
  */
  trait CreateQueueExceptionsUnion extends StObject
  object CreateQueueExceptionsUnion {
    
    inline def QueueDeletedRecently(): typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently = {
      val __obj = js.Dynamic.literal(name = "QueueDeletedRecently")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently]
    }
    
    inline def QueueNameExists(): typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists = {
      val __obj = js.Dynamic.literal(name = "QueueNameExists")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists]
    }
  }
}
