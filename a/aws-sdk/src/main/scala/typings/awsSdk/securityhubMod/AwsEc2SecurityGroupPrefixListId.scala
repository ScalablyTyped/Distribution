package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupPrefixListId extends js.Object {
  
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2SecurityGroupPrefixListId {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupPrefixListId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupPrefixListId]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupPrefixListIdOps[Self <: AwsEc2SecurityGroupPrefixListId] (val x: Self) extends AnyVal {
    
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
    def setPrefixListId(value: NonEmptyString): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
  }
}
