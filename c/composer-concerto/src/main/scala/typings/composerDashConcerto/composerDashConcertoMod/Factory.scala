package typings.composerDashConcerto.composerDashConcertoMod

import typings.composerDashConcerto.Anon_AllowEmptyId
import typings.composerDashConcerto.Anon_AllowEmptyIdGenerate
import typings.composerDashConcerto.Anon_DisableValidation
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
  def newConcept(ns: String, `type`: String): Resource = js.native
  def newConcept(ns: String, `type`: String, options: Anon_DisableValidation): Resource = js.native
  /**
    * Create a new event object. The identifier of the event is
    * set to a UUID.
    */
  def newEvent(ns: String, `type`: String): Resource = js.native
  def newEvent(ns: String, `type`: String, id: String): Resource = js.native
  def newEvent(ns: String, `type`: String, id: String, options: Anon_AllowEmptyIdGenerate): Resource = js.native
  /**
    * Create a new Relationship with a given namespace, type and identifier.
    * A relationship is a typed pointer to an instance. I.e the relationship
    * with `namespace = 'org.example'`, `type = 'Vehicle'` and `id = 'ABC' creates`
    * a pointer that points at an instance of org.example.Vehicle with the id
    * ABC.
    * @throws {TypeNotFoundException} if the type is not registered with the ModelManager
    */
  def newRelationship(ns: String, `type`: String, id: String): Relationship = js.native
  /**
    * Create a new Resource with a given namespace, type name and id.
    * @throws {TypeNotFoundException} if the type is not registered with the ModelManager
    */
  def newResource(ns: String, `type`: String, id: String): Resource = js.native
  def newResource(ns: String, `type`: String, id: String, options: Anon_AllowEmptyId): Resource = js.native
  /**
    * Create a new transaction object. The identifier of the transaction is
    * set to a UUID.
    */
  def newTransaction(ns: String, `type`: String): Resource = js.native
  def newTransaction(ns: String, `type`: String, id: String): Resource = js.native
  def newTransaction(ns: String, `type`: String, id: String, options: Anon_AllowEmptyIdGenerate): Resource = js.native
}

