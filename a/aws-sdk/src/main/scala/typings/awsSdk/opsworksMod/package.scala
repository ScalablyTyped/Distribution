package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AgentVersions = js.Array[typings.awsSdk.opsworksMod.AgentVersion]

type AppAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DocumentRoot
  - typings.awsSdk.awsSdkStrings.RailsEnv
  - typings.awsSdk.awsSdkStrings.AutoBundleOnDeploy
  - typings.awsSdk.awsSdkStrings.AwsFlowRubySettings
  - java.lang.String
*/
type AppAttributesKeys = typings.awsSdk.opsworksMod._AppAttributesKeys | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`aws-flow-ruby`
  - typings.awsSdk.awsSdkStrings.java_
  - typings.awsSdk.awsSdkStrings.rails
  - typings.awsSdk.awsSdkStrings.php_
  - typings.awsSdk.awsSdkStrings.nodejs
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.other_
  - java.lang.String
*/
type AppType = typings.awsSdk.opsworksMod._AppType | java.lang.String

type Apps = js.Array[typings.awsSdk.opsworksMod.App]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.x86_64_
  - typings.awsSdk.awsSdkStrings.i386
  - java.lang.String
*/
type Architecture = typings.awsSdk.opsworksMod._Architecture | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.load
  - typings.awsSdk.awsSdkStrings.timer
  - java.lang.String
*/
type AutoScalingType = typings.awsSdk.opsworksMod._AutoScalingType | java.lang.String

