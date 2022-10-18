package typings.codemirrorView.mod

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
@js.native
trait Decoration extends RangeValue {
  
  def eq(other: Decoration): Boolean = js.native
  
  /**
    The config object used to create this decoration. You can
    include additional properties in there to store metadata about
    your decoration.
    */
  val spec: Any = js.native
}
