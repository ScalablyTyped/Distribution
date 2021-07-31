package typings.caseSensitivePathsWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("case-sensitive-paths-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with CaseSensitivePathsWebpackPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait CaseSensitivePathsWebpackPlugin
    extends StObject
       with Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Show more information
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run before emit instead of after resolve for individual files
      */
    var useBeforeEmitHook: js.UndefOr[Boolean] = js.undefined
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
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setUseBeforeEmitHook(value: Boolean): Self = StObject.set(x, "useBeforeEmitHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBeforeEmitHookUndefined: Self = StObject.set(x, "useBeforeEmitHook", js.undefined)
    }
  }
}