type BlockDeviceMappings = js.Array[typings.awsSdk.opsworksMod.BlockDeviceMapping]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ascii
  - typings.awsSdk.awsSdkStrings.big5
  - typings.awsSdk.awsSdkStrings.big5hkscs
  - typings.awsSdk.awsSdkStrings.cp037
  - typings.awsSdk.awsSdkStrings.cp424
  - typings.awsSdk.awsSdkStrings.cp437
  - typings.awsSdk.awsSdkStrings.cp500
  - typings.awsSdk.awsSdkStrings.cp720
  - typings.awsSdk.awsSdkStrings.cp737
  - typings.awsSdk.awsSdkStrings.cp775
  - typings.awsSdk.awsSdkStrings.cp850
  - typings.awsSdk.awsSdkStrings.cp852
  - typings.awsSdk.awsSdkStrings.cp855
  - typings.awsSdk.awsSdkStrings.cp856
  - typings.awsSdk.awsSdkStrings.cp857
  - typings.awsSdk.awsSdkStrings.cp858
  - typings.awsSdk.awsSdkStrings.cp860
  - typings.awsSdk.awsSdkStrings.cp861
  - typings.awsSdk.awsSdkStrings.cp862
  - typings.awsSdk.awsSdkStrings.cp863
  - typings.awsSdk.awsSdkStrings.cp864
  - typings.awsSdk.awsSdkStrings.cp865
  - typings.awsSdk.awsSdkStrings.cp866
  - typings.awsSdk.awsSdkStrings.cp869
  - typings.awsSdk.awsSdkStrings.cp874
  - typings.awsSdk.awsSdkStrings.cp875
  - typings.awsSdk.awsSdkStrings.cp932
  - typings.awsSdk.awsSdkStrings.cp949
  - typings.awsSdk.awsSdkStrings.cp950
  - typings.awsSdk.awsSdkStrings.cp1006
  - typings.awsSdk.awsSdkStrings.cp1026
  - typings.awsSdk.awsSdkStrings.cp1140
  - typings.awsSdk.awsSdkStrings.cp1250
  - typings.awsSdk.awsSdkStrings.cp1251
  - typings.awsSdk.awsSdkStrings.cp1252
  - typings.awsSdk.awsSdkStrings.cp1253
  - typings.awsSdk.awsSdkStrings.cp1254
  - typings.awsSdk.awsSdkStrings.cp1255
  - typings.awsSdk.awsSdkStrings.cp1256
  - typings.awsSdk.awsSdkStrings.cp1257
  - typings.awsSdk.awsSdkStrings.cp1258
  - typings.awsSdk.awsSdkStrings.euc_jp
  - typings.awsSdk.awsSdkStrings.euc_jis_2004
  - typings.awsSdk.awsSdkStrings.euc_jisx0213
  - typings.awsSdk.awsSdkStrings.euc_kr
  - typings.awsSdk.awsSdkStrings.gb2312
  - typings.awsSdk.awsSdkStrings.gbk
  - typings.awsSdk.awsSdkStrings.gb18030
  - typings.awsSdk.awsSdkStrings.hz
  - typings.awsSdk.awsSdkStrings.iso2022_jp
  - typings.awsSdk.awsSdkStrings.iso2022_jp_1
  - typings.awsSdk.awsSdkStrings.iso2022_jp_2
  - typings.awsSdk.awsSdkStrings.iso2022_jp_2004
  - typings.awsSdk.awsSdkStrings.iso2022_jp_3
  - typings.awsSdk.awsSdkStrings.iso2022_jp_ext
  - typings.awsSdk.awsSdkStrings.iso2022_kr
  - typings.awsSdk.awsSdkStrings.latin_1
  - typings.awsSdk.awsSdkStrings.iso8859_2
  - typings.awsSdk.awsSdkStrings.iso8859_3
  - typings.awsSdk.awsSdkStrings.iso8859_4
  - typings.awsSdk.awsSdkStrings.iso8859_5
  - typings.awsSdk.awsSdkStrings.iso8859_6
  - typings.awsSdk.awsSdkStrings.iso8859_7
  - typings.awsSdk.awsSdkStrings.iso8859_8
  - typings.awsSdk.awsSdkStrings.iso8859_9
  - typings.awsSdk.awsSdkStrings.iso8859_10
  - typings.awsSdk.awsSdkStrings.iso8859_13
  - typings.awsSdk.awsSdkStrings.iso8859_14
  - typings.awsSdk.awsSdkStrings.iso8859_15
  - typings.awsSdk.awsSdkStrings.iso8859_16
  - typings.awsSdk.awsSdkStrings.johab
  - typings.awsSdk.awsSdkStrings.koi8_r
  - typings.awsSdk.awsSdkStrings.koi8_u
  - typings.awsSdk.awsSdkStrings.mac_cyrillic
  - typings.awsSdk.awsSdkStrings.mac_greek
  - typings.awsSdk.awsSdkStrings.mac_iceland
  - typings.awsSdk.awsSdkStrings.mac_latin2
  - typings.awsSdk.awsSdkStrings.mac_roman
  - typings.awsSdk.awsSdkStrings.mac_turkish
  - typings.awsSdk.awsSdkStrings.ptcp154
  - typings.awsSdk.awsSdkStrings.shift_jis
  - typings.awsSdk.awsSdkStrings.shift_jis_2004
  - typings.awsSdk.awsSdkStrings.shift_jisx0213
  - typings.awsSdk.awsSdkStrings.utf_32
  - typings.awsSdk.awsSdkStrings.utf_32_be
  - typings.awsSdk.awsSdkStrings.utf_32_le
  - typings.awsSdk.awsSdkStrings.utf_16
  - typings.awsSdk.awsSdkStrings.utf_16_be
  - typings.awsSdk.awsSdkStrings.utf_16_le
  - typings.awsSdk.awsSdkStrings.utf_7
  - typings.awsSdk.awsSdkStrings.utf_8
  - typings.awsSdk.awsSdkStrings.utf_8_sig
  - java.lang.String
*/
type CloudWatchLogsEncoding = typings.awsSdk.opsworksMod._CloudWatchLogsEncoding | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.start_of_file
  - typings.awsSdk.awsSdkStrings.end_of_file
  - java.lang.String
*/
type CloudWatchLogsInitialPosition = typings.awsSdk.opsworksMod._CloudWatchLogsInitialPosition | java.lang.String

