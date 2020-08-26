package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBuildOutput extends js.Object {
  /**
    * The updated build resource.
    */
  var Build: js.UndefOr[typings.awsSdk.gameliftMod.Build] = js.native
}

object UpdateBuildOutput {
  @scala.inline
  def apply(): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBuildOutput]
  }
  @scala.inline
  implicit class UpdateBuildOutputOps[Self <: UpdateBuildOutput] (val x: Self) extends AnyVal {
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
    def setBuild(value: Build): Self = this.set("Build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("Build", js.undefined)
  }
  
}

