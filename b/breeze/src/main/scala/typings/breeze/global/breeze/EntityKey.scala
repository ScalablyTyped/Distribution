package typings.breeze.global.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityKey")
@js.native
open class EntityKey protected ()
  extends StObject
     with typings.breeze.breeze.EntityKey {
  def this(entityType: typings.breeze.breeze.EntityType, keyValue: Any) = this()
  def this(entityType: typings.breeze.breeze.EntityType, keyValues: js.Array[Any]) = this()
  
  /* CompleteClass */
  var entityType: typings.breeze.breeze.EntityType = js.native
  
  /* CompleteClass */
  override def equals(entityKey: typings.breeze.breeze.EntityKey): Boolean = js.native
  
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
/* static members */
object EntityKey {
  
  @JSGlobal("breeze.EntityKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(k1: typings.breeze.breeze.EntityKey, k2: typings.breeze.breeze.EntityKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
