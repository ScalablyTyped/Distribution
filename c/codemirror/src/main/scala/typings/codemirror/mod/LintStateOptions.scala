package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.gutter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintStateOptions extends js.Object {
  /** specifies that the lint process runs asynchronously */
  var async: js.UndefOr[Boolean] = js.native
  /** debounce delay before linting onChange */
  var delay: js.UndefOr[Double] = js.native
  /** callback to modify an annotation before display */
  var formatAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Annotation]] = js.native
  /** custom linting function provided by the user */
  var getAnnotations: js.UndefOr[Linter | AsyncLinter] = js.native
  /** 
    * specifies that lint errors should be displayed in the CodeMirror
    * gutter, note that you must use this in conjunction with [ "CodeMirror-lint-markers" ] as an element in the gutters argument on
    * initialization of the CodeMirror instance. */
  var hasGutters: js.UndefOr[Boolean] = js.native
  /** whether to lint onChange event */
  var lintOnChange: js.UndefOr[Boolean] = js.native
  /** callback after linter completes */
  var onUpdateLinting: js.UndefOr[
    js.Function3[
      /* annotationsNotSorted */ js.Array[Annotation], 
      /* annotations */ js.Array[Annotation], 
      /* codeMirror */ Editor, 
      Unit
    ]
  ] = js.native
  /**
    * Passing rules in `options` property prevents JSHint (and other linters) from complaining
    * about unrecognized rules like `onUpdateLinting`, `delay`, `lintOnChange`, etc.
    */
  var options: js.UndefOr[js.Any] = js.native
  /** controls display of lint tooltips */
  var tooltips: js.UndefOr[Boolean | gutter] = js.native
}

object LintStateOptions {
  @scala.inline
  def apply(): LintStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintStateOptions]
  }
  @scala.inline
  implicit class LintStateOptionsOps[Self <: LintStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFormatAnnotation(value: /* annotation */ Annotation => Annotation): Self = this.set("formatAnnotation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatAnnotation: Self = this.set("formatAnnotation", js.undefined)
    @scala.inline
    def setGetAnnotationsFunction4(
      value: (/* content */ String, /* updateLintingCallback */ UpdateLintingCallback, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => Unit
    ): Self = this.set("getAnnotations", js.Any.fromFunction4(value))
    @scala.inline
    def setGetAnnotationsFunction3(
      value: (/* content */ String, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
    ): Self = this.set("getAnnotations", js.Any.fromFunction3(value))
    @scala.inline
    def setGetAnnotations(value: Linter | AsyncLinter): Self = this.set("getAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetAnnotations: Self = this.set("getAnnotations", js.undefined)
    @scala.inline
    def setHasGutters(value: Boolean): Self = this.set("hasGutters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasGutters: Self = this.set("hasGutters", js.undefined)
    @scala.inline
    def setLintOnChange(value: Boolean): Self = this.set("lintOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLintOnChange: Self = this.set("lintOnChange", js.undefined)
    @scala.inline
    def setOnUpdateLinting(
      value: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Unit
    ): Self = this.set("onUpdateLinting", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnUpdateLinting: Self = this.set("onUpdateLinting", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setTooltips(value: Boolean | gutter): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

