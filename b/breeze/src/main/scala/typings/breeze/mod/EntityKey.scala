package typings.breeze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityKey")
@js.native
class EntityKey protected ()
  extends typings.breeze.breeze.EntityKey {
  def this(entityType: typings.breeze.breeze.EntityType, keyValue: js.Any) = this()
  def this(entityType: typings.breeze.breeze.EntityType, keyValues: js.Array[_]) = this()
}
/* static members */
@JSImport("breeze", "EntityKey")
@js.native
object EntityKey extends js.Object {
  
  def equals(k1: typings.breeze.breeze.EntityKey, k2: typings.breeze.breeze.EntityKey): Boolean = js.native
}
