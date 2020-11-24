package typings.connectTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for timeout options.
  * @interface
  */
@js.native
trait TimeoutOptions extends js.Object {
  
  /**
    * @summary Controls if this module will "respond" in the form of forwarding an error.
    * @type {boolean}
    */
  var respond: js.UndefOr[Boolean] = js.native
}
object TimeoutOptions {
  
  @scala.inline
  def apply(): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutOptions]
  }
  
  @scala.inline
  implicit class TimeoutOptionsOps[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    
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
    def setRespond(value: Boolean): Self = this.set("respond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespond: Self = this.set("respond", js.undefined)
  }
}
