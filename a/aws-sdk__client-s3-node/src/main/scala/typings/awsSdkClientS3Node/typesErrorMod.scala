package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorMod {
  
  trait Error extends StObject {
    
    /**
      * _Code shape
      */
    var Code: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * _Message shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
  
  type UnmarshalledError = Error
}
