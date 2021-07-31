package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectIdentifierMod {
  
  trait ObjectIdentifier extends StObject {
    
    /**
      * <p>Key name of the object to delete.</p>
      */
    var Key: String
    
    /**
      * <p>VersionId for the specific version of the object to delete.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object ObjectIdentifier {
    
    @scala.inline
    def apply(Key: String): ObjectIdentifier = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectIdentifier]
    }
    
    @scala.inline
    implicit class ObjectIdentifierMutableBuilder[Self <: ObjectIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  type UnmarshalledObjectIdentifier = ObjectIdentifier
}
