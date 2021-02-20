package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationVersionsMessage extends StObject {
  
  /**
    * Specify an application name to show only application versions for that application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * For a paginated request. Specify a maximum number of application versions to include in each response. If no MaxRecords is specified, all available application versions are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxRecords] = js.native
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Specify a version label to show a specific application version.
    */
  var VersionLabels: js.UndefOr[VersionLabelsList] = js.native
}
object DescribeApplicationVersionsMessage {
  
  @scala.inline
  def apply(): DescribeApplicationVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationVersionsMessage]
  }
  
  @scala.inline
  implicit class DescribeApplicationVersionsMessageMutableBuilder[Self <: DescribeApplicationVersionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersionLabels(value: VersionLabelsList): Self = StObject.set(x, "VersionLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLabelsUndefined: Self = StObject.set(x, "VersionLabels", js.undefined)
    
    @scala.inline
    def setVersionLabelsVarargs(value: VersionLabel*): Self = StObject.set(x, "VersionLabels", js.Array(value :_*))
  }
}
