package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends StObject {
  
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
  implicit class LoggingMutableBuilder[Self <: Logging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterLogging(value: LogSetups): Self = StObject.set(x, "clusterLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterLoggingUndefined: Self = StObject.set(x, "clusterLogging", js.undefined)
    
    @scala.inline
    def setClusterLoggingVarargs(value: LogSetup*): Self = StObject.set(x, "clusterLogging", js.Array(value :_*))
  }
}
