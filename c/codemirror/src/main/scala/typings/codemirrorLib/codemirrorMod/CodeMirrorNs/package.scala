package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeMirrorNs {
  /**
    * A function that calls the updateLintingCallback with any errors found during the linting process.
    */
  type AsyncLinter = js.Function4[
    /* content */ java.lang.String, 
    /* updateLintingCallback */ UpdateLintingCallback, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    scala.Unit
  ]
  type HintFunction = js.Function1[/* cm */ Editor, Hints]
  /**
    * A function that return errors found during the linting process.
    */
  type Linter = js.Function3[
    /* content */ java.lang.String, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
  ]
  /**
    * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
    */
  type ModeFactory[T] = js.Function2[/* config */ EditorConfiguration, /* modeOptions */ js.UndefOr[js.Any], Mode[T]]
  /**
    * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
    */
  type UpdateLintingCallback = js.Function2[/* codeMirror */ Editor, /* annotations */ js.Array[Annotation], scala.Unit]
}
