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
    contains: js.Any => scala.Boolean,
    fromName: java.lang.String => breezeLib.breezeNs.coreNs.EnumSymbol,
    getNames: () => js.Array[java.lang.String],
    getSymbols: () => js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]
  ): EntityState = {
    val __obj = js.Dynamic.literal(Added = Added, Deleted = Deleted, Detached = Detached, Modified = Modified, Unchanged = Unchanged, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[EntityState]
  }
}

