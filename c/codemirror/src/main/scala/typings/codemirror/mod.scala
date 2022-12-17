package typings.codemirror

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.RangeSet
import typings.codemirrorState.mod.SelectionRange
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.StateEffectType
import typings.codemirrorView.anon.Dark
import typings.codemirrorView.anon.PartialRect
import typings.codemirrorView.anon.X
import typings.codemirrorView.mod.AttrSource
import typings.codemirrorView.mod.DOMEventHandlers
import typings.codemirrorView.mod.DecorationSet
import typings.codemirrorView.mod.EditorViewConfig
import typings.codemirrorView.mod.MakeSelectionStyle
import typings.codemirrorView.mod.ViewUpdate
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.styleMod.mod.StyleModule
import typings.styleMod.mod.StyleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  An editor view represents the editor's user interface. It holds
  the editable DOM surface, and possibly other elements such as the
  line number gutter. It handles events and dispatches state
  transactions for editing actions.
  */
  @JSImport("codemirror", "EditorView")
  @js.native
  /**
    Construct a new view. You'll want to either provide a `parent`
    option, or put `view.dom` into your document after creating a
    view, so that the user can see the editor.
    */
  open class EditorView ()
    extends typings.codemirrorView.mod.EditorView {
    def this(config: EditorViewConfig) = this()
  }
  object EditorView {
    
    @JSImport("codemirror", "EditorView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      State effect used to include screen reader announcements in a
      transaction. These will be added to the DOM in a visually hidden
      element with `aria-live="polite"` set, and should be used to
      describe effects that are visually obvious but may not be
      noticed by screen reader users (such as moving to the next
      search match).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.announce")
    @js.native
    def announce: StateEffectType[String] = js.native
    inline def announce_=(x: StateEffectType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("announce")(x.asInstanceOf[js.Any])
    
    /**
      Used to provide ranges that should be treated as atoms as far as
      cursor motion is concerned. This causes methods like
      [`moveByChar`](https://codemirror.net/6/docs/ref/#view.EditorView.moveByChar) and
      [`moveVertically`](https://codemirror.net/6/docs/ref/#view.EditorView.moveVertically) (and the
      commands built on top of them) to skip across such regions when
      a selection endpoint would enter them. This does _not_ prevent
      direct programmatic [selection
      updates](https://codemirror.net/6/docs/ref/#state.TransactionSpec.selection) from moving into such
      regions.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.atomicRanges")
    @js.native
    def atomicRanges: Facet[
        js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]], 
        js.Array[js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]]]
      ] = js.native
    inline def atomicRanges_=(
      x: Facet[
          js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]], 
          js.Array[js.Function1[/* view */ typings.codemirrorView.mod.EditorView, RangeSet[Any]]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atomicRanges")(x.asInstanceOf[js.Any])
    
    /**
      Create an extension that adds styles to the base theme. Like
      with [`theme`](https://codemirror.net/6/docs/ref/#view.EditorView^theme), use `&` to indicate the
      place of the editor wrapper element when directly targeting
      that. You can also use `&dark` or `&light` instead to only
      target editors with a dark or light theme.
      */
    /* static member */
    inline def baseTheme(spec: StringDictionary[StyleSpec]): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTheme")(spec.asInstanceOf[js.Any]).asInstanceOf[Extension]
    
    /**
      Facet used to configure whether a given selecting click adds a
      new range to the existing selection or replaces it entirely. The
      default behavior is to check `event.metaKey` on macOS, and
      `event.ctrlKey` elsewhere.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.clickAddsSelectionRange")
    @js.native
    def clickAddsSelectionRange: Facet[
        js.Function1[/* event */ MouseEvent, Boolean], 
        js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
      ] = js.native
    inline def clickAddsSelectionRange_=(
      x: Facet[
          js.Function1[/* event */ MouseEvent, Boolean], 
          js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickAddsSelectionRange")(x.asInstanceOf[js.Any])
    
    /**
      Facet that provides additional DOM attributes for the editor's
      editable DOM element.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.contentAttributes")
    @js.native
    def contentAttributes: Facet[AttrSource, js.Array[AttrSource]] = js.native
    inline def contentAttributes_=(x: Facet[AttrSource, js.Array[AttrSource]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentAttributes")(x.asInstanceOf[js.Any])
    
    /**
      This facet records whether a dark theme is active. The extension
      returned by [`theme`](https://codemirror.net/6/docs/ref/#view.EditorView^theme) automatically
      includes an instance of this when the `dark` option is set to
      true.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.darkTheme")
    @js.native
    def darkTheme: Facet[Boolean, Boolean] = js.native
    inline def darkTheme_=(x: Facet[Boolean, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkTheme")(x.asInstanceOf[js.Any])
    
    /**
      A facet that determines which [decorations](https://codemirror.net/6/docs/ref/#view.Decoration)
      are shown in the view. Decorations can be provided in two
      ways—directly, or via a function that takes an editor view.
      
      Only decoration sets provided directly are allowed to influence
      the editor's vertical layout structure. The ones provided as
      functions are called _after_ the new viewport has been computed,
      and thus **must not** introduce block widgets or replacing
      decorations that cover line breaks.
      
      If you want decorated ranges to behave like atomic units for
      cursor motion and deletion purposes, also provide the range set
      containing the decorations to
      [`EditorView.atomicRanges`](https://codemirror.net/6/docs/ref/#view.EditorView^atomicRanges).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.decorations")
    @js.native
    def decorations: Facet[
        DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet]), 
        js.Array[
          DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet])
        ]
      ] = js.native
    inline def decorations_=(
      x: Facet[
          DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet]), 
          js.Array[
            DecorationSet | (js.Function1[/* view */ typings.codemirrorView.mod.EditorView, DecorationSet])
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorations")(x.asInstanceOf[js.Any])
    
    /**
      Returns an extension that can be used to add DOM event handlers.
      The value should be an object mapping event names to handler
      functions. For any given event, such functions are ordered by
      extension precedence, and the first handler to return true will
      be assumed to have handled that event, and no other handlers or
      built-in behavior will be activated for it. These are registered
      on the [content element](https://codemirror.net/6/docs/ref/#view.EditorView.contentDOM), except
      for `scroll` handlers, which will be called any time the
      editor's [scroll element](https://codemirror.net/6/docs/ref/#view.EditorView.scrollDOM) or one of
      its parent nodes is scrolled.
      */
    /* static member */
    inline def domEventHandlers(handlers: DOMEventHandlers[Any]): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("domEventHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Extension]
    
    /**
      Facet used to configure whether a given selection drag event
      should move or copy the selection. The given predicate will be
      called with the `mousedown` event, and can return `true` when
      the drag should move the content.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.dragMovesSelection")
    @js.native
    def dragMovesSelection: Facet[
        js.Function1[/* event */ MouseEvent, Boolean], 
        js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
      ] = js.native
    inline def dragMovesSelection_=(
      x: Facet[
          js.Function1[/* event */ MouseEvent, Boolean], 
          js.Array[js.Function1[/* event */ MouseEvent, Boolean]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragMovesSelection")(x.asInstanceOf[js.Any])
    
    /**
      Facet that controls whether the editor content DOM is editable.
      When its highest-precedence value is `false`, the element will
      not have its `contenteditable` attribute set. (Note that this
      doesn't affect API calls that change the editor content, even
      when those are bound to keys or buttons. See the
      [`readOnly`](https://codemirror.net/6/docs/ref/#state.EditorState.readOnly) facet for that.)
      */
    /* static member */
    @JSImport("codemirror", "EditorView.editable")
    @js.native
    def editable: Facet[Boolean, Boolean] = js.native
    inline def editable_=(x: Facet[Boolean, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editable")(x.asInstanceOf[js.Any])
    
    /**
      Facet that provides DOM attributes for the editor's outer
      element.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.editorAttributes")
    @js.native
    def editorAttributes: Facet[AttrSource, js.Array[AttrSource]] = js.native
    inline def editorAttributes_=(x: Facet[AttrSource, js.Array[AttrSource]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorAttributes")(x.asInstanceOf[js.Any])
    
    /**
      Allows you to provide a function that should be called when the
      library catches an exception from an extension (mostly from view
      plugins, but may be used by other extensions to route exceptions
      from user-code-provided callbacks). This is mostly useful for
      debugging and logging. See [`logException`](https://codemirror.net/6/docs/ref/#view.logException).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.exceptionSink")
    @js.native
    def exceptionSink: Facet[
        js.Function1[/* exception */ Any, Unit], 
        js.Array[js.Function1[/* exception */ Any, Unit]]
      ] = js.native
    inline def exceptionSink_=(
      x: Facet[
          js.Function1[/* exception */ Any, Unit], 
          js.Array[js.Function1[/* exception */ Any, Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exceptionSink")(x.asInstanceOf[js.Any])
    
    /**
      Retrieve an editor view instance from the view's DOM
      representation.
      */
    /* static member */
    inline def findFromDOM(dom: HTMLElement): typings.codemirrorView.mod.EditorView | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findFromDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[typings.codemirrorView.mod.EditorView | Null]
    
    /**
      An input handler can override the way changes to the editable
      DOM content are handled. Handlers are passed the document
      positions between which the change was found, and the new
      content. When one returns true, no further input handlers are
      called and the default behavior is prevented.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.inputHandler")
    @js.native
    def inputHandler: Facet[
        js.Function4[
          /* view */ typings.codemirrorView.mod.EditorView, 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean
        ], 
        js.Array[
          js.Function4[
            /* view */ typings.codemirrorView.mod.EditorView, 
            /* from */ Double, 
            /* to */ Double, 
            /* text */ String, 
            Boolean
          ]
        ]
      ] = js.native
    inline def inputHandler_=(
      x: Facet[
          js.Function4[
            /* view */ typings.codemirrorView.mod.EditorView, 
            /* from */ Double, 
            /* to */ Double, 
            /* text */ String, 
            Boolean
          ], 
          js.Array[
            js.Function4[
              /* view */ typings.codemirrorView.mod.EditorView, 
              /* from */ Double, 
              /* to */ Double, 
              /* text */ String, 
              Boolean
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputHandler")(x.asInstanceOf[js.Any])
    
    /**
      An extension that enables line wrapping in the editor (by
      setting CSS `white-space` to `pre-wrap` in the content).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.lineWrapping")
    @js.native
    def lineWrapping: Extension = js.native
    inline def lineWrapping_=(x: Extension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWrapping")(x.asInstanceOf[js.Any])
    
    /**
      Allows you to influence the way mouse selection happens. The
      functions in this facet will be called for a `mousedown` event
      on the editor, and can return an object that overrides the way a
      selection is computed from that mouse click or drag.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.mouseSelectionStyle")
    @js.native
    def mouseSelectionStyle: Facet[MakeSelectionStyle, js.Array[MakeSelectionStyle]] = js.native
    inline def mouseSelectionStyle_=(x: Facet[MakeSelectionStyle, js.Array[MakeSelectionStyle]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseSelectionStyle")(x.asInstanceOf[js.Any])
    
    /**
      By default, the editor assumes all its content has the same
      [text direction](https://codemirror.net/6/docs/ref/#view.Direction). Configure this with a `true`
      value to make it read the text direction of every (rendered)
      line separately.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.perLineTextDirection")
    @js.native
    def perLineTextDirection: Facet[Boolean, Boolean] = js.native
    inline def perLineTextDirection_=(x: Facet[Boolean, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perLineTextDirection")(x.asInstanceOf[js.Any])
    
    /**
      Returns an effect that can be
      [added](https://codemirror.net/6/docs/ref/#state.TransactionSpec.effects) to a transaction to
      cause it to scroll the given position or range into view.
      */
    /* static member */
    inline def scrollIntoView(pos: Double): StateEffect[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(pos.asInstanceOf[js.Any]).asInstanceOf[StateEffect[Any]]
    inline def scrollIntoView(pos: Double, options: X): StateEffect[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateEffect[Any]]
    inline def scrollIntoView(pos: SelectionRange): StateEffect[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(pos.asInstanceOf[js.Any]).asInstanceOf[StateEffect[Any]]
    inline def scrollIntoView(pos: SelectionRange, options: X): StateEffect[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateEffect[Any]]
    
    /**
      Facet that allows extensions to provide additional scroll
      margins (space around the sides of the scrolling element that
      should be considered invisible). This can be useful when the
      plugin introduces elements that cover part of that element (for
      example a horizontally fixed gutter).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.scrollMargins")
    @js.native
    def scrollMargins: Facet[
        js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null], 
        js.Array[
          js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null]
        ]
      ] = js.native
    inline def scrollMargins_=(
      x: Facet[
          js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null], 
          js.Array[
            js.Function1[/* view */ typings.codemirrorView.mod.EditorView, PartialRect | Null]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollMargins")(x.asInstanceOf[js.Any])
    
    /**
      Facet to add a [style
      module](https://github.com/marijnh/style-mod#documentation) to
      an editor view. The view will ensure that the module is
      mounted in its [document
      root](https://codemirror.net/6/docs/ref/#view.EditorView.constructor^config.root).
      */
    /* static member */
    @JSImport("codemirror", "EditorView.styleModule")
    @js.native
    def styleModule: Facet[StyleModule, js.Array[StyleModule]] = js.native
    inline def styleModule_=(x: Facet[StyleModule, js.Array[StyleModule]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleModule")(x.asInstanceOf[js.Any])
    
    /**
      Create a theme extension. The first argument can be a
      [`style-mod`](https://github.com/marijnh/style-mod#documentation)
      style spec providing the styles for the theme. These will be
      prefixed with a generated class for the style.
      
      Because the selectors will be prefixed with a scope class, rule
      that directly match the editor's [wrapper
      element](https://codemirror.net/6/docs/ref/#view.EditorView.dom)—to which the scope class will be
      added—need to be explicitly differentiated by adding an `&` to
      the selector for that element—for example
      `&.cm-focused`.
      
      When `dark` is set to true, the theme will be marked as dark,
      which will cause the `&dark` rules from [base
      themes](https://codemirror.net/6/docs/ref/#view.EditorView^baseTheme) to be used (as opposed to
      `&light` when a light theme is active).
      */
    /* static member */
    inline def theme(spec: StringDictionary[StyleSpec]): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(spec.asInstanceOf[js.Any]).asInstanceOf[Extension]
    inline def theme(spec: StringDictionary[StyleSpec], options: Dark): Extension = (^.asInstanceOf[js.Dynamic].applyDynamic("theme")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Extension]
    
    /**
      A facet that can be used to register a function to be called
      every time the view updates.
      */
    /* static member */
    @JSImport("codemirror", "EditorView.updateListener")
    @js.native
    def updateListener: Facet[
        js.Function1[/* update */ ViewUpdate, Unit], 
        js.Array[js.Function1[/* update */ ViewUpdate, Unit]]
      ] = js.native
    inline def updateListener_=(
      x: Facet[
          js.Function1[/* update */ ViewUpdate, Unit], 
          js.Array[js.Function1[/* update */ ViewUpdate, Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateListener")(x.asInstanceOf[js.Any])
  }
  
  /**
  This is an extension value that just pulls together a number of
  extensions that you might want in a basic editor. It is meant as a
  convenient helper to quickly set up CodeMirror without installing
  and importing a lot of separate packages.
  Specifically, it includes...
    - [the default command bindings](https://codemirror.net/6/docs/ref/#commands.defaultKeymap)
    - [line numbers](https://codemirror.net/6/docs/ref/#view.lineNumbers)
    - [special character highlighting](https://codemirror.net/6/docs/ref/#view.highlightSpecialChars)
    - [the undo history](https://codemirror.net/6/docs/ref/#commands.history)
    - [a fold gutter](https://codemirror.net/6/docs/ref/#language.foldGutter)
    - [custom selection drawing](https://codemirror.net/6/docs/ref/#view.drawSelection)
    - [drop cursor](https://codemirror.net/6/docs/ref/#view.dropCursor)
    - [multiple selections](https://codemirror.net/6/docs/ref/#state.EditorState^allowMultipleSelections)
    - [reindentation on input](https://codemirror.net/6/docs/ref/#language.indentOnInput)
    - [the default highlight style](https://codemirror.net/6/docs/ref/#language.defaultHighlightStyle) (as fallback)
    - [bracket matching](https://codemirror.net/6/docs/ref/#language.bracketMatching)
    - [bracket closing](https://codemirror.net/6/docs/ref/#autocomplete.closeBrackets)
    - [autocompletion](https://codemirror.net/6/docs/ref/#autocomplete.autocompletion)
    - [rectangular selection](https://codemirror.net/6/docs/ref/#view.rectangularSelection) and [crosshair cursor](https://codemirror.net/6/docs/ref/#view.crosshairCursor)
    - [active line highlighting](https://codemirror.net/6/docs/ref/#view.highlightActiveLine)
    - [active line gutter highlighting](https://codemirror.net/6/docs/ref/#view.highlightActiveLineGutter)
    - [selection match highlighting](https://codemirror.net/6/docs/ref/#search.highlightSelectionMatches)
    - [search](https://codemirror.net/6/docs/ref/#search.searchKeymap)
    - [linting](https://codemirror.net/6/docs/ref/#lint.lintKeymap)
  (You'll probably want to add some language package to your setup
  too.)
  This extension does not allow customization. The idea is that,
  once you decide you want to configure your editor more precisely,
  you take this package's source (which is just a bunch of imports
  and an array literal), copy it into your own code, and adjust it
  as desired.
  */
  @JSImport("codemirror", "basicSetup")
  @js.native
  val basicSetup: Extension = js.native
  
  /**
  A minimal set of extensions to create a functional editor. Only
  includes [the default keymap](https://codemirror.net/6/docs/ref/#commands.defaultKeymap), [undo
  history](https://codemirror.net/6/docs/ref/#commands.history), [special character
  highlighting](https://codemirror.net/6/docs/ref/#view.highlightSpecialChars), [custom selection
  drawing](https://codemirror.net/6/docs/ref/#view.drawSelection), and [default highlight
  style](https://codemirror.net/6/docs/ref/#language.defaultHighlightStyle).
  */
  @JSImport("codemirror", "minimalSetup")
  @js.native
  val minimalSetup: Extension = js.native
}
