package typings.cloneRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Modifies the [`dotAll`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/dotAll) property of the cloned `RegExp` instance.
  		*/
  var dotAll: js.UndefOr[Boolean] = js.undefined
  /**
  		Modifies the [`global`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/global) property of the cloned `RegExp` instance.
  		*/
  var global: js.UndefOr[Boolean] = js.undefined
  /**
  		Modifies the [`ignoreCase`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/ignoreCase) property of the cloned `RegExp` instance.
  		*/
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  /**
  		Modifies the [`lastIndex`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/lastIndex) property of the cloned `RegExp` instance.
  		*/
  var lastIndex: js.UndefOr[Double] = js.undefined
  /**
  		Modifies the [`multiline`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/multiline) property of the cloned `RegExp` instance.
  		*/
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
  		Modifies the [`source`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/source) property of the cloned `RegExp` instance.
  		*/
  var source: js.UndefOr[String] = js.undefined
  /**
  		Modifies the [`sticky`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky) property of the cloned `RegExp` instance.
  		*/
  var sticky: js.UndefOr[Boolean] = js.undefined
  /**
  		Modifies the [`unicode`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicode) property of the cloned `RegExp` instance.
  		*/
  var unicode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dotAll: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    lastIndex: js.UndefOr[Double] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    unicode: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dotAll)) __obj.updateDynamic("dotAll")(dotAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastIndex)) __obj.updateDynamic("lastIndex")(lastIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

