package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bumper extends js.Object {
  /**
    * The URL for the end bumper asset. 
    */
  var EndUrl: js.UndefOr[string] = js.native
  /**
    * The URL for the start bumper asset. 
    */
  var StartUrl: js.UndefOr[string] = js.native
}

object Bumper {
  @scala.inline
  def apply(): Bumper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bumper]
  }
  @scala.inline
  implicit class BumperOps[Self <: Bumper] (val x: Self) extends AnyVal {
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
    def setEndUrl(value: string): Self = this.set("EndUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndUrl: Self = this.set("EndUrl", js.undefined)
    @scala.inline
    def setStartUrl(value: string): Self = this.set("StartUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartUrl: Self = this.set("StartUrl", js.undefined)
  }
  
}

