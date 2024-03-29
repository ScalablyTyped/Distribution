package typings.codemirrorView

import org.scalablytyped.runtime.Instantiable1
import typings.codemirrorState.mod.Transaction
import typings.codemirrorView.codemirrorViewStrings.Alt
import typings.codemirrorView.codemirrorViewStrings.Control
import typings.codemirrorView.codemirrorViewStrings.Meta
import typings.codemirrorView.codemirrorViewStrings.Shift
import typings.codemirrorView.codemirrorViewStrings.absolute
import typings.codemirrorView.codemirrorViewStrings.fixed
import typings.codemirrorView.codemirrorViewStrings.touch
import typings.codemirrorView.mod.Decoration
import typings.codemirrorView.mod.EditorView
import typings.codemirrorView.mod.PluginValue
import typings.codemirrorView.mod.Rect
import typings.codemirrorView.mod.ScrollStrategy
import typings.codemirrorView.mod.Tooltip
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Boundary extends StObject {
    
    /**
      By default, changed lines are re-matched entirely. You can
      provide a boundary expression, which should match single
      character strings that can never occur in `regexp`, to reduce
      the amount of re-matching.
      */
    var boundary: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      Customize the way decorations are added for matches. This
      function, when given, will be called for matches and should
      call `add` to create decorations for them. Note that the
      decorations should appear *in* the given range, and the
      function should have no side effects beyond calling `add`.
      
      The `decoration` option is ignored when `decorate` is
      provided.
      */
    var decorate: js.UndefOr[
        js.Function5[
          /* add */ js.Function3[/* from */ Double, /* to */ Double, /* decoration */ Decoration, Unit], 
          /* from */ Double, 
          /* to */ Double, 
          /* match */ RegExpExecArray, 
          /* view */ EditorView, 
          Unit
        ]
      ] = js.undefined
    
    /**
      The decoration to apply to matches, either directly or as a
      function of the match.
      */
    var decoration: js.UndefOr[
        Decoration | (js.Function3[
          /* match */ RegExpExecArray, 
          /* view */ EditorView, 
          /* pos */ Double, 
          Decoration | Null
        ])
      ] = js.undefined
    
    /**
      Matching happens by line, by default, but when lines are
      folded or very long lines are only partially drawn, the
      decorator may avoid matching part of them for speed. This
      controls how much additional invisible content it should
      include in its matches. Defaults to 1000.
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      The regular expression to match against the content. Will only
      be matched inside lines (not across them). Should have its 'g'
      flag set.
      */
    var regexp: js.RegExp
  }
  object Boundary {
    
    inline def apply(regexp: js.RegExp): Boundary = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Boundary] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: js.RegExp): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setDecorate(
        value: (/* add */ js.Function3[/* from */ Double, /* to */ Double, /* decoration */ Decoration, Unit], /* from */ Double, /* to */ Double, /* match */ RegExpExecArray, /* view */ EditorView) => Unit
      ): Self = StObject.set(x, "decorate", js.Any.fromFunction5(value))
      
      inline def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
      
      inline def setDecoration(
        value: Decoration | (js.Function3[
              /* match */ RegExpExecArray, 
              /* view */ EditorView, 
              /* pos */ Double, 
              Decoration | Null
            ])
      ): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationFunction3(value: (/* match */ RegExpExecArray, /* view */ EditorView, /* pos */ Double) => Decoration | Null): Self = StObject.set(x, "decoration", js.Any.fromFunction3(value))
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dark extends StObject {
    
    var dark: js.UndefOr[Boolean] = js.undefined
  }
  object Dark {
    
    inline def apply(): Dark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    }
  }
  
  trait EventFilter extends StObject {
    
    /**
      A custom predicate function, which takes a `mousedown` event and
      returns true if it should be used for rectangular selection.
      */
    var eventFilter: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.undefined
  }
  object EventFilter {
    
    inline def apply(): EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
      
      inline def setEventFilter(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "eventFilter", js.Any.fromFunction1(value))
      
      inline def setEventFilterUndefined: Self = StObject.set(x, "eventFilter", js.undefined)
    }
  }
  
  trait Fixed extends StObject {
    
    var fixed: js.UndefOr[Boolean] = js.undefined
  }
  object Fixed {
    
    inline def apply(): Fixed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fixed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fixed] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait HideOn extends StObject {
    
    /**
      Controls whether a transaction hides the tooltip. The default
      is to not hide.
      */
    var hideOn: js.UndefOr[js.Function2[/* tr */ Transaction, /* tooltip */ Tooltip, Boolean]] = js.undefined
    
    /**
      When enabled (this defaults to false), close the tooltip
      whenever the document changes or the selection is set.
      */
    var hideOnChange: js.UndefOr[Boolean | touch] = js.undefined
    
    /**
      Hover time after which the tooltip should appear, in
      milliseconds. Defaults to 300ms.
      */
    var hoverTime: js.UndefOr[Double] = js.undefined
  }
  object HideOn {
    
    inline def apply(): HideOn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideOn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HideOn] (val x: Self) extends AnyVal {
      
      inline def setHideOn(value: (/* tr */ Transaction, /* tooltip */ Tooltip) => Boolean): Self = StObject.set(x, "hideOn", js.Any.fromFunction2(value))
      
      inline def setHideOnChange(value: Boolean | touch): Self = StObject.set(x, "hideOnChange", value.asInstanceOf[js.Any])
      
      inline def setHideOnChangeUndefined: Self = StObject.set(x, "hideOnChange", js.undefined)
      
      inline def setHideOnUndefined: Self = StObject.set(x, "hideOn", js.undefined)
      
      inline def setHoverTime(value: Double): Self = StObject.set(x, "hoverTime", value.asInstanceOf[js.Any])
      
      inline def setHoverTimeUndefined: Self = StObject.set(x, "hoverTime", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable[V /* <: PluginValue */]
    extends StObject
       with Instantiable1[/* view */ EditorView, V]
  
  trait Key extends StObject {
    
    var key: js.UndefOr[Alt | Control | Shift | Meta] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Alt | Control | Shift | Meta): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var node: typings.std.Node
    
    var offset: Double
  }
  object Node {
    
    inline def apply(node: typings.std.Node, offset: Double): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setNode(value: typings.std.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parent extends StObject {
    
    /**
      The element to put the tooltips into. By default, they are put
      in the editor (`cm-editor`) element, and that is usually what
      you want. But in some layouts that can lead to positioning
      issues, and you need to use a different parent to work around
      those.
      */
    var parent: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      By default, tooltips use `"fixed"`
      [positioning](https://developer.mozilla.org/en-US/docs/Web/CSS/position),
      which has the advantage that tooltips don't get cut off by
      scrollable parent elements. However, CSS rules like `contain:
      layout` can break fixed positioning in child nodes, which can be
      worked about by using `"absolute"` here.
      
      On iOS, which at the time of writing still doesn't properly
      support fixed positioning, the library always uses absolute
      positioning.
      */
    var position: js.UndefOr[fixed | absolute] = js.undefined
    
    /**
      By default, when figuring out whether there is room for a
      tooltip at a given position, the extension considers the entire
      space between 0,0 and `innerWidth`,`innerHeight` to be available
      for showing tooltips. You can provide a function here that
      returns an alternative rectangle.
      */
    var tooltipSpace: js.UndefOr[js.Function1[/* view */ EditorView, Rect]] = js.undefined
  }
  object Parent {
    
    inline def apply(): Parent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      inline def setParent(value: HTMLElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPosition(value: fixed | absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTooltipSpace(value: /* view */ EditorView => Rect): Self = StObject.set(x, "tooltipSpace", js.Any.fromFunction1(value))
      
      inline def setTooltipSpaceUndefined: Self = StObject.set(x, "tooltipSpace", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@codemirror/view.@codemirror/view.Rect> */
  trait PartialRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object PartialRect {
    
    inline def apply(): PartialRect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    /**
      Effect similar to
      [`y`](https://codemirror.net/6/docs/ref/#view.EditorView^scrollIntoView^options.y), but for the
      horizontal scroll position.
      */
    var x: js.UndefOr[ScrollStrategy] = js.undefined
    
    /**
      Extra horizontal distance to add. Not used with the `"center"`
      strategy. Defaults to 5.
      */
    var xMargin: js.UndefOr[Double] = js.undefined
    
    /**
      By default (`"nearest"`) the position will be vertically
      scrolled only the minimal amount required to move the given
      position into view. You can set this to `"start"` to move it
      to the top of the view, `"end"` to move it to the bottom, or
      `"center"` to move it to the center.
      */
    var y: js.UndefOr[ScrollStrategy] = js.undefined
    
    /**
      Extra vertical distance to add when moving something into
      view. Not used with the `"center"` strategy. Defaults to 5.
      */
    var yMargin: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: ScrollStrategy): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
      
      inline def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: ScrollStrategy): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      inline def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
