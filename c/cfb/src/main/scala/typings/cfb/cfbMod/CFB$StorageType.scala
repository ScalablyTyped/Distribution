package typings.cfb.cfbMod

import org.scalablytyped.runtime.TopLevel
import typings.cfb.cfbMod.CFB$StorageType.fat
import typings.cfb.cfbMod.CFB$StorageType.minifat
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
  
  @JSBracketAccess
  @JSName("CFB$StorageType")
  def apply(value: Double): js.UndefOr[CFB$StorageType with Double] = js.native
  /* 0 */ @js.native
  object fat extends TopLevel[fat with Double]
  
  /* 1 */ @js.native
  object minifat extends TopLevel[minifat with Double]
  
}

