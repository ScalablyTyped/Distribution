package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Factory")
@js.native
class Factory protected () extends js.Object {
  /**
    * Create the factory.
    */
  def this(modelManager: ModelManager) = this()
  /**
    * Create a new Concept with a given namespace and type name.
    * @throws {TypeNotFoundException} if the type is not registered with the ModelManager
    */
  def newConcept(ns: java.lang.String, `type`: java.lang.String): Resource = js.native
  def newConcept(
    ns: java.lang.String,
    `type`: java.lang.String,
    options: composerDashConcertoLib.Anon_DisableValidation
  ): Resource = js.native
  /**
    * Create a new event object. The identifier of the event is
    * set to a UUID.
    */
  def newEvent(ns: java.lang.String, `type`: java.lang.String): Resource = js.native
  def newEvent(ns: java.lang.String, `type`: java.lang.String, id: java.lang.String): Resource = js.native
  def newEvent(
    ns: java.lang.String,
    `type`: java.lang.String,
    id: java.lang.String,
    options: composerDashConcertoLib.Anon_AllowEmptyIdGenerate
  ): Resource = js.native
  /**
    * Create a new Relationship with a given namespace, type and identifier.
    * A relationship is a typed pointer to an instance. I.e the relationship
    * with `namespace = 'org.example'`, `type = 'Vehicle'` and `id = 'ABC' creates`
    * a pointer that points at an instance of org.example.Vehicle with the id
    * ABC.
    * @throws {TypeNotFoundException} if the type is not registered with the ModelManager
    */
  def newRelationship(ns: java.lang.String, `type`: java.lang.String, id: java.lang.String): Relationship = js.native
  /**
    * Create a new Resource with a given namespace, type name and id.
    * @throws {TypeNotFoundException} if the type is not registered with the ModelManager
    */
  def newResource(ns: java.lang.String, `type`: java.lang.String, id: java.lang.String): Resource = js.native
  def newResource(
    ns: java.lang.String,
    `type`: java.lang.String,
    id: java.lang.String,
    options: composerDashConcertoLib.Anon_AllowEmptyId
  ): Resource = js.native
  /**
    * Create a new transaction object. The identifier of the transaction is
    * set to a UUID.
    */
  def newTransaction(ns: java.lang.String, `type`: java.lang.String): Resource = js.native
  def newTransaction(ns: java.lang.String, `type`: java.lang.String, id: java.lang.String): Resource = js.native
  def newTransaction(
    ns: java.lang.String,
    `type`: java.lang.String,
    id: java.lang.String,
    options: composerDashConcertoLib.Anon_AllowEmptyIdGenerate
  ): Resource = js.native
}

