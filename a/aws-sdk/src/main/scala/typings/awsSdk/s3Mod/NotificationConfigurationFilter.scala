package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfigurationFilter extends StObject {
  
  var Key: js.UndefOr[S3KeyFilter] = js.native
}
object NotificationConfigurationFilter {
  
  @scala.inline
  def apply(): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
  
  @scala.inline
  implicit class NotificationConfigurationFilterMutableBuilder[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: S3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
