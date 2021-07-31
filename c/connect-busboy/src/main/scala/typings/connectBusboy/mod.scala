package typings.connectBusboy

import typings.busboy.busboy.Busboy
import typings.busboy.busboy.BusboyConfig
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: ConnectBusboyOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("connect-busboy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConnectBusboyOptions
    extends StObject
       with BusboyConfig {
    
    var immediate: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectBusboyOptions {
    
    @scala.inline
    def apply(): ConnectBusboyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectBusboyOptions]
    }
    
    @scala.inline
    implicit class ConnectBusboyOptionsMutableBuilder[Self <: ConnectBusboyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var busboy: Busboy
      }
      object Request {
        
        @scala.inline
        def apply(busboy: Busboy): Request = {
          val __obj = js.Dynamic.literal(busboy = busboy.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBusboy(value: Busboy): Self = StObject.set(x, "busboy", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
