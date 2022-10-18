package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.CAPTCHA
  - typings.awsSdk.awsSdkStrings.EXCLUDED_AS_COUNT
  - java.lang.String
*/
type ActionValue = _ActionValue | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MATCH
  - typings.awsSdk.awsSdkStrings.NO_MATCH
  - typings.awsSdk.awsSdkStrings.EVALUATE_AS_STRING
  - java.lang.String
*/
type BodyParsingFallbackBehavior = _BodyParsingFallbackBehavior | String

type Boolean = scala.Boolean

type CapacityUnit = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.LE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.GT
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type Conditions = js.Array[Condition]

type ConsumedCapacity = Double

type CookieNames = js.Array[SingleCookieName]

type Country = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AF
  - typings.awsSdk.awsSdkStrings.AX
  - typings.awsSdk.awsSdkStrings.AL
  - typings.awsSdk.awsSdkStrings.DZ
  - typings.awsSdk.awsSdkStrings.AS
  - typings.awsSdk.awsSdkStrings.AD
  - typings.awsSdk.awsSdkStrings.AO
  - typings.awsSdk.awsSdkStrings.AI
  - typings.awsSdk.awsSdkStrings.AQ
  - typings.awsSdk.awsSdkStrings.AG
  - typings.awsSdk.awsSdkStrings.AR
  - typings.awsSdk.awsSdkStrings.AM
  - typings.awsSdk.awsSdkStrings.AW
  - typings.awsSdk.awsSdkStrings.AU
  - typings.awsSdk.awsSdkStrings.AT
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.BS
  - typings.awsSdk.awsSdkStrings.BH
  - typings.awsSdk.awsSdkStrings.BD
  - typings.awsSdk.awsSdkStrings.BB
  - typings.awsSdk.awsSdkStrings.BY
  - typings.awsSdk.awsSdkStrings.BE
  - typings.awsSdk.awsSdkStrings.BZ
  - typings.awsSdk.awsSdkStrings.BJ
  - typings.awsSdk.awsSdkStrings.BM
  - typings.awsSdk.awsSdkStrings.BT
  - typings.awsSdk.awsSdkStrings.BO
  - typings.awsSdk.awsSdkStrings.BQ
  - typings.awsSdk.awsSdkStrings.BA
  - typings.awsSdk.awsSdkStrings.BW
  - typings.awsSdk.awsSdkStrings.BV
  - typings.awsSdk.awsSdkStrings.BR
  - typings.awsSdk.awsSdkStrings.IO
  - typings.awsSdk.awsSdkStrings.BN
  - typings.awsSdk.awsSdkStrings.BG
  - typings.awsSdk.awsSdkStrings.BF
  - typings.awsSdk.awsSdkStrings.BI
  - typings.awsSdk.awsSdkStrings.KH
  - typings.awsSdk.awsSdkStrings.CM
  - typings.awsSdk.awsSdkStrings.CA
  - typings.awsSdk.awsSdkStrings.CV
  - typings.awsSdk.awsSdkStrings.KY
  - typings.awsSdk.awsSdkStrings.CF
  - typings.awsSdk.awsSdkStrings.TD
  - typings.awsSdk.awsSdkStrings.CL
  - typings.awsSdk.awsSdkStrings.CN
  - typings.awsSdk.awsSdkStrings.CX
  - typings.awsSdk.awsSdkStrings.CC
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.KM
  - typings.awsSdk.awsSdkStrings.CG
  - typings.awsSdk.awsSdkStrings.CD
  - typings.awsSdk.awsSdkStrings.CK
  - typings.awsSdk.awsSdkStrings.CR
  - typings.awsSdk.awsSdkStrings.CI
  - typings.awsSdk.awsSdkStrings.HR
  - typings.awsSdk.awsSdkStrings.CU
  - typings.awsSdk.awsSdkStrings.CW
  - typings.awsSdk.awsSdkStrings.CY
  - typings.awsSdk.awsSdkStrings.CZ
  - typings.awsSdk.awsSdkStrings.DK
  - typings.awsSdk.awsSdkStrings.DJ
  - typings.awsSdk.awsSdkStrings.DM
  - typings.awsSdk.awsSdkStrings.DO
  - typings.awsSdk.awsSdkStrings.EC
  - typings.awsSdk.awsSdkStrings.EG
  - typings.awsSdk.awsSdkStrings.SV
  - typings.awsSdk.awsSdkStrings.GQ
  - typings.awsSdk.awsSdkStrings.ER
  - typings.awsSdk.awsSdkStrings.EE
  - typings.awsSdk.awsSdkStrings.ET
  - typings.awsSdk.awsSdkStrings.FK
  - typings.awsSdk.awsSdkStrings.FO
  - typings.awsSdk.awsSdkStrings.FJ
  - typings.awsSdk.awsSdkStrings.FI
  - typings.awsSdk.awsSdkStrings.FR
  - typings.awsSdk.awsSdkStrings.GF
  - typings.awsSdk.awsSdkStrings.PF
  - typings.awsSdk.awsSdkStrings.TF
  - typings.awsSdk.awsSdkStrings.GA
  - typings.awsSdk.awsSdkStrings.GM
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.DE
  - typings.awsSdk.awsSdkStrings.GH
  - typings.awsSdk.awsSdkStrings.GI
  - typings.awsSdk.awsSdkStrings.GR
  - typings.awsSdk.awsSdkStrings.GL
  - typings.awsSdk.awsSdkStrings.GD
  - typings.awsSdk.awsSdkStrings.GP
  - typings.awsSdk.awsSdkStrings.GU
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GG
  - typings.awsSdk.awsSdkStrings.GN
  - typings.awsSdk.awsSdkStrings.GW
  - typings.awsSdk.awsSdkStrings.GY
  - typings.awsSdk.awsSdkStrings.HT
  - typings.awsSdk.awsSdkStrings.HM
  - typings.awsSdk.awsSdkStrings.VA
  - typings.awsSdk.awsSdkStrings.HN
  - typings.awsSdk.awsSdkStrings.HK
  - typings.awsSdk.awsSdkStrings.HU
  - typings.awsSdk.awsSdkStrings.IS
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.ID
  - typings.awsSdk.awsSdkStrings.IR
  - typings.awsSdk.awsSdkStrings.IQ
  - typings.awsSdk.awsSdkStrings.IE
  - typings.awsSdk.awsSdkStrings.IM
  - typings.awsSdk.awsSdkStrings.IL
  - typings.awsSdk.awsSdkStrings.IT
  - typings.awsSdk.awsSdkStrings.JM
  - typings.awsSdk.awsSdkStrings.JP
  - typings.awsSdk.awsSdkStrings.JE
  - typings.awsSdk.awsSdkStrings.JO
  - typings.awsSdk.awsSdkStrings.KZ
  - typings.awsSdk.awsSdkStrings.KE
  - typings.awsSdk.awsSdkStrings.KI
  - typings.awsSdk.awsSdkStrings.KP
  - typings.awsSdk.awsSdkStrings.KR
  - typings.awsSdk.awsSdkStrings.KW
  - typings.awsSdk.awsSdkStrings.KG
  - typings.awsSdk.awsSdkStrings.LA
  - typings.awsSdk.awsSdkStrings.LV
  - typings.awsSdk.awsSdkStrings.LB
  - typings.awsSdk.awsSdkStrings.LS
  - typings.awsSdk.awsSdkStrings.LR
  - typings.awsSdk.awsSdkStrings.LY
  - typings.awsSdk.awsSdkStrings.LI
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LU
  - typings.awsSdk.awsSdkStrings.MO
  - typings.awsSdk.awsSdkStrings.MK
  - typings.awsSdk.awsSdkStrings.MG
  - typings.awsSdk.awsSdkStrings.MW
  - typings.awsSdk.awsSdkStrings.MY
  - typings.awsSdk.awsSdkStrings.MV
  - typings.awsSdk.awsSdkStrings.ML
  - typings.awsSdk.awsSdkStrings.MT
  - typings.awsSdk.awsSdkStrings.MH
  - typings.awsSdk.awsSdkStrings.MQ
  - typings.awsSdk.awsSdkStrings.MR
  - typings.awsSdk.awsSdkStrings.MU
  - typings.awsSdk.awsSdkStrings.YT
  - typings.awsSdk.awsSdkStrings.MX
  - typings.awsSdk.awsSdkStrings.FM
  - typings.awsSdk.awsSdkStrings.MD
  - typings.awsSdk.awsSdkStrings.MC
  - typings.awsSdk.awsSdkStrings.MN
  - typings.awsSdk.awsSdkStrings.ME
  - typings.awsSdk.awsSdkStrings.MS
  - typings.awsSdk.awsSdkStrings.MA
  - typings.awsSdk.awsSdkStrings.MZ
  - typings.awsSdk.awsSdkStrings.MM
  - typings.awsSdk.awsSdkStrings.NA
  - typings.awsSdk.awsSdkStrings.NR
  - typings.awsSdk.awsSdkStrings.NP
  - typings.awsSdk.awsSdkStrings.NL
  - typings.awsSdk.awsSdkStrings.NC
  - typings.awsSdk.awsSdkStrings.NZ
  - typings.awsSdk.awsSdkStrings.NI
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.NG
  - typings.awsSdk.awsSdkStrings.NU
  - typings.awsSdk.awsSdkStrings.NF
  - typings.awsSdk.awsSdkStrings.MP
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.OM
  - typings.awsSdk.awsSdkStrings.PK
  - typings.awsSdk.awsSdkStrings.PW
  - typings.awsSdk.awsSdkStrings.PS
  - typings.awsSdk.awsSdkStrings.PA
  - typings.awsSdk.awsSdkStrings.PG
  - typings.awsSdk.awsSdkStrings.PY
  - typings.awsSdk.awsSdkStrings.PE
  - typings.awsSdk.awsSdkStrings.PH
  - typings.awsSdk.awsSdkStrings.PN
  - typings.awsSdk.awsSdkStrings.PL
  - typings.awsSdk.awsSdkStrings.PT
  - typings.awsSdk.awsSdkStrings.PR
  - typings.awsSdk.awsSdkStrings.QA
  - typings.awsSdk.awsSdkStrings.RE
  - typings.awsSdk.awsSdkStrings.RO
  - typings.awsSdk.awsSdkStrings.RU
  - typings.awsSdk.awsSdkStrings.RW
  - typings.awsSdk.awsSdkStrings.BL
  - typings.awsSdk.awsSdkStrings.SH
  - typings.awsSdk.awsSdkStrings.KN
  - typings.awsSdk.awsSdkStrings.LC
  - typings.awsSdk.awsSdkStrings.MF
  - typings.awsSdk.awsSdkStrings.PM
  - typings.awsSdk.awsSdkStrings.VC
  - typings.awsSdk.awsSdkStrings.WS
  - typings.awsSdk.awsSdkStrings.SM
  - typings.awsSdk.awsSdkStrings.ST
  - typings.awsSdk.awsSdkStrings.SA
  - typings.awsSdk.awsSdkStrings.SN
  - typings.awsSdk.awsSdkStrings.RS
  - typings.awsSdk.awsSdkStrings.SC
  - typings.awsSdk.awsSdkStrings.SL
  - typings.awsSdk.awsSdkStrings.SG
  - typings.awsSdk.awsSdkStrings.SX
  - typings.awsSdk.awsSdkStrings.SK
  - typings.awsSdk.awsSdkStrings.SI
  - typings.awsSdk.awsSdkStrings.SB
  - typings.awsSdk.awsSdkStrings.SO
  - typings.awsSdk.awsSdkStrings.ZA
  - typings.awsSdk.awsSdkStrings.GS
  - typings.awsSdk.awsSdkStrings.SS
  - typings.awsSdk.awsSdkStrings.ES
  - typings.awsSdk.awsSdkStrings.LK
  - typings.awsSdk.awsSdkStrings.SD
  - typings.awsSdk.awsSdkStrings.SR
  - typings.awsSdk.awsSdkStrings.SJ
  - typings.awsSdk.awsSdkStrings.SZ
  - typings.awsSdk.awsSdkStrings.SE
  - typings.awsSdk.awsSdkStrings.CH
  - typings.awsSdk.awsSdkStrings.SY
  - typings.awsSdk.awsSdkStrings.TW
  - typings.awsSdk.awsSdkStrings.TJ
  - typings.awsSdk.awsSdkStrings.TZ
  - typings.awsSdk.awsSdkStrings.TH
  - typings.awsSdk.awsSdkStrings.TL
  - typings.awsSdk.awsSdkStrings.TG
  - typings.awsSdk.awsSdkStrings.TK
  - typings.awsSdk.awsSdkStrings.TO
  - typings.awsSdk.awsSdkStrings.TT
  - typings.awsSdk.awsSdkStrings.TN
  - typings.awsSdk.awsSdkStrings.TR
  - typings.awsSdk.awsSdkStrings.TM
  - typings.awsSdk.awsSdkStrings.TC
  - typings.awsSdk.awsSdkStrings.TV
  - typings.awsSdk.awsSdkStrings.UG
  - typings.awsSdk.awsSdkStrings.UA
  - typings.awsSdk.awsSdkStrings.AE
  - typings.awsSdk.awsSdkStrings.GB
  - typings.awsSdk.awsSdkStrings.US
  - typings.awsSdk.awsSdkStrings.UM
  - typings.awsSdk.awsSdkStrings.UY
  - typings.awsSdk.awsSdkStrings.UZ
  - typings.awsSdk.awsSdkStrings.VU
  - typings.awsSdk.awsSdkStrings.VE
  - typings.awsSdk.awsSdkStrings.VN
  - typings.awsSdk.awsSdkStrings.VG
  - typings.awsSdk.awsSdkStrings.VI
  - typings.awsSdk.awsSdkStrings.WF
  - typings.awsSdk.awsSdkStrings.EH
  - typings.awsSdk.awsSdkStrings.YE
  - typings.awsSdk.awsSdkStrings.ZM
  - typings.awsSdk.awsSdkStrings.ZW
  - typings.awsSdk.awsSdkStrings.XK
  - java.lang.String
