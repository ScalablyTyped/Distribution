package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsConfiguration extends js.Object {
  
  /**
    * Whether CloudWatch Logs is enabled for a layer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of configuration options for CloudWatch Logs.
    */
  var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.native
}
object CloudWatchLogsConfiguration {
  
  @scala.inline
  def apply(): CloudWatchLogsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsConfiguration]
  }
  
  @scala.inline
  implicit class CloudWatchLogsConfigurationOps[Self <: CloudWatchLogsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setLogStreamsVarargs(value: CloudWatchLogsLogStream*): Self = this.set("LogStreams", js.Array(value :_*))
    
    @scala.inline
    def setLogStreams(value: CloudWatchLogsLogStreams): Self = this.set("LogStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreams: Self = this.set("LogStreams", js.undefined)
  }
}
