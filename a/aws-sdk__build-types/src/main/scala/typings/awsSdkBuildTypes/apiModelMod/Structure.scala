package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Structure
  extends ShapeDef
     with ComplexShape
     with Shape {
  var error: js.UndefOr[Error] = js.native
  var exception: js.UndefOr[scala.Boolean] = js.native
  var fault: js.UndefOr[scala.Boolean] = js.native
  var members: StringDictionary[StructureMember] = js.native
  var payload: js.UndefOr[java.lang.String] = js.native
  var required: js.UndefOr[js.Array[java.lang.String]] = js.native
  var topLevel: js.UndefOr[input | output] = js.native
  @JSName("type")
  val type_Structure: structure = js.native
}

object Structure {
  @scala.inline
  def apply(members: StringDictionary[StructureMember], `type`: structure): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
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
    def setMembers(value: StringDictionary[StructureMember]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: structure): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setException(value: scala.Boolean): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    @scala.inline
    def setFault(value: scala.Boolean): Self = this.set("fault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFault: Self = this.set("fault", js.undefined)
    @scala.inline
    def setPayload(value: java.lang.String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: java.lang.String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[java.lang.String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTopLevel(value: input | output): Self = this.set("topLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLevel: Self = this.set("topLevel", js.undefined)
  }
  
}

