package typings.breeze.breezeNs

import typings.breeze.breezeNs.coreNs.EnumSymbol
import typings.breeze.breezeNs.coreNs.IEnum
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

object EntityState {
  @scala.inline
  def apply(
    Added: EntityStateSymbol,
    Deleted: EntityStateSymbol,
    Detached: EntityStateSymbol,
    Modified: EntityStateSymbol,
    Unchanged: EntityStateSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityState = {
    val __obj = js.Dynamic.literal(Added = Added, Deleted = Deleted, Detached = Detached, Modified = Modified, Unchanged = Unchanged, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[EntityState]
  }
}

