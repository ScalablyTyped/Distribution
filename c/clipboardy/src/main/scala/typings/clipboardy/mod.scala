package typings.clipboardy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboardy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def read(): js.Promise[String] = js.native
  def readSync(): String = js.native
  def write(text: String): js.Promise[Unit] = js.native
  def writeSync(text: String): Unit = js.native
}

