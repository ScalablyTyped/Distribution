package typings.awsSdkClientS3Browser

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketMod {
  
  trait Bucket extends StObject {
    
    /**
      * <p>Date the bucket was created.</p>
      */
    var CreationDate: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The name of the bucket.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  object Bucket {
    
    inline def apply(): Bucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bucket]
    }
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setCreationDate(value: Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
  
  trait UnmarshalledBucket
    extends StObject
       with Bucket {
    
    /**
      * <p>Date the bucket was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledBucket: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledBucket {
    
    inline def apply(): UnmarshalledBucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBucket]
    }
    
    extension [Self <: UnmarshalledBucket](x: Self) {
      
      inline def setCreationDate(value: Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    }
  }
}
