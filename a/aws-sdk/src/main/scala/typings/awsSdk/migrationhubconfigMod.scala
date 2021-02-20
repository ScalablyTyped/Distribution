package typings.awsSdk

import typings.awsSdk.awsSdkStrings.ACCOUNT
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationhubconfigMod {
  
  @JSImport("aws-sdk/clients/migrationhubconfig", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends MigrationHubConfig {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type ControlId = String
  
  @js.native
  trait CreateHomeRegionControlRequest extends StObject {
    
    /**
      * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[typings.awsSdk.migrationhubconfigMod.DryRun] = js.native
    
    /**
      * The name of the home region of the calling account.
      */
    var HomeRegion: typings.awsSdk.migrationhubconfigMod.HomeRegion = js.native
    
    /**
      * The account for which this command sets up a home region control. The Target is always of type ACCOUNT.
      */
    var Target: typings.awsSdk.migrationhubconfigMod.Target = js.native
  }
  object CreateHomeRegionControlRequest {
    
    @scala.inline
    def apply(HomeRegion: HomeRegion, Target: Target): CreateHomeRegionControlRequest = {
      val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHomeRegionControlRequest]
    }
    
    @scala.inline
    implicit class CreateHomeRegionControlRequestMutableBuilder[Self <: CreateHomeRegionControlRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
      
      @scala.inline
      def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateHomeRegionControlResult extends StObject {
    
    /**
      * This object is the HomeRegionControl object that's returned by a successful call to CreateHomeRegionControl.
      */
    var HomeRegionControl: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegionControl] = js.native
  }
  object CreateHomeRegionControlResult {
    
    @scala.inline
    def apply(): CreateHomeRegionControlResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHomeRegionControlResult]
    }
    
    @scala.inline
    implicit class CreateHomeRegionControlResultMutableBuilder[Self <: CreateHomeRegionControlResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeRegionControl(value: HomeRegionControl): Self = StObject.set(x, "HomeRegionControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionControlUndefined: Self = StObject.set(x, "HomeRegionControl", js.undefined)
    }
  }
  
  type DescribeHomeRegionControlsMaxResults = Double
  
  @js.native
  trait DescribeHomeRegionControlsRequest extends StObject {
    
    /**
      * The ControlID is a unique identifier string of your HomeRegionControl object.
      */
    var ControlId: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ControlId] = js.native
    
    /**
      * The name of the home region you'd like to view.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
    
    /**
      * The maximum number of filtering results to display per page. 
      */
    var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.native
    
    /**
      * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.native
    
    /**
      * The target parameter specifies the identifier to which the home region is applied, which is always of type ACCOUNT. It applies the home region to the current ACCOUNT.
      */
    var Target: js.UndefOr[typings.awsSdk.migrationhubconfigMod.Target] = js.native
  }
  object DescribeHomeRegionControlsRequest {
    
    @scala.inline
    def apply(): DescribeHomeRegionControlsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
    }
    
    @scala.inline
    implicit class DescribeHomeRegionControlsRequestMutableBuilder[Self <: DescribeHomeRegionControlsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlId(value: ControlId): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
      
      @scala.inline
      def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
      
      @scala.inline
      def setMaxResults(value: DescribeHomeRegionControlsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    }
  }
  
  @js.native
  trait DescribeHomeRegionControlsResult extends StObject {
    
    /**
      * An array that contains your HomeRegionControl objects.
      */
    var HomeRegionControls: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegionControls] = js.native
    
    /**
      * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.native
  }
  object DescribeHomeRegionControlsResult {
    
    @scala.inline
    def apply(): DescribeHomeRegionControlsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeHomeRegionControlsResult]
    }
    
    @scala.inline
    implicit class DescribeHomeRegionControlsResultMutableBuilder[Self <: DescribeHomeRegionControlsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeRegionControls(value: HomeRegionControls): Self = StObject.set(x, "HomeRegionControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionControlsUndefined: Self = StObject.set(x, "HomeRegionControls", js.undefined)
      
      @scala.inline
      def setHomeRegionControlsVarargs(value: HomeRegionControl*): Self = StObject.set(x, "HomeRegionControls", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type DryRun = Boolean
  
  @js.native
  trait GetHomeRegionRequest extends StObject
  
  @js.native
  trait GetHomeRegionResult extends StObject {
    
    /**
      * The name of the home region of the calling account.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  }
  object GetHomeRegionResult {
    
    @scala.inline
    def apply(): GetHomeRegionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHomeRegionResult]
    }
    
    @scala.inline
    implicit class GetHomeRegionResultMutableBuilder[Self <: GetHomeRegionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    }
  }
  
  type HomeRegion = String
  
  @js.native
  trait HomeRegionControl extends StObject {
    
    /**
      * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-" followed by 12 lowercase letters and numbers.
      */
    var ControlId: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ControlId] = js.native
    
    /**
      * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
    
    /**
      * A timestamp representing the time when the customer called CreateHomeregionControl and set the home region for the account.
      */
    var RequestedTime: js.UndefOr[typings.awsSdk.migrationhubconfigMod.RequestedTime] = js.native
    
    /**
      * The target parameter specifies the identifier to which the home region is applied, which is always an ACCOUNT. It applies the home region to the current ACCOUNT.
      */
    var Target: js.UndefOr[typings.awsSdk.migrationhubconfigMod.Target] = js.native
  }
  object HomeRegionControl {
    
    @scala.inline
    def apply(): HomeRegionControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeRegionControl]
    }
    
    @scala.inline
    implicit class HomeRegionControlMutableBuilder[Self <: HomeRegionControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlId(value: ControlId): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
      
      @scala.inline
      def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
      
      @scala.inline
      def setRequestedTime(value: RequestedTime): Self = StObject.set(x, "RequestedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedTimeUndefined: Self = StObject.set(x, "RequestedTime", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    }
  }
  
  type HomeRegionControls = js.Array[HomeRegionControl]
  
  @js.native
  trait MigrationHubConfig extends Service {
    
    @JSName("config")
    var config_MigrationHubConfig: ConfigBase with ClientConfiguration = js.native
    
    /**
      * This API sets up the home region for the calling account only.
      */
    def createHomeRegionControl(): Request[CreateHomeRegionControlResult, AWSError] = js.native
    def createHomeRegionControl(callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]): Request[CreateHomeRegionControlResult, AWSError] = js.native
    /**
      * This API sets up the home region for the calling account only.
      */
    def createHomeRegionControl(params: CreateHomeRegionControlRequest): Request[CreateHomeRegionControlResult, AWSError] = js.native
    def createHomeRegionControl(
      params: CreateHomeRegionControlRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]
    ): Request[CreateHomeRegionControlResult, AWSError] = js.native
    
    /**
      * This API permits filtering on the ControlId and HomeRegion fields.
      */
    def describeHomeRegionControls(): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    def describeHomeRegionControls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    /**
      * This API permits filtering on the ControlId and HomeRegion fields.
      */
    def describeHomeRegionControls(params: DescribeHomeRegionControlsRequest): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    def describeHomeRegionControls(
      params: DescribeHomeRegionControlsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]
    ): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    
    /**
      * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
      */
    def getHomeRegion(): Request[GetHomeRegionResult, AWSError] = js.native
    def getHomeRegion(callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]): Request[GetHomeRegionResult, AWSError] = js.native
    /**
      * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
      */
    def getHomeRegion(params: GetHomeRegionRequest): Request[GetHomeRegionResult, AWSError] = js.native
    def getHomeRegion(
      params: GetHomeRegionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]
    ): Request[GetHomeRegionResult, AWSError] = js.native
  }
  
  type RequestedTime = Date
  
  @js.native
  trait Target extends StObject {
    
    /**
      * The TargetID is a 12-character identifier of the ACCOUNT for which the control was created. (This must be the current account.) 
      */
    var Id: js.UndefOr[TargetId] = js.native
    
    /**
      * The target type is always an ACCOUNT.
      */
    var Type: TargetType = js.native
  }
  object Target {
    
    @scala.inline
    def apply(Type: TargetType): Target = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetId = String
  
  type TargetType = ACCOUNT | String
  
  type Token = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
