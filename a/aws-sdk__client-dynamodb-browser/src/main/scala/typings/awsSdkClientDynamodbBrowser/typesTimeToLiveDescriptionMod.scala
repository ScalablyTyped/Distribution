package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeToLiveDescriptionMod {
  
  trait TimeToLiveDescription extends StObject {
    
    /**
      * <p> The name of the Time to Live attribute for items in the table.</p>
      */
    var AttributeName: js.UndefOr[String] = js.undefined
    
    /**
      * <p> The Time to Live status for the table.</p>
      */
    var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.undefined
  }
  object TimeToLiveDescription {
    
    inline def apply(): TimeToLiveDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeToLiveDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
      
      inline def setTimeToLiveStatus(value: ENABLING | DISABLING | ENABLED | DISABLED | String): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
    }
  }
  
  type UnmarshalledTimeToLiveDescription = TimeToLiveDescription
}
