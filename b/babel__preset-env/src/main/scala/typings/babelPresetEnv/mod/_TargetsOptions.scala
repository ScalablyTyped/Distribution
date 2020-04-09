package typings.babelPresetEnv.mod

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.babelPresetEnvStrings.tp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TargetsOptions extends js.Object

object _TargetsOptions {
  @scala.inline
  def AnonBrowsers(browsers: String | js.Array[String]): _TargetsOptions = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonEsmodules(esmodules: `true`): _TargetsOptions = {
    val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def keyinTargetstring(
    Android: String = null,
    Baidu: String = null,
    BlackBerry: String = null,
    Chrome: String = null,
    ChromeAndroid: String = null,
    Edge: String = null,
    Electron: String = null,
    Explorer: String = null,
    ExplorerMobile: String = null,
    Firefox: String = null,
    FirefoxAndroid: String = null,
    Node: String = null,
    Opera: String = null,
    OperaMini: String = null,
    OperaMobile: String = null,
    QQAndroid: String = null,
    Safari: String = null,
    Samsung: String = null,
    UCAndroid: String = null,
    and_chr: String = null,
    and_ff: String = null,
    and_qq: String = null,
    and_uc: String = null,
    bb: String = null,
    ff: String = null,
    iOS: String = null,
    ie: String = null,
    ie_mob: String = null,
    ios_saf: String = null,
    kaios: String = null,
    op_mini: String = null,
    op_mob: String = null
  ): _TargetsOptions = {
    val __obj = js.Dynamic.literal()
    if (Android != null) __obj.updateDynamic("Android")(Android.asInstanceOf[js.Any])
    if (Baidu != null) __obj.updateDynamic("Baidu")(Baidu.asInstanceOf[js.Any])
    if (BlackBerry != null) __obj.updateDynamic("BlackBerry")(BlackBerry.asInstanceOf[js.Any])
    if (Chrome != null) __obj.updateDynamic("Chrome")(Chrome.asInstanceOf[js.Any])
    if (ChromeAndroid != null) __obj.updateDynamic("ChromeAndroid")(ChromeAndroid.asInstanceOf[js.Any])
    if (Edge != null) __obj.updateDynamic("Edge")(Edge.asInstanceOf[js.Any])
    if (Electron != null) __obj.updateDynamic("Electron")(Electron.asInstanceOf[js.Any])
    if (Explorer != null) __obj.updateDynamic("Explorer")(Explorer.asInstanceOf[js.Any])
    if (ExplorerMobile != null) __obj.updateDynamic("ExplorerMobile")(ExplorerMobile.asInstanceOf[js.Any])
    if (Firefox != null) __obj.updateDynamic("Firefox")(Firefox.asInstanceOf[js.Any])
    if (FirefoxAndroid != null) __obj.updateDynamic("FirefoxAndroid")(FirefoxAndroid.asInstanceOf[js.Any])
    if (Node != null) __obj.updateDynamic("Node")(Node.asInstanceOf[js.Any])
    if (Opera != null) __obj.updateDynamic("Opera")(Opera.asInstanceOf[js.Any])
    if (OperaMini != null) __obj.updateDynamic("OperaMini")(OperaMini.asInstanceOf[js.Any])
    if (OperaMobile != null) __obj.updateDynamic("OperaMobile")(OperaMobile.asInstanceOf[js.Any])
    if (QQAndroid != null) __obj.updateDynamic("QQAndroid")(QQAndroid.asInstanceOf[js.Any])
    if (Safari != null) __obj.updateDynamic("Safari")(Safari.asInstanceOf[js.Any])
    if (Samsung != null) __obj.updateDynamic("Samsung")(Samsung.asInstanceOf[js.Any])
    if (UCAndroid != null) __obj.updateDynamic("UCAndroid")(UCAndroid.asInstanceOf[js.Any])
    if (and_chr != null) __obj.updateDynamic("and_chr")(and_chr.asInstanceOf[js.Any])
    if (and_ff != null) __obj.updateDynamic("and_ff")(and_ff.asInstanceOf[js.Any])
    if (and_qq != null) __obj.updateDynamic("and_qq")(and_qq.asInstanceOf[js.Any])
    if (and_uc != null) __obj.updateDynamic("and_uc")(and_uc.asInstanceOf[js.Any])
    if (bb != null) __obj.updateDynamic("bb")(bb.asInstanceOf[js.Any])
    if (ff != null) __obj.updateDynamic("ff")(ff.asInstanceOf[js.Any])
    if (iOS != null) __obj.updateDynamic("iOS")(iOS.asInstanceOf[js.Any])
    if (ie != null) __obj.updateDynamic("ie")(ie.asInstanceOf[js.Any])
    if (ie_mob != null) __obj.updateDynamic("ie_mob")(ie_mob.asInstanceOf[js.Any])
    if (ios_saf != null) __obj.updateDynamic("ios_saf")(ios_saf.asInstanceOf[js.Any])
    if (kaios != null) __obj.updateDynamic("kaios")(kaios.asInstanceOf[js.Any])
    if (op_mini != null) __obj.updateDynamic("op_mini")(op_mini.asInstanceOf[js.Any])
    if (op_mob != null) __obj.updateDynamic("op_mob")(op_mob.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonNode(node: String | current | `true`): _TargetsOptions = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonSafari(safari: String | tp): _TargetsOptions = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TargetsOptions]
  }
}

