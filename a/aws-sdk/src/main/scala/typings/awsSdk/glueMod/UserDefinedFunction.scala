package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedFunction extends js.Object {
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.native
  /**
    * The time at which the function was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
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

object UserDefinedFunction {
  @scala.inline
  def apply(
    ClassName: NameString = null,
    CreateTime: Timestamp = null,
    FunctionName: NameString = null,
    OwnerName: NameString = null,
    OwnerType: PrincipalType = null,
    ResourceUris: ResourceUriList = null
  ): UserDefinedFunction = {
    val __obj = js.Dynamic.literal()
    if (ClassName != null) __obj.updateDynamic("ClassName")(ClassName.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName.asInstanceOf[js.Any])
    if (OwnerType != null) __obj.updateDynamic("OwnerType")(OwnerType.asInstanceOf[js.Any])
    if (ResourceUris != null) __obj.updateDynamic("ResourceUris")(ResourceUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunction]
  }
}

