package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectVersionMod {
  
  @js.native
  trait ObjectVersion extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.native
    
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
    var Owner: js.UndefOr[typings.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
    
    /**
      * <p>Size in bytes of the object.</p>
      */
    var Size: js.UndefOr[Double] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | String] = js.native
    
    /**
      * <p>Version ID of an object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  object ObjectVersion {
    
    @scala.inline
    def apply(): ObjectVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectVersion]
    }
    
    @scala.inline
    implicit class ObjectVersionMutableBuilder[Self <: ObjectVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
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
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledObjectVersion extends ObjectVersion {
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledObjectVersion: js.UndefOr[Date] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledObjectVersion: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledObjectVersion {
    
    @scala.inline
    def apply(): UnmarshalledObjectVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledObjectVersion]
    }
    
    @scala.inline
    implicit class UnmarshalledObjectVersionMutableBuilder[Self <: UnmarshalledObjectVersion] (val x: Self) extends AnyVal {
      
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
