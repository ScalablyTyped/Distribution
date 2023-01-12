package typings.circularDependencyPlugin

import typings.circularDependencyPlugin.anon.Compilation
import typings.circularDependencyPlugin.anon.CompilationCompilation
import typings.circularDependencyPlugin.circularDependencyPluginBooleans.`false`
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Detect modules with circular dependencies when bundling with webpack.
    */
  @JSImport("circular-dependency-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CircularDependencyPlugin {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /**
    * Detect modules with circular dependencies when bundling with webpack.
    */
  trait CircularDependencyPlugin
    extends StObject
       with WebpackPluginInstance
  object CircularDependencyPlugin {
    
    inline def apply(apply: Compiler => Unit): CircularDependencyPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[CircularDependencyPlugin]
    }
  }
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var allowAsyncCycles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * @default /$^/
      */
    var exclude: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * @default false
      */
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default /.*\/
      */
    var include: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * @default false
      */
    var onDetected: js.UndefOr[`false` | (js.Function1[/* x */ Compilation, Unit])] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowAsyncCycles(value: Boolean): Self = StObject.set(x, "allowAsyncCycles", value.asInstanceOf[js.Any])
      
      inline def setAllowAsyncCyclesUndefined: Self = StObject.set(x, "allowAsyncCycles", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      inline def setInclude(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setOnDetected(value: `false` | (js.Function1[/* x */ Compilation, Unit])): Self = StObject.set(x, "onDetected", value.asInstanceOf[js.Any])
      
      inline def setOnDetectedFunction1(value: /* x */ Compilation => Unit): Self = StObject.set(x, "onDetected", js.Any.fromFunction1(value))
      
      inline def setOnDetectedUndefined: Self = StObject.set(x, "onDetected", js.undefined)
      
      inline def setOnEnd(value: /* x */ CompilationCompilation => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* x */ CompilationCompilation => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
