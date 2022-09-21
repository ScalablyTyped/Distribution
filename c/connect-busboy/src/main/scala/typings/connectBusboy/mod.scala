package typings.connectBusboy

import typings.busboy.mod.Busboy
import typings.busboy.mod.BusboyConfig
import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: ConnectBusboyOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("connect-busboy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConnectBusboyOptions
    extends StObject
       with BusboyConfig {
    
    var immediate: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectBusboyOptions {
    
    inline def apply(): ConnectBusboyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectBusboyOptions]
    }
    
    extension [Self <: ConnectBusboyOptions](x: Self) {
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var busboy: Busboy
      }
      object Request {
        
        inline def apply(busboy: Busboy): Request = {
          val __obj = js.Dynamic.literal(busboy = busboy.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setBusboy(value: Busboy): Self = StObject.set(x, "busboy", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
