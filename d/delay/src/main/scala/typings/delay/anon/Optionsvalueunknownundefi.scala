package typings.delay.anon

import typings.delay.mod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined delay.delay.Options & {  value :unknown | undefined} */
@js.native
trait Optionsvalueunknownundefi extends js.Object {
  
  /**
  		An optional AbortSignal to abort the delay.
  		If aborted, the Promise will be rejected with an AbortError.
  		*/
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
  			Value to reject in the returned promise.
  			*/
  var value: js.UndefOr[js.Any] = js.native
}
object Optionsvalueunknownundefi {
  
  @scala.inline
  def apply(): Optionsvalueunknownundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsvalueunknownundefi]
  }
  
  @scala.inline
  implicit class OptionsvalueunknownundefiOps[Self <: Optionsvalueunknownundefi] (val x: Self) extends AnyVal {
    
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
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
