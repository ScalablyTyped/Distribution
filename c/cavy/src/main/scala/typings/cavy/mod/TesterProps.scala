package typings.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TesterProps extends js.Object {
  
  var clearAsyncStorage: js.UndefOr[Boolean] = js.native
  
  var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.native
  
  // Deprecated
  var sendReport: js.UndefOr[Boolean] = js.native
  
  var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]] = js.native
  
  var startDelay: js.UndefOr[Double] = js.native
  
  var store: TestHookStore = js.native
  
  var waitTime: js.UndefOr[Double] = js.native
}
object TesterProps {
  
  @scala.inline
  def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): TesterProps = {
    val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[TesterProps]
  }
  
  @scala.inline
  implicit class TesterPropsOps[Self <: TesterProps] (val x: Self) extends AnyVal {
    
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
    def setSpecsVarargs(value: (js.Function1[/* spec */ TestScope, Unit])*): Self = this.set("specs", js.Array(value :_*))
    
    @scala.inline
    def setSpecs(value: js.Array[js.Function1[/* spec */ TestScope, Unit]]): Self = this.set("specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: TestHookStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAsyncStorage(value: Boolean): Self = this.set("clearAsyncStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearAsyncStorage: Self = this.set("clearAsyncStorage", js.undefined)
    
    @scala.inline
    def setReporter(value: /* report */ TestReport => Unit): Self = this.set("reporter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setSendReport(value: Boolean): Self = this.set("sendReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendReport: Self = this.set("sendReport", js.undefined)
    
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
    
    @scala.inline
    def setWaitTime(value: Double): Self = this.set("waitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTime: Self = this.set("waitTime", js.undefined)
  }
}
