package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box element which draws a simple box containing content or other elements.
  */
@JSImport("blessed", "Widgets.BoxElement")
@js.native
open class BoxElement protected () extends ScrollableTextElement {
  def this(opts: BoxOptions) = this()
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_BoxElement: BoxOptions = js.native
}
