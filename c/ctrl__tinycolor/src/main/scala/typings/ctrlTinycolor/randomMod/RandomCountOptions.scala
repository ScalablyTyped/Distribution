package typings.ctrlTinycolor.randomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomCountOptions extends RandomOptions {
  
  var count: js.UndefOr[Double | Null] = js.native
}
object RandomCountOptions {
  
  @scala.inline
  def apply(): RandomCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomCountOptions]
  }
  
  @scala.inline
  implicit class RandomCountOptionsOps[Self <: RandomCountOptions] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCountNull: Self = this.set("count", null)
  }
}
