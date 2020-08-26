package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wafv2Mod {
  type Action = java.lang.String
  type Boolean = scala.Boolean
  type CapacityUnit = scala.Double
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.wafv2Mod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.wafv2Mod._ComparisonOperator | java.lang.String
  type ConsumedCapacity = scala.Double
  type Country = java.lang.String
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
    - java.lang.String
  */
  type CountryCode = typings.awsSdk.wafv2Mod._CountryCode | java.lang.String
  type CountryCodes = js.Array[typings.awsSdk.wafv2Mod.CountryCode]
  type EntityDescription = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  type ExcludedRules = js.Array[typings.awsSdk.wafv2Mod.ExcludedRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MATCH
    - typings.awsSdk.awsSdkStrings.NO_MATCH
    - java.lang.String
  */
  type FallbackBehavior = typings.awsSdk.wafv2Mod._FallbackBehavior | java.lang.String
  type FieldToMatchData = java.lang.String
  type FirewallManagerRuleGroups = js.Array[typings.awsSdk.wafv2Mod.FirewallManagerRuleGroup]
  type ForwardedIPHeaderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIRST
    - typings.awsSdk.awsSdkStrings.LAST
    - typings.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type ForwardedIPPosition = typings.awsSdk.wafv2Mod._ForwardedIPPosition | java.lang.String
  type HTTPHeaders = js.Array[typings.awsSdk.wafv2Mod.HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type IPAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IPV4
    - typings.awsSdk.awsSdkStrings.IPV6
    - java.lang.String
  */
  type IPAddressVersion = typings.awsSdk.wafv2Mod._IPAddressVersion | java.lang.String
  type IPAddresses = js.Array[typings.awsSdk.wafv2Mod.IPAddress]
  type IPSetSummaries = js.Array[typings.awsSdk.wafv2Mod.IPSetSummary]
  type IPString = java.lang.String
  type ListMaxItems = scala.Double
  type LockToken = java.lang.String
  type LogDestinationConfigs = js.Array[typings.awsSdk.wafv2Mod.ResourceArn]
  type LoggingConfigurations = js.Array[typings.awsSdk.wafv2Mod.LoggingConfiguration]
  type ManagedRuleGroupSummaries = js.Array[typings.awsSdk.wafv2Mod.ManagedRuleGroupSummary]
  type MetricName = java.lang.String
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PolicyString = java.lang.String
  type PopulationSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EXACTLY
    - typings.awsSdk.awsSdkStrings.STARTS_WITH
    - typings.awsSdk.awsSdkStrings.ENDS_WITH
    - typings.awsSdk.awsSdkStrings.CONTAINS
    - typings.awsSdk.awsSdkStrings.CONTAINS_WORD
    - java.lang.String
  */
  type PositionalConstraint = typings.awsSdk.wafv2Mod._PositionalConstraint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IP
    - typings.awsSdk.awsSdkStrings.FORWARDED_IP
    - java.lang.String
  */
  type RateBasedStatementAggregateKeyType = typings.awsSdk.wafv2Mod._RateBasedStatementAggregateKeyType | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[typings.awsSdk.wafv2Mod.FieldToMatch]
  type RegexPatternSetSummaries = js.Array[typings.awsSdk.wafv2Mod.RegexPatternSetSummary]
  type RegexPatternString = java.lang.String
  type RegularExpressionList = js.Array[typings.awsSdk.wafv2Mod.Regex]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typings.awsSdk.wafv2Mod.ResourceArn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
    - typings.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.wafv2Mod._ResourceType | java.lang.String
  type RuleGroupSummaries = js.Array[typings.awsSdk.wafv2Mod.RuleGroupSummary]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[typings.awsSdk.wafv2Mod.RuleSummary]
  type Rules = js.Array[typings.awsSdk.wafv2Mod.Rule]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[typings.awsSdk.wafv2Mod.SampledHTTPRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUDFRONT
    - typings.awsSdk.awsSdkStrings.REGIONAL
    - java.lang.String
  */
  type Scope = typings.awsSdk.wafv2Mod._Scope | java.lang.String
  type SearchString = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.wafv2Mod.Blob | java.lang.String
  type Size = scala.Double
  type Statements = js.Array[typings.awsSdk.wafv2Mod.Statement]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.wafv2Mod.TagKey]
  type TagList = js.Array[typings.awsSdk.wafv2Mod.Tag]
  type TagValue = java.lang.String
  type TextTransformationPriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
    - typings.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
    - typings.awsSdk.awsSdkStrings.LOWERCASE
    - typings.awsSdk.awsSdkStrings.CMD_LINE
    - typings.awsSdk.awsSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformationType = typings.awsSdk.wafv2Mod._TextTransformationType | java.lang.String
  type TextTransformations = js.Array[typings.awsSdk.wafv2Mod.TextTransformation]
  type Timestamp = typings.std.Date
  type URIString = java.lang.String
  type VendorName = java.lang.String
  type WebACLSummaries = js.Array[typings.awsSdk.wafv2Mod.WebACLSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-07-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.wafv2Mod._apiVersion | java.lang.String
}
