package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FalsyOptions extends js.Object {
  var pool: js.Array[FalsyType] = js.native
}

object FalsyOptions {
  @scala.inline
  def apply(pool: js.Array[FalsyType]): FalsyOptions = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[FalsyOptions]
  }
  @scala.inline
  implicit class FalsyOptionsOps[Self <: FalsyOptions] (val x: Self) extends AnyVal {
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
    def setPoolVarargs(value: FalsyType*): Self = this.set("pool", js.Array(value :_*))
    @scala.inline
    def setPool(value: js.Array[FalsyType]): Self = this.set("pool", value.asInstanceOf[js.Any])
  }
  
}

