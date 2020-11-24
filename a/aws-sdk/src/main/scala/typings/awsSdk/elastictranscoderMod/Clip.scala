package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clip extends js.Object {
  
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typings.awsSdk.elastictranscoderMod.TimeSpan] = js.native
}
object Clip {
  
  @scala.inline
  def apply(): Clip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clip]
  }
  
  @scala.inline
  implicit class ClipOps[Self <: Clip] (val x: Self) extends AnyVal {
    
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
    def setTimeSpan(value: TimeSpan): Self = this.set("TimeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSpan: Self = this.set("TimeSpan", js.undefined)
  }
}
