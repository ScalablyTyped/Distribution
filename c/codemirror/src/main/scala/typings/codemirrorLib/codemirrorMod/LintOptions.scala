package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds the getAnnotations callback to LintStateOptions which may be overridden by the user if they choose use their own
  * linter.
  */
trait LintOptions extends LintStateOptions {
  var getAnnotations: js.UndefOr[Linter | AsyncLinter] = js.undefined
}

object LintOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    getAnnotations: Linter | AsyncLinter = null,
    hasGutters: js.UndefOr[scala.Boolean] = js.undefined,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => scala.Unit = null
  ): LintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (getAnnotations != null) __obj.updateDynamic("getAnnotations")(getAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(hasGutters)) __obj.updateDynamic("hasGutters")(hasGutters)
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3(onUpdateLinting))
    __obj.asInstanceOf[LintOptions]
  }
}

