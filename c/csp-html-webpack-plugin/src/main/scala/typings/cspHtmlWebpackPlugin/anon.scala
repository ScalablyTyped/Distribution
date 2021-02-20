package typings.cspHtmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import typings.cspHtmlWebpackPlugin.mod.HtmlPluginData
import typings.cspHtmlWebpackPlugin.mod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined csp-html-webpack-plugin.csp-html-webpack-plugin.AdditionalOptions & {  policy :csp-html-webpack-plugin.csp-html-webpack-plugin.Policy | undefined} */
  @js.native
  trait AdditionalOptionspolicyPo extends StObject {
    
    /**
      * If false, or the function returns false, the empty CSP tag will be
      * stripped from the html output.
      *
      * * The `htmlPluginData` is passed into the function as its first
      *   param.
      * * If `enabled` is set the false, it will disable generating a CSP for
      *   all instances of HtmlWebpackPlugin in your webpack config.
      */
    var enabled: js.UndefOr[Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])] = js.native
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include hashes.
      */
    var hashEnabled: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    /**
      * The hashing method. Your node version must also accept this hashing
      * method.
      */
    var hashingMethod: js.UndefOr[sha256 | sha384 | sha512] = js.native
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include nonces.
      */
    var nonceEnabled: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var policy: js.UndefOr[Policy] = js.native
  }
  object AdditionalOptionspolicyPo {
    
    @scala.inline
    def apply(): AdditionalOptionspolicyPo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalOptionspolicyPo]
    }
    
    @scala.inline
    implicit class AdditionalOptionspolicyPoMutableBuilder[Self <: AdditionalOptionspolicyPo] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
