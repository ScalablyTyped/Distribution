package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityState
  extends breezeLib.breezeNs.coreNs.IEnum {
  var Added: EntityStateSymbol
  var Deleted: EntityStateSymbol
  var Detached: EntityStateSymbol
  var Modified: EntityStateSymbol
  var Unchanged: EntityStateSymbol
}

object EntityState {
  @scala.inline
  def apply(
    Added: EntityStateSymbol,
    Deleted: EntityStateSymbol,
    Detached: EntityStateSymbol,
    Modified: EntityStateSymbol,
    Unchanged: EntityStateSymbol,
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, breezeLib.breezeNs.coreNs.EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]]
  ): EntityState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Added")(Added)
    __obj.updateDynamic("Deleted")(Deleted)
    __obj.updateDynamic("Detached")(Detached)
    __obj.updateDynamic("Modified")(Modified)
    __obj.updateDynamic("Unchanged")(Unchanged)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("fromName")(fromName)
    __obj.updateDynamic("getNames")(getNames)
    __obj.updateDynamic("getSymbols")(getSymbols)
    __obj.asInstanceOf[EntityState]
  }
}

