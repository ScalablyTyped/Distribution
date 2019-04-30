package typings
package cloneDashRegexpLib.cloneDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Modifies the [`dotAll`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/dotAll) property of the cloned `RegExp` instance.
  		*/
  var dotAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Modifies the [`global`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/global) property of the cloned `RegExp` instance.
  		*/
  var global: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Modifies the [`ignoreCase`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/ignoreCase) property of the cloned `RegExp` instance.
  		*/
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Modifies the [`lastIndex`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/lastIndex) property of the cloned `RegExp` instance.
  		*/
  var lastIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  		Modifies the [`multiline`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/multiline) property of the cloned `RegExp` instance.
  		*/
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Modifies the [`source`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/source) property of the cloned `RegExp` instance.
  		*/
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Modifies the [`sticky`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky) property of the cloned `RegExp` instance.
  		*/
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Modifies the [`unicode`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicode) property of the cloned `RegExp` instance.
  		*/
  var unicode: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dotAll: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    lastIndex: scala.Int | scala.Double = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    unicode: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dotAll)) __obj.updateDynamic("dotAll")(dotAll)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (lastIndex != null) __obj.updateDynamic("lastIndex")(lastIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode)
    __obj.asInstanceOf[Options]
  }
}

