package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMarkerEntryMod {
  
  trait DeleteMarkerEntry extends StObject {
    
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
    var Owner: js.UndefOr[typings.awsSdkClientS3Node.typesOwnerMod.Owner] = js.undefined
    
    /**
      * <p>Version ID of an object.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object DeleteMarkerEntry {
    
    inline def apply(): DeleteMarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMarkerEntry]
    }
    
    extension [Self <: DeleteMarkerEntry](x: Self) {
      
      inline def setIsLatest(value: Boolean): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
      
      inline def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  trait UnmarshalledDeleteMarkerEntry
    extends StObject
       with DeleteMarkerEntry {
    
    /**
      * <p>Date and time the object was last modified.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledDeleteMarkerEntry: js.UndefOr[Date] = js.undefined
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledDeleteMarkerEntry: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object UnmarshalledDeleteMarkerEntry {
    
    inline def apply(): UnmarshalledDeleteMarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDeleteMarkerEntry]
    }
    
    extension [Self <: UnmarshalledDeleteMarkerEntry](x: Self) {
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
