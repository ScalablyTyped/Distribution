package typings.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityState extends IEnum {
  var Added: EntityStateSymbol
  var Deleted: EntityStateSymbol
  var Detached: EntityStateSymbol
  var Modified: EntityStateSymbol
  var Unchanged: EntityStateSymbol
}

@JSGlobal("breeze.EntityState")
@js.native
object EntityState extends TopLevel[EntityState]

