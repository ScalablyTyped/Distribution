package typings
package builderDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/hash", JSImport.Namespace)
@js.native
object outHashMod extends js.Object {
  def hashFile(file: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def hashFile(file: java.lang.String, algorithm: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  @JSName("hashFile")
  def hashFile_base64(
    file: java.lang.String,
    algorithm: java.lang.String,
    encoding: builderDashUtilLib.builderDashUtilLibStrings.base64
  ): stdLib.Promise[java.lang.String] = js.native
  @JSName("hashFile")
  def hashFile_base64(
    file: java.lang.String,
    algorithm: java.lang.String,
    encoding: builderDashUtilLib.builderDashUtilLibStrings.base64,
    options: js.Any
  ): stdLib.Promise[java.lang.String] = js.native
  @JSName("hashFile")
  def hashFile_hex(
    file: java.lang.String,
    algorithm: java.lang.String,
    encoding: builderDashUtilLib.builderDashUtilLibStrings.hex
  ): stdLib.Promise[java.lang.String] = js.native
  @JSName("hashFile")
  def hashFile_hex(
    file: java.lang.String,
    algorithm: java.lang.String,
    encoding: builderDashUtilLib.builderDashUtilLibStrings.hex,
    options: js.Any
  ): stdLib.Promise[java.lang.String] = js.native
}

