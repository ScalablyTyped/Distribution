package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple line which can be line or bg styled.
  */
@JSImport("blessed", "Widgets.LineElement")
@js.native
class LineElement protected () extends BoxElement {
  def this(opts: LineOptions) = this()
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_LineElement: LineOptions = js.native
}
