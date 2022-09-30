package typings.babelPluginTransformRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPluginTransformRuntime.mod.CorejsVersion
    - typings.babelPluginTransformRuntime.anon.Proposals
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeBooleans.`false`
  */
  trait CorejsOption extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`2`
    - typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`3`
  */
  trait CorejsVersion
    extends StObject
       with CorejsOption
  object CorejsVersion {
    
    inline def `2`: typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`2` = 2.asInstanceOf[typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`2`]
    
    inline def `3`: typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`3` = 3.asInstanceOf[typings.babelPluginTransformRuntime.babelPluginTransformRuntimeInts.`3`]
  }
  
  trait Options extends StObject {
    
    var absoluteRuntime: js.UndefOr[Boolean | String] = js.undefined
    
    var corejs: js.UndefOr[CorejsOption] = js.undefined
    
    var helpers: js.UndefOr[Boolean] = js.undefined
    
    var regenerator: js.UndefOr[Boolean] = js.undefined
    
    var useESModules: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbsoluteRuntime(value: Boolean | String): Self = StObject.set(x, "absoluteRuntime", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteRuntimeUndefined: Self = StObject.set(x, "absoluteRuntime", js.undefined)
      
      inline def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      inline def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      inline def setHelpers(value: Boolean): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setRegenerator(value: Boolean): Self = StObject.set(x, "regenerator", value.asInstanceOf[js.Any])
      
      inline def setRegeneratorUndefined: Self = StObject.set(x, "regenerator", js.undefined)
      
      inline def setUseESModules(value: Boolean): Self = StObject.set(x, "useESModules", value.asInstanceOf[js.Any])
      
      inline def setUseESModulesUndefined: Self = StObject.set(x, "useESModules", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
