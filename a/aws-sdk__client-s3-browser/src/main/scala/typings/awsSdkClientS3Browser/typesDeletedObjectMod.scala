package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeletedObjectMod {
  
  @js.native
  trait DeletedObject extends StObject {
    
    /**
      * _DeleteMarker shape
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.native
    
    /**
      * _DeleteMarkerVersionId shape
      */
    var DeleteMarkerVersionId: js.UndefOr[String] = js.native
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.native
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  object DeletedObject {
    
    @scala.inline
    def apply(): DeletedObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletedObject]
    }
    
    @scala.inline
    implicit class DeletedObjectMutableBuilder[Self <: DeletedObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteMarker(value: Boolean): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
      
      @scala.inline
      def setDeleteMarkerVersionId(value: String): Self = StObject.set(x, "DeleteMarkerVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerVersionIdUndefined: Self = StObject.set(x, "DeleteMarkerVersionId", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  type UnmarshalledDeletedObject = DeletedObject
}
