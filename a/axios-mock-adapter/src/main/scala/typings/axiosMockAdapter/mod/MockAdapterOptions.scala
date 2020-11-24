package typings.axiosMockAdapter.mod

import typings.axiosMockAdapter.axiosMockAdapterStrings.passthrough
import typings.axiosMockAdapter.axiosMockAdapterStrings.throwException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockAdapterOptions extends js.Object {
  
  var delayResponse: js.UndefOr[Double] = js.native
  
  var onNoMatch: js.UndefOr[passthrough | throwException] = js.native
}
object MockAdapterOptions {
  
  @scala.inline
  def apply(): MockAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockAdapterOptions]
  }
  
  @scala.inline
  implicit class MockAdapterOptionsOps[Self <: MockAdapterOptions] (val x: Self) extends AnyVal {
    
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
    def setDelayResponse(value: Double): Self = this.set("delayResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayResponse: Self = this.set("delayResponse", js.undefined)
    
    @scala.inline
    def setOnNoMatch(value: passthrough | throwException): Self = this.set("onNoMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnNoMatch: Self = this.set("onNoMatch", js.undefined)
  }
}
