package typings
package clipboardyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboardy", JSImport.Namespace)
@js.native
object clipboardyMod extends js.Object {
  def read(): js.Promise[java.lang.String] = js.native
  def readSync(): java.lang.String = js.native
  def write(input: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeSync(input: java.lang.String): scala.Unit = js.native
}

