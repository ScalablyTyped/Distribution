package typings.babelPluginTransformRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPluginTransformRuntime.mod.CorejsVersion
    - typings.babelPluginTransformRuntime.anon.Proposals
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeBooleans.`false`
  */
  trait CorejsOption extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`2`
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`3`
  */
  trait CorejsVersion extends CorejsOption
  object CorejsVersion {
    
    @scala.inline
    def `2`: typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`2` = 2.asInstanceOf[typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`2`]
    
    @scala.inline
    def `3`: typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`3` = 3.asInstanceOf[typings.babelPluginTransformRuntime.babelPluginTransformRuntimeNumbers.`3`]
  }
  
  @js.native
  trait Options extends StObject {
    
    var absoluteRuntime: js.UndefOr[Boolean | String] = js.native
    
    var corejs: js.UndefOr[CorejsOption] = js.native
    
    var helpers: js.UndefOr[Boolean] = js.native
    
    var regenerator: js.UndefOr[Boolean] = js.native
    
    var useESModules: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
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
      def setAbsoluteRuntime(value: Boolean | String): Self = StObject.set(x, "absoluteRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteRuntimeUndefined: Self = StObject.set(x, "absoluteRuntime", js.undefined)
      
      @scala.inline
      def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      @scala.inline
      def setHelpers(value: Boolean): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setRegenerator(value: Boolean): Self = StObject.set(x, "regenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegeneratorUndefined: Self = StObject.set(x, "regenerator", js.undefined)
      
      @scala.inline
      def setUseESModules(value: Boolean): Self = StObject.set(x, "useESModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseESModulesUndefined: Self = StObject.set(x, "useESModules", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
