package typings.backlogJs

import typings.node.streamMod.PassThrough
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntityMod {
  
  object File {
    
    trait BrowserFileData
      extends StObject
         with FileData {
      
      var blob: js.UndefOr[js.Function0[js.Promise[Blob]]] = js.undefined
      
      var body: Any
      
      var url: String
    }
    object BrowserFileData {
      
      inline def apply(body: Any, url: String): BrowserFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[BrowserFileData]
      }
      
      extension [Self <: BrowserFileData](x: Self) {
        
        inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
        
        inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
        
        inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.backlogJs.distTypesEntityMod.File.NodeFileData
      - typings.backlogJs.distTypesEntityMod.File.BrowserFileData
    */
    trait FileData extends StObject
    object FileData {
      
      inline def BrowserFileData(body: Any, url: String): typings.backlogJs.distTypesEntityMod.File.BrowserFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.backlogJs.distTypesEntityMod.File.BrowserFileData]
      }
      
      inline def NodeFileData(body: PassThrough, filename: String, url: String): typings.backlogJs.distTypesEntityMod.File.NodeFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.backlogJs.distTypesEntityMod.File.NodeFileData]
      }
    }
    
    trait NodeFileData
      extends StObject
         with FileData {
      
      var body: PassThrough
      
      var filename: String
      
      var url: String
    }
    object NodeFileData {
      
      inline def apply(body: PassThrough, filename: String, url: String): NodeFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[NodeFileData]
      }
      
      extension [Self <: NodeFileData](x: Self) {
        
        inline def setBody(value: PassThrough): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object OAuth2 {
    
    trait AccessToken extends StObject {
      
      var access_token: String
      
      var expires_in: Double
      
      var refresh_token: String
      
      var token_type: String
    }
    object AccessToken {
      
      inline def apply(access_token: String, expires_in: Double, refresh_token: String, token_type: String): AccessToken = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
        __obj.asInstanceOf[AccessToken]
      }
      
      extension [Self <: AccessToken](x: Self) {
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
        
        inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      }
    }
  }
}
