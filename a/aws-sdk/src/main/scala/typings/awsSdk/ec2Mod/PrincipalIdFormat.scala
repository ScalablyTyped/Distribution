package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrincipalIdFormat extends StObject {
  
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}
object PrincipalIdFormat {
  
  @scala.inline
  def apply(): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalIdFormat]
  }
  
  @scala.inline
  implicit class PrincipalIdFormatMutableBuilder[Self <: PrincipalIdFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setStatuses(value: IdFormatList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: IdFormat*): Self = StObject.set(x, "Statuses", js.Array(value :_*))
  }
}
