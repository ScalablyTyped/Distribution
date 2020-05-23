package typings.bull.anon

import typings.bull.mod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T] extends js.Object {
  var data: T
  var name: js.UndefOr[String] = js.undefined
  var opts: js.UndefOr[JobOptions] = js.undefined
}

object Data {
  @scala.inline
  def apply[T](data: T, name: String = null, opts: JobOptions = null): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

