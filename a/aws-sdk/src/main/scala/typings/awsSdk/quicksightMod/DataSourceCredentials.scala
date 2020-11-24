package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceCredentials extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When CopySourceArn is not null, the credential pair from the data source in the ARN is used as the credentials for the DataSourceCredentials structure.
    */
  var CopySourceArn: js.UndefOr[typings.awsSdk.quicksightMod.CopySourceArn] = js.native
  
  /**
    * Credential pair. For more information, see CredentialPair.
    */
  var CredentialPair: js.UndefOr[typings.awsSdk.quicksightMod.CredentialPair] = js.native
}
object DataSourceCredentials {
  
  @scala.inline
  def apply(): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceCredentials]
  }
  
  @scala.inline
  implicit class DataSourceCredentialsOps[Self <: DataSourceCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopySourceArn(value: CopySourceArn): Self = this.set("CopySourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceArn: Self = this.set("CopySourceArn", js.undefined)
    
    @scala.inline
    def setCredentialPair(value: CredentialPair): Self = this.set("CredentialPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialPair: Self = this.set("CredentialPair", js.undefined)
  }
}
