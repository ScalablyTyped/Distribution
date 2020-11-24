package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box with a spinning line to denote loading (automatically hidden).
  */
@JSImport("blessed", "Widgets.LoadingElement")
@js.native
class LoadingElement protected () extends BoxElement {
  def this(opts: LoadingOptions) = this()
  
  /**
    * Display the loading box with a message. Will lock keys until stop is called.
    */
  def load(text: String): Unit = js.native
  
  @JSName("options")
  var options_LoadingElement: LoadingOptions = js.native
  
  /**
    * Hide loading box. Unlock keys.
    */
  def stop(): Unit = js.native
}
