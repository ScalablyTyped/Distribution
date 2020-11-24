package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextNumber extends js.Object {
  
  var nextNumber: Double = js.native
  
  var nextNumberIncrement: Double = js.native
  
  var stringPrefix: String = js.native
}
object NextNumber {
  
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): NextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextNumber]
  }
  
  @scala.inline
  implicit class NextNumberOps[Self <: NextNumber] (val x: Self) extends AnyVal {
    
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
    def setNextNumber(value: Double): Self = this.set("nextNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNumberIncrement(value: Double): Self = this.set("nextNumberIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringPrefix(value: String): Self = this.set("stringPrefix", value.asInstanceOf[js.Any])
  }
}
