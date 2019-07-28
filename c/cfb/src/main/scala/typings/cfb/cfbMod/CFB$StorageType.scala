package typings.cfb.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFB$StorageType extends js.Object

@JSImport("cfb", "CFB$StorageType")
@js.native
object CFB$StorageType extends js.Object {
  @js.native
  sealed trait fat extends CFB$StorageType
  
  @js.native
  sealed trait minifat extends CFB$StorageType
  
  /* 0 */ val fat: typings.cfb.cfbMod.CFB$StorageType.fat with Double = js.native
  /* 1 */ val minifat: typings.cfb.cfbMod.CFB$StorageType.minifat with Double = js.native
  @JSBracketAccess
  @JSName("CFB$StorageType")
  def apply(value: Double): js.UndefOr[CFB$StorageType with Double] = js.native
}

