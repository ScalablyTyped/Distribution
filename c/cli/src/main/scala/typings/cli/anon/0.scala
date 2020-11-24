package typings.cli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends js.Object {
  
  var `0`: String | Boolean = js.native
  
  var `1`: String = js.native
  
  var `2`: js.UndefOr[String] = js.native
  
  var `3`: js.UndefOr[js.Any] = js.native
}
object `0` {
  
  @scala.inline
  def apply(`0`: String | Boolean, `1`: String): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    
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
    def set0(value: String | Boolean): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    
    @scala.inline
    def set3(value: js.Any): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
  }
}
