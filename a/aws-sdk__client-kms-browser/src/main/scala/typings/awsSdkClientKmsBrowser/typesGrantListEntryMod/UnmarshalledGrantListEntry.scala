package typings.awsSdkClientKmsBrowser.typesGrantListEntryMod

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typings.awsSdkClientKmsBrowser.typesGrantConstraintsMod.UnmarshalledGrantConstraints
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledGrantListEntry extends GrantListEntry {
  
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  @JSName("Constraints")
  var Constraints_UnmarshalledGrantListEntry: js.UndefOr[UnmarshalledGrantConstraints] = js.native
  
  /**
    * <p>The date and time when the grant was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledGrantListEntry: js.UndefOr[Date] = js.native
  
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  @JSName("Operations")
  var Operations_UnmarshalledGrantListEntry: js.UndefOr[
    js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]
  ] = js.native
}
object UnmarshalledGrantListEntry {
  
  @scala.inline
  def apply(): UnmarshalledGrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGrantListEntry]
  }
  
  @scala.inline
  implicit class UnmarshalledGrantListEntryOps[Self <: UnmarshalledGrantListEntry] (val x: Self) extends AnyVal {
    
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
    def setConstraints(value: UnmarshalledGrantConstraints): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("Constraints", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(
      value: (Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String)*
    ): Self = this.set("Operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(
      value: js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]
    ): Self = this.set("Operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("Operations", js.undefined)
  }
}
