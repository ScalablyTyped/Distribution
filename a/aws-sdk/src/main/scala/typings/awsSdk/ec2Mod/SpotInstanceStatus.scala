package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceStatus extends StObject {
  
  /**
    * The status code. For a list of status codes, see Spot status codes in the Amazon EC2 User Guide for Linux Instances.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The description for the status code.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time of the most recent status update, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var UpdateTime: js.UndefOr[DateTime] = js.undefined
}
object SpotInstanceStatus {
  
  @scala.inline
  def apply(): SpotInstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStatus]
  }
  
  @scala.inline
  implicit class SpotInstanceStatusMutableBuilder[Self <: SpotInstanceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: DateTime): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
