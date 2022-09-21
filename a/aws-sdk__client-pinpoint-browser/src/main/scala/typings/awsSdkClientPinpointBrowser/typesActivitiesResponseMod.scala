package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.ActivityResponse
import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.UnmarshalledActivityResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesActivitiesResponseMod {
  
  trait ActivitiesResponse extends StObject {
    
    /**
      * List of campaign activities
      */
    var Item: js.UndefOr[js.Array[ActivityResponse] | js.Iterable[ActivityResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ActivitiesResponse {
    
    inline def apply(): ActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivitiesResponse]
    }
    
    extension [Self <: ActivitiesResponse](x: Self) {
      
      inline def setItem(value: js.Array[ActivityResponse] | js.Iterable[ActivityResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: ActivityResponse*): Self = StObject.set(x, "Item", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledActivitiesResponse
    extends StObject
       with ActivitiesResponse {
    
    /**
      * List of campaign activities
      */
    @JSName("Item")
    var Item_UnmarshalledActivitiesResponse: js.UndefOr[js.Array[UnmarshalledActivityResponse]] = js.undefined
  }
  object UnmarshalledActivitiesResponse {
    
    inline def apply(): UnmarshalledActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledActivitiesResponse]
    }
    
    extension [Self <: UnmarshalledActivitiesResponse](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledActivityResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledActivityResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
}
