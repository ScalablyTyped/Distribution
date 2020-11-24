package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectAclOutput extends js.Object {
  
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typings.awsSdk.s3Mod.Grants] = js.native
  
  /**
    *  Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}
object GetObjectAclOutput {
  
  @scala.inline
  def apply(): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectAclOutput]
  }
  
  @scala.inline
  implicit class GetObjectAclOutputOps[Self <: GetObjectAclOutput] (val x: Self) extends AnyVal {
    
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
    def setGrantsVarargs(value: Grant*): Self = this.set("Grants", js.Array(value :_*))
    
    @scala.inline
    def setGrants(value: Grants): Self = this.set("Grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrants: Self = this.set("Grants", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
  }
}
