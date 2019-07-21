package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Resource")
@js.native
class Resource protected () extends Identifiable {
  /**
    * This constructor should not be called directly.
    */
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: java.lang.String, `type`: java.lang.String, id: java.lang.String) = this()
  /**
    * Serialize this resource into a JavaScript object suitable for serialization to JSON,
    * using the default options for the serializer. If you need to set additional options
    * for the serializer, use the {@link Serializer#toJSON} method instead.
    */
  def toJSON(): js.Any = js.native
}

