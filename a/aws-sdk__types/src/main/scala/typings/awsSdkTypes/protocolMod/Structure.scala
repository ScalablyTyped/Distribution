package typings.awsSdkTypes.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Structure
  extends Shape
     with SerializationModel {
  var exceptionCode: js.UndefOr[java.lang.String] = js.native
  var exceptionType: js.UndefOr[java.lang.String] = js.native
  var members: StringDictionary[Member] = js.native
  var payload: js.UndefOr[java.lang.String] = js.native
  var required: js.Array[java.lang.String] = js.native
  @JSName("type")
  var type_Structure: structure = js.native
}

object Structure {
  @scala.inline
  def apply(members: StringDictionary[Member], required: js.Array[java.lang.String], `type`: structure): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure]
  }
  @scala.inline
  implicit class StructureOps[Self <: Structure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMembers(value: StringDictionary[Member]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredVarargs(value: java.lang.String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[java.lang.String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: structure): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionCode(value: java.lang.String): Self = this.set("exceptionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionCode: Self = this.set("exceptionCode", js.undefined)
    @scala.inline
    def setExceptionType(value: java.lang.String): Self = this.set("exceptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionType: Self = this.set("exceptionType", js.undefined)
    @scala.inline
    def setPayload(value: java.lang.String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

