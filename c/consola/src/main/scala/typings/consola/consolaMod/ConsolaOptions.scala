package typings.consola.consolaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[ConsolaLogObject] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var mockFn: js.UndefOr[ConsolaMockFn] = js.undefined
  var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.undefined
  var stderr: js.UndefOr[js.Any] = js.undefined
  var stdout: js.UndefOr[js.Any] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var types: js.UndefOr[StringDictionary[ConsolaLogObject]] = js.undefined
}

object ConsolaOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    defaults: ConsolaLogObject = null,
    level: Int | Double = null,
    mockFn: (/* type */ String, /* defaults */ ConsolaLogObject) => ConsolaMock = null,
    reporters: js.Array[ConsolaReporter] = null,
    stderr: js.Any = null,
    stdout: js.Any = null,
    throttle: Int | Double = null,
    types: StringDictionary[ConsolaLogObject] = null
  ): ConsolaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mockFn != null) __obj.updateDynamic("mockFn")(js.Any.fromFunction2(mockFn))
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaOptions]
  }
}

