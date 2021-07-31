package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ACTIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_14
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_30
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_7
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HR_24
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INACTIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRecencyDimensionMod {
  
  trait RecencyDimension extends StObject {
    
    /**
      * The length of time during which users have been active or inactive with your app.
      *
      * Valid values: HR_24, DAY_7, DAY_14, DAY_30
      */
    var Duration: js.UndefOr[HR_24 | DAY_7 | DAY_14 | DAY_30 | String] = js.undefined
    
    /**
      * The recency dimension type:
      *
      * ACTIVE - Users who have used your app within the specified duration are included in the segment.
      *
      * INACTIVE - Users who have not used your app within the specified duration are included in the segment.
      */
    var RecencyType: js.UndefOr[ACTIVE | INACTIVE | String] = js.undefined
  }
  object RecencyDimension {
    
    @scala.inline
    def apply(): RecencyDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecencyDimension]
    }
    
    @scala.inline
    implicit class RecencyDimensionMutableBuilder[Self <: RecencyDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: HR_24 | DAY_7 | DAY_14 | DAY_30 | String): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      @scala.inline
      def setRecencyType(value: ACTIVE | INACTIVE | String): Self = StObject.set(x, "RecencyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecencyTypeUndefined: Self = StObject.set(x, "RecencyType", js.undefined)
    }
  }
  
  type UnmarshalledRecencyDimension = RecencyDimension
}
