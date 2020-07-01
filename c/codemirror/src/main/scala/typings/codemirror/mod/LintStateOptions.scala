package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.gutter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintStateOptions extends js.Object {
  /** specifies that the lint process runs asynchronously */
  var async: js.UndefOr[Boolean] = js.undefined
  /** debounce delay before linting onChange */
  var delay: js.UndefOr[Double] = js.undefined
  /** callback to modify an annotation before display */
  var formatAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Annotation]] = js.undefined
  /** custom linting function provided by the user */
  var getAnnotations: js.UndefOr[Linter | AsyncLinter] = js.undefined
  /** 
    * specifies that lint errors should be displayed in the CodeMirror
    * gutter, note that you must use this in conjunction with [ "CodeMirror-lint-markers" ] as an element in the gutters argument on
    * initialization of the CodeMirror instance. */
  var hasGutters: js.UndefOr[Boolean] = js.undefined
  /** whether to lint onChange event */
  var lintOnChange: js.UndefOr[Boolean] = js.undefined
  /** callback after linter completes */
  var onUpdateLinting: js.UndefOr[
    js.Function3[
      /* annotationsNotSorted */ js.Array[Annotation], 
      /* annotations */ js.Array[Annotation], 
      /* codeMirror */ Editor, 
      Unit
    ]
  ] = js.undefined
  /**
    * Passing rules in `options` property prevents JSHint (and other linters) from complaining
    * about unrecognized rules like `onUpdateLinting`, `delay`, `lintOnChange`, etc.
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /** controls display of lint tooltips */
  var tooltips: js.UndefOr[Boolean | gutter] = js.undefined
}

object LintStateOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    formatAnnotation: /* annotation */ Annotation => Annotation = null,
    getAnnotations: Linter | AsyncLinter = null,
    hasGutters: js.UndefOr[Boolean] = js.undefined,
    lintOnChange: js.UndefOr[Boolean] = js.undefined,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Unit = null,
    options: js.Any = null,
    tooltips: Boolean | gutter = null
  ): LintStateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (formatAnnotation != null) __obj.updateDynamic("formatAnnotation")(js.Any.fromFunction1(formatAnnotation))
    if (getAnnotations != null) __obj.updateDynamic("getAnnotations")(getAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(hasGutters)) __obj.updateDynamic("hasGutters")(hasGutters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lintOnChange)) __obj.updateDynamic("lintOnChange")(lintOnChange.get.asInstanceOf[js.Any])
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3(onUpdateLinting))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintStateOptions]
  }
}

