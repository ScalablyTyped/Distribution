package typings.circuitBreakerJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var errorThreshold: js.UndefOr[Double] = js.native
  
  var numBuckets: js.UndefOr[Double] = js.native
  
  var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
  
  var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
  
  var timeoutDuration: js.UndefOr[Double] = js.native
  
  var volumeThreshold: js.UndefOr[Double] = js.native
  
  var windowDuration: js.UndefOr[Double] = js.native
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
    def setErrorThreshold(value: Double): Self = this.set("errorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorThreshold: Self = this.set("errorThreshold", js.undefined)
    
    @scala.inline
    def setNumBuckets(value: Double): Self = this.set("numBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumBuckets: Self = this.set("numBuckets", js.undefined)
    
    @scala.inline
    def setOnCircuitClose(value: /* m */ Metrics => Unit): Self = this.set("onCircuitClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCircuitClose: Self = this.set("onCircuitClose", js.undefined)
    
    @scala.inline
    def setOnCircuitOpen(value: /* m */ Metrics => Unit): Self = this.set("onCircuitOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCircuitOpen: Self = this.set("onCircuitOpen", js.undefined)
    
    @scala.inline
    def setTimeoutDuration(value: Double): Self = this.set("timeoutDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutDuration: Self = this.set("timeoutDuration", js.undefined)
    
    @scala.inline
    def setVolumeThreshold(value: Double): Self = this.set("volumeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeThreshold: Self = this.set("volumeThreshold", js.undefined)
    
    @scala.inline
    def setWindowDuration(value: Double): Self = this.set("windowDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowDuration: Self = this.set("windowDuration", js.undefined)
  }
}
