package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PercentPair extends js.Object {
  
  /**
    * The percentile.
    */
  var percent: js.UndefOr[Percent] = js.native
  
  /**
    * The value of the percentile.
    */
  var value: js.UndefOr[PercentValue] = js.native
}
object PercentPair {
  
  @scala.inline
  def apply(): PercentPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentPair]
  }
  
  @scala.inline
  implicit class PercentPairOps[Self <: PercentPair] (val x: Self) extends AnyVal {
    
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
    def setPercent(value: Percent): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setValue(value: PercentValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
