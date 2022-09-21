package typings.codemirrorLint

import typings.codemirrorLint.codemirrorLintStrings.error
import typings.codemirrorLint.codemirrorLintStrings.info
import typings.codemirrorLint.codemirrorLintStrings.warning
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.StateEffectType
import typings.codemirrorState.mod.TransactionSpec
import typings.codemirrorView.mod.Command
import typings.codemirrorView.mod.EditorView
import typings.codemirrorView.mod.KeyBinding
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Command to close the lint panel, when open.
  */
  @JSImport("@codemirror/lint", "closeLintPanel")
  @js.native
  val closeLintPanel: Command = js.native
  
  /**
  Returns the number of active lint diagnostics in the given state.
  */
  inline def diagnosticCount(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticCount")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Forces any linters [configured](https://codemirror.net/6/docs/ref/#lint.linter) to run when the
  editor is idle to run right away.
  */
  inline def forceLinting(view: EditorView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLinting")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  Returns an extension that installs a gutter showing markers for
  each line that has diagnostics, which can be hovered over to see
  the diagnostics.
  */
  inline def lintGutter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("lintGutter")().asInstanceOf[Extension]
  inline def lintGutter(config: LintGutterConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("lintGutter")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  A set of default key bindings for the lint functionality.
  - Ctrl-Shift-m (Cmd-Shift-m on macOS): [`openLintPanel`](https://codemirror.net/6/docs/ref/#lint.openLintPanel)
  - F8: [`nextDiagnostic`](https://codemirror.net/6/docs/ref/#lint.nextDiagnostic)
  */
  @JSImport("@codemirror/lint", "lintKeymap")
  @js.native
  val lintKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Given a diagnostic source, this function returns an extension that
  enables linting with that source. It will be called whenever the
  editor is idle (after its content changed).
  */
  inline def linter(source: LintSource): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("linter")(source.asInstanceOf[js.Any]).asInstanceOf[Extension]
  inline def linter(source: LintSource, config: LintConfig): Extension = (^.asInstanceOf[js.Dynamic].applyDynamic("linter")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Extension]
  
  /**
  Move the selection to the next diagnostic.
  */
  @JSImport("@codemirror/lint", "nextDiagnostic")
  @js.native
  val nextDiagnostic: Command = js.native
  
  /**
  Command to open and focus the lint panel.
  */
  @JSImport("@codemirror/lint", "openLintPanel")
  @js.native
  val openLintPanel: Command = js.native
  
  /**
  Returns a transaction spec which updates the current set of
  diagnostics, and enables the lint extension if if wasn't already
  active.
  */
  inline def setDiagnostics(state: EditorState, diagnostics: js.Array[Diagnostic]): TransactionSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("setDiagnostics")(state.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[TransactionSpec]
  
  /**
  The state effect that updates the set of active diagnostics. Can
  be useful when writing an extension that needs to track these.
  */
  @JSImport("@codemirror/lint", "setDiagnosticsEffect")
  @js.native
  val setDiagnosticsEffect: StateEffectType[js.Array[Diagnostic]] = js.native
  
  /**
  An action associated with a diagnostic.
  */
  trait Action extends StObject {
    
    /**
      The function to call when the user activates this action. Is
      given the diagnostic's _current_ position, which may have
      changed since the creation of the diagnostic, due to editing.
      */
    @JSName("apply")
    def apply(view: EditorView, from: Double, to: Double): Unit
    
    /**
      The label to show to the user. Should be relatively short.
      */
    var name: String
  }
  object Action {
    
    inline def apply(apply: (EditorView, Double, Double) => Unit, name: String): Action = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setApply(value: (EditorView, Double, Double) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  Describes a problem or hint for a piece of code.
  */
  trait Diagnostic extends StObject {
    
    /**
      An optional array of actions that can be taken on this
      diagnostic.
      */
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    /**
      The start position of the relevant text.
      */
    var from: Double
    
    /**
      The message associated with this diagnostic.
      */
    var message: String
    
    /**
      An optional custom rendering function that displays the message
      as a DOM node.
      */
    var renderMessage: js.UndefOr[js.Function0[Node]] = js.undefined
    
    /**
      The severity of the problem. This will influence how it is
      displayed.
      */
    var severity: info | warning | error
    
    /**
      An optional source string indicating where the diagnostic is
      coming from. You can put the name of your linter here, if
      applicable.
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      The end position. May be equal to `from`, though actually
      covering text is preferable.
      */
    var to: Double
  }
  object Diagnostic {
    
    inline def apply(from: Double, message: String, severity: info | warning | error, to: Double): Diagnostic = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    extension [Self <: Diagnostic](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRenderMessage(value: () => Node): Self = StObject.set(x, "renderMessage", js.Any.fromFunction0(value))
      
      inline def setRenderMessageUndefined: Self = StObject.set(x, "renderMessage", js.undefined)
      
      inline def setSeverity(value: info | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type DiagnosticFilter = js.Function1[/* diagnostics */ js.Array[Diagnostic], js.Array[Diagnostic]]
  
  trait LintConfig extends StObject {
    
    /**
      Time to wait (in milliseconds) after a change before running
      the linter. Defaults to 750ms.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      Optional filter to determine which diagnostics produce markers
      in the content.
      */
    var markerFilter: js.UndefOr[Null | DiagnosticFilter] = js.undefined
    
    /**
      Filter applied to a set of diagnostics shown in a tooltip. No
      tooltip will appear if the empty set is returned.
      */
    var tooltipFilter: js.UndefOr[Null | DiagnosticFilter] = js.undefined
  }
  object LintConfig {
    
    inline def apply(): LintConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LintConfig]
    }
    
    extension [Self <: LintConfig](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setMarkerFilter(value: /* diagnostics */ js.Array[Diagnostic] => js.Array[Diagnostic]): Self = StObject.set(x, "markerFilter", js.Any.fromFunction1(value))
      
      inline def setMarkerFilterNull: Self = StObject.set(x, "markerFilter", null)
      
      inline def setMarkerFilterUndefined: Self = StObject.set(x, "markerFilter", js.undefined)
      
      inline def setTooltipFilter(value: /* diagnostics */ js.Array[Diagnostic] => js.Array[Diagnostic]): Self = StObject.set(x, "tooltipFilter", js.Any.fromFunction1(value))
      
      inline def setTooltipFilterNull: Self = StObject.set(x, "tooltipFilter", null)
      
      inline def setTooltipFilterUndefined: Self = StObject.set(x, "tooltipFilter", js.undefined)
    }
  }
  
  trait LintGutterConfig extends StObject {
    
    /**
      The delay before showing a tooltip when hovering over a lint gutter marker.
      */
    var hoverTime: js.UndefOr[Double] = js.undefined
    
    /**
      Optional filter determining which diagnostics show a marker in
      the gutter.
      */
    var markerFilter: js.UndefOr[Null | DiagnosticFilter] = js.undefined
    
    /**
      Optional filter for diagnostics displayed in a tooltip, which
      can also be used to prevent a tooltip appearing.
      */
    var tooltipFilter: js.UndefOr[Null | DiagnosticFilter] = js.undefined
  }
  object LintGutterConfig {
    
    inline def apply(): LintGutterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LintGutterConfig]
    }
    
    extension [Self <: LintGutterConfig](x: Self) {
      
      inline def setHoverTime(value: Double): Self = StObject.set(x, "hoverTime", value.asInstanceOf[js.Any])
      
      inline def setHoverTimeUndefined: Self = StObject.set(x, "hoverTime", js.undefined)
      
      inline def setMarkerFilter(value: /* diagnostics */ js.Array[Diagnostic] => js.Array[Diagnostic]): Self = StObject.set(x, "markerFilter", js.Any.fromFunction1(value))
      
      inline def setMarkerFilterNull: Self = StObject.set(x, "markerFilter", null)
      
      inline def setMarkerFilterUndefined: Self = StObject.set(x, "markerFilter", js.undefined)
      
      inline def setTooltipFilter(value: /* diagnostics */ js.Array[Diagnostic] => js.Array[Diagnostic]): Self = StObject.set(x, "tooltipFilter", js.Any.fromFunction1(value))
      
      inline def setTooltipFilterNull: Self = StObject.set(x, "tooltipFilter", null)
      
      inline def setTooltipFilterUndefined: Self = StObject.set(x, "tooltipFilter", js.undefined)
    }
  }
  
  /**
  The type of a function that produces diagnostics.
  */
  type LintSource = js.Function1[/* view */ EditorView, js.Array[Diagnostic] | js.Promise[js.Array[Diagnostic]]]
}
