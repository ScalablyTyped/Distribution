package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogErroredRequests extends js.Object {
  
  var logErroredRequests: js.UndefOr[Boolean] = js.native
  
  var logNormalRequests: js.UndefOr[Boolean] = js.native
  
  var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.native
  
  var messageMaxParameterValueLength: js.UndefOr[Double] = js.native
  
  var messageMaxQueryLength: js.UndefOr[Double] = js.native
  
  var slowThreshold: js.UndefOr[Double] = js.native
}
object LogErroredRequests {
  
  @scala.inline
  def apply(): LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErroredRequests]
  }
  
  @scala.inline
  implicit class LogErroredRequestsOps[Self <: LogErroredRequests] (val x: Self) extends AnyVal {
    
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
    def setLogErroredRequests(value: Boolean): Self = this.set("logErroredRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogErroredRequests: Self = this.set("logErroredRequests", js.undefined)
    
    @scala.inline
    def setLogNormalRequests(value: Boolean): Self = this.set("logNormalRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogNormalRequests: Self = this.set("logNormalRequests", js.undefined)
    
    @scala.inline
    def setMessageMaxErrorStackTraceLength(value: Double): Self = this.set("messageMaxErrorStackTraceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageMaxErrorStackTraceLength: Self = this.set("messageMaxErrorStackTraceLength", js.undefined)
    
    @scala.inline
    def setMessageMaxParameterValueLength(value: Double): Self = this.set("messageMaxParameterValueLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageMaxParameterValueLength: Self = this.set("messageMaxParameterValueLength", js.undefined)
    
    @scala.inline
    def setMessageMaxQueryLength(value: Double): Self = this.set("messageMaxQueryLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageMaxQueryLength: Self = this.set("messageMaxQueryLength", js.undefined)
    
    @scala.inline
    def setSlowThreshold(value: Double): Self = this.set("slowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowThreshold: Self = this.set("slowThreshold", js.undefined)
  }
}
