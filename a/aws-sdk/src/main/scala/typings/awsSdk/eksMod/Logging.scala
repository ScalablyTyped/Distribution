package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends js.Object {
  
  /**
    * The cluster control plane logging configuration for your cluster.
    */
  var clusterLogging: js.UndefOr[LogSetups] = js.native
}
object Logging {
  
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  @scala.inline
  implicit class LoggingOps[Self <: Logging] (val x: Self) extends AnyVal {
    
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
    def setClusterLoggingVarargs(value: LogSetup*): Self = this.set("clusterLogging", js.Array(value :_*))
    
    @scala.inline
    def setClusterLogging(value: LogSetups): Self = this.set("clusterLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterLogging: Self = this.set("clusterLogging", js.undefined)
  }
}
