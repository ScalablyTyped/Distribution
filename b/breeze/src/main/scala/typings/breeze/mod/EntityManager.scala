package typings.breeze.mod

import typings.breeze.AnonMergeStrategy
import typings.breeze.breeze.EntityManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends typings.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}

/* static members */
@JSImport("breeze", "EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): typings.breeze.breeze.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: AnonMergeStrategy): typings.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String): typings.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String, config: AnonMergeStrategy): typings.breeze.breeze.EntityManager = js.native
}

