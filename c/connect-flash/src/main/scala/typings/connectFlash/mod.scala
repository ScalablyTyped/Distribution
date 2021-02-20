package typings.connectFlash

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-flash", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-flash", JSImport.Namespace)
  @js.native
  def apply(options: IConnectFlashOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait IConnectFlashOptions extends StObject {
    
    var unsafe: js.UndefOr[Boolean] = js.native
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
