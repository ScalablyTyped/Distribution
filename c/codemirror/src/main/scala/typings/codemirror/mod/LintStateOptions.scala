package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.gutter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintStateOptions extends StObject {
  
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
  def apply(): LintStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintStateOptions]
  }
  
  @scala.inline
  implicit class LintStateOptionsMutableBuilder[Self <: LintStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFormatAnnotation(value: /* annotation */ Annotation => Annotation): Self = StObject.set(x, "formatAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatAnnotationUndefined: Self = StObject.set(x, "formatAnnotation", js.undefined)
    
    @scala.inline
    def setGetAnnotations(value: Linter | AsyncLinter): Self = StObject.set(x, "getAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnnotationsFunction3(
      value: (/* content */ String, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
    ): Self = StObject.set(x, "getAnnotations", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAnnotationsFunction4(
      value: (/* content */ String, /* updateLintingCallback */ UpdateLintingCallback, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => Unit
    ): Self = StObject.set(x, "getAnnotations", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetAnnotationsUndefined: Self = StObject.set(x, "getAnnotations", js.undefined)
    
    @scala.inline
    def setHasGutters(value: Boolean): Self = StObject.set(x, "hasGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasGuttersUndefined: Self = StObject.set(x, "hasGutters", js.undefined)
    
    @scala.inline
    def setLintOnChange(value: Boolean): Self = StObject.set(x, "lintOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLintOnChangeUndefined: Self = StObject.set(x, "lintOnChange", js.undefined)
    
    @scala.inline
    def setOnUpdateLinting(
      value: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Unit
    ): Self = StObject.set(x, "onUpdateLinting", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnUpdateLintingUndefined: Self = StObject.set(x, "onUpdateLinting", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTooltips(value: Boolean | gutter): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
  }
}
