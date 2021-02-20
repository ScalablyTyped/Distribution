package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogs extends StObject {
  
  var Enabled: boolean = js.native
  
  var LogGroup: js.UndefOr[string] = js.native
}
object CloudWatchLogs {
  
  @scala.inline
  def apply(Enabled: boolean): CloudWatchLogs = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogs]
  }
  
  @scala.inline
  implicit class CloudWatchLogsMutableBuilder[Self <: CloudWatchLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroup(value: string): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
  }
}
