package typings.awsSdkTypes.unmarshallerMod

import typings.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyParser[SerializedType] extends js.Object {
  /**
    * Convert the provided input into the shape described in the supplied
    * serialization model.
    *
    * @param shape A serialization model describing the expected shape of the
    *              value supplied as `input`.
    * @param input The value to parse
    */
  def parse[OutputType](shape: Member, input: SerializedType): OutputType = js.native
}

object BodyParser {
  @scala.inline
  def apply[SerializedType](parse: (Member, SerializedType) => js.Any): BodyParser[SerializedType] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[BodyParser[SerializedType]]
  }
  @scala.inline
  implicit class BodyParserOps[Self <: BodyParser[_], SerializedType] (val x: Self with BodyParser[SerializedType]) extends AnyVal {
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
    def setParse(value: (Member, SerializedType) => js.Any): Self = this.set("parse", js.Any.fromFunction2(value))
  }
  
}

