package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Grantee extends js.Object {
  
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.native
}
object S3Grantee {
  
  @scala.inline
  def apply(): S3Grantee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grantee]
  }
  
  @scala.inline
  implicit class S3GranteeOps[Self <: S3Grantee] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NonEmptyMaxLength1024String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setIdentifier(value: NonEmptyMaxLength1024String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    
    @scala.inline
    def setTypeIdentifier(value: S3GranteeTypeIdentifier): Self = this.set("TypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeIdentifier: Self = this.set("TypeIdentifier", js.undefined)
  }
}
