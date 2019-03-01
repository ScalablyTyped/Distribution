package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entities extends js.Object {
  var entities: js.Array[breezeLib.breezeNs.Entity]
  var tempKeyMapping: org.scalablytyped.runtime.StringDictionary[breezeLib.breezeNs.EntityKey]
}

object Anon_Entities {
  @scala.inline
  def apply(
    entities: js.Array[breezeLib.breezeNs.Entity],
    tempKeyMapping: org.scalablytyped.runtime.StringDictionary[breezeLib.breezeNs.EntityKey]
  ): Anon_Entities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entities")(entities)
    __obj.updateDynamic("tempKeyMapping")(tempKeyMapping)
    __obj.asInstanceOf[Anon_Entities]
  }
}

