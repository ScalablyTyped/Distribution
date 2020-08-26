package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileIdentifier extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileArn = js.native
  /**
    * The name you have given to the security profile.
    */
  var name: SecurityProfileName = js.native
}

object SecurityProfileIdentifier {
  @scala.inline
  def apply(arn: SecurityProfileArn, name: SecurityProfileName): SecurityProfileIdentifier = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileIdentifier]
  }
  @scala.inline
  implicit class SecurityProfileIdentifierOps[Self <: SecurityProfileIdentifier] (val x: Self) extends AnyVal {
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
    def setArn(value: SecurityProfileArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: SecurityProfileName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