*/
type CountryCode = _CountryCode | String

type CountryCodes = js.Array[CountryCode]

type CustomHTTPHeaderName = String

type CustomHTTPHeaderValue = String

type CustomHTTPHeaders = js.Array[CustomHTTPHeader]

type CustomResponseBodies = StringDictionary[CustomResponseBody]

type DownloadUrl = String

type EntityDescription = String

type EntityId = String

type EntityName = String

type ExcludedRules = js.Array[ExcludedRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TOKEN_MISSING
  - typings.awsSdk.awsSdkStrings.TOKEN_EXPIRED
  - java.lang.String
*/
type FailureReason = _FailureReason | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MATCH
  - typings.awsSdk.awsSdkStrings.NO_MATCH
  - java.lang.String
*/
type FallbackBehavior = _FallbackBehavior | String

type FieldIdentifier = String

type FieldToMatchData = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEEP
  - typings.awsSdk.awsSdkStrings.DROP
  - java.lang.String
*/
type FilterBehavior = _FilterBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MEETS_ALL
  - typings.awsSdk.awsSdkStrings.MEETS_ANY
  - java.lang.String
*/
type FilterRequirement = _FilterRequirement | String

type Filters = js.Array[Filter]

type FirewallManagerRuleGroups = js.Array[FirewallManagerRuleGroup]

type ForwardedIPHeaderName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIRST
  - typings.awsSdk.awsSdkStrings.LAST
  - typings.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type ForwardedIPPosition = _ForwardedIPPosition | String

type HTTPHeaders = js.Array[HTTPHeader]

type HTTPMethod = String

type HTTPVersion = String

type HeaderName = String

type HeaderNames = js.Array[FieldToMatchData]

type HeaderValue = String

type IPAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPV4
  - typings.awsSdk.awsSdkStrings.IPV6
  - java.lang.String
*/
type IPAddressVersion = _IPAddressVersion | String

type IPAddresses = js.Array[IPAddress]

type IPSetSummaries = js.Array[IPSetSummary]

type IPString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.KEY
  - typings.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type JsonMatchScope = _JsonMatchScope | String

type JsonPointerPath = String

type JsonPointerPaths = js.Array[JsonPointerPath]

type LabelMatchKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LABEL
  - typings.awsSdk.awsSdkStrings.NAMESPACE
  - java.lang.String
*/
type LabelMatchScope = _LabelMatchScope | String

type LabelName = String

type LabelSummaries = js.Array[LabelSummary]

type Labels = js.Array[Label]

type ListMaxItems = Double

type LockToken = String

type LogDestinationConfigs = js.Array[ResourceArn]

type LoggingConfigurations = js.Array[LoggingConfiguration]

type LoginPathString = String

type ManagedRuleGroupConfigs = js.Array[ManagedRuleGroupConfig]

type ManagedRuleGroupSummaries = js.Array[ManagedRuleGroupSummary]

type ManagedRuleGroupVersions = js.Array[ManagedRuleGroupVersion]

type ManagedRuleSetSummaries = js.Array[ManagedRuleSetSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.KEY
  - typings.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type MapMatchScope = _MapMatchScope | String

type MetricName = String

type NextMarker = String

type OutputUrl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTINUE
  - typings.awsSdk.awsSdkStrings.MATCH
  - typings.awsSdk.awsSdkStrings.NO_MATCH
  - java.lang.String
*/
type OversizeHandling = _OversizeHandling | String

type PaginationLimit = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.FORM_ENCODED
  - java.lang.String
*/
type PayloadType = _PayloadType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IOS
  - typings.awsSdk.awsSdkStrings.ANDROID
  - java.lang.String
*/
type Platform = _Platform | String

type PolicyString = String

type PopulationSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXACTLY
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - typings.awsSdk.awsSdkStrings.ENDS_WITH
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.CONTAINS_WORD
  - java.lang.String
*/
type PositionalConstraint = _PositionalConstraint | String

type PublishedVersions = StringDictionary[ManagedRuleSetVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IP
  - typings.awsSdk.awsSdkStrings.FORWARDED_IP
  - java.lang.String
*/
type RateBasedStatementAggregateKeyType = _RateBasedStatementAggregateKeyType | String

type RateLimit = Double

type RedactedFields = js.Array[FieldToMatch]

type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]

type RegexPatternString = String

type RegularExpressionList = js.Array[Regex]

type ReleaseNotes = String

type ReleaseSummaries = js.Array[ReleaseSummary]

type ResourceArn = String

type ResourceArns = js.Array[ResourceArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
  - typings.awsSdk.awsSdkStrings.API_GATEWAY
  - typings.awsSdk.awsSdkStrings.APPSYNC
  - typings.awsSdk.awsSdkStrings.COGNITO_USER_POOL
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type ResponseCode = Double

type ResponseContent = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXT_PLAIN
  - typings.awsSdk.awsSdkStrings.TEXT_HTML
  - typings.awsSdk.awsSdkStrings.APPLICATION_JSON
  - java.lang.String
*/
type ResponseContentType = _ResponseContentType | String

type ResponseStatusCode = Double

type RuleGroupSummaries = js.Array[RuleGroupSummary]

type RulePriority = Double

type RuleSummaries = js.Array[RuleSummary]

type Rules = js.Array[Rule]

type SampleWeight = Double

type SampledHTTPRequests = js.Array[SampledHTTPRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLOUDFRONT
  - typings.awsSdk.awsSdkStrings.REGIONAL
  - java.lang.String
*/
type Scope = _Scope | String

type SearchString = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type SensitivityLevel = _SensitivityLevel | String

type SingleCookieName = String

type Size = Double

type SolveTimestamp = Double

type Statements = js.Array[Statement]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TextTransformationPriority = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
  - typings.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
  - typings.awsSdk.awsSdkStrings.LOWERCASE
  - typings.awsSdk.awsSdkStrings.CMD_LINE
  - typings.awsSdk.awsSdkStrings.URL_DECODE
  - typings.awsSdk.awsSdkStrings.BASE64_DECODE
  - typings.awsSdk.awsSdkStrings.HEX_DECODE
  - typings.awsSdk.awsSdkStrings.MD5
  - typings.awsSdk.awsSdkStrings.REPLACE_COMMENTS
  - typings.awsSdk.awsSdkStrings.ESCAPE_SEQ_DECODE
  - typings.awsSdk.awsSdkStrings.SQL_HEX_DECODE
  - typings.awsSdk.awsSdkStrings.CSS_DECODE
  - typings.awsSdk.awsSdkStrings.JS_DECODE
  - typings.awsSdk.awsSdkStrings.NORMALIZE_PATH
  - typings.awsSdk.awsSdkStrings.NORMALIZE_PATH_WIN
  - typings.awsSdk.awsSdkStrings.REMOVE_NULLS
  - typings.awsSdk.awsSdkStrings.REPLACE_NULLS
  - typings.awsSdk.awsSdkStrings.BASE64_DECODE_EXT
  - typings.awsSdk.awsSdkStrings.URL_DECODE_UNI
  - typings.awsSdk.awsSdkStrings.UTF8_TO_UNICODE
  - java.lang.String
*/
type TextTransformationType = _TextTransformationType | String

type TextTransformations = js.Array[TextTransformation]

type TimeWindowDay = Double

type TimeWindowSecond = Double

type Timestamp = js.Date

type URIString = String

type VendorName = String

type VersionKeyString = String

type VersionsToPublish = StringDictionary[VersionToPublish]

type WebACLSummaries = js.Array[WebACLSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-07-29`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
