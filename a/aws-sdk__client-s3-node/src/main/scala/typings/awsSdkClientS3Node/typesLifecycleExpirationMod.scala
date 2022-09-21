package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleExpirationMod {
  
  trait LifecycleExpiration extends StObject {
    
    /**
      * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
      */
    var Date: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.</p>
      */
    var Days: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.</p>
      */
    var ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  }
  object LifecycleExpiration {
    
    inline def apply(): LifecycleExpiration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleExpiration]
    }
    
    extension [Self <: LifecycleExpiration](x: Self) {
      
      inline def setDate(value: js.Date | String | Double): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
      
      inline def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
      
      inline def setExpiredObjectDeleteMarker(value: Boolean): Self = StObject.set(x, "ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
      
      inline def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "ExpiredObjectDeleteMarker", js.undefined)
    }
  }
  
  trait UnmarshalledLifecycleExpiration
    extends StObject
       with LifecycleExpiration {
    
    /**
      * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
      */
    @JSName("Date")
    var Date_UnmarshalledLifecycleExpiration: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledLifecycleExpiration {
    
    inline def apply(): UnmarshalledLifecycleExpiration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledLifecycleExpiration]
    }
    
    extension [Self <: UnmarshalledLifecycleExpiration](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    }
  }
}
