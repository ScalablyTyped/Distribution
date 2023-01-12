package typings.codemirrorView.anon

import typings.codemirrorView.mod.Decoration
import typings.codemirrorView.mod.EditorView
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
