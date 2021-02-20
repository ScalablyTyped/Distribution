package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogTargetConfiguration extends StObject {
  
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.native
}
object LogTargetConfiguration {
  
  @scala.inline
  def apply(): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogTargetConfiguration]
  }
  
  @scala.inline
  implicit class LogTargetConfigurationMutableBuilder[Self <: LogTargetConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogTarget(value: LogTarget): Self = StObject.set(x, "logTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTargetUndefined: Self = StObject.set(x, "logTarget", js.undefined)
  }
}
