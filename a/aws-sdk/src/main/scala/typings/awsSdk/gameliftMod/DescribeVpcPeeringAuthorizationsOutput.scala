package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcPeeringAuthorizationsOutput extends StObject {
  
  /**
    * A collection of objects that describe all valid VPC peering operations for the current AWS account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.native
}
object DescribeVpcPeeringAuthorizationsOutput {
  
  @scala.inline
  def apply(): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
  
  @scala.inline
  implicit class DescribeVpcPeeringAuthorizationsOutputMutableBuilder[Self <: DescribeVpcPeeringAuthorizationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcPeeringAuthorizations(value: VpcPeeringAuthorizationList): Self = StObject.set(x, "VpcPeeringAuthorizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringAuthorizationsUndefined: Self = StObject.set(x, "VpcPeeringAuthorizations", js.undefined)
    
    @scala.inline
    def setVpcPeeringAuthorizationsVarargs(value: VpcPeeringAuthorization*): Self = StObject.set(x, "VpcPeeringAuthorizations", js.Array(value :_*))
  }
}
