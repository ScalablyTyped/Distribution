package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.ActivityResponse
import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.UnmarshalledActivityResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesActivitiesResponseMod {
  
  trait ActivitiesResponse extends StObject {
    
    /**
      * List of campaign activities
      */
    var Item: js.UndefOr[js.Array[ActivityResponse] | Iterable[ActivityResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ActivitiesResponse {
    
    @scala.inline
    def apply(): ActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivitiesResponse]
    }
    
    @scala.inline
    implicit class ActivitiesResponseMutableBuilder[Self <: ActivitiesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[ActivityResponse] | Iterable[ActivityResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: ActivityResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
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
    
    @scala.inline
    def apply(): UnmarshalledActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledActivitiesResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledActivitiesResponseMutableBuilder[Self <: UnmarshalledActivitiesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledActivityResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledActivityResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
