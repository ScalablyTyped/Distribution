package typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginStrings.sha256
import typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginStrings.sha384
import typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    enabled: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean]) = null,
    hashEnabled: StringDictionary[Boolean] = null,
    hashingMethod: sha256 | sha384 | sha512 = null,
    nonceEnabled: StringDictionary[Boolean] = null
  ): AdditionalOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hashEnabled != null) __obj.updateDynamic("hashEnabled")(hashEnabled.asInstanceOf[js.Any])
    if (hashingMethod != null) __obj.updateDynamic("hashingMethod")(hashingMethod.asInstanceOf[js.Any])
    if (nonceEnabled != null) __obj.updateDynamic("nonceEnabled")(nonceEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalOptions]
  }
}

