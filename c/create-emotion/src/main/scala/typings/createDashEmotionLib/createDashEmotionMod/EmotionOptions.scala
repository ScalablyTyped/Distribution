package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionOptions extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[
    scala.Boolean | (js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* context */ createDashEmotionLib.createDashEmotionLibNumbers.`1` | createDashEmotionLib.createDashEmotionLibNumbers.`2` | createDashEmotionLib.createDashEmotionLibNumbers.`3`, 
      scala.Boolean
    ])
  ] = js.undefined
  var stylisPlugins: js.UndefOr[StylisPlugins] = js.undefined
}

object EmotionOptions {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    key: java.lang.String = null,
    nonce: java.lang.String = null,
    prefix: scala.Boolean | (js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* context */ createDashEmotionLib.createDashEmotionLibNumbers.`1` | createDashEmotionLib.createDashEmotionLibNumbers.`2` | createDashEmotionLib.createDashEmotionLibNumbers.`3`, 
      scala.Boolean
    ]) = null,
    stylisPlugins: StylisPlugins = null
  ): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionOptions]
  }
}

