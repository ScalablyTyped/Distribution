package typings.cliBox.mod

import typings.cliBox.anon.Fullscreen
import typings.cliBox.anon.Height
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
  override var options: Fullscreen = js.native
  /* CompleteClass */
  override var settings: Height = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

