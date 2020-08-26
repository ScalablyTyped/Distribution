package typings.bull.anon

import typings.bull.mod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[T] extends js.Object {
  var data: T = js.native
  var name: js.UndefOr[String] = js.native
  var opts: js.UndefOr[JobOptions] = js.native
}

object Data {
  @scala.inline
  def apply[T](data: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpts(value: JobOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
  
}

