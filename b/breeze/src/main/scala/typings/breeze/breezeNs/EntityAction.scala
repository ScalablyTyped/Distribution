package typings.breeze.breezeNs

import typings.breeze.breezeNs.coreNs.EnumSymbol
import typings.breeze.breezeNs.coreNs.IEnum
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

object EntityAction {
  @scala.inline
  def apply(
    AcceptChanges: EntityActionSymbol,
    Attach: EntityActionSymbol,
    AttachOnImport: EntityActionSymbol,
    AttachOnQuery: EntityActionSymbol,
    Clear: EntityActionSymbol,
    Detach: EntityActionSymbol,
    EntityStateChange: EntityActionSymbol,
    MergeOnImport: EntityActionSymbol,
    MergeOnQuery: EntityActionSymbol,
    MergeOnSave: EntityActionSymbol,
    PropertyChange: EntityActionSymbol,
    RejectChanges: EntityActionSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityAction = {
    val __obj = js.Dynamic.literal(AcceptChanges = AcceptChanges, Attach = Attach, AttachOnImport = AttachOnImport, AttachOnQuery = AttachOnQuery, Clear = Clear, Detach = Detach, EntityStateChange = EntityStateChange, MergeOnImport = MergeOnImport, MergeOnQuery = MergeOnQuery, MergeOnSave = MergeOnSave, PropertyChange = PropertyChange, RejectChanges = RejectChanges, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[EntityAction]
  }
}

