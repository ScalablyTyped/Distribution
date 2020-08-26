package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonPrefix extends js.Object {
  /**
    * Container for the specified common prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
}

object CommonPrefix {
  @scala.inline
  def apply(): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonPrefix]
  }
  @scala.inline
  implicit class CommonPrefixOps[Self <: CommonPrefix] (val x: Self) extends AnyVal {
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
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

