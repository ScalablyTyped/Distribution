package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelism extends js.Object {
  /**
    * Number of in-application streams to create. For more information, see Limits. 
    */
  var Count: js.UndefOr[InputParallelismCount] = js.native
}

object InputParallelism {
  @scala.inline
  def apply(): InputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelism]
  }
  @scala.inline
  implicit class InputParallelismOps[Self <: InputParallelism] (val x: Self) extends AnyVal {
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
    def setCount(value: InputParallelismCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
  }
  
}

