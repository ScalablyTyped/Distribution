package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPointInTimeRecoveryDescriptionMod {
  
  trait PointInTimeRecoveryDescription extends StObject {
    
    /**
      * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
      */
    var EarliestRestorableDateTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    var LatestRestorableDateTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The current state of point in time recovery:</p> <ul> <li> <p> <code>ENABLING</code> - Point in time recovery is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Point in time recovery is enabled.</p> </li> <li> <p> <code>DISABLED</code> - Point in time recovery is disabled.</p> </li> </ul>
      */
    var PointInTimeRecoveryStatus: js.UndefOr[ENABLED | DISABLED | String] = js.undefined
  }
  object PointInTimeRecoveryDescription {
    
    inline def apply(): PointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryDescription]
    }
    
    extension [Self <: PointInTimeRecoveryDescription](x: Self) {
      
      inline def setEarliestRestorableDateTime(value: Date | String | Double): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      inline def setLatestRestorableDateTime(value: Date | String | Double): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
      
      inline def setPointInTimeRecoveryStatus(value: ENABLED | DISABLED | String): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
    }
  }
  
  trait UnmarshalledPointInTimeRecoveryDescription
    extends StObject
       with PointInTimeRecoveryDescription {
    
    /**
      * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
      */
    @JSName("EarliestRestorableDateTime")
    var EarliestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.undefined
    
    /**
      * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    @JSName("LatestRestorableDateTime")
    var LatestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledPointInTimeRecoveryDescription {
    
    inline def apply(): UnmarshalledPointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPointInTimeRecoveryDescription]
    }
    
    extension [Self <: UnmarshalledPointInTimeRecoveryDescription](x: Self) {
      
      inline def setEarliestRestorableDateTime(value: Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      inline def setLatestRestorableDateTime(value: Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
    }
  }
}
