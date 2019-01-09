package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends breezeLib.breezeNs.EntityManager {
  def this(config: breezeLib.breezeNs.EntityManagerOptions) = this()
  def this(config: java.lang.String) = this()
}

@JSImport("breeze", "EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: breezeLib.Anon_Any): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedString: java.lang.String): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedString: java.lang.String, config: breezeLib.Anon_Any): breezeLib.breezeNs.EntityManager = js.native
}

