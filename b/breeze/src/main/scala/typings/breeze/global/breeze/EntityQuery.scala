package typings.breeze.global.breeze

import typings.breeze.breeze.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityQuery")
@js.native
class EntityQuery ()
  extends typings.breeze.breeze.EntityQuery {
  def this(resourceName: String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}
/* static members */
object EntityQuery {
  
  @JSGlobal("breeze.EntityQuery.from")
  @js.native
  def from(resourceName: String): typings.breeze.breeze.EntityQuery = js.native
  
  @JSGlobal("breeze.EntityQuery.fromEntities")
  @js.native
  def fromEntities(entities: js.Array[Entity]): typings.breeze.breeze.EntityQuery = js.native
  @JSGlobal("breeze.EntityQuery.fromEntities")
  @js.native
  def fromEntities(entity: Entity): typings.breeze.breeze.EntityQuery = js.native
  
  @JSGlobal("breeze.EntityQuery.fromEntityKey")
  @js.native
  def fromEntityKey(entityKey: typings.breeze.breeze.EntityKey): typings.breeze.breeze.EntityQuery = js.native
  
  @JSGlobal("breeze.EntityQuery.fromEntityNavigation")
  @js.native
  def fromEntityNavigation(entity: Entity, navigationProperty: typings.breeze.breeze.NavigationProperty): typings.breeze.breeze.EntityQuery = js.native
}
