package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchResultErrorEntryMod {
  
  trait BatchResultErrorEntry extends StObject {
    
    /**
      * <p>An error code representing why the action failed on this entry.</p>
      */
    var Code: String
    
    /**
      * <p>The <code>Id</code> of an entry in a batch request.</p>
      */
    var Id: String
    
    /**
      * <p>A message explaining why the action failed on this entry.</p>
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies whether the error happened due to the producer.</p>
      */
    var SenderFault: Boolean
  }
  object BatchResultErrorEntry {
    
    inline def apply(Code: String, Id: String, SenderFault: Boolean): BatchResultErrorEntry = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchResultErrorEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchResultErrorEntry] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setSenderFault(value: Boolean): Self = StObject.set(x, "SenderFault", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledBatchResultErrorEntry = BatchResultErrorEntry
}
