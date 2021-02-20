package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPointInTimeRecoveryDescriptionMod {
  
  @js.native
  trait PointInTimeRecoveryDescription extends StObject {
    
    /**
      * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
      */
    var EarliestRestorableDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    var LatestRestorableDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The current state of point in time recovery:</p> <ul> <li> <p> <code>ENABLING</code> - Point in time recovery is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Point in time recovery is enabled.</p> </li> <li> <p> <code>DISABLED</code> - Point in time recovery is disabled.</p> </li> </ul>
      */
    var PointInTimeRecoveryStatus: js.UndefOr[ENABLED | DISABLED | String] = js.native
  }
  object PointInTimeRecoveryDescription {
    
    @scala.inline
    def apply(): PointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryDescription]
    }
    
    @scala.inline
    implicit class PointInTimeRecoveryDescriptionMutableBuilder[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEarliestRestorableDateTime(value: Date | String | Double): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      @scala.inline
      def setLatestRestorableDateTime(value: Date | String | Double): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
      
      @scala.inline
      def setPointInTimeRecoveryStatus(value: ENABLED | DISABLED | String): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledPointInTimeRecoveryDescription extends PointInTimeRecoveryDescription {
    
    /**
      * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
      */
    @JSName("EarliestRestorableDateTime")
    var EarliestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.native
    
    /**
      * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    @JSName("LatestRestorableDateTime")
    var LatestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.native
  }
  object UnmarshalledPointInTimeRecoveryDescription {
    
    @scala.inline
    def apply(): UnmarshalledPointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPointInTimeRecoveryDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledPointInTimeRecoveryDescriptionMutableBuilder[Self <: UnmarshalledPointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEarliestRestorableDateTime(value: Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      @scala.inline
      def setLatestRestorableDateTime(value: Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
    }
  }
}
