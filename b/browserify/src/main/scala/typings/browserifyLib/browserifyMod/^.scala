package typings
package browserifyLib.browserifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserify", JSImport.Namespace)
@js.native
class ^ () extends BrowserifyObject {
  def this(file: InputFile) = this()
  def this(files: js.Array[InputFile]) = this()
  def this(opts: Options) = this()
  def this(file: InputFile, opts: Options) = this()
  def this(files: js.Array[InputFile], opts: Options) = this()
}

@JSImport("browserify", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[BrowserifyConstructor]

