package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codemirrorMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.codemirror.Anon_CodeMirrorPASS
  import typings.codemirror.codemirrorNumbers.`false`

  /**
    * A function that calls the updateLintingCallback with any errors found during the linting process.
    */
  type AsyncLinter = js.Function4[
    /* content */ String, 
    /* updateLintingCallback */ UpdateLintingCallback, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    Unit
  ]
  type KeyMap = StringDictionary[
    `false` | String | (js.Function1[/* instance */ Editor, Unit | Anon_CodeMirrorPASS])
  ]
  /**
    * A function that return errors found during the linting process.
    */
  type Linter = js.Function3[
    /* content */ String, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
  ]
  type MimeModeMap = StringDictionary[js.Any]
  /**
    * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
    */
  type ModeFactory[T] = js.Function2[/* config */ EditorConfiguration, /* modeOptions */ js.UndefOr[js.Any], Mode[T]]
  type ModeMap = StringDictionary[ModeFactory[js.Any]]
  /**
    * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
    */
  type UpdateLintingCallback = js.Function2[/* codeMirror */ Editor, /* annotations */ js.Array[Annotation], Unit]
}
