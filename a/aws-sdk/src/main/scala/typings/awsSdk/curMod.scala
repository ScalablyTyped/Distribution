package typings.awsSdk

import typings.awsSdk.awsSdkStrings.RESOURCES
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curMod {
  
  @JSImport("aws-sdk/clients/cur", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends CUR {
    def this(options: ClientConfiguration) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`af-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-east-1`
    - typings.awsSdk.awsSdkStrings.`ap-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typings.awsSdk.awsSdkStrings.`ca-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-3`
    - typings.awsSdk.awsSdkStrings.`eu-north-1`
    - typings.awsSdk.awsSdkStrings.`eu-south-1`
    - typings.awsSdk.awsSdkStrings.`me-south-1`
    - typings.awsSdk.awsSdkStrings.`sa-east-1`
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-east-2`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`cn-north-1`
    - typings.awsSdk.awsSdkStrings.`cn-northwest-1`
    - java.lang.String
  */
  type AWSRegion = _AWSRegion | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REDSHIFT
    - typings.awsSdk.awsSdkStrings.QUICKSIGHT
    - typings.awsSdk.awsSdkStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = _AdditionalArtifact | String
  
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait CUR extends Service {
    
    @JSName("config")
    var config_CUR: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Deletes the specified report.
      */
    def deleteReportDefinition(): Request[DeleteReportDefinitionResponse, AWSError] = js.native
    def deleteReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResponse, Unit]): Request[DeleteReportDefinitionResponse, AWSError] = js.native
    /**
      * Deletes the specified report.
      */
    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse, AWSError] = js.native
    def deleteReportDefinition(
      params: DeleteReportDefinitionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResponse, Unit]
    ): Request[DeleteReportDefinitionResponse, AWSError] = js.native
    
    /**
      * Lists the AWS Cost and Usage reports available to this account.
      */
    def describeReportDefinitions(): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
    def describeReportDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportDefinitionsResponse, Unit]): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
    /**
      * Lists the AWS Cost and Usage reports available to this account.
      */
    def describeReportDefinitions(params: DescribeReportDefinitionsRequest): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
    def describeReportDefinitions(
      params: DescribeReportDefinitionsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportDefinitionsResponse, Unit]
    ): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
    
    /**
      * Allows you to programatically update your report preferences.
      */
    def modifyReportDefinition(): Request[ModifyReportDefinitionResponse, AWSError] = js.native
    def modifyReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReportDefinitionResponse, Unit]): Request[ModifyReportDefinitionResponse, AWSError] = js.native
    /**
      * Allows you to programatically update your report preferences.
      */
    def modifyReportDefinition(params: ModifyReportDefinitionRequest): Request[ModifyReportDefinitionResponse, AWSError] = js.native
    def modifyReportDefinition(
      params: ModifyReportDefinitionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ModifyReportDefinitionResponse, Unit]
    ): Request[ModifyReportDefinitionResponse, AWSError] = js.native
    
    /**
      * Creates a new report using the description that you provide.
      */
    def putReportDefinition(): Request[PutReportDefinitionResponse, AWSError] = js.native
    def putReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResponse, Unit]): Request[PutReportDefinitionResponse, AWSError] = js.native
    /**
      * Creates a new report using the description that you provide.
      */
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse, AWSError] = js.native
    def putReportDefinition(
      params: PutReportDefinitionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResponse, Unit]
    ): Request[PutReportDefinitionResponse, AWSError] = js.native
  }
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.curMod.apiVersion] = js.native
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ZIP
    - typings.awsSdk.awsSdkStrings.GZIP
    - typings.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type CompressionFormat = _CompressionFormat | String
  
  @js.native
  trait DeleteReportDefinitionRequest extends StObject {
    
    /**
      * The name of the report that you want to delete. The name must be unique, is case sensitive, and can't include spaces.
      */
    var ReportName: js.UndefOr[typings.awsSdk.curMod.ReportName] = js.native
  }
  object DeleteReportDefinitionRequest {
    
    @scala.inline
    def apply(): DeleteReportDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReportDefinitionRequest]
    }
    
    @scala.inline
    implicit class DeleteReportDefinitionRequestMutableBuilder[Self <: DeleteReportDefinitionRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNameUndefined: Self = StObject.set(x, "ReportName", js.undefined)
    }
  }
  
  @js.native
  trait DeleteReportDefinitionResponse extends StObject {
    
    var ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.native
  }
  object DeleteReportDefinitionResponse {
    
    @scala.inline
    def apply(): DeleteReportDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReportDefinitionResponse]
    }
    
    @scala.inline
    implicit class DeleteReportDefinitionResponseMutableBuilder[Self <: DeleteReportDefinitionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseMessage(value: DeleteResponseMessage): Self = StObject.set(x, "ResponseMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMessageUndefined: Self = StObject.set(x, "ResponseMessage", js.undefined)
    }
  }
  
  type DeleteResponseMessage = String
  
  @js.native
  trait DescribeReportDefinitionsRequest extends StObject {
    
    var MaxResults: js.UndefOr[typings.awsSdk.curMod.MaxResults] = js.native
    
    var NextToken: js.UndefOr[GenericString] = js.native
  }
  object DescribeReportDefinitionsRequest {
    
    @scala.inline
    def apply(): DescribeReportDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeReportDefinitionsRequest]
    }
    
    @scala.inline
    implicit class DescribeReportDefinitionsRequestMutableBuilder[Self <: DescribeReportDefinitionsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait DescribeReportDefinitionsResponse extends StObject {
    
    var NextToken: js.UndefOr[GenericString] = js.native
    
    /**
      * A list of AWS Cost and Usage reports owned by the account.
      */
    var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.native
  }
  object DescribeReportDefinitionsResponse {
    
    @scala.inline
    def apply(): DescribeReportDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeReportDefinitionsResponse]
    }
    
    @scala.inline
    implicit class DescribeReportDefinitionsResponseMutableBuilder[Self <: DescribeReportDefinitionsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setReportDefinitions(value: ReportDefinitionList): Self = StObject.set(x, "ReportDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDefinitionsUndefined: Self = StObject.set(x, "ReportDefinitions", js.undefined)
      
      @scala.inline
      def setReportDefinitionsVarargs(value: ReportDefinition*): Self = StObject.set(x, "ReportDefinitions", js.Array(value :_*))
    }
  }
  
  type GenericString = String
  
  type MaxResults = Double
  
  @js.native
  trait ModifyReportDefinitionRequest extends StObject {
    
    var ReportDefinition: typings.awsSdk.curMod.ReportDefinition = js.native
    
    var ReportName: typings.awsSdk.curMod.ReportName = js.native
  }
  object ModifyReportDefinitionRequest {
    
    @scala.inline
    def apply(ReportDefinition: ReportDefinition, ReportName: ReportName): ModifyReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifyReportDefinitionRequest]
    }
    
    @scala.inline
    implicit class ModifyReportDefinitionRequestMutableBuilder[Self <: ModifyReportDefinitionRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportDefinition(value: ReportDefinition): Self = StObject.set(x, "ReportDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModifyReportDefinitionResponse extends StObject
  
  @js.native
  trait PutReportDefinitionRequest extends StObject {
    
    /**
      * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and data file information. 
      */
    var ReportDefinition: typings.awsSdk.curMod.ReportDefinition = js.native
  }
  object PutReportDefinitionRequest {
    
    @scala.inline
    def apply(ReportDefinition: ReportDefinition): PutReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutReportDefinitionRequest]
    }
    
    @scala.inline
    implicit class PutReportDefinitionRequestMutableBuilder[Self <: PutReportDefinitionRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportDefinition(value: ReportDefinition): Self = StObject.set(x, "ReportDefinition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PutReportDefinitionResponse extends StObject
  
  type RefreshClosedReports = Boolean
  
  @js.native
  trait ReportDefinition extends StObject {
    
    /**
      * A list of manifests that you want Amazon Web Services to create for this report.
      */
    var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.native
    
    /**
      * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as individual resource IDs. 
      */
    var AdditionalSchemaElements: SchemaElementList = js.native
    
    var Compression: CompressionFormat = js.native
    
    var Format: ReportFormat = js.native
    
    /**
      * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services detects charges related to previous months. These charges can include refunds, credits, or support fees.
      */
    var RefreshClosedReports: js.UndefOr[typings.awsSdk.curMod.RefreshClosedReports] = js.native
    
    var ReportName: typings.awsSdk.curMod.ReportName = js.native
    
    /**
      * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in addition to the previous versions.
      */
    var ReportVersioning: js.UndefOr[typings.awsSdk.curMod.ReportVersioning] = js.native
    
    var S3Bucket: typings.awsSdk.curMod.S3Bucket = js.native
    
    var S3Prefix: typings.awsSdk.curMod.S3Prefix = js.native
    
    var S3Region: AWSRegion = js.native
    
    var TimeUnit: typings.awsSdk.curMod.TimeUnit = js.native
  }
  object ReportDefinition {
    
    @scala.inline
    def apply(
      AdditionalSchemaElements: SchemaElementList,
      Compression: CompressionFormat,
      Format: ReportFormat,
      ReportName: ReportName,
      S3Bucket: S3Bucket,
      S3Prefix: S3Prefix,
      S3Region: AWSRegion,
      TimeUnit: TimeUnit
    ): ReportDefinition = {
      val __obj = js.Dynamic.literal(AdditionalSchemaElements = AdditionalSchemaElements.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any], S3Bucket = S3Bucket.asInstanceOf[js.Any], S3Prefix = S3Prefix.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportDefinition]
    }
    
    @scala.inline
    implicit class ReportDefinitionMutableBuilder[Self <: ReportDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalArtifacts(value: AdditionalArtifactList): Self = StObject.set(x, "AdditionalArtifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalArtifactsUndefined: Self = StObject.set(x, "AdditionalArtifacts", js.undefined)
      
      @scala.inline
      def setAdditionalArtifactsVarargs(value: AdditionalArtifact*): Self = StObject.set(x, "AdditionalArtifacts", js.Array(value :_*))
      
      @scala.inline
      def setAdditionalSchemaElements(value: SchemaElementList): Self = StObject.set(x, "AdditionalSchemaElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSchemaElementsVarargs(value: SchemaElement*): Self = StObject.set(x, "AdditionalSchemaElements", js.Array(value :_*))
      
      @scala.inline
      def setCompression(value: CompressionFormat): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: ReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshClosedReports(value: RefreshClosedReports): Self = StObject.set(x, "RefreshClosedReports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshClosedReportsUndefined: Self = StObject.set(x, "RefreshClosedReports", js.undefined)
      
      @scala.inline
      def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportVersioning(value: ReportVersioning): Self = StObject.set(x, "ReportVersioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportVersioningUndefined: Self = StObject.set(x, "ReportVersioning", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Region(value: AWSRegion): Self = StObject.set(x, "S3Region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    }
  }
  
  type ReportDefinitionList = js.Array[ReportDefinition]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.textORcsv
    - typings.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type ReportFormat = _ReportFormat | String
  
  type ReportName = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_NEW_REPORT
    - typings.awsSdk.awsSdkStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = _ReportVersioning | String
  
  type S3Bucket = String
  
  type S3Prefix = String
  
  type SchemaElement = RESOURCES | String
  
  type SchemaElementList = js.Array[SchemaElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HOURLY
    - typings.awsSdk.awsSdkStrings.DAILY
    - typings.awsSdk.awsSdkStrings.MONTHLY
    - java.lang.String
  */
  type TimeUnit = _TimeUnit | String
  
  trait _AWSRegion extends StObject
  
  trait _AdditionalArtifact extends StObject
  
  trait _CompressionFormat extends StObject
  
  trait _ReportFormat extends StObject
  
  trait _ReportVersioning extends StObject
  
  trait _TimeUnit extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-01-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
