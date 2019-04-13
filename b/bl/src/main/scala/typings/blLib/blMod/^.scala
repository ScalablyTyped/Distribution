package typings
package blLib.blMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bl", JSImport.Namespace)
@js.native
class ^ () extends BufferList {
  def this(callbackOrData: BufferList) = this()
  def this(callbackOrData: java.lang.String) = this()
  def this(callbackOrData: js.Array[nodeLib.Buffer | BufferList]) = this()
  def this(callbackOrData: js.Function2[/* err */ stdLib.Error, /* buffer */ nodeLib.Buffer, scala.Unit]) = this()
  def this(callbackOrData: nodeLib.Buffer) = this()
}

