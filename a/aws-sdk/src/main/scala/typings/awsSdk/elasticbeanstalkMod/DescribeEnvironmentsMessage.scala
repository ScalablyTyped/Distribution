package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentsMessage extends js.Object {
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
    */
  var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
    */
  var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.native
  
  /**
    * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
    */
  var IncludeDeleted: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.IncludeDeleted] = js.native
  
  /**
    *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
    */
  var IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.native
  
  /**
    * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxRecords] = js.native
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}
object DescribeEnvironmentsMessage {
  
  @scala.inline
  def apply(): DescribeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsMessage]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentsMessageOps[Self <: DescribeEnvironmentsMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    
    @scala.inline
    def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = this.set("EnvironmentIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentIds(value: EnvironmentIdList): Self = this.set("EnvironmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentIds: Self = this.set("EnvironmentIds", js.undefined)
    
    @scala.inline
    def setEnvironmentNamesVarargs(value: EnvironmentName*): Self = this.set("EnvironmentNames", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentNames(value: EnvironmentNamesList): Self = this.set("EnvironmentNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentNames: Self = this.set("EnvironmentNames", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: IncludeDeleted): Self = this.set("IncludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("IncludeDeleted", js.undefined)
    
    @scala.inline
    def setIncludedDeletedBackTo(value: IncludeDeletedBackTo): Self = this.set("IncludedDeletedBackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedDeletedBackTo: Self = this.set("IncludedDeletedBackTo", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
}
