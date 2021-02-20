package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMarkerEntryMod {
  
  @js.native
  trait DeleteMarkerEntry extends StObject {
    
    /**
      * <p>Specifies whether the object is (true) or is not (false) the latest version of an object.</p>
      */
    var IsLatest: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The object key.</p>
      */
    var Key: js.UndefOr[String] = js.native
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.native
    
    /**
      * <p>Version ID of an object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  object DeleteMarkerEntry {
    
    @scala.inline
    def apply(): DeleteMarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMarkerEntry]
    }
    
    @scala.inline
    implicit class DeleteMarkerEntryMutableBuilder[Self <: DeleteMarkerEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLatest(value: Boolean): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledDeleteMarkerEntry extends DeleteMarkerEntry {
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledDeleteMarkerEntry: js.UndefOr[Date] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledDeleteMarkerEntry: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledDeleteMarkerEntry {
    
    @scala.inline
    def apply(): UnmarshalledDeleteMarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDeleteMarkerEntry]
    }
    
    @scala.inline
    implicit class UnmarshalledDeleteMarkerEntryMutableBuilder[Self <: UnmarshalledDeleteMarkerEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
