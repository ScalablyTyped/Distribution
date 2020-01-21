package typings.cfb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFBStorageType extends js.Object

@JSImport("cfb", "CFB$StorageType")
@js.native
object CFBStorageType extends js.Object {
  @js.native
  sealed trait fat extends CFBStorageType
  
  @js.native
  sealed trait minifat extends CFBStorageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFBStorageType with Double] = js.native
  /* 0 */ @js.native
  object fat extends TopLevel[fat with Double]
  
  /* 1 */ @js.native
  object minifat extends TopLevel[minifat with Double]
  
}

