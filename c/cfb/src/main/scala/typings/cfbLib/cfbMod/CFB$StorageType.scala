package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFB$StorageType extends js.Object

@JSImport("cfb", "CFB$StorageType")
@js.native
object CFB$StorageType extends js.Object {
  @js.native
  sealed trait fat
    extends cfbLib.cfbMod.CFB$StorageType
  
  @js.native
  sealed trait minifat
    extends cfbLib.cfbMod.CFB$StorageType
  
  val fat: fat with java.lang.String = js.native
  val minifat: minifat with java.lang.String = js.native
  @JSBracketAccess
  @JSName("CFB$StorageType")
  def apply(value: java.lang.String): js.UndefOr[cfbLib.cfbMod.CFB$StorageType with java.lang.String] = js.native
}

