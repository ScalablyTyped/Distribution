package typings.cspHtmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait AdditionalOptions extends js.Object {
  
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
}
object AdditionalOptions {
  
  @scala.inline
  def apply(): AdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalOptions]
  }
  
  @scala.inline
  implicit class AdditionalOptionsOps[Self <: AdditionalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabledFunction1(value: /* htmlPluginData */ HtmlPluginData => Boolean): Self = this.set("enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnabled(value: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHashEnabled(value: StringDictionary[Boolean]): Self = this.set("hashEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashEnabled: Self = this.set("hashEnabled", js.undefined)
    
    @scala.inline
    def setHashingMethod(value: sha256 | sha384 | sha512): Self = this.set("hashingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashingMethod: Self = this.set("hashingMethod", js.undefined)
    
    @scala.inline
    def setNonceEnabled(value: StringDictionary[Boolean]): Self = this.set("nonceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonceEnabled: Self = this.set("nonceEnabled", js.undefined)
  }
}
