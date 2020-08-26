package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
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
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AppType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppSource(value: Source): Self = this.set("AppSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppSource: Self = this.set("AppSource", js.undefined)
    @scala.inline
    def setAttributes(value: AppAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("DataSources", js.Array(value :_*))
    @scala.inline
    def setDataSources(value: DataSources): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("Domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: Strings): Self = this.set("Domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("Domains", js.undefined)
    @scala.inline
    def setEnableSsl(value: Boolean): Self = this.set("EnableSsl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSsl: Self = this.set("EnableSsl", js.undefined)
    @scala.inline
    def setEnvironmentVarargs(value: EnvironmentVariable*): Self = this.set("Environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setShortname(value: String): Self = this.set("Shortname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortname: Self = this.set("Shortname", js.undefined)
    @scala.inline
    def setSslConfiguration(value: SslConfiguration): Self = this.set("SslConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslConfiguration: Self = this.set("SslConfiguration", js.undefined)
  }
  
}