type CloudWatchLogsLogStreams = js.Array[typings.awsSdk.opsworksMod.CloudWatchLogsLogStream]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOCAL
  - typings.awsSdk.awsSdkStrings.UTC
  - java.lang.String
*/
type CloudWatchLogsTimeZone = typings.awsSdk.opsworksMod._CloudWatchLogsTimeZone | java.lang.String

type Commands = js.Array[typings.awsSdk.opsworksMod.Command]

type DailyAutoScalingSchedule = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.Switch]

type DataSources = js.Array[typings.awsSdk.opsworksMod.DataSource]

type DateTime = java.lang.String

type DeploymentCommandArgs = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.Strings]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.install_dependencies
  - typings.awsSdk.awsSdkStrings.update_dependencies
  - typings.awsSdk.awsSdkStrings.update_custom_cookbooks
  - typings.awsSdk.awsSdkStrings.execute_recipes
  - typings.awsSdk.awsSdkStrings.configure
  - typings.awsSdk.awsSdkStrings.setup_
  - typings.awsSdk.awsSdkStrings.deploy_
  - typings.awsSdk.awsSdkStrings.rollback_
  - typings.awsSdk.awsSdkStrings.start_
  - typings.awsSdk.awsSdkStrings.stop
  - typings.awsSdk.awsSdkStrings.restart
  - typings.awsSdk.awsSdkStrings.undeploy
  - java.lang.String
*/
type DeploymentCommandName = typings.awsSdk.opsworksMod._DeploymentCommandName | java.lang.String

type Deployments = js.Array[typings.awsSdk.opsworksMod.Deployment]

type Double = scala.Double

type EcsClusters = js.Array[typings.awsSdk.opsworksMod.EcsCluster]

type ElasticIps = js.Array[typings.awsSdk.opsworksMod.ElasticIp]

type ElasticLoadBalancers = js.Array[typings.awsSdk.opsworksMod.ElasticLoadBalancer]

type EnvironmentVariables = js.Array[typings.awsSdk.opsworksMod.EnvironmentVariable]

type Hour = java.lang.String

type Instances = js.Array[typings.awsSdk.opsworksMod.Instance]

type Integer = scala.Double

type LayerAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EcsClusterArn
  - typings.awsSdk.awsSdkStrings.EnableHaproxyStats
  - typings.awsSdk.awsSdkStrings.HaproxyStatsUrl
  - typings.awsSdk.awsSdkStrings.HaproxyStatsUser
  - typings.awsSdk.awsSdkStrings.HaproxyStatsPassword
  - typings.awsSdk.awsSdkStrings.HaproxyHealthCheckUrl
  - typings.awsSdk.awsSdkStrings.HaproxyHealthCheckMethod
  - typings.awsSdk.awsSdkStrings.MysqlRootPassword
  - typings.awsSdk.awsSdkStrings.MysqlRootPasswordUbiquitous
  - typings.awsSdk.awsSdkStrings.GangliaUrl
  - typings.awsSdk.awsSdkStrings.GangliaUser
  - typings.awsSdk.awsSdkStrings.GangliaPassword
  - typings.awsSdk.awsSdkStrings.MemcachedMemory
  - typings.awsSdk.awsSdkStrings.NodejsVersion
  - typings.awsSdk.awsSdkStrings.RubyVersion
  - typings.awsSdk.awsSdkStrings.RubygemsVersion
  - typings.awsSdk.awsSdkStrings.ManageBundler
  - typings.awsSdk.awsSdkStrings.BundlerVersion
  - typings.awsSdk.awsSdkStrings.RailsStack
  - typings.awsSdk.awsSdkStrings.PassengerVersion
  - typings.awsSdk.awsSdkStrings.Jvm
  - typings.awsSdk.awsSdkStrings.JvmVersion
  - typings.awsSdk.awsSdkStrings.JvmOptions
  - typings.awsSdk.awsSdkStrings.JavaAppServer
  - typings.awsSdk.awsSdkStrings.JavaAppServerVersion
  - java.lang.String
