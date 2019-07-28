package typings.commonDashErrors.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "AlreadyInUseError")
@js.native
class AlreadyInUseError protected () extends ErrorConstructor {
  /**
    * @param entityName the entity that owns the protected resource
    * @param args       the fields or attributes that are already in use
    */
  def this(entityName: String, args: String*) = this()
}

