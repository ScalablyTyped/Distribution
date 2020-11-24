package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramEntry extends js.Object {
  
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.native
}
object HistogramEntry {
  
  @scala.inline
  def apply(): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramEntry]
  }
  
  @scala.inline
  implicit class HistogramEntryOps[Self <: HistogramEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
