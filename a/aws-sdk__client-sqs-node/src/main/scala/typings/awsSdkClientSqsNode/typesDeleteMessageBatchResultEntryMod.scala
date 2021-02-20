package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMessageBatchResultEntryMod {
  
  @js.native
  trait DeleteMessageBatchResultEntry extends StObject {
    
    /**
      * <p>Represents a successfully deleted message.</p>
      */
    var Id: String = js.native
  }
  object DeleteMessageBatchResultEntry {
    
    @scala.inline
    def apply(Id: String): DeleteMessageBatchResultEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteMessageBatchResultEntry]
    }
    
    @scala.inline
    implicit class DeleteMessageBatchResultEntryMutableBuilder[Self <: DeleteMessageBatchResultEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledDeleteMessageBatchResultEntry = DeleteMessageBatchResultEntry
}
