package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketMod {
  
  trait Bucket extends StObject {
    
    /**
      * <p>Date the bucket was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      inline def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
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
    var CreationDate_UnmarshalledBucket: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledBucket {
    
    inline def apply(): UnmarshalledBucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBucket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledBucket] (val x: Self) extends AnyVal {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    }
  }
}
