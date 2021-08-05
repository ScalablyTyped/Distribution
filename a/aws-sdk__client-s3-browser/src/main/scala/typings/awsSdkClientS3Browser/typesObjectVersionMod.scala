package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectVersionMod {
  
  trait ObjectVersion extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies whether the object is (true) or is not (false) the latest version of an object.</p>
      */
    var IsLatest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The object key.</p>
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.undefined
    
    /**
      * <p>Size in bytes of the object.</p>
      */
    var Size: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | String] = js.undefined
    
    /**
      * <p>Version ID of an object.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object ObjectVersion {
    
    inline def apply(): ObjectVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectVersion]
    }
    
    extension [Self <: ObjectVersion](x: Self) {
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setIsLatest(value: Boolean): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
      
      inline def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
      
      inline def setStorageClass(value: STANDARD | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  trait UnmarshalledObjectVersion
    extends StObject
       with ObjectVersion {
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledObjectVersion: js.UndefOr[Date] = js.undefined
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledObjectVersion: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object UnmarshalledObjectVersion {
    
    inline def apply(): UnmarshalledObjectVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledObjectVersion]
    }
    
    extension [Self <: UnmarshalledObjectVersion](x: Self) {
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
