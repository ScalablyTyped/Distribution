package typings.bluebirdRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var args: js.UndefOr[js.Any] = js.native
  
  var backoff: js.UndefOr[Double] = js.native
  
  var context: js.UndefOr[js.Any] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var max_interval: js.UndefOr[Double] = js.native
  
  var max_tries: js.UndefOr[Double] = js.native
  
  var predicate: js.UndefOr[js.Any] = js.native
  
  var throw_original: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setBackoff(value: Double): Self = this.set("backoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMax_interval(value: Double): Self = this.set("max_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_interval: Self = this.set("max_interval", js.undefined)
    
    @scala.inline
    def setMax_tries(value: Double): Self = this.set("max_tries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_tries: Self = this.set("max_tries", js.undefined)
    
    @scala.inline
    def setPredicate(value: js.Any): Self = this.set("predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    
    @scala.inline
    def setThrow_original(value: Boolean): Self = this.set("throw_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrow_original: Self = this.set("throw_original", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
