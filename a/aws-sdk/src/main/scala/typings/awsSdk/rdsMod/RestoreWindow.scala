package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreWindow extends js.Object {
  
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[TStamp] = js.native
}
object RestoreWindow {
  
  @scala.inline
  def apply(): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreWindow]
  }
  
  @scala.inline
  implicit class RestoreWindowOps[Self <: RestoreWindow] (val x: Self) extends AnyVal {
    
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
    def setEarliestTime(value: TStamp): Self = this.set("EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestTime: Self = this.set("EarliestTime", js.undefined)
    
    @scala.inline
    def setLatestTime(value: TStamp): Self = this.set("LatestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestTime: Self = this.set("LatestTime", js.undefined)
  }
}
