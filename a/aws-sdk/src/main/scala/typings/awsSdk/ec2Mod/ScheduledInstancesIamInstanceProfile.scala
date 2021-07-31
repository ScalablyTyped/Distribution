package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesIamInstanceProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN).
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ScheduledInstancesIamInstanceProfile {
  
  @scala.inline
  def apply(): ScheduledInstancesIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesIamInstanceProfile]
  }
  
  @scala.inline
  implicit class ScheduledInstancesIamInstanceProfileMutableBuilder[Self <: ScheduledInstancesIamInstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
