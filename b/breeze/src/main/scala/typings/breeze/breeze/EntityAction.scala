package typings.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAction extends IEnum {
  var AcceptChanges: EntityActionSymbol
  var Attach: EntityActionSymbol
  var AttachOnImport: EntityActionSymbol
  var AttachOnQuery: EntityActionSymbol
  var Clear: EntityActionSymbol
  var Detach: EntityActionSymbol
  var EntityStateChange: EntityActionSymbol
  var MergeOnImport: EntityActionSymbol
  var MergeOnQuery: EntityActionSymbol
  var MergeOnSave: EntityActionSymbol
  var PropertyChange: EntityActionSymbol
  var RejectChanges: EntityActionSymbol
}

@JSGlobal("breeze.EntityAction")
@js.native
object EntityAction extends TopLevel[EntityAction]

