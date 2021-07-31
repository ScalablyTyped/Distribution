package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.DeleteRequest
import typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.UnmarshalledDeleteRequest
import typings.awsSdkClientDynamodbBrowser.typesPutRequestMod.PutRequest
import typings.awsSdkClientDynamodbBrowser.typesPutRequestMod.UnmarshalledPutRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteRequestMod {
  
  trait UnmarshalledWriteRequest
    extends StObject
       with WriteRequest {
    
    /**
      * <p>A request to perform a <code>DeleteItem</code> operation.</p>
      */
    @JSName("DeleteRequest")
    var DeleteRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledDeleteRequest] = js.undefined
    
    /**
      * <p>A request to perform a <code>PutItem</code> operation.</p>
      */
    @JSName("PutRequest")
    var PutRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledPutRequest] = js.undefined
  }
  object UnmarshalledWriteRequest {
    
    @scala.inline
    def apply(): UnmarshalledWriteRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledWriteRequestMutableBuilder[Self <: UnmarshalledWriteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteRequest(value: UnmarshalledDeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
      
      @scala.inline
      def setPutRequest(value: UnmarshalledPutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
    }
  }
  
  trait WriteRequest extends StObject {
    
    /**
      * <p>A request to perform a <code>DeleteItem</code> operation.</p>
      */
    var DeleteRequest: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.DeleteRequest] = js.undefined
    
    /**
      * <p>A request to perform a <code>PutItem</code> operation.</p>
      */
    var PutRequest: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesPutRequestMod.PutRequest] = js.undefined
  }
  object WriteRequest {
    
    @scala.inline
    def apply(): WriteRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteRequest]
    }
    
    @scala.inline
    implicit class WriteRequestMutableBuilder[Self <: WriteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteRequest(value: DeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
      
      @scala.inline
      def setPutRequest(value: PutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
    }
  }
}
