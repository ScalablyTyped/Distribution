package typings.breeze.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityKey")
@js.native
class EntityKey protected ()
  extends StObject
     with typings.breeze.breeze.EntityKey {
  def this(entityType: typings.breeze.breeze.EntityType, keyValue: js.Any) = this()
  def this(entityType: typings.breeze.breeze.EntityType, keyValues: js.Array[js.Any]) = this()
  
  /* CompleteClass */
  var entityType: typings.breeze.breeze.EntityType = js.native
  
  /* CompleteClass */
  override def equals(entityKey: typings.breeze.breeze.EntityKey): Boolean = js.native
  
  /* CompleteClass */
  var values: js.Array[js.Any] = js.native
}
/* static members */
object EntityKey {
  
  @JSImport("breeze", "EntityKey")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def equals(k1: typings.breeze.breeze.EntityKey, k2: typings.breeze.breeze.EntityKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
