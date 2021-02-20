package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppRequest extends StObject {
  
  /**
    * A Source object that specifies the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.native
  
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.native
  
  /**
    * The app's data source.
    */
  var DataSources: js.UndefOr[typings.awsSdk.opsworksMod.DataSources] = js.native
  
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The app virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.native
  
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instance. For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."  If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * The app name.
    */
  var Name: String = js.native
  
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.SslConfiguration] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
  
  /**
    * The app type. Each supported type is associated with a particular layer. For example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that are members of the corresponding layer. If your app isn't one of the standard types, or you prefer to implement your own Deploy recipes, specify other.
    */
  var Type: AppType = js.native
}
object CreateAppRequest {
  
  @scala.inline
  def apply(Name: String, StackId: String, Type: AppType): CreateAppRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit class CreateAppRequestMutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSource(value: Source): Self = StObject.set(x, "AppSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSourceUndefined: Self = StObject.set(x, "AppSource", js.undefined)
    
    @scala.inline
    def setAttributes(value: AppAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setDataSources(value: DataSources): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "DataSources", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDomains(value: Strings): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: String*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    @scala.inline
    def setEnableSsl(value: Boolean): Self = StObject.set(x, "EnableSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSslUndefined: Self = StObject.set(x, "EnableSsl", js.undefined)
    
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "Environment", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortname(value: String): Self = StObject.set(x, "Shortname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortnameUndefined: Self = StObject.set(x, "Shortname", js.undefined)
    
    @scala.inline
    def setSslConfiguration(value: SslConfiguration): Self = StObject.set(x, "SslConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslConfigurationUndefined: Self = StObject.set(x, "SslConfiguration", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AppType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
