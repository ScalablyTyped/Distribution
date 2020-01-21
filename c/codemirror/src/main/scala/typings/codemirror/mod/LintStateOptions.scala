package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * async specifies that the lint process runs asynchronously. hasGutters specifies that lint errors should be displayed in the CodeMirror
  * gutter, note that you must use this in conjunction with [ "CodeMirror-lint-markers" ] as an element in the gutters argument on
  * initialization of the CodeMirror instance.
  */
trait LintStateOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var hasGutters: js.UndefOr[Boolean] = js.undefined
  var onUpdateLinting: js.UndefOr[
    js.Function3[
      /* annotationsNotSorted */ js.Array[Annotation], 
      /* annotations */ js.Array[Annotation], 
      /* codeMirror */ Editor, 
      Unit
    ]
  ] = js.undefined
}

object LintStateOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    hasGutters: js.UndefOr[Boolean] = js.undefined,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Unit = null
  ): LintStateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(hasGutters)) __obj.updateDynamic("hasGutters")(hasGutters.asInstanceOf[js.Any])
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3(onUpdateLinting))
    __obj.asInstanceOf[LintStateOptions]
  }
}

