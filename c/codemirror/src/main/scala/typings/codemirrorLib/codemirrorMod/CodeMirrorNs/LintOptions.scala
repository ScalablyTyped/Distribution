package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds the getAnnotations callback to LintStateOptions which may be overridden by the user if they choose use their own
  * linter.
  */
trait LintOptions extends LintStateOptions {
  var getAnnotations: Linter | AsyncLinter
}

object LintOptions {
  @scala.inline
  def apply(
    async: scala.Boolean,
    getAnnotations: Linter | AsyncLinter,
    hasGutters: scala.Boolean,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => scala.Unit = null
  ): LintOptions = {
    val __obj = js.Dynamic.literal(async = async, getAnnotations = getAnnotations.asInstanceOf[js.Any], hasGutters = hasGutters)
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3(onUpdateLinting))
    __obj.asInstanceOf[LintOptions]
  }
}

