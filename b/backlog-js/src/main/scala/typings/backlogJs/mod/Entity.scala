package typings.backlogJs.mod

import typings.node.streamMod.PassThrough
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Entity {
  
  object File {
    
    trait BrowserFileData
      extends StObject
         with FileData {
      
      var blob: js.UndefOr[js.Function0[js.Promise[Blob]]] = js.undefined
      
      var body: js.Any
      
      var url: String
    }
    object BrowserFileData {
      
      @scala.inline
      def apply(body: js.Any, url: String): BrowserFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[BrowserFileData]
      }
      
      @scala.inline
      implicit class BrowserFileDataMutableBuilder[Self <: BrowserFileData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.backlogJs.mod.Entity.File.NodeFileData
      - typings.backlogJs.mod.Entity.File.BrowserFileData
    */
    trait FileData extends StObject
    object FileData {
      
      @scala.inline
      def BrowserFileData(body: js.Any, url: String): typings.backlogJs.mod.Entity.File.BrowserFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.backlogJs.mod.Entity.File.BrowserFileData]
      }
      
      @scala.inline
      def NodeFileData(body: PassThrough, filename: String, url: String): typings.backlogJs.mod.Entity.File.NodeFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.backlogJs.mod.Entity.File.NodeFileData]
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
      
      @scala.inline
      def apply(body: PassThrough, filename: String, url: String): NodeFileData = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[NodeFileData]
      }
      
      @scala.inline
      implicit class NodeFileDataMutableBuilder[Self <: NodeFileData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: PassThrough): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
      
      @scala.inline
      def apply(access_token: String, expires_in: Double, refresh_token: String, token_type: String): AccessToken = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
        __obj.asInstanceOf[AccessToken]
      }
      
      @scala.inline
      implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      }
    }
  }
}
