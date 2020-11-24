package typings.awsSdkClientS3Node.typesLoggingEnabledMod

import typings.awsSdkClientS3Node.typesTargetGrantMod.UnmarshalledTargetGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledLoggingEnabled extends LoggingEnabled {
  
  /**
    * _TargetGrants shape
    */
  @JSName("TargetGrants")
  var TargetGrants_UnmarshalledLoggingEnabled: js.UndefOr[js.Array[UnmarshalledTargetGrant]] = js.native
}
object UnmarshalledLoggingEnabled {
  
  @scala.inline
  def apply(TargetBucket: String, TargetPrefix: String): UnmarshalledLoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLoggingEnabled]
  }
  
  @scala.inline
  implicit class UnmarshalledLoggingEnabledOps[Self <: UnmarshalledLoggingEnabled] (val x: Self) extends AnyVal {
    
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
    def setTargetGrantsVarargs(value: UnmarshalledTargetGrant*): Self = this.set("TargetGrants", js.Array(value :_*))
    
    @scala.inline
    def setTargetGrants(value: js.Array[UnmarshalledTargetGrant]): Self = this.set("TargetGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGrants: Self = this.set("TargetGrants", js.undefined)
  }
}
