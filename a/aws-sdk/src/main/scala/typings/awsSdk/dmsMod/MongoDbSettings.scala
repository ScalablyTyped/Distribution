package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoDbSettings extends StObject {
  
  /**
    *  The authentication mechanism you use to access the MongoDB source endpoint. For the default value, in MongoDB version 2.x, "default" is "mongodb_cr". For MongoDB version 3.x or later, "default" is "scram_sha_1". This setting isn't used when AuthType is set to "no".
    */
  var AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined
  
  /**
    *  The MongoDB database name. This setting isn't used when AuthType is set to "no".  The default is "admin".
    */
  var AuthSource: js.UndefOr[String] = js.undefined
  
  /**
    *  The authentication type you use to access the MongoDB source endpoint. When when set to "no", user name and password parameters are not used and can be empty. 
    */
  var AuthType: js.UndefOr[AuthTypeValue] = js.undefined
  
  /**
    *  The database name on the MongoDB source endpoint. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    *  Indicates the number of documents to preview to determine the document organization. Use this setting when NestingLevel is set to "one".  Must be a positive value greater than 0. Default value is 1000.
    */
  var DocsToInvestigate: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies the document ID. Use this setting when NestingLevel is set to "none".  Default value is "false". 
    */
  var ExtractDocId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies either document or table mode.  Default value is "none". Specify "none" to use document mode. Specify "one" to use table mode.
    */
  var NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined
  
  /**
    *  The password for the user account you use to access the MongoDB source endpoint. 
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    *  The port value for the MongoDB source endpoint. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    *  The name of the server on the MongoDB source endpoint. 
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * The user name you use to access the MongoDB source endpoint. 
    */
  var Username: js.UndefOr[String] = js.undefined
}
object MongoDbSettings {
  
  @scala.inline
  def apply(): MongoDbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDbSettings]
  }
  
  @scala.inline
  implicit class MongoDbSettingsMutableBuilder[Self <: MongoDbSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthMechanism(value: AuthMechanismValue): Self = StObject.set(x, "AuthMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMechanismUndefined: Self = StObject.set(x, "AuthMechanism", js.undefined)
    
    @scala.inline
    def setAuthSource(value: String): Self = StObject.set(x, "AuthSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSourceUndefined: Self = StObject.set(x, "AuthSource", js.undefined)
    
    @scala.inline
    def setAuthType(value: AuthTypeValue): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTypeUndefined: Self = StObject.set(x, "AuthType", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDocsToInvestigate(value: String): Self = StObject.set(x, "DocsToInvestigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsToInvestigateUndefined: Self = StObject.set(x, "DocsToInvestigate", js.undefined)
    
    @scala.inline
    def setExtractDocId(value: String): Self = StObject.set(x, "ExtractDocId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractDocIdUndefined: Self = StObject.set(x, "ExtractDocId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: NestingLevelValue): Self = StObject.set(x, "NestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "NestingLevel", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
