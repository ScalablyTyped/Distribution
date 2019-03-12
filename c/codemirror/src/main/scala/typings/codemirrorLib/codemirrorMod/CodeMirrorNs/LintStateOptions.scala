package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * async specifies that the lint process runs asynchronously. hasGutters specifies that lint errors should be displayed in the CodeMirror
  * gutter, note that you must use this in conjunction with [ "CodeMirror-lint-markers" ] as an element in the gutters argument on
  * initialization of the CodeMirror instance.
  */
trait LintStateOptions extends js.Object {
  var async: scala.Boolean
  var hasGutters: scala.Boolean
  var onUpdateLinting: js.UndefOr[
    js.Function3[
      /* annotationsNotSorted */ js.Array[Annotation], 
      /* annotations */ js.Array[Annotation], 
      /* codeMirror */ Editor, 
      scala.Unit
    ]
  ] = js.undefined
}

object LintStateOptions {
  @scala.inline
  def apply(
    async: scala.Boolean,
    hasGutters: scala.Boolean,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => scala.Unit = null
  ): LintStateOptions = {
    val __obj = js.Dynamic.literal(async = async, hasGutters = hasGutters)
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3(onUpdateLinting))
    __obj.asInstanceOf[LintStateOptions]
  }
}

