package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Serializer")
@js.native
class Serializer protected () extends js.Object {
  /**
    * Create a Serializer.
    */
  def this(factory: Factory, modelManager: ModelManager) = this()
  /**
    * Create a {@link Resource} from a JavaScript any representation.
    * The JavaScript any should have been created by calling the
    * {@link Serializer#toJSON toJSON} API.
    *
    * The Resource is populated based on the JavaScript any.
    */
  def fromJSON(jsonany: js.Any): Resource = js.native
  def fromJSON(jsonany: js.Any, options: composerDashConcertoLib.Anon_AcceptResourcesForRelationships): Resource = js.native
  /**
    * Set the default options for the serializer.
    */
  def setDefaultOptions(newDefaultOptions: js.Any): scala.Unit = js.native
  /**
    * Convert a {@link Resource} to a JavaScript object suitable for long-term
    * peristent storage.
    * @throws {Error} - throws an exception if resource is not an instance of
    * Resource or fails validation.
    */
  def toJSON(resource: Resource): js.Any = js.native
  def toJSON(resource: Resource, options: composerDashConcertoLib.Anon_ConvertResourcesToRelationships): js.Any = js.native
}

