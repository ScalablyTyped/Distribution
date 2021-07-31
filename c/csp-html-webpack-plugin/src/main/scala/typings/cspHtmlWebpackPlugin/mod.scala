package typings.cspHtmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.cspHtmlWebpackPlugin.anon.AdditionalOptionspolicyPo
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import typings.tapable.mod.AsyncSeriesWaterfallHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csp-html-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * Setup for our plugin
    * @param policy - the policy object
    * @param additionalOpts - additional config options
    */
  class ^ ()
    extends StObject
       with CspHtmlWebpackPlugin {
    def this(policy: Policy) = this()
    def this(policy: Unit, additionalOpts: AdditionalOptions) = this()
    def this(policy: Policy, additionalOpts: AdditionalOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackCompiler */ js.Any
    ): Unit = js.native
  }
  
  // Fallback when nothing works.
  /**
    * Additional options. Defaults are:
    *
    * ```javascript
    * {
    *   enabled: true
    *   hashingMethod: 'sha256',
    *   hashEnabled: {
    *     'script-src': true,
    *     'style-src': true
    *   },
    *   nonceEnabled: {
    *     'script-src': true,
    *     'style-src': true
    *   }
    * }
    * ```
    */
  trait AdditionalOptions extends StObject {
    
    /**
      * If false, or the function returns false, the empty CSP tag will be
      * stripped from the html output.
      *
      * * The `htmlPluginData` is passed into the function as its first
      *   param.
      * * If `enabled` is set the false, it will disable generating a CSP for
      *   all instances of HtmlWebpackPlugin in your webpack config.
      */
    var enabled: js.UndefOr[Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include hashes.
      */
    var hashEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    /**
      * The hashing method. Your node version must also accept this hashing
      * method.
      */
    var hashingMethod: js.UndefOr[sha256 | sha384 | sha512] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include nonces.
      */
    var nonceEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  }
  object AdditionalOptions {
    
    @scala.inline
    def apply(): AdditionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalOptions]
    }
    
    @scala.inline
    implicit class AdditionalOptionsMutableBuilder[Self <: AdditionalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledFunction1(value: /* htmlPluginData */ HtmlPluginData => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHashEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "hashEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashEnabledUndefined: Self = StObject.set(x, "hashEnabled", js.undefined)
      
      @scala.inline
      def setHashingMethod(value: sha256 | sha384 | sha512): Self = StObject.set(x, "hashingMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashingMethodUndefined: Self = StObject.set(x, "hashingMethod", js.undefined)
      
      @scala.inline
      def setNonceEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "nonceEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceEnabledUndefined: Self = StObject.set(x, "nonceEnabled", js.undefined)
    }
  }
  
  trait CspHtmlWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackCompiler */ js.Any
    ): Unit
  }
  object CspHtmlWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackCompiler */ js.Any => Unit
    ): CspHtmlWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[CspHtmlWebpackPlugin]
    }
    
    @scala.inline
    implicit class CspHtmlWebpackPluginMutableBuilder[Self <: CspHtmlWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackCompiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  // HtmlWebpackPlugin v3 and v4 use different hook interfaces. Figure out
  // which we're using and infer the generic type variable inside.
  type HtmlPluginData = js.Any
  
  // Helpers for extracting the relevant generic types from
  // HtmlWebpackPlugin.Hooks.
  trait HtmlPluginDataHookV3[T] extends StObject {
    
    var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, js.Any, js.Any]
  }
  object HtmlPluginDataHookV3 {
    
    @scala.inline
    def apply[T](htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, js.Any, js.Any]): HtmlPluginDataHookV3[T] = {
      val __obj = js.Dynamic.literal(htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlPluginDataHookV3[T]]
    }
    
    @scala.inline
    implicit class HtmlPluginDataHookV3MutableBuilder[Self <: HtmlPluginDataHookV3[?], T] (val x: Self & HtmlPluginDataHookV3[T]) extends AnyVal {
      
      @scala.inline
      def setHtmlWebpackPluginAfterHtmlProcessing(value: AsyncSeriesWaterfallHook[T, js.Any, js.Any]): Self = StObject.set(x, "htmlWebpackPluginAfterHtmlProcessing", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlPluginDataHookV4[T] extends StObject {
    
    var beforeEmit: AsyncSeriesWaterfallHook[T, js.Any, js.Any]
  }
  object HtmlPluginDataHookV4 {
    
    @scala.inline
    def apply[T](beforeEmit: AsyncSeriesWaterfallHook[T, js.Any, js.Any]): HtmlPluginDataHookV4[T] = {
      val __obj = js.Dynamic.literal(beforeEmit = beforeEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlPluginDataHookV4[T]]
    }
    
    @scala.inline
    implicit class HtmlPluginDataHookV4MutableBuilder[Self <: HtmlPluginDataHookV4[?], T] (val x: Self & HtmlPluginDataHookV4[T]) extends AnyVal {
      
      @scala.inline
      def setBeforeEmit(value: AsyncSeriesWaterfallHook[T, js.Any, js.Any]): Self = StObject.set(x, "beforeEmit", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A flat object which defines your CSP policy. Values can either be a
    * string or an array of strings.
    *
    * The default policy is:
    *
    * ```javascript
    * {
    *   'base-uri': "'self'",
    *   'object-src': "'none'",
    *   'script-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"],
    *   'style-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"]
    * }
    * ```
    */
  type Policy = StringDictionary[String | js.Array[String]]
  
  /* augmented module */
  object htmlWebpackPluginAugmentingMod {
    
    trait Options extends StObject {
      
      var cspPlugin: js.UndefOr[AdditionalOptionspolicyPo] = js.undefined
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
        def setCspPlugin(value: AdditionalOptionspolicyPo): Self = StObject.set(x, "cspPlugin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCspPluginUndefined: Self = StObject.set(x, "cspPlugin", js.undefined)
      }
    }
  }
}
