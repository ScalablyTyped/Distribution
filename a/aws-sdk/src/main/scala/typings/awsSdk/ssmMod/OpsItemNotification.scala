package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsItemNotification extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Arn: js.UndefOr[String] = js.native
}
object OpsItemNotification {
  
  @scala.inline
  def apply(): OpsItemNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemNotification]
  }
  
  @scala.inline
  implicit class OpsItemNotificationMutableBuilder[Self <: OpsItemNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
