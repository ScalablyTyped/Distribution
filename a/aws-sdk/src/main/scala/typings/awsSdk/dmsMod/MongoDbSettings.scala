package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoDbSettings extends js.Object {
  
  /**
    *  The authentication mechanism you use to access the MongoDB source endpoint. For the default value, in MongoDB version 2.x, "default" is "mongodb_cr". For MongoDB version 3.x or later, "default" is "scram_sha_1". This setting isn't used when AuthType is set to "no".
    */
  var AuthMechanism: js.UndefOr[AuthMechanismValue] = js.native
  
  /**
    *  The MongoDB database name. This setting isn't used when AuthType is set to "no".  The default is "admin".
    */
  var AuthSource: js.UndefOr[String] = js.native
  
  /**
    *  The authentication type you use to access the MongoDB source endpoint. When when set to "no", user name and password parameters are not used and can be empty. 
    */
  var AuthType: js.UndefOr[AuthTypeValue] = js.native
  
  /**
    *  The database name on the MongoDB source endpoint. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    *  Indicates the number of documents to preview to determine the document organization. Use this setting when NestingLevel is set to "one".  Must be a positive value greater than 0. Default value is 1000.
    */
  var DocsToInvestigate: js.UndefOr[String] = js.native
  
  /**
    *  Specifies the document ID. Use this setting when NestingLevel is set to "none".  Default value is "false". 
    */
  var ExtractDocId: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    *  Specifies either document or table mode.  Default value is "none". Specify "none" to use document mode. Specify "one" to use table mode.
    */
  var NestingLevel: js.UndefOr[NestingLevelValue] = js.native
  
  /**
    *  The password for the user account you use to access the MongoDB source endpoint. 
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    *  The port value for the MongoDB source endpoint. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    *  The name of the server on the MongoDB source endpoint. 
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * The user name you use to access the MongoDB source endpoint. 
    */
  var Username: js.UndefOr[String] = js.native
}
object MongoDbSettings {
  
  @scala.inline
  def apply(): MongoDbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDbSettings]
  }
  
  @scala.inline
  implicit class MongoDbSettingsOps[Self <: MongoDbSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthMechanism(value: AuthMechanismValue): Self = this.set("AuthMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMechanism: Self = this.set("AuthMechanism", js.undefined)
    
    @scala.inline
    def setAuthSource(value: String): Self = this.set("AuthSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSource: Self = this.set("AuthSource", js.undefined)
    
    @scala.inline
    def setAuthType(value: AuthTypeValue): Self = this.set("AuthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthType: Self = this.set("AuthType", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDocsToInvestigate(value: String): Self = this.set("DocsToInvestigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocsToInvestigate: Self = this.set("DocsToInvestigate", js.undefined)
    
    @scala.inline
    def setExtractDocId(value: String): Self = this.set("ExtractDocId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractDocId: Self = this.set("ExtractDocId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: NestingLevelValue): Self = this.set("NestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevel: Self = this.set("NestingLevel", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
