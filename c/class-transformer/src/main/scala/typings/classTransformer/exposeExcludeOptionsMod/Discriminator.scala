package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discriminator extends js.Object {
  var property: String = js.native
  var subTypes: js.Array[JsonSubType] = js.native
}

object Discriminator {
  @scala.inline
  def apply(property: String, subTypes: js.Array[JsonSubType]): Discriminator = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discriminator]
  }
  @scala.inline
  implicit class DiscriminatorOps[Self <: Discriminator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTypesVarargs(value: JsonSubType*): Self = this.set("subTypes", js.Array(value :_*))
    @scala.inline
    def setSubTypes(value: js.Array[JsonSubType]): Self = this.set("subTypes", value.asInstanceOf[js.Any])
  }
  
}

