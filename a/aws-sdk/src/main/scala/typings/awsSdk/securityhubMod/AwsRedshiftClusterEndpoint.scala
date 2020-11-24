package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterEndpoint extends js.Object {
  
  /**
    * The DNS address of the cluster.
    */
  var Address: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The port that the database engine listens on.
    */
  var Port: js.UndefOr[Integer] = js.native
}
object AwsRedshiftClusterEndpoint {
  
  @scala.inline
  def apply(): AwsRedshiftClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterEndpoint]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterEndpointOps[Self <: AwsRedshiftClusterEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: NonEmptyString): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
}
