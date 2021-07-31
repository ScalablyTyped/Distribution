package typings.circularDependencyPlugin

import typings.circularDependencyPlugin.anon.Compilation
import typings.circularDependencyPlugin.anon.CompilationAny
import typings.circularDependencyPlugin.circularDependencyPluginBooleans.`false`
import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Detect modules with circular dependencies when bundling with webpack.
    */
  @JSImport("circular-dependency-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  /**
    * Detect modules with circular dependencies when bundling with webpack.
    */
  type CircularDependencyPlugin = Plugin
  
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
    var exclude: js.UndefOr[RegExp] = js.undefined
    
    /**
      * @default false
      */
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default /.*\/
      */
    var include: js.UndefOr[RegExp] = js.undefined
    
    /**
      * @default false
      */
    var onDetected: js.UndefOr[`false` | (js.Function1[/* x */ Compilation, Unit])] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* x */ CompilationAny, Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* x */ CompilationAny, Unit]] = js.undefined
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
      def setAllowAsyncCycles(value: Boolean): Self = StObject.set(x, "allowAsyncCycles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAsyncCyclesUndefined: Self = StObject.set(x, "allowAsyncCycles", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExclude(value: RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      @scala.inline
      def setInclude(value: RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setOnDetected(value: `false` | (js.Function1[/* x */ Compilation, Unit])): Self = StObject.set(x, "onDetected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDetectedFunction1(value: /* x */ Compilation => Unit): Self = StObject.set(x, "onDetected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDetectedUndefined: Self = StObject.set(x, "onDetected", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* x */ CompilationAny => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* x */ CompilationAny => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
