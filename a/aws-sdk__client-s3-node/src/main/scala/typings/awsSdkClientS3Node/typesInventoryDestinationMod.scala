package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod.InventoryS3BucketDestination
import typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod.UnmarshalledInventoryS3BucketDestination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryDestinationMod {
  
  trait InventoryDestination extends StObject {
    
    /**
      * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
      */
    var S3BucketDestination: InventoryS3BucketDestination
  }
  object InventoryDestination {
    
    inline def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryDestination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InventoryDestination] (val x: Self) extends AnyVal {
      
      inline def setS3BucketDestination(value: InventoryS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledInventoryDestination
    extends StObject
       with InventoryDestination {
    
    /**
      * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
      */
    @JSName("S3BucketDestination")
    var S3BucketDestination_UnmarshalledInventoryDestination: UnmarshalledInventoryS3BucketDestination
  }
  object UnmarshalledInventoryDestination {
    
    inline def apply(S3BucketDestination: UnmarshalledInventoryS3BucketDestination): UnmarshalledInventoryDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledInventoryDestination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledInventoryDestination] (val x: Self) extends AnyVal {
      
      inline def setS3BucketDestination(value: UnmarshalledInventoryS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
}
