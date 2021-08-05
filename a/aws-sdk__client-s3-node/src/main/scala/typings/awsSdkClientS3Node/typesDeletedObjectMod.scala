package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeletedObjectMod {
  
  trait DeletedObject extends StObject {
    
    /**
      * _DeleteMarker shape
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * _DeleteMarkerVersionId shape
      */
    var DeleteMarkerVersionId: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object DeletedObject {
    
    inline def apply(): DeletedObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletedObject]
    }
    
    extension [Self <: DeletedObject](x: Self) {
      
      inline def setDeleteMarker(value: Boolean): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
      
      inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
      
      inline def setDeleteMarkerVersionId(value: String): Self = StObject.set(x, "DeleteMarkerVersionId", value.asInstanceOf[js.Any])
      
      inline def setDeleteMarkerVersionIdUndefined: Self = StObject.set(x, "DeleteMarkerVersionId", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  type UnmarshalledDeletedObject = DeletedObject
}
