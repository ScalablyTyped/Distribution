package typings.connectSlashes

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @see https://github.com/avinoamr/connect-slashes#usage
    */
  @JSImport("connect-slashes", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-slashes", JSImport.Namespace)
  @js.native
  def apply(addTrailingSlashes: js.UndefOr[scala.Nothing], options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-slashes", JSImport.Namespace)
  @js.native
  def apply(addTrailingSlashes: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-slashes", JSImport.Namespace)
  @js.native
  def apply(addTrailingSlashes: Boolean, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Additional settings
    * @see https://github.com/avinoamr/connect-slashes#additional-settings
    */
  @js.native
  trait Options extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    var code: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
}
