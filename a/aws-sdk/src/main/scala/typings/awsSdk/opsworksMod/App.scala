package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
  
  /**
    * A Source object that describes the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.undefined
  
  /**
    * The stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.undefined
  
  /**
    * When the app was created.
    */
  var CreatedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The app's data sources.
    */
  var DataSources: js.UndefOr[typings.awsSdk.opsworksMod.DataSources] = js.undefined
  
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The app vhost settings with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.undefined
  
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances. For more information, see  Environment Variables.   There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variable names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an exception (API) with an "Environment: is too large (maximum is 20 KB)" message. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    * The app name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.undefined
  
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.SslConfiguration] = js.undefined
  
  /**
    * The app stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The app type.
    */
  var Type: js.UndefOr[AppType] = js.undefined
}
object App {
  
  inline def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setAppSource(value: Source): Self = StObject.set(x, "AppSource", value.asInstanceOf[js.Any])
    
    inline def setAppSourceUndefined: Self = StObject.set(x, "AppSource", js.undefined)
    
    inline def setAttributes(value: AppAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataSources(value: DataSources): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "DataSources", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomains(value: Strings): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    inline def setEnableSsl(value: Boolean): Self = StObject.set(x, "EnableSsl", value.asInstanceOf[js.Any])
    
    inline def setEnableSslUndefined: Self = StObject.set(x, "EnableSsl", js.undefined)
    
    inline def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "Environment", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setShortname(value: String): Self = StObject.set(x, "Shortname", value.asInstanceOf[js.Any])
    
    inline def setShortnameUndefined: Self = StObject.set(x, "Shortname", js.undefined)
    
    inline def setSslConfiguration(value: SslConfiguration): Self = StObject.set(x, "SslConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSslConfigurationUndefined: Self = StObject.set(x, "SslConfiguration", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setType(value: AppType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
