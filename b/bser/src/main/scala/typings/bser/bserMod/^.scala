package typings.bser.bserMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dumpToBuffer(`val`: js.Any): Buffer = js.native
  def loadFromBuffer(input: InputWrapper): AnyWrapper | js.Array[AnyWrapper] = js.native
}

