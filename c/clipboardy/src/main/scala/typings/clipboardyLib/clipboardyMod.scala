package typings
package clipboardyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboardy", JSImport.Namespace)
@js.native
object clipboardyMod extends js.Object {
  def read(): stdLib.Promise[java.lang.String] = js.native
  def readSync(): java.lang.String = js.native
  def write(input: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeSync(input: java.lang.String): scala.Unit = js.native
}

