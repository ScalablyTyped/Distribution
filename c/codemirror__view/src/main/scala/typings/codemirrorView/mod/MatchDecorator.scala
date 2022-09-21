package typings.codemirrorView.mod

import typings.codemirrorState.mod.RangeSet
import typings.codemirrorView.anon.Boundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Helper class used to make it easier to maintain decorations on
visible code that matches a given regular expression. To be used
in a [view plugin](https://codemirror.net/6/docs/ref/#view.ViewPlugin). Instances of this object
represent a matching configuration.
*/
@JSImport("@codemirror/view", "MatchDecorator")
@js.native
open class MatchDecorator protected () extends StObject {
  /**
    Create a decorator.
    */
  def this(config: Boundary) = this()
  
  /* private */ var addMatch: Any = js.native
  
  /* private */ var boundary: Any = js.native
  
  /**
    Compute the full set of decorations for matches in the given
    view's viewport. You'll want to call this when initializing your
    plugin.
    */
  def createDeco(view: EditorView): RangeSet[Decoration] = js.native
  
  /* private */ var maxLength: Any = js.native
  
  /* private */ var regexp: Any = js.native
  
  /**
    Update a set of decorations for a view update. `deco` _must_ be
    the set of decorations produced by _this_ `MatchDecorator` for
    the view state before the update.
    */
  def updateDeco(update: ViewUpdate, deco: DecorationSet): DecorationSet = js.native
  
  /* private */ var updateRange: Any = js.native
}
