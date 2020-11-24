package typings.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeanstalkdHandleOptions extends js.Object {
  
  /** Backoff handling options */
  var backoff: js.UndefOr[BeanstalkdHandleBackoff] = js.native
  
  /** Total amount of tries including the first one. */
  var tries: js.UndefOr[Double] = js.native
  
  /** Total number of watcher handling this Tube simultaneously. */
  var width: js.UndefOr[Double] = js.native
}
object BeanstalkdHandleOptions {
  
  @scala.inline
  def apply(): BeanstalkdHandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeanstalkdHandleOptions]
  }
  
  @scala.inline
  implicit class BeanstalkdHandleOptionsOps[Self <: BeanstalkdHandleOptions] (val x: Self) extends AnyVal {
    
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
    def setBackoff(value: BeanstalkdHandleBackoff): Self = this.set("backoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    
    @scala.inline
    def setTries(value: Double): Self = this.set("tries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTries: Self = this.set("tries", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
