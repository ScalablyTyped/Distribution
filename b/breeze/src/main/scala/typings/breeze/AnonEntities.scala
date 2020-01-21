package typings.breeze

import org.scalablytyped.runtime.StringDictionary
import typings.breeze.breeze.Entity
import typings.breeze.breeze.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntities extends js.Object {
  var entities: js.Array[Entity]
  var tempKeyMapping: StringDictionary[EntityKey]
}

object AnonEntities {
  @scala.inline
  def apply(entities: js.Array[Entity], tempKeyMapping: StringDictionary[EntityKey]): AnonEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], tempKeyMapping = tempKeyMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntities]
  }
}

