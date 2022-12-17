package typings.codemirrorView.mod

import typings.codemirrorState.mod.Range
import typings.codemirrorState.mod.RangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A decoration provides information on how to draw or style a piece
of content. You'll usually use it wrapped in a
[`Range`](https://codemirror.net/6/docs/ref/#state.Range), which adds a start and end position.
@nonabstract
*/
/* note: abstract class */ @JSImport("@codemirror/view", "Decoration")
@js.native
open class Decoration protected () extends RangeValue {
  /* protected */ def this(
    /**
    @internal
    */
  startSide: Double,
    /**
    @internal
    */
  endSide: Double,
    /**
    @internal
    */
  widget: Null,
    /**
    The config object used to create this decoration. You can
    include additional properties in there to store metadata about
    your decoration.
    */
  spec: Any
  ) = this()
  /* protected */ def this(
    /**
    @internal
    */
  startSide: Double,
    /**
    @internal
    */
  endSide: Double,
    /**
    @internal
    */
  widget: WidgetType,
    /**
    The config object used to create this decoration. You can
    include additional properties in there to store metadata about
    your decoration.
    */
  spec: Any
  ) = this()
  
  def eq(other: Decoration): Boolean = js.native
  
  /**
    The config object used to create this decoration. You can
    include additional properties in there to store metadata about
    your decoration.
    */
  val spec: Any = js.native
}
object Decoration {
  
  @JSImport("@codemirror/view", "Decoration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Create a line decoration, which can add DOM attributes to the
    line starting at the given position.
    */
  /* static member */
  inline def line(spec: LineDecorationSpec): Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(spec.asInstanceOf[js.Any]).asInstanceOf[Decoration]
  
  /**
    Create a mark decoration, which influences the styling of the
    content in its range. Nested mark decorations will cause nested
    DOM elements to be created. Nesting order is determined by
    precedence of the [facet](https://codemirror.net/6/docs/ref/#view.EditorView^decorations), with
    the higher-precedence decorations creating the inner DOM nodes.
    Such elements are split on line boundaries and on the boundaries
    of lower-precedence decorations.
    */
  /* static member */
  inline def mark(spec: MarkDecorationSpec): Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(spec.asInstanceOf[js.Any]).asInstanceOf[Decoration]
  
  /**
    The empty set of decorations.
    */
  /* static member */
  @JSImport("@codemirror/view", "Decoration.none")
  @js.native
  def none: DecorationSet = js.native
  inline def none_=(x: DecorationSet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  
  /**
    Create a replace decoration which replaces the given range with
    a widget, or simply hides it.
    */
  /* static member */
  inline def replace(spec: ReplaceDecorationSpec): Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(spec.asInstanceOf[js.Any]).asInstanceOf[Decoration]
  
  inline def set(of: js.Array[Range[Decoration]]): DecorationSet = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(of.asInstanceOf[js.Any]).asInstanceOf[DecorationSet]
  inline def set(of: js.Array[Range[Decoration]], sort: Boolean): DecorationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(of.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[DecorationSet]
  /**
    Build a [`DecorationSet`](https://codemirror.net/6/docs/ref/#view.DecorationSet) from the given
    decorated range or ranges. If the ranges aren't already sorted,
    pass `true` for `sort` to make the library sort them for you.
    */
  /* static member */
  inline def set(of: Range[Decoration]): DecorationSet = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(of.asInstanceOf[js.Any]).asInstanceOf[DecorationSet]
  inline def set(of: Range[Decoration], sort: Boolean): DecorationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(of.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[DecorationSet]
  
  /**
    Create a widget decoration, which displays a DOM element at the
    given position.
    */
  /* static member */
  inline def widget(spec: WidgetDecorationSpec): Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("widget")(spec.asInstanceOf[js.Any]).asInstanceOf[Decoration]
}
