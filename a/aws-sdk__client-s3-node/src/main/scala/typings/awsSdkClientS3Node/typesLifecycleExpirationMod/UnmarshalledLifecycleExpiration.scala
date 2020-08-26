package typings.awsSdkClientS3Node.typesLifecycleExpirationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLifecycleExpiration extends LifecycleExpiration {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  @JSName("Date")
  var Date_UnmarshalledLifecycleExpiration: js.UndefOr[Date] = js.native
}

object UnmarshalledLifecycleExpiration {
  @scala.inline
  def apply(): UnmarshalledLifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledLifecycleExpiration]
  }
  @scala.inline
  implicit class UnmarshalledLifecycleExpirationOps[Self <: UnmarshalledLifecycleExpiration] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
  }
  
}