*/
type LayerAttributesKeys = typings.awsSdk.opsworksMod._LayerAttributesKeys | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`aws-flow-ruby`
  - typings.awsSdk.awsSdkStrings.`ecs-cluster`
  - typings.awsSdk.awsSdkStrings.`java-app`
  - typings.awsSdk.awsSdkStrings.lb_
  - typings.awsSdk.awsSdkStrings.web_
  - typings.awsSdk.awsSdkStrings.`php-app`
  - typings.awsSdk.awsSdkStrings.`rails-app`
  - typings.awsSdk.awsSdkStrings.`nodejs-app`
  - typings.awsSdk.awsSdkStrings.memcached
  - typings.awsSdk.awsSdkStrings.`db-master`
  - typings.awsSdk.awsSdkStrings.`monitoring-master`
  - typings.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type LayerType = typings.awsSdk.opsworksMod._LayerType | java.lang.String

type Layers = js.Array[typings.awsSdk.opsworksMod.Layer]

type LoadBasedAutoScalingConfigurations = js.Array[typings.awsSdk.opsworksMod.LoadBasedAutoScalingConfiguration]

type MaxResults = scala.Double

type Minute = scala.Double

type NextToken = java.lang.String

type OperatingSystemConfigurationManagers = js.Array[typings.awsSdk.opsworksMod.OperatingSystemConfigurationManager]

type OperatingSystems = js.Array[typings.awsSdk.opsworksMod.OperatingSystem]

type Parameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.String]

type Permissions = js.Array[typings.awsSdk.opsworksMod.Permission]

type RaidArrays = js.Array[typings.awsSdk.opsworksMod.RaidArray]

type RdsDbInstances = js.Array[typings.awsSdk.opsworksMod.RdsDbInstance]

type ResourceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ebs_
  - typings.awsSdk.awsSdkStrings.`instance-store`
  - java.lang.String
*/
type RootDeviceType = typings.awsSdk.opsworksMod._RootDeviceType | java.lang.String

type ServiceErrors = js.Array[typings.awsSdk.opsworksMod.ServiceError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.git_
  - typings.awsSdk.awsSdkStrings.svn
  - typings.awsSdk.awsSdkStrings.archive_
  - typings.awsSdk.awsSdkStrings.s3_
  - java.lang.String
*/
type SourceType = typings.awsSdk.opsworksMod._SourceType | java.lang.String

type StackAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.String]

type StackAttributesKeys = typings.awsSdk.awsSdkStrings.Color_ | java.lang.String

type Stacks = js.Array[typings.awsSdk.opsworksMod.Stack]

type String = java.lang.String

type Strings = js.Array[typings.awsSdk.opsworksMod.String]

type Switch = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[typings.awsSdk.opsworksMod.TagKey]

type TagValue = java.lang.String

type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.opsworksMod.TagValue]

type TimeBasedAutoScalingConfigurations = js.Array[typings.awsSdk.opsworksMod.TimeBasedAutoScalingConfiguration]

type UserProfiles = js.Array[typings.awsSdk.opsworksMod.UserProfile]

type ValidForInMinutes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.paravirtual
  - typings.awsSdk.awsSdkStrings.hvm
  - java.lang.String
*/
type VirtualizationType = typings.awsSdk.opsworksMod._VirtualizationType | java.lang.String

type VolumeConfigurations = js.Array[typings.awsSdk.opsworksMod.VolumeConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.gp2
  - typings.awsSdk.awsSdkStrings.io1
  - typings.awsSdk.awsSdkStrings.standard__
  - java.lang.String
*/
type VolumeType = typings.awsSdk.opsworksMod._VolumeType | java.lang.String

type Volumes = js.Array[typings.awsSdk.opsworksMod.Volume]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2013-02-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.opsworksMod._apiVersion | java.lang.String
