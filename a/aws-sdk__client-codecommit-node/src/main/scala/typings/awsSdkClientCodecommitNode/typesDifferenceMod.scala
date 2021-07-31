package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.A
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.D
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.M
import typings.awsSdkClientCodecommitNode.typesBlobMetadataMod.BlobMetadata
import typings.awsSdkClientCodecommitNode.typesBlobMetadataMod.UnmarshalledBlobMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDifferenceMod {
  
  trait Difference extends StObject {
    
    /**
      * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
      */
    var afterBlob: js.UndefOr[BlobMetadata] = js.undefined
    
    /**
      * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
      */
    var beforeBlob: js.UndefOr[BlobMetadata] = js.undefined
    
    /**
      * <p>Whether the change type of the difference is an addition (A), deletion (D), or modification (M).</p>
      */
    var changeType: js.UndefOr[A | M | D | String] = js.undefined
  }
  object Difference {
    
    @scala.inline
    def apply(): Difference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Difference]
    }
    
    @scala.inline
    implicit class DifferenceMutableBuilder[Self <: Difference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterBlob(value: BlobMetadata): Self = StObject.set(x, "afterBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobUndefined: Self = StObject.set(x, "afterBlob", js.undefined)
      
      @scala.inline
      def setBeforeBlob(value: BlobMetadata): Self = StObject.set(x, "beforeBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlobUndefined: Self = StObject.set(x, "beforeBlob", js.undefined)
      
      @scala.inline
      def setChangeType(value: A | M | D | String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    }
  }
  
  trait UnmarshalledDifference
    extends StObject
       with Difference {
    
    /**
      * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
      */
    @JSName("afterBlob")
    var afterBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.undefined
    
    /**
      * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
      */
    @JSName("beforeBlob")
    var beforeBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.undefined
  }
  object UnmarshalledDifference {
    
    @scala.inline
    def apply(): UnmarshalledDifference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDifference]
    }
    
    @scala.inline
    implicit class UnmarshalledDifferenceMutableBuilder[Self <: UnmarshalledDifference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterBlob(value: UnmarshalledBlobMetadata): Self = StObject.set(x, "afterBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobUndefined: Self = StObject.set(x, "afterBlob", js.undefined)
      
      @scala.inline
      def setBeforeBlob(value: UnmarshalledBlobMetadata): Self = StObject.set(x, "beforeBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlobUndefined: Self = StObject.set(x, "beforeBlob", js.undefined)
    }
  }
}
