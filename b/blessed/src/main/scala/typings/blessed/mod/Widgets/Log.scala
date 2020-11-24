package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A log permanently scrolled to the bottom.
  */
@JSImport("blessed", "Widgets.Log")
@js.native
class Log () extends ScrollableBoxElement {
  def this(options: LogOptions) = this()
  
  /**
    * add a log line.
    */
  def add(text: String): Unit = js.native
  
  /**
    * add a log line.
    */
  def log(text: String): Unit = js.native
  
  @JSName("options")
  var options_Log: LogOptions = js.native
  
  /**
    * scroll to bottom on input even if the user has scrolled up. default: false.
    */
  var scrollOnInput: Boolean = js.native
  
  /**
    * amount of scrollback allowed. default: Infinity.
    */
  var scrollback: Double = js.native
}
