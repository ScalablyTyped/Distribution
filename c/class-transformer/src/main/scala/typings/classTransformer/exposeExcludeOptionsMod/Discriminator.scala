package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discriminator extends js.Object {
  var property: String
  var subTypes: js.Array[JsonSubType]
}

object Discriminator {
  @scala.inline
  def apply(property: String, subTypes: js.Array[JsonSubType]): Discriminator = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discriminator]
  }
}

