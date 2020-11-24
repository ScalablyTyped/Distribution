package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lags extends js.Object {
  
  /**
    * The LAGs.
    */
  var lags: js.UndefOr[LagList] = js.native
}
object Lags {
  
  @scala.inline
  def apply(): Lags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lags]
  }
  
  @scala.inline
  implicit class LagsOps[Self <: Lags] (val x: Self) extends AnyVal {
    
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
    def setLagsVarargs(value: Lag*): Self = this.set("lags", js.Array(value :_*))
    
    @scala.inline
    def setLags(value: LagList): Self = this.set("lags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLags: Self = this.set("lags", js.undefined)
  }
}
