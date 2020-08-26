package typings.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryService extends js.Object {
  var characteristics: js.Array[Characteristic] = js.native
  var uuid: String = js.native
}

object PrimaryService {
  @scala.inline
  def apply(characteristics: js.Array[Characteristic], uuid: String): PrimaryService = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryService]
  }
  @scala.inline
  implicit class PrimaryServiceOps[Self <: PrimaryService] (val x: Self) extends AnyVal {
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
    def setCharacteristicsVarargs(value: Characteristic*): Self = this.set("characteristics", js.Array(value :_*))
    @scala.inline
    def setCharacteristics(value: js.Array[Characteristic]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

