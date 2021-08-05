package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.SegmentResponse
import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentsResponseMod {
  
  trait SegmentsResponse extends StObject {
    
    /**
      * The list of segments.
      */
    var Item: js.UndefOr[js.Array[SegmentResponse] | Iterable[SegmentResponse]] = js.undefined
    
    /**
      * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object SegmentsResponse {
    
    inline def apply(): SegmentsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentsResponse]
    }
    
    extension [Self <: SegmentsResponse](x: Self) {
      
      inline def setItem(value: js.Array[SegmentResponse] | Iterable[SegmentResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: SegmentResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentsResponse
    extends StObject
       with SegmentsResponse {
    
    /**
      * The list of segments.
      */
    @JSName("Item")
    var Item_UnmarshalledSegmentsResponse: js.UndefOr[js.Array[UnmarshalledSegmentResponse]] = js.undefined
  }
  object UnmarshalledSegmentsResponse {
    
    inline def apply(): UnmarshalledSegmentsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentsResponse]
    }
    
    extension [Self <: UnmarshalledSegmentsResponse](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledSegmentResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledSegmentResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
