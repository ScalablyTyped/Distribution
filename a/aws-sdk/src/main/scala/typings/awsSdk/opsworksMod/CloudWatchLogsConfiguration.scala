package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsConfiguration extends StObject {
  
  /**
    * Whether CloudWatch Logs is enabled for a layer.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of configuration options for CloudWatch Logs.
    */
  var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.undefined
}
object CloudWatchLogsConfiguration {
  
  @scala.inline
  def apply(): CloudWatchLogsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsConfiguration]
  }
  
  @scala.inline
  implicit class CloudWatchLogsConfigurationMutableBuilder[Self <: CloudWatchLogsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setLogStreams(value: CloudWatchLogsLogStreams): Self = StObject.set(x, "LogStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamsUndefined: Self = StObject.set(x, "LogStreams", js.undefined)
    
    @scala.inline
    def setLogStreamsVarargs(value: CloudWatchLogsLogStream*): Self = StObject.set(x, "LogStreams", js.Array(value :_*))
  }
}
