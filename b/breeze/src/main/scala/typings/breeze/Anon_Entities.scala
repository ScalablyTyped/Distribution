package typings.breeze

import org.scalablytyped.runtime.StringDictionary
import typings.breeze.breeze.Entity
import typings.breeze.breeze.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entities extends js.Object {
  var entities: js.Array[Entity]
  var tempKeyMapping: StringDictionary[EntityKey]
}

object Anon_Entities {
  @scala.inline
  def apply(entities: js.Array[Entity], tempKeyMapping: StringDictionary[EntityKey]): Anon_Entities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], tempKeyMapping = tempKeyMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Entities]
  }
}

