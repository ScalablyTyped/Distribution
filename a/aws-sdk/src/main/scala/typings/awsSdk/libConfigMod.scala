package typings.awsSdk

import typings.awsSdk.anon.ConfigurationOptionsConfi
import typings.awsSdk.awsSdkBooleans.`true`
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.clientsAccessanalyzerMod.ClientConfiguration
import typings.awsSdk.libConfigBaseMod.ConfigurationOptions
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("aws-sdk/lib/config", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  open class Config ()
    extends typings.awsSdk.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk/lib/config", "ConfigBase")
  @js.native
  open class ConfigBase ()
    extends typings.awsSdk.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions) = this()
  }
  
  trait APIVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[latest_ | String] = js.undefined
    
    /**
      * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
      */
    var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  }
  object APIVersions {
    
    inline def apply(): APIVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APIVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders because Inheritance from two classes. Inlined acm, apigateway, applicationautoscaling, appstream, autoscaling, batch, budgets, clouddirectory, cloudformation, cloudfront, cloudhsm, cloudsearch, cloudsearchdomain, cloudtrail, cloudwatch, cloudwatchevents, cloudwatchlogs, codebuild, codecommit, codedeploy, codepipeline, cognitoidentity, cognitoidentityserviceprovider, cognitosync, configservice, cur, datapipeline, devicefarm, directconnect, directoryservice, discovery, dms, dynamodb, dynamodbstreams, ec2, ecr, ecs, efs, elasticache, elasticbeanstalk, elb, elbv2, emr, es, elastictranscoder, firehose, gamelift, glacier, health, iam, importexport, inspector, iot, iotdata, kinesis, kinesisanalytics, kms, lambda, lexruntime, lightsail, machinelearning, marketplacecommerceanalytics, marketplacemetering, mturk, mobileanalytics, opsworks, opsworkscm, organizations, pinpoint, polly, rds, redshift, rekognition, resourcegroupstaggingapi, route53, route53domains, s3, s3control, servicecatalog, ses, shield, simpledb, sms, snowball, sns, sqs, ssm, storagegateway, stepfunctions, sts, support, swf, xray, waf, wafregional, workdocs, workspaces, codestar, lexmodelbuildingservice, marketplaceentitlementservice, athena, greengrass, dax, migrationhub, cloudhsmv2, glue, mobile, pricing, costexplorer, mediaconvert, medialive, mediapackage, mediastore, mediastoredata, appsync, guardduty, mq, comprehend, iotjobsdataplane, kinesisvideoarchivedmedia, kinesisvideomedia, kinesisvideo, sagemakerruntime, sagemaker, translate, resourcegroups, alexaforbusiness, cloud9, serverlessapplicationrepository, servicediscovery, workmail, autoscalingplans, transcribeservice, connect, acmpca, fms, secretsmanager, iotanalytics, iot1clickdevicesservice, iot1clickprojects, pi, neptune, mediatailor, eks, macie, dlm, signer, chime, pinpointemail, ram, route53resolver, pinpointsmsvoice, quicksight, rdsdataservice, amplify, datasync, robomaker, transfer, globalaccelerator, comprehendmedical, kinesisanalyticsv2, mediaconnect, fsx, securityhub, appmesh, licensemanager, kafka, apigatewaymanagementapi, apigatewayv2, docdb, backup, worklink, textract, managedblockchain, mediapackagevod, groundstation, iotthingsgraph, iotevents, ioteventsdata, personalize, personalizeevents, personalizeruntime, applicationinsights, servicequotas, ec2instanceconnect, eventbridge, lakeformation, forecastservice, forecastqueryservice, qldb, qldbsession, workmailmessageflow, codestarnotifications, savingsplans, sso, ssooidc, marketplacecatalog, dataexchange, sesv2, migrationhubconfig, connectparticipant, appconfig, iotsecuretunneling, wafv2, elasticinference, imagebuilder, schemas, accessanalyzer, codegurureviewer, codeguruprofiler, computeoptimizer, frauddetector, kendra, networkmanager, outposts, augmentedairuntime, ebs, kinesisvideosignalingchannels, detective, codestarconnections, synthetics, iotsitewise, macie2, codeartifact, honeycode, ivs, braket, identitystore, appflow, redshiftdata, ssoadmin, timestreamquery, timestreamwrite, s3outposts, databrew, servicecatalogappregistry, networkfirewall, mwaa, amplifybackend, appintegrations, connectcontactlens, devopsguru, ecrpublic, lookoutvision, sagemakerfeaturestoreruntime, customerprofiles, auditmanager, emrcontainers, healthlake, sagemakeredge, amp, greengrassv2, iotdeviceadvisor, iotfleethub, iotwireless, location, wellarchitected, lexmodelsv2, lexruntimev2, fis, lookoutmetrics, mgn, lookoutequipment, nimble, finspace, finspacedata, ssmcontacts, ssmincidents, applicationcostprofiler, apprunner, proton, route53recoverycluster, route53recoverycontrolconfig, route53recoveryreadiness, chimesdkidentity, chimesdkmessaging, snowdevicemanagement, memorydb, opensearch, kafkaconnect, voiceid, wisdom, account, cloudcontrol, grafana, panorama, chimesdkmeetings, resiliencehub, migrationhubstrategy, appconfigdata, drs, migrationhubrefactorspaces, evidently, inspector2, rbin, rum, backupgateway, iottwinmaker, workspacesweb, amplifyuibuilder, keyspaces, billingconductor, gamesparks, pinpointsmsvoicev2, ivschat, chimesdkmediapipelines, emrserverless, m2, connectcampaigns, redshiftserverless, rolesanywhere, licensemanagerusersubscriptions, backupstorage, privatenetworks, supportapp, controltower, iotfleetwise, migrationhuborchestrator, connectcases, resourceexplorer2, scheduler, chimesdkvoice, iotroborunner, ssmsap, oam, arczonalshift, omics, opensearchserverless, securitylake, simspaceweaver, docdbelastic, sagemakergeospatial, codecatalyst, pipes, sagemakermetrics, kinesisvideowebrtcstorage, licensemanagerlinuxsubscriptions, kendraranking, cleanrooms, cloudtraildata, tnb, internetmonitor, ivsrealtime, vpclattice, osis */ @js.native
  trait GlobalConfigInstance
    extends Config
       with APIVersions {
    
    var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
    
    var account: js.UndefOr[typings.awsSdk.clientsAccountMod.ClientConfiguration] = js.native
    
    var acm: js.UndefOr[typings.awsSdk.clientsAcmMod.ClientConfiguration] = js.native
    
    var acmpca: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.ClientConfiguration] = js.native
    
    var alexaforbusiness: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration] = js.native
    
    var amp: js.UndefOr[typings.awsSdk.clientsAmpMod.ClientConfiguration] = js.native
    
    var amplify: js.UndefOr[typings.awsSdk.clientsAmplifyMod.ClientConfiguration] = js.native
    
    var amplifybackend: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.ClientConfiguration] = js.native
    
    var amplifyuibuilder: js.UndefOr[typings.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration] = js.native
    
    var apigateway: js.UndefOr[typings.awsSdk.clientsApigatewayMod.ClientConfiguration] = js.native
    
    var apigatewaymanagementapi: js.UndefOr[typings.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration] = js.native
    
    var apigatewayv2: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.ClientConfiguration] = js.native
    
    var appconfig: js.UndefOr[typings.awsSdk.clientsAppconfigMod.ClientConfiguration] = js.native
    
    var appconfigdata: js.UndefOr[typings.awsSdk.clientsAppconfigdataMod.ClientConfiguration] = js.native
    
    var appflow: js.UndefOr[typings.awsSdk.clientsAppflowMod.ClientConfiguration] = js.native
    
    var appintegrations: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.ClientConfiguration] = js.native
    
    var applicationautoscaling: js.UndefOr[typings.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration] = js.native
    
    var applicationcostprofiler: js.UndefOr[typings.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration] = js.native
    
    var applicationinsights: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ClientConfiguration] = js.native
    
    var appmesh: js.UndefOr[typings.awsSdk.clientsAppmeshMod.ClientConfiguration] = js.native
    
    var apprunner: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ClientConfiguration] = js.native
    
    var appstream: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ClientConfiguration] = js.native
    
    var appsync: js.UndefOr[typings.awsSdk.clientsAppsyncMod.ClientConfiguration] = js.native
    
    var arczonalshift: js.UndefOr[typings.awsSdk.clientsArczonalshiftMod.ClientConfiguration] = js.native
    
    var athena: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientConfiguration] = js.native
    
    var auditmanager: js.UndefOr[typings.awsSdk.clientsAuditmanagerMod.ClientConfiguration] = js.native
    
    var augmentedairuntime: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration] = js.native
    
    var autoscaling: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ClientConfiguration] = js.native
    
    var autoscalingplans: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ClientConfiguration] = js.native
    
    var backup: js.UndefOr[typings.awsSdk.clientsBackupMod.ClientConfiguration] = js.native
    
    var backupgateway: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.ClientConfiguration] = js.native
    
    var backupstorage: js.UndefOr[typings.awsSdk.clientsBackupstorageMod.ClientConfiguration] = js.native
    
    var batch: js.UndefOr[typings.awsSdk.clientsBatchMod.ClientConfiguration] = js.native
    
    var billingconductor: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ClientConfiguration] = js.native
    
    var braket: js.UndefOr[typings.awsSdk.clientsBraketMod.ClientConfiguration] = js.native
    
    var budgets: js.UndefOr[typings.awsSdk.clientsBudgetsMod.ClientConfiguration] = js.native
    
    var chime: js.UndefOr[typings.awsSdk.clientsChimeMod.ClientConfiguration] = js.native
    
    var chimesdkidentity: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.ClientConfiguration] = js.native
    
    var chimesdkmediapipelines: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration] = js.native
    
    var chimesdkmeetings: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration] = js.native
    
    var chimesdkmessaging: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration] = js.native
    
    var chimesdkvoice: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ClientConfiguration] = js.native
    
    var cleanrooms: js.UndefOr[typings.awsSdk.clientsCleanroomsMod.ClientConfiguration] = js.native
    
    var cloud9: js.UndefOr[typings.awsSdk.clientsCloud9Mod.ClientConfiguration] = js.native
    
    var cloudcontrol: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ClientConfiguration] = js.native
    
    var clouddirectory: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ClientConfiguration] = js.native
    
    var cloudformation: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ClientConfiguration] = js.native
    
    var cloudfront: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ClientConfiguration] = js.native
    
    var cloudhsm: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.ClientConfiguration] = js.native
    
    var cloudhsmv2: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration] = js.native
    
    var cloudsearch: js.UndefOr[typings.awsSdk.clientsCloudsearchMod.ClientConfiguration] = js.native
    
    var cloudsearchdomain: js.UndefOr[typings.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration] = js.native
    
    var cloudtrail: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ClientConfiguration] = js.native
    
    var cloudtraildata: js.UndefOr[typings.awsSdk.clientsCloudtraildataMod.ClientConfiguration] = js.native
    
    var cloudwatch: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ClientConfiguration] = js.native
    
    var cloudwatchevents: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration] = js.native
    
    var cloudwatchlogs: js.UndefOr[typings.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration] = js.native
    
    var codeartifact: js.UndefOr[typings.awsSdk.clientsCodeartifactMod.ClientConfiguration] = js.native
    
    var codebuild: js.UndefOr[typings.awsSdk.clientsCodebuildMod.ClientConfiguration] = js.native
    
    var codecatalyst: js.UndefOr[typings.awsSdk.clientsCodecatalystMod.ClientConfiguration] = js.native
    
    var codecommit: js.UndefOr[typings.awsSdk.clientsCodecommitMod.ClientConfiguration] = js.native
    
    var codedeploy: js.UndefOr[typings.awsSdk.clientsCodedeployMod.ClientConfiguration] = js.native
    
    var codeguruprofiler: js.UndefOr[typings.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration] = js.native
    
    var codegurureviewer: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ClientConfiguration] = js.native
    
    var codepipeline: js.UndefOr[typings.awsSdk.clientsCodepipelineMod.ClientConfiguration] = js.native
    
    var codestar: js.UndefOr[typings.awsSdk.clientsCodestarMod.ClientConfiguration] = js.native
    
    var codestarconnections: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration] = js.native
    
    var codestarnotifications: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration] = js.native
    
    var cognitoidentity: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.ClientConfiguration] = js.native
    
    var cognitoidentityserviceprovider: js.UndefOr[typings.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration] = js.native
    
    var cognitosync: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.ClientConfiguration] = js.native
    
    var comprehend: js.UndefOr[typings.awsSdk.clientsComprehendMod.ClientConfiguration] = js.native
    
    var comprehendmedical: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ClientConfiguration] = js.native
    
    var computeoptimizer: js.UndefOr[typings.awsSdk.clientsComputeoptimizerMod.ClientConfiguration] = js.native
    
    var configservice: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ClientConfiguration] = js.native
    
    var connect: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientConfiguration] = js.native
    
    var connectcampaigns: js.UndefOr[typings.awsSdk.clientsConnectcampaignsMod.ClientConfiguration] = js.native
    
    var connectcases: js.UndefOr[typings.awsSdk.clientsConnectcasesMod.ClientConfiguration] = js.native
    
    var connectcontactlens: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.ClientConfiguration] = js.native
    
    var connectparticipant: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ClientConfiguration] = js.native
    
    var controltower: js.UndefOr[typings.awsSdk.clientsControltowerMod.ClientConfiguration] = js.native
    
    var costexplorer: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.ClientConfiguration] = js.native
    
    var cur: js.UndefOr[typings.awsSdk.clientsCurMod.ClientConfiguration] = js.native
    
    var customerprofiles: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ClientConfiguration] = js.native
    
    var databrew: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ClientConfiguration] = js.native
    
    var dataexchange: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ClientConfiguration] = js.native
    
    var datapipeline: js.UndefOr[typings.awsSdk.clientsDatapipelineMod.ClientConfiguration] = js.native
    
    var datasync: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ClientConfiguration] = js.native
    
    var dax: js.UndefOr[typings.awsSdk.clientsDaxMod.ClientConfiguration] = js.native
    
    var detective: js.UndefOr[typings.awsSdk.clientsDetectiveMod.ClientConfiguration] = js.native
    
    var devicefarm: js.UndefOr[typings.awsSdk.clientsDevicefarmMod.ClientConfiguration] = js.native
    
    var devopsguru: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ClientConfiguration] = js.native
    
    var directconnect: js.UndefOr[typings.awsSdk.clientsDirectconnectMod.ClientConfiguration] = js.native
    
    var directoryservice: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ClientConfiguration] = js.native
    
    var discovery: js.UndefOr[typings.awsSdk.clientsDiscoveryMod.ClientConfiguration] = js.native
    
    var dlm: js.UndefOr[typings.awsSdk.clientsDlmMod.ClientConfiguration] = js.native
    
    var dms: js.UndefOr[typings.awsSdk.clientsDmsMod.ClientConfiguration] = js.native
    
    var docdb: js.UndefOr[typings.awsSdk.clientsDocdbMod.ClientConfiguration] = js.native
    
    var docdbelastic: js.UndefOr[typings.awsSdk.clientsDocdbelasticMod.ClientConfiguration] = js.native
    
    var drs: js.UndefOr[typings.awsSdk.clientsDrsMod.ClientConfiguration] = js.native
    
    var dynamodb: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientConfiguration] = js.native
    
    var dynamodbstreams: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration] = js.native
    
    var ebs: js.UndefOr[typings.awsSdk.clientsEbsMod.ClientConfiguration] = js.native
    
    var ec2: js.UndefOr[typings.awsSdk.clientsEc2Mod.ClientConfiguration] = js.native
    
    var ec2instanceconnect: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration] = js.native
    
    var ecr: js.UndefOr[typings.awsSdk.clientsEcrMod.ClientConfiguration] = js.native
    
    var ecrpublic: js.UndefOr[typings.awsSdk.clientsEcrpublicMod.ClientConfiguration] = js.native
    
    var ecs: js.UndefOr[typings.awsSdk.clientsEcsMod.ClientConfiguration] = js.native
    
    var efs: js.UndefOr[typings.awsSdk.clientsEfsMod.ClientConfiguration] = js.native
    
    var eks: js.UndefOr[typings.awsSdk.clientsEksMod.ClientConfiguration] = js.native
    
    var elasticache: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ClientConfiguration] = js.native
    
    var elasticbeanstalk: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration] = js.native
    
    var elasticinference: js.UndefOr[typings.awsSdk.clientsElasticinferenceMod.ClientConfiguration] = js.native
    
    var elastictranscoder: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.ClientConfiguration] = js.native
    
    var elb: js.UndefOr[typings.awsSdk.clientsElbMod.ClientConfiguration] = js.native
    
    var elbv2: js.UndefOr[typings.awsSdk.clientsElbv2Mod.ClientConfiguration] = js.native
    
    var emr: js.UndefOr[typings.awsSdk.clientsEmrMod.ClientConfiguration] = js.native
    
    var emrcontainers: js.UndefOr[typings.awsSdk.clientsEmrcontainersMod.ClientConfiguration] = js.native
    
    var emrserverless: js.UndefOr[typings.awsSdk.clientsEmrserverlessMod.ClientConfiguration] = js.native
    
    var es: js.UndefOr[typings.awsSdk.clientsEsMod.ClientConfiguration] = js.native
    
    var eventbridge: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ClientConfiguration] = js.native
    
    var evidently: js.UndefOr[typings.awsSdk.clientsEvidentlyMod.ClientConfiguration] = js.native
    
    var finspace: js.UndefOr[typings.awsSdk.clientsFinspaceMod.ClientConfiguration] = js.native
    
    var finspacedata: js.UndefOr[typings.awsSdk.clientsFinspacedataMod.ClientConfiguration] = js.native
    
    var firehose: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ClientConfiguration] = js.native
    
    var fis: js.UndefOr[typings.awsSdk.clientsFisMod.ClientConfiguration] = js.native
    
    var fms: js.UndefOr[typings.awsSdk.clientsFmsMod.ClientConfiguration] = js.native
    
    var forecastqueryservice: js.UndefOr[typings.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration] = js.native
    
    var forecastservice: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ClientConfiguration] = js.native
    
    var frauddetector: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.ClientConfiguration] = js.native
    
    var fsx: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientConfiguration] = js.native
    
    var gamelift: js.UndefOr[typings.awsSdk.clientsGameliftMod.ClientConfiguration] = js.native
    
    var gamesparks: js.UndefOr[typings.awsSdk.clientsGamesparksMod.ClientConfiguration] = js.native
    
    var glacier: js.UndefOr[typings.awsSdk.clientsGlacierMod.ClientConfiguration] = js.native
    
    var globalaccelerator: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration] = js.native
    
    var glue: js.UndefOr[typings.awsSdk.clientsGlueMod.ClientConfiguration] = js.native
    
    var grafana: js.UndefOr[typings.awsSdk.clientsGrafanaMod.ClientConfiguration] = js.native
    
    var greengrass: js.UndefOr[typings.awsSdk.clientsGreengrassMod.ClientConfiguration] = js.native
    
    var greengrassv2: js.UndefOr[typings.awsSdk.clientsGreengrassv2Mod.ClientConfiguration] = js.native
    
    var groundstation: js.UndefOr[typings.awsSdk.clientsGroundstationMod.ClientConfiguration] = js.native
    
    var guardduty: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ClientConfiguration] = js.native
    
    var health: js.UndefOr[typings.awsSdk.clientsHealthMod.ClientConfiguration] = js.native
    
    var healthlake: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.ClientConfiguration] = js.native
    
    var honeycode: js.UndefOr[typings.awsSdk.clientsHoneycodeMod.ClientConfiguration] = js.native
    
    var iam: js.UndefOr[typings.awsSdk.clientsIamMod.ClientConfiguration] = js.native
    
    var identitystore: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.ClientConfiguration] = js.native
    
    var imagebuilder: js.UndefOr[typings.awsSdk.clientsImagebuilderMod.ClientConfiguration] = js.native
    
    var importexport: js.UndefOr[typings.awsSdk.clientsImportexportMod.ClientConfiguration] = js.native
    
    var inspector: js.UndefOr[typings.awsSdk.clientsInspectorMod.ClientConfiguration] = js.native
    
    var inspector2: js.UndefOr[typings.awsSdk.clientsInspector2Mod.ClientConfiguration] = js.native
    
    var internetmonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.ClientConfiguration] = js.native
    
    var iot: js.UndefOr[typings.awsSdk.clientsIotMod.ClientConfiguration] = js.native
    
    var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration] = js.native
    
    var iot1clickprojects: js.UndefOr[typings.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration] = js.native
    
    var iotanalytics: js.UndefOr[typings.awsSdk.clientsIotanalyticsMod.ClientConfiguration] = js.native
    
    var iotdata: js.UndefOr[typings.awsSdk.clientsIotdataMod.ClientConfiguration] = js.native
    
    var iotdeviceadvisor: js.UndefOr[typings.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration] = js.native
    
    var iotevents: js.UndefOr[typings.awsSdk.clientsIoteventsMod.ClientConfiguration] = js.native
    
    var ioteventsdata: js.UndefOr[typings.awsSdk.clientsIoteventsdataMod.ClientConfiguration] = js.native
    
    var iotfleethub: js.UndefOr[typings.awsSdk.clientsIotfleethubMod.ClientConfiguration] = js.native
    
    var iotfleetwise: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.ClientConfiguration] = js.native
    
    var iotjobsdataplane: js.UndefOr[typings.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration] = js.native
    
    var iotroborunner: js.UndefOr[typings.awsSdk.clientsIotroborunnerMod.ClientConfiguration] = js.native
    
    var iotsecuretunneling: js.UndefOr[typings.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration] = js.native
    
    var iotsitewise: js.UndefOr[typings.awsSdk.clientsIotsitewiseMod.ClientConfiguration] = js.native
    
    var iotthingsgraph: js.UndefOr[typings.awsSdk.clientsIotthingsgraphMod.ClientConfiguration] = js.native
    
    var iottwinmaker: js.UndefOr[typings.awsSdk.clientsIottwinmakerMod.ClientConfiguration] = js.native
    
    var iotwireless: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientConfiguration] = js.native
    
    var ivs: js.UndefOr[typings.awsSdk.clientsIvsMod.ClientConfiguration] = js.native
    
    var ivschat: js.UndefOr[typings.awsSdk.clientsIvschatMod.ClientConfiguration] = js.native
    
    var ivsrealtime: js.UndefOr[typings.awsSdk.clientsIvsrealtimeMod.ClientConfiguration] = js.native
    
    var kafka: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClientConfiguration] = js.native
    
    var kafkaconnect: js.UndefOr[typings.awsSdk.clientsKafkaconnectMod.ClientConfiguration] = js.native
    
    var kendra: js.UndefOr[typings.awsSdk.clientsKendraMod.ClientConfiguration] = js.native
    
    var kendraranking: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.ClientConfiguration] = js.native
    
    var keyspaces: js.UndefOr[typings.awsSdk.clientsKeyspacesMod.ClientConfiguration] = js.native
    
    var kinesis: js.UndefOr[typings.awsSdk.clientsKinesisMod.ClientConfiguration] = js.native
    
    var kinesisanalytics: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration] = js.native
    
    var kinesisanalyticsv2: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration] = js.native
    
    var kinesisvideo: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ClientConfiguration] = js.native
    
    var kinesisvideoarchivedmedia: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
    
    var kinesisvideomedia: js.UndefOr[typings.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration] = js.native
    
    var kinesisvideosignalingchannels: js.UndefOr[typings.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration] = js.native
    
    var kinesisvideowebrtcstorage: js.UndefOr[typings.awsSdk.clientsKinesisvideowebrtcstorageMod.ClientConfiguration] = js.native
    
    var kms: js.UndefOr[typings.awsSdk.clientsKmsMod.ClientConfiguration] = js.native
    
    var lakeformation: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ClientConfiguration] = js.native
    
    var lambda: js.UndefOr[typings.awsSdk.clientsLambdaMod.ClientConfiguration] = js.native
    
    var lexmodelbuildingservice: js.UndefOr[typings.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration] = js.native
    
    var lexmodelsv2: js.UndefOr[typings.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration] = js.native
    
    var lexruntime: js.UndefOr[typings.awsSdk.clientsLexruntimeMod.ClientConfiguration] = js.native
    
    var lexruntimev2: js.UndefOr[typings.awsSdk.clientsLexruntimev2Mod.ClientConfiguration] = js.native
    
    var licensemanager: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ClientConfiguration] = js.native
    
    var licensemanagerlinuxsubscriptions: js.UndefOr[typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.ClientConfiguration] = js.native
    
    var licensemanagerusersubscriptions: js.UndefOr[typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration] = js.native
    
    var lightsail: js.UndefOr[typings.awsSdk.clientsLightsailMod.ClientConfiguration] = js.native
    
    var location: js.UndefOr[typings.awsSdk.clientsLocationMod.ClientConfiguration] = js.native
    
    var lookoutequipment: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ClientConfiguration] = js.native
    
    var lookoutmetrics: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.ClientConfiguration] = js.native
    
    var lookoutvision: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ClientConfiguration] = js.native
    
    var m2: js.UndefOr[typings.awsSdk.clientsM2Mod.ClientConfiguration] = js.native
    
    var machinelearning: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.ClientConfiguration] = js.native
    
    var macie: js.UndefOr[typings.awsSdk.clientsMacieMod.ClientConfiguration] = js.native
    
    var macie2: js.UndefOr[typings.awsSdk.clientsMacie2Mod.ClientConfiguration] = js.native
    
    var managedblockchain: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.ClientConfiguration] = js.native
    
    var marketplacecatalog: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration] = js.native
    
    var marketplacecommerceanalytics: js.UndefOr[typings.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration] = js.native
    
    var marketplaceentitlementservice: js.UndefOr[typings.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration] = js.native
    
    var marketplacemetering: js.UndefOr[typings.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration] = js.native
    
    var mediaconnect: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.ClientConfiguration] = js.native
    
    var mediaconvert: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ClientConfiguration] = js.native
    
    var medialive: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ClientConfiguration] = js.native
    
    var mediapackage: js.UndefOr[typings.awsSdk.clientsMediapackageMod.ClientConfiguration] = js.native
    
    var mediapackagevod: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.ClientConfiguration] = js.native
    
    var mediastore: js.UndefOr[typings.awsSdk.clientsMediastoreMod.ClientConfiguration] = js.native
    
    var mediastoredata: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.ClientConfiguration] = js.native
    
    var mediatailor: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ClientConfiguration] = js.native
    
    var memorydb: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ClientConfiguration] = js.native
    
    var mgn: js.UndefOr[typings.awsSdk.clientsMgnMod.ClientConfiguration] = js.native
    
    var migrationhub: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ClientConfiguration] = js.native
    
    var migrationhubconfig: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration] = js.native
    
    var migrationhuborchestrator: js.UndefOr[typings.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration] = js.native
    
    var migrationhubrefactorspaces: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration] = js.native
    
    var migrationhubstrategy: js.UndefOr[typings.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration] = js.native
    
    var mobile: js.UndefOr[typings.awsSdk.clientsMobileMod.ClientConfiguration] = js.native
    
    var mobileanalytics: js.UndefOr[typings.awsSdk.clientsMobileanalyticsMod.ClientConfiguration] = js.native
    
    var mq: js.UndefOr[typings.awsSdk.clientsMqMod.ClientConfiguration] = js.native
    
    var mturk: js.UndefOr[typings.awsSdk.clientsMturkMod.ClientConfiguration] = js.native
    
    var mwaa: js.UndefOr[typings.awsSdk.clientsMwaaMod.ClientConfiguration] = js.native
    
    var neptune: js.UndefOr[typings.awsSdk.clientsNeptuneMod.ClientConfiguration] = js.native
    
    var networkfirewall: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ClientConfiguration] = js.native
    
    var networkmanager: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientConfiguration] = js.native
    
    var nimble: js.UndefOr[typings.awsSdk.clientsNimbleMod.ClientConfiguration] = js.native
    
    var oam: js.UndefOr[typings.awsSdk.clientsOamMod.ClientConfiguration] = js.native
    
    var omics: js.UndefOr[typings.awsSdk.clientsOmicsMod.ClientConfiguration] = js.native
    
    var opensearch: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ClientConfiguration] = js.native
    
    var opensearchserverless: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.ClientConfiguration] = js.native
    
    var opsworks: js.UndefOr[typings.awsSdk.clientsOpsworksMod.ClientConfiguration] = js.native
    
    var opsworkscm: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.ClientConfiguration] = js.native
    
    var organizations: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.ClientConfiguration] = js.native
    
    var osis: js.UndefOr[typings.awsSdk.clientsOsisMod.ClientConfiguration] = js.native
    
    var outposts: js.UndefOr[typings.awsSdk.clientsOutpostsMod.ClientConfiguration] = js.native
    
    var panorama: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ClientConfiguration] = js.native
    
    var personalize: js.UndefOr[typings.awsSdk.clientsPersonalizeMod.ClientConfiguration] = js.native
    
    var personalizeevents: js.UndefOr[typings.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration] = js.native
    
    var personalizeruntime: js.UndefOr[typings.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration] = js.native
    
    var pi: js.UndefOr[typings.awsSdk.clientsPiMod.ClientConfiguration] = js.native
    
    var pinpoint: js.UndefOr[typings.awsSdk.clientsPinpointMod.ClientConfiguration] = js.native
    
    var pinpointemail: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.ClientConfiguration] = js.native
    
    var pinpointsmsvoice: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration] = js.native
    
    var pinpointsmsvoicev2: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration] = js.native
    
    var pipes: js.UndefOr[typings.awsSdk.clientsPipesMod.ClientConfiguration] = js.native
    
    var polly: js.UndefOr[typings.awsSdk.clientsPollyMod.ClientConfiguration] = js.native
    
    var pricing: js.UndefOr[typings.awsSdk.clientsPricingMod.ClientConfiguration] = js.native
    
    var privatenetworks: js.UndefOr[typings.awsSdk.clientsPrivatenetworksMod.ClientConfiguration] = js.native
    
    var proton: js.UndefOr[typings.awsSdk.clientsProtonMod.ClientConfiguration] = js.native
    
    var qldb: js.UndefOr[typings.awsSdk.clientsQldbMod.ClientConfiguration] = js.native
    
    var qldbsession: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.ClientConfiguration] = js.native
    
    var quicksight: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ClientConfiguration] = js.native
    
    var ram: js.UndefOr[typings.awsSdk.clientsRamMod.ClientConfiguration] = js.native
    
    var rbin: js.UndefOr[typings.awsSdk.clientsRbinMod.ClientConfiguration] = js.native
    
    var rds: js.UndefOr[typings.awsSdk.clientsRdsMod.ClientConfiguration] = js.native
    
    var rdsdataservice: js.UndefOr[typings.awsSdk.clientsRdsdataserviceMod.ClientConfiguration] = js.native
    
    var redshift: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClientConfiguration] = js.native
    
    var redshiftdata: js.UndefOr[typings.awsSdk.clientsRedshiftdataMod.ClientConfiguration] = js.native
    
    var redshiftserverless: js.UndefOr[typings.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration] = js.native
    
    var rekognition: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ClientConfiguration] = js.native
    
    var resiliencehub: js.UndefOr[typings.awsSdk.clientsResiliencehubMod.ClientConfiguration] = js.native
    
    var resourceexplorer2: js.UndefOr[typings.awsSdk.clientsResourceexplorer2Mod.ClientConfiguration] = js.native
    
    var resourcegroups: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ClientConfiguration] = js.native
    
    var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration] = js.native
    
    var robomaker: js.UndefOr[typings.awsSdk.clientsRobomakerMod.ClientConfiguration] = js.native
    
    var rolesanywhere: js.UndefOr[typings.awsSdk.clientsRolesanywhereMod.ClientConfiguration] = js.native
    
    var route53: js.UndefOr[typings.awsSdk.clientsRoute53Mod.ClientConfiguration] = js.native
    
    var route53domains: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.ClientConfiguration] = js.native
    
    var route53recoverycluster: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration] = js.native
    
    var route53recoverycontrolconfig: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration] = js.native
    
    var route53recoveryreadiness: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration] = js.native
    
    var route53resolver: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ClientConfiguration] = js.native
    
    var rum: js.UndefOr[typings.awsSdk.clientsRumMod.ClientConfiguration] = js.native
    
    var s3: js.UndefOr[typings.awsSdk.clientsS3Mod.ClientConfiguration] = js.native
    
    var s3control: js.UndefOr[typings.awsSdk.clientsS3controlMod.ClientConfiguration] = js.native
    
    var s3outposts: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.ClientConfiguration] = js.native
    
    var sagemaker: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ClientConfiguration] = js.native
    
    var sagemakeredge: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.ClientConfiguration] = js.native
    
    var sagemakerfeaturestoreruntime: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration] = js.native
    
    var sagemakergeospatial: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ClientConfiguration] = js.native
    
    var sagemakermetrics: js.UndefOr[typings.awsSdk.clientsSagemakermetricsMod.ClientConfiguration] = js.native
    
    var sagemakerruntime: js.UndefOr[typings.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration] = js.native
    
    var savingsplans: js.UndefOr[typings.awsSdk.clientsSavingsplansMod.ClientConfiguration] = js.native
    
    var scheduler: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ClientConfiguration] = js.native
    
    var schemas: js.UndefOr[typings.awsSdk.clientsSchemasMod.ClientConfiguration] = js.native
    
    var secretsmanager: js.UndefOr[typings.awsSdk.clientsSecretsmanagerMod.ClientConfiguration] = js.native
    
    var securityhub: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.ClientConfiguration] = js.native
    
    var securitylake: js.UndefOr[typings.awsSdk.clientsSecuritylakeMod.ClientConfiguration] = js.native
    
    var serverlessapplicationrepository: js.UndefOr[typings.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration] = js.native
    
    var servicecatalog: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ClientConfiguration] = js.native
    
    var servicecatalogappregistry: js.UndefOr[typings.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration] = js.native
    
    var servicediscovery: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.ClientConfiguration] = js.native
    
    var servicequotas: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ClientConfiguration] = js.native
    
    var ses: js.UndefOr[typings.awsSdk.clientsSesMod.ClientConfiguration] = js.native
    
    var sesv2: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ClientConfiguration] = js.native
    
    var shield: js.UndefOr[typings.awsSdk.clientsShieldMod.ClientConfiguration] = js.native
    
    var signer: js.UndefOr[typings.awsSdk.clientsSignerMod.ClientConfiguration] = js.native
    
    var simpledb: js.UndefOr[typings.awsSdk.clientsSimpledbMod.ClientConfiguration] = js.native
    
    var simspaceweaver: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ClientConfiguration] = js.native
    
    var sms: js.UndefOr[typings.awsSdk.clientsSmsMod.ClientConfiguration] = js.native
    
    var snowball: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClientConfiguration] = js.native
    
    var snowdevicemanagement: js.UndefOr[typings.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration] = js.native
    
    var sns: js.UndefOr[typings.awsSdk.clientsSnsMod.ClientConfiguration] = js.native
    
    var sqs: js.UndefOr[typings.awsSdk.clientsSqsMod.ClientConfiguration] = js.native
    
    var ssm: js.UndefOr[typings.awsSdk.clientsSsmMod.ClientConfiguration] = js.native
    
    var ssmcontacts: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.ClientConfiguration] = js.native
    
    var ssmincidents: js.UndefOr[typings.awsSdk.clientsSsmincidentsMod.ClientConfiguration] = js.native
    
    var ssmsap: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ClientConfiguration] = js.native
    
    var sso: js.UndefOr[typings.awsSdk.clientsSsoMod.ClientConfiguration] = js.native
    
    var ssoadmin: js.UndefOr[typings.awsSdk.clientsSsoadminMod.ClientConfiguration] = js.native
    
    var ssooidc: js.UndefOr[typings.awsSdk.clientsSsooidcMod.ClientConfiguration] = js.native
    
    var stepfunctions: js.UndefOr[typings.awsSdk.clientsStepfunctionsMod.ClientConfiguration] = js.native
    
    var storagegateway: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ClientConfiguration] = js.native
    
    var sts: js.UndefOr[typings.awsSdk.clientsStsMod.ClientConfiguration] = js.native
    
    var support: js.UndefOr[typings.awsSdk.clientsSupportMod.ClientConfiguration] = js.native
    
    var supportapp: js.UndefOr[typings.awsSdk.clientsSupportappMod.ClientConfiguration] = js.native
    
    var swf: js.UndefOr[typings.awsSdk.clientsSwfMod.ClientConfiguration] = js.native
    
    var synthetics: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.ClientConfiguration] = js.native
    
    var textract: js.UndefOr[typings.awsSdk.clientsTextractMod.ClientConfiguration] = js.native
    
    var timestreamquery: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ClientConfiguration] = js.native
    
    var timestreamwrite: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.ClientConfiguration] = js.native
    
    var tnb: js.UndefOr[typings.awsSdk.clientsTnbMod.ClientConfiguration] = js.native
    
    var transcribeservice: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ClientConfiguration] = js.native
    
    var transfer: js.UndefOr[typings.awsSdk.clientsTransferMod.ClientConfiguration] = js.native
    
    var translate: js.UndefOr[typings.awsSdk.clientsTranslateMod.ClientConfiguration] = js.native
    
    var voiceid: js.UndefOr[typings.awsSdk.clientsVoiceidMod.ClientConfiguration] = js.native
    
    var vpclattice: js.UndefOr[typings.awsSdk.clientsVpclatticeMod.ClientConfiguration] = js.native
    
    var waf: js.UndefOr[typings.awsSdk.clientsWafMod.ClientConfiguration] = js.native
    
    var wafregional: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ClientConfiguration] = js.native
    
    var wafv2: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ClientConfiguration] = js.native
    
    var wellarchitected: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ClientConfiguration] = js.native
    
    var wisdom: js.UndefOr[typings.awsSdk.clientsWisdomMod.ClientConfiguration] = js.native
    
    var workdocs: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.ClientConfiguration] = js.native
    
    var worklink: js.UndefOr[typings.awsSdk.clientsWorklinkMod.ClientConfiguration] = js.native
    
    var workmail: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ClientConfiguration] = js.native
    
    var workmailmessageflow: js.UndefOr[typings.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration] = js.native
    
    var workspaces: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ClientConfiguration] = js.native
    
    var workspacesweb: js.UndefOr[typings.awsSdk.clientsWorkspaceswebMod.ClientConfiguration] = js.native
    
    var xray: js.UndefOr[typings.awsSdk.clientsXrayMod.ClientConfiguration] = js.native
  }
}
