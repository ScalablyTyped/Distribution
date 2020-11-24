package typings.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryServiceOptions extends js.Object {
  
  var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.native
  
  var uuid: String = js.native
}
object PrimaryServiceOptions {
  
  @scala.inline
  def apply(uuid: String): PrimaryServiceOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryServiceOptions]
  }
  
  @scala.inline
  implicit class PrimaryServiceOptionsOps[Self <: PrimaryServiceOptions] (val x: Self) extends AnyVal {
    
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicsVarargs(value: Characteristic*): Self = this.set("characteristics", js.Array(value :_*))
    
    @scala.inline
    def setCharacteristics(value: js.Array[Characteristic]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacteristics: Self = this.set("characteristics", js.undefined)
    
    @scala.inline
    def setCharacteristicsNull: Self = this.set("characteristics", null)
  }
}
