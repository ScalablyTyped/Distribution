package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterRequest extends js.Object {
  /**
    * The name of the parameter you want to query.
    */
  var Name: PSParameterName = js.native
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.native
}

object GetParameterRequest {
  @scala.inline
  def apply(Name: PSParameterName): GetParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterRequest]
  }
  @scala.inline
  implicit class GetParameterRequestOps[Self <: GetParameterRequest] (val x: Self) extends AnyVal {
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
    def setName(value: PSParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithDecryption(value: Boolean): Self = this.set("WithDecryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithDecryption: Self = this.set("WithDecryption", js.undefined)
  }
  
}

