package typings.dayjs.toArrayMod.dayjsEsmAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dayjs extends js.Object {
  
  def toArray(): js.Array[Double] = js.native
}
object Dayjs {
  
  @scala.inline
  def apply(toArray: () => js.Array[Double]): Dayjs = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Dayjs]
  }
  
  @scala.inline
  implicit class DayjsOps[Self <: Dayjs] (val x: Self) extends AnyVal {
    
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
    def setToArray(value: () => js.Array[Double]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
