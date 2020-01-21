package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  /**
    * The identifier for the entity.
    */
  var Identifier: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Identifier] = js.native
  /**
    * The type of entity.
    */
  var Type: EntityType = js.native
}

object Entity {
  @scala.inline
  def apply(Type: EntityType, Identifier: Identifier = null): Entity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

