package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wafregionalMod {
  type Action = java.lang.String
  type ActivatedRules = js.Array[typings.awsSdk.wafregionalMod.ActivatedRule]
  type ByteMatchSetSummaries = js.Array[typings.awsSdk.wafregionalMod.ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[typings.awsSdk.wafregionalMod.ByteMatchSetUpdate]
  type ByteMatchTargetString = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.wafregionalMod.Blob | java.lang.String
  type ByteMatchTuples = js.Array[typings.awsSdk.wafregionalMod.ByteMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSERT
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeAction = typings.awsSdk.wafregionalMod._ChangeAction | java.lang.String
  type ChangeToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROVISIONED
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeTokenStatus = typings.awsSdk.wafregionalMod._ChangeTokenStatus | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.wafregionalMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.wafregionalMod._ComparisonOperator | java.lang.String
  type Country = java.lang.String
  type ExcludedRules = js.Array[typings.awsSdk.wafregionalMod.ExcludedRule]
  type GeoMatchConstraintType = typings.awsSdk.awsSdkStrings.Country_ | java.lang.String
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
  type GeoMatchConstraintValue = typings.awsSdk.wafregionalMod._GeoMatchConstraintValue | java.lang.String
  type GeoMatchConstraints = js.Array[typings.awsSdk.wafregionalMod.GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[typings.awsSdk.wafregionalMod.GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[typings.awsSdk.wafregionalMod.GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = scala.Double
  type HTTPHeaders = js.Array[typings.awsSdk.wafregionalMod.HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IPV4
    - typings.awsSdk.awsSdkStrings.IPV6
    - java.lang.String
  */
  type IPSetDescriptorType = typings.awsSdk.wafregionalMod._IPSetDescriptorType | java.lang.String
  type IPSetDescriptorValue = java.lang.String
  type IPSetDescriptors = js.Array[typings.awsSdk.wafregionalMod.IPSetDescriptor]
  type IPSetSummaries = js.Array[typings.awsSdk.wafregionalMod.IPSetSummary]
  type IPSetUpdates = js.Array[typings.awsSdk.wafregionalMod.IPSetUpdate]
  type IPString = java.lang.String
  type LogDestinationConfigs = js.Array[typings.awsSdk.wafregionalMod.ResourceArn]
  type LoggingConfigurations = js.Array[typings.awsSdk.wafregionalMod.LoggingConfiguration]
  type ManagedKey = java.lang.String
  type ManagedKeys = js.Array[typings.awsSdk.wafregionalMod.ManagedKey]
  type MatchFieldData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.URI
    - typings.awsSdk.awsSdkStrings.QUERY_STRING
    - typings.awsSdk.awsSdkStrings.HEADER
    - typings.awsSdk.awsSdkStrings.METHOD
    - typings.awsSdk.awsSdkStrings.BODY
    - typings.awsSdk.awsSdkStrings.SINGLE_QUERY_ARG
    - typings.awsSdk.awsSdkStrings.ALL_QUERY_ARGS
    - java.lang.String
  */
  type MatchFieldType = typings.awsSdk.wafregionalMod._MatchFieldType | java.lang.String
  type MetricName = java.lang.String
  type Negated = scala.Boolean
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
  type PositionalConstraint = typings.awsSdk.wafregionalMod._PositionalConstraint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IPMatch
    - typings.awsSdk.awsSdkStrings.ByteMatch
    - typings.awsSdk.awsSdkStrings.SqlInjectionMatch
    - typings.awsSdk.awsSdkStrings.GeoMatch
    - typings.awsSdk.awsSdkStrings.SizeConstraint
    - typings.awsSdk.awsSdkStrings.XssMatch
    - typings.awsSdk.awsSdkStrings.RegexMatch
    - java.lang.String
  */
  type PredicateType = typings.awsSdk.wafregionalMod._PredicateType | java.lang.String
  type Predicates = js.Array[typings.awsSdk.wafregionalMod.Predicate]
  type RateKey = typings.awsSdk.awsSdkStrings.IP | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[typings.awsSdk.wafregionalMod.FieldToMatch]
  type RegexMatchSetSummaries = js.Array[typings.awsSdk.wafregionalMod.RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[typings.awsSdk.wafregionalMod.RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[typings.awsSdk.wafregionalMod.RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[typings.awsSdk.wafregionalMod.RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[typings.awsSdk.wafregionalMod.RegexPatternSetUpdate]
  type RegexPatternString = java.lang.String
  type RegexPatternStrings = js.Array[typings.awsSdk.wafregionalMod.RegexPatternString]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typings.awsSdk.wafregionalMod.ResourceArn]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
    - typings.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.wafregionalMod._ResourceType | java.lang.String
  type RuleGroupSummaries = js.Array[typings.awsSdk.wafregionalMod.RuleGroupSummary]
  type RuleGroupUpdates = js.Array[typings.awsSdk.wafregionalMod.RuleGroupUpdate]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[typings.awsSdk.wafregionalMod.RuleSummary]
  type RuleUpdates = js.Array[typings.awsSdk.wafregionalMod.RuleUpdate]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[typings.awsSdk.wafregionalMod.SampledHTTPRequest]
  type Size = scala.Double
  type SizeConstraintSetSummaries = js.Array[typings.awsSdk.wafregionalMod.SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[typings.awsSdk.wafregionalMod.SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[typings.awsSdk.wafregionalMod.SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[typings.awsSdk.wafregionalMod.SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[typings.awsSdk.wafregionalMod.SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[typings.awsSdk.wafregionalMod.SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[typings.awsSdk.wafregionalMod.SubscribedRuleGroupSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.wafregionalMod.TagKey]
  type TagList = js.Array[typings.awsSdk.wafregionalMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
    - typings.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
    - typings.awsSdk.awsSdkStrings.LOWERCASE
    - typings.awsSdk.awsSdkStrings.CMD_LINE
    - typings.awsSdk.awsSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformation = typings.awsSdk.wafregionalMod._TextTransformation | java.lang.String
  type Timestamp = typings.std.Date
  type URIString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BLOCK
    - typings.awsSdk.awsSdkStrings.ALLOW
    - typings.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type WafActionType = typings.awsSdk.wafregionalMod._WafActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type WafOverrideActionType = typings.awsSdk.wafregionalMod._WafOverrideActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REGULAR
    - typings.awsSdk.awsSdkStrings.RATE_BASED
    - typings.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type WafRuleType = typings.awsSdk.wafregionalMod._WafRuleType | java.lang.String
  type WebACLSummaries = js.Array[typings.awsSdk.wafregionalMod.WebACLSummary]
  type WebACLUpdates = js.Array[typings.awsSdk.wafregionalMod.WebACLUpdate]
  type XssMatchSetSummaries = js.Array[typings.awsSdk.wafregionalMod.XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[typings.awsSdk.wafregionalMod.XssMatchSetUpdate]
  type XssMatchTuples = js.Array[typings.awsSdk.wafregionalMod.XssMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-11-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.wafregionalMod._apiVersion | java.lang.String
}
