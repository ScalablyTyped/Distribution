package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box which can render content drawn as 8x14 cell characters using the terminus font.
  */
@JSImport("blessed", "Widgets.BigTextElement")
@js.native
open class BigTextElement protected () extends BoxElement {
  def this(opts: BigTextOptions) = this()
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_BigTextElement: BigTextOptions = js.native
}
