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

