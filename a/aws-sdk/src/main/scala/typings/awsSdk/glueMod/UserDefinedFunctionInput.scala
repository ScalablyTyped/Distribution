package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedFunctionInput extends js.Object {
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.native
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.native
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.native
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.native
}

object UserDefinedFunctionInput {
  @scala.inline
  def apply(): UserDefinedFunctionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionInput]
  }
  @scala.inline
  implicit class UserDefinedFunctionInputOps[Self <: UserDefinedFunctionInput] (val x: Self) extends AnyVal {
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
    def setClassName(value: NameString): Self = this.set("ClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("ClassName", js.undefined)
    @scala.inline
    def setFunctionName(value: NameString): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("FunctionName", js.undefined)
    @scala.inline
    def setOwnerName(value: NameString): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerName: Self = this.set("OwnerName", js.undefined)
    @scala.inline
    def setOwnerType(value: PrincipalType): Self = this.set("OwnerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerType: Self = this.set("OwnerType", js.undefined)
    @scala.inline
    def setResourceUrisVarargs(value: ResourceUri*): Self = this.set("ResourceUris", js.Array(value :_*))
    @scala.inline
    def setResourceUris(value: ResourceUriList): Self = this.set("ResourceUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUris: Self = this.set("ResourceUris", js.undefined)
  }
  
}

