package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.deta.anon.Last
import typings.deta.distTypesTypesBasicMod.NullType
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesDriveResponseMod {
  
  trait DeleteManyResponse extends StObject {
    
    var deleted: js.Array[String]
    
    var failed: StringDictionary[String]
  }
  object DeleteManyResponse {
    
    inline def apply(deleted: js.Array[String], failed: StringDictionary[String]): DeleteManyResponse = {
      val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteManyResponse]
    }
    
    extension [Self <: DeleteManyResponse](x: Self) {
      
      inline def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value*))
      
      inline def setFailed(value: StringDictionary[String]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    }
  }
  
  type DeleteResponse = String
  
  type GetResponse = Blob | NullType
  
  trait ListResponse extends StObject {
    
    var names: js.Array[String]
    
    var paging: Last
  }
  object ListResponse {
    
    inline def apply(names: js.Array[String], paging: Last): ListResponse = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], paging = paging.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResponse]
    }
    
    extension [Self <: ListResponse](x: Self) {
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setPaging(value: Last): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    }
  }
  
  type PutResponse = String
  
  trait UploadResponse extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
  }
  object UploadResponse {
    
    inline def apply(): UploadResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadResponse]
    }
    
    extension [Self <: UploadResponse](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
