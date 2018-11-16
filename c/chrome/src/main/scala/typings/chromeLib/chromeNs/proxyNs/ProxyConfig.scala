package typings
package chromeLib.chromeNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProxyConfig extends js.Object {
  /**
           * 'direct' = Never use a proxy
           * 'auto_detect' = Auto detect proxy settings
           * 'pac_script' = Use specified PAC script
           * 'fixed_servers' = Manually specify proxy servers
           * 'system' = Use system proxy settings
           */
  var mode: java.lang.String
  /** Optional. The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode. */
  var pacScript: js.UndefOr[PacScript] = js.undefined
  /** Optional. The proxy rules describing this configuration. Use this for 'fixed_servers' mode. */
  var rules: js.UndefOr[ProxyRules] = js.undefined
}

