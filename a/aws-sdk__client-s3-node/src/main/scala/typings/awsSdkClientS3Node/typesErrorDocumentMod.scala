package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorDocumentMod {
  
  trait ErrorDocument extends StObject {
    
    /**
      * <p>The object key name to use when a 4XX class error occurs.</p>
      */
    var Key: String
  }
  object ErrorDocument {
    
    inline def apply(Key: String): ErrorDocument = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDocument]
    }
    
    extension [Self <: ErrorDocument](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledErrorDocument = ErrorDocument
}
