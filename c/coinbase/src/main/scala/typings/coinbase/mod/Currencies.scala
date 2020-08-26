package typings.coinbase.mod

import typings.coinbase.anon.Minsize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currencies extends js.Object {
  var data: js.Array[Minsize] = js.native
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[Minsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
  @scala.inline
  implicit class CurrenciesOps[Self <: Currencies] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Minsize*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Minsize]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

