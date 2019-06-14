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
  
  /* 0 */ val fat: fat with scala.Double = js.native
  /* 1 */ val minifat: minifat with scala.Double = js.native
  @JSBracketAccess
  @JSName("CFB$StorageType")
  def apply(value: scala.Double): js.UndefOr[cfbLib.cfbMod.CFB$StorageType with scala.Double] = js.native
}

