package typings.cliBox.mod

import typings.cliBox.AnonFullscreen
import typings.cliBox.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-box", JSImport.Namespace)
@js.native
class Class protected () extends Box {
  def this(options: String) = this()
  def this(options: Options) = this()
  def this(options: String, text: String) = this()
  def this(options: String, text: Text) = this()
  def this(options: Options, text: String) = this()
  def this(options: Options, text: Text) = this()
  /* CompleteClass */
  override var options: AnonFullscreen = js.native
  /* CompleteClass */
  override var settings: AnonHeight = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

