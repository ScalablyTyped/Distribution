package typings.connectFlash

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
  def apply(options: IConnectFlashOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("connect-flash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IConnectFlashOptions extends StObject {
    
    var unsafe: js.UndefOr[Boolean] = js.undefined
  }
  object IConnectFlashOptions {
    
    @scala.inline
    def apply(): IConnectFlashOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConnectFlashOptions]
    }
    
    @scala.inline
    implicit class IConnectFlashOptionsMutableBuilder[Self <: IConnectFlashOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
}
