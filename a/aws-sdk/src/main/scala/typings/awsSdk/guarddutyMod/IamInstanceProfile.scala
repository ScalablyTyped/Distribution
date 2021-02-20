package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamInstanceProfile extends StObject {
  
  /**
    * The profile ARN of the EC2 instance.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The profile ID of the EC2 instance.
    */
  var Id: js.UndefOr[String] = js.native
}
object IamInstanceProfile {
  
  @scala.inline
  def apply(): IamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfile]
  }
  
  @scala.inline
  implicit class IamInstanceProfileMutableBuilder[Self <: IamInstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
