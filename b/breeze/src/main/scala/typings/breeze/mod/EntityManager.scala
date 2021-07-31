package typings.breeze.mod

import typings.breeze.breeze.EntityManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends StObject
     with typings.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}
/* static members */
object EntityManager {
  
  @JSImport("breeze", "EntityManager")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def importEntities(exportedData: js.Object): typings.breeze.breeze.EntityManager = ^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedData.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.EntityManager]
  @scala.inline
  def importEntities(exportedData: js.Object, config: typings.breeze.anon.MergeStrategy): typings.breeze.breeze.EntityManager = (^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedData.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.EntityManager]
  @scala.inline
  def importEntities(exportedString: String): typings.breeze.breeze.EntityManager = ^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedString.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.EntityManager]
  @scala.inline
  def importEntities(exportedString: String, config: typings.breeze.anon.MergeStrategy): typings.breeze.breeze.EntityManager = (^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.EntityManager]
}
