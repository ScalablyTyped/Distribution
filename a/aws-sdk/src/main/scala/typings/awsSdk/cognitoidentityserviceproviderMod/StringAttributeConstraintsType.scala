package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringAttributeConstraintsType extends js.Object {
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.native
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.native
}

object StringAttributeConstraintsType {
  @scala.inline
  def apply(MaxLength: StringType = null, MinLength: StringType = null): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    if (MaxLength != null) __obj.updateDynamic("MaxLength")(MaxLength.asInstanceOf[js.Any])
    if (MinLength != null) __obj.updateDynamic("MinLength")(MinLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
}

