package typings.cspHtmlWebpackPlugin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typings.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import typings.cspHtmlWebpackPlugin.mod.HtmlPluginData
import typings.cspHtmlWebpackPlugin.mod.Policy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined csp-html-webpack-plugin.csp-html-webpack-plugin.AdditionalOptions & {  policy ? :csp-html-webpack-plugin.csp-html-webpack-plugin.Policy} */
trait AdditionalOptionspolicyPo extends js.Object {
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
  var policy: js.UndefOr[Policy] = js.undefined
}

object AdditionalOptionspolicyPo {
  @scala.inline
  def apply(
    enabled: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean]) = null,
    hashEnabled: StringDictionary[Boolean] = null,
    hashingMethod: sha256 | sha384 | sha512 = null,
    nonceEnabled: StringDictionary[Boolean] = null,
    policy: Policy = null
  ): AdditionalOptionspolicyPo = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hashEnabled != null) __obj.updateDynamic("hashEnabled")(hashEnabled.asInstanceOf[js.Any])
    if (hashingMethod != null) __obj.updateDynamic("hashingMethod")(hashingMethod.asInstanceOf[js.Any])
    if (nonceEnabled != null) __obj.updateDynamic("nonceEnabled")(nonceEnabled.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalOptionspolicyPo]
  }
}

