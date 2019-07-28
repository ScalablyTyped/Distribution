package typings.breeze.breezeMod

import typings.breeze.Anon_Any
import typings.breeze.breezeNs.EntityManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends typings.breeze.breezeNs.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}

/* static members */
@JSImport("breeze", "EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): typings.breeze.breezeNs.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: Anon_Any): typings.breeze.breezeNs.EntityManager = js.native
  def importEntities(exportedString: String): typings.breeze.breezeNs.EntityManager = js.native
  def importEntities(exportedString: String, config: Anon_Any): typings.breeze.breezeNs.EntityManager = js.native
}

