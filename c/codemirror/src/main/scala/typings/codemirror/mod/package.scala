package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A function that calls the updateLintingCallback with any errors found during the linting process.
    */
  type AsyncLinter = js.Function4[
    /* content */ java.lang.String, 
    /* updateLintingCallback */ typings.codemirror.mod.UpdateLintingCallback, 
    /* options */ typings.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typings.codemirror.mod.Editor, 
    scala.Unit
  ]
  type HintFunction = js.Function1[/* cm */ typings.codemirror.mod.Editor, typings.codemirror.mod.Hints]
  type KeyMap = org.scalablytyped.runtime.StringDictionary[
    typings.codemirror.codemirrorBooleans.`false` | java.lang.String | (js.Function1[
      /* instance */ typings.codemirror.mod.Editor, 
      scala.Unit | typings.codemirror.anon.ToString
    ])
  ]
  /**
    * A function that return errors found during the linting process.
    */
  type Linter = js.Function3[
    /* content */ java.lang.String, 
    /* options */ typings.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typings.codemirror.mod.Editor, 
    js.Array[typings.codemirror.mod.Annotation] | js.Thenable[js.Array[typings.codemirror.mod.Annotation]]
  ]
  type MimeModeMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
    */
  type ModeFactory[T] = js.Function2[
    /* config */ typings.codemirror.mod.EditorConfiguration, 
    /* modeOptions */ js.UndefOr[js.Any], 
    typings.codemirror.mod.Mode[T]
  ]
  type ModeMap = org.scalablytyped.runtime.StringDictionary[typings.codemirror.mod.ModeFactory[js.Any]]
  /**
    * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
    */
  type UpdateLintingCallback = js.Function2[
    /* codeMirror */ typings.codemirror.mod.Editor, 
    /* annotations */ js.Array[typings.codemirror.mod.Annotation], 
    scala.Unit
  ]
}
