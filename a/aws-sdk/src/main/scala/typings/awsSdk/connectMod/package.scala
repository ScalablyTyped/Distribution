package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectMod {
  
  type ARN = java.lang.String
  
  type AfterContactWorkTimeLimit = scala.Double
  
  type AgentFirstName = java.lang.String
  
  type AgentLastName = java.lang.String
  
  type AgentUsername = java.lang.String
  
  type AssociationId = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.connectMod.AttributeValue]
  
  type AttributesList = js.Array[typings.awsSdk.connectMod.Attribute]
  
  type AutoAccept = scala.Boolean
  
  type BotName = java.lang.String
  
  type BucketName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VOICE
    - typings.awsSdk.awsSdkStrings.CHAT
    - java.lang.String
  */
  type Channel = typings.awsSdk.connectMod._Channel | java.lang.String
  
  type Channels = js.Array[typings.awsSdk.connectMod.Channel]
  
  type ChatContent = java.lang.String
  
  type ChatContentType = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.connectMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type Comparison = typings.awsSdk.awsSdkStrings.LT | java.lang.String
  
  type Concurrency = scala.Double
  
  type ContactFlowContent = java.lang.String
  
  type ContactFlowDescription = java.lang.String
  
  type ContactFlowId = java.lang.String
  
  type ContactFlowName = java.lang.String
  
  type ContactFlowSummaryList = js.Array[typings.awsSdk.connectMod.ContactFlowSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONTACT_FLOW
    - typings.awsSdk.awsSdkStrings.CUSTOMER_QUEUE
    - typings.awsSdk.awsSdkStrings.CUSTOMER_HOLD
    - typings.awsSdk.awsSdkStrings.CUSTOMER_WHISPER
    - typings.awsSdk.awsSdkStrings.AGENT_HOLD
    - typings.awsSdk.awsSdkStrings.AGENT_WHISPER
    - typings.awsSdk.awsSdkStrings.OUTBOUND_WHISPER
    - typings.awsSdk.awsSdkStrings.AGENT_TRANSFER
    - typings.awsSdk.awsSdkStrings.QUEUE_TRANSFER
    - java.lang.String
  */
  type ContactFlowType = typings.awsSdk.connectMod._ContactFlowType | java.lang.String
  
  type ContactFlowTypes = js.Array[typings.awsSdk.connectMod.ContactFlowType]
  
  type ContactId = java.lang.String
  
  type CurrentMetricDataCollections = js.Array[typings.awsSdk.connectMod.CurrentMetricData]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AGENTS_ONLINE
    - typings.awsSdk.awsSdkStrings.AGENTS_AVAILABLE
    - typings.awsSdk.awsSdkStrings.AGENTS_ON_CALL
    - typings.awsSdk.awsSdkStrings.AGENTS_NON_PRODUCTIVE
    - typings.awsSdk.awsSdkStrings.AGENTS_AFTER_CONTACT_WORK
    - typings.awsSdk.awsSdkStrings.AGENTS_ERROR
    - typings.awsSdk.awsSdkStrings.AGENTS_STAFFED
    - typings.awsSdk.awsSdkStrings.CONTACTS_IN_QUEUE
    - typings.awsSdk.awsSdkStrings.OLDEST_CONTACT_AGE
    - typings.awsSdk.awsSdkStrings.CONTACTS_SCHEDULED
    - typings.awsSdk.awsSdkStrings.AGENTS_ON_CONTACT
    - typings.awsSdk.awsSdkStrings.SLOTS_ACTIVE
    - typings.awsSdk.awsSdkStrings.SLOTS_AVAILABLE
    - java.lang.String
  */
  type CurrentMetricName = typings.awsSdk.connectMod._CurrentMetricName | java.lang.String
  
  type CurrentMetricResults = js.Array[typings.awsSdk.connectMod.CurrentMetricResult]
  
  type CurrentMetrics = js.Array[typings.awsSdk.connectMod.CurrentMetric]
  
  type Delay = scala.Double
  
  type DirectoryAlias = java.lang.String
  
  type DirectoryId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SAML
    - typings.awsSdk.awsSdkStrings.CONNECT_MANAGED
    - typings.awsSdk.awsSdkStrings.EXISTING_DIRECTORY
    - java.lang.String
  */
  type DirectoryType = typings.awsSdk.connectMod._DirectoryType | java.lang.String
  
  type DirectoryUserId = java.lang.String
  
  type DisplayName = java.lang.String
  
  type Email = java.lang.String
  
  type EncryptionType = typings.awsSdk.awsSdkStrings.KMS | java.lang.String
  
  type FunctionArn = java.lang.String
  
  type FunctionArnsList = js.Array[typings.awsSdk.connectMod.FunctionArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUEUE
    - typings.awsSdk.awsSdkStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = typings.awsSdk.connectMod._Grouping | java.lang.String
  
  type Groupings = js.Array[typings.awsSdk.connectMod.Grouping]
  
  type HierarchyGroupId = java.lang.String
  
  type HierarchyGroupName = java.lang.String
  
  type HierarchyGroupSummaryList = js.Array[typings.awsSdk.connectMod.HierarchyGroupSummary]
  
  type HierarchyLevelId = java.lang.String
  
  type HierarchyLevelName = java.lang.String
  
  type HistoricalMetricDataCollections = js.Array[typings.awsSdk.connectMod.HistoricalMetricData]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONTACTS_QUEUED
    - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED
    - typings.awsSdk.awsSdkStrings.CONTACTS_ABANDONED
    - typings.awsSdk.awsSdkStrings.CONTACTS_CONSULTED
    - typings.awsSdk.awsSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED_INCOMING
    - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED_OUTBOUND
    - typings.awsSdk.awsSdkStrings.CONTACTS_HOLD_ABANDONS
    - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN
    - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT
    - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - typings.awsSdk.awsSdkStrings.CONTACTS_MISSED
    - typings.awsSdk.awsSdkStrings.CALLBACK_CONTACTS_HANDLED
    - typings.awsSdk.awsSdkStrings.API_CONTACTS_HANDLED
    - typings.awsSdk.awsSdkStrings.OCCUPANCY
    - typings.awsSdk.awsSdkStrings.HANDLE_TIME
    - typings.awsSdk.awsSdkStrings.AFTER_CONTACT_WORK_TIME
    - typings.awsSdk.awsSdkStrings.QUEUED_TIME
    - typings.awsSdk.awsSdkStrings.ABANDON_TIME
    - typings.awsSdk.awsSdkStrings.QUEUE_ANSWER_TIME
    - typings.awsSdk.awsSdkStrings.HOLD_TIME
    - typings.awsSdk.awsSdkStrings.INTERACTION_TIME
    - typings.awsSdk.awsSdkStrings.INTERACTION_AND_HOLD_TIME
    - typings.awsSdk.awsSdkStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = typings.awsSdk.connectMod._HistoricalMetricName | java.lang.String
  
  type HistoricalMetricResults = js.Array[typings.awsSdk.connectMod.HistoricalMetricResult]
  
  type HistoricalMetrics = js.Array[typings.awsSdk.connectMod.HistoricalMetric]
  
  type Hours = scala.Double
  
  type HoursOfOperationId = java.lang.String
  
  type HoursOfOperationName = java.lang.String
  
  type HoursOfOperationSummaryList = js.Array[typings.awsSdk.connectMod.HoursOfOperationSummary]
  
  type InboundCallsEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INBOUND_CALLS
    - typings.awsSdk.awsSdkStrings.OUTBOUND_CALLS
    - typings.awsSdk.awsSdkStrings.CONTACTFLOW_LOGS
    - typings.awsSdk.awsSdkStrings.CONTACT_LENS
    - typings.awsSdk.awsSdkStrings.AUTO_RESOLVE_BEST_VOICES
    - typings.awsSdk.awsSdkStrings.USE_CUSTOM_TTS_VOICES
    - typings.awsSdk.awsSdkStrings.EARLY_MEDIA
    - java.lang.String
  */
  type InstanceAttributeType = typings.awsSdk.connectMod._InstanceAttributeType | java.lang.String
  
  type InstanceAttributeValue = java.lang.String
  
  type InstanceId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.CREATION_FAILED
    - java.lang.String
  */
  type InstanceStatus = typings.awsSdk.connectMod._InstanceStatus | java.lang.String
  
  type InstanceStorageConfigs = js.Array[typings.awsSdk.connectMod.InstanceStorageConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CHAT_TRANSCRIPTS
    - typings.awsSdk.awsSdkStrings.CALL_RECORDINGS
    - typings.awsSdk.awsSdkStrings.SCHEDULED_REPORTS
    - typings.awsSdk.awsSdkStrings.MEDIA_STREAMS
    - typings.awsSdk.awsSdkStrings.CONTACT_TRACE_RECORDS
    - typings.awsSdk.awsSdkStrings.AGENT_EVENTS
    - java.lang.String
  */
  type InstanceStorageResourceType = typings.awsSdk.connectMod._InstanceStorageResourceType | java.lang.String
  
  type InstanceSummaryList = js.Array[typings.awsSdk.connectMod.InstanceSummary]
  
  type KeyId = java.lang.String
  
  type LexBotsList = js.Array[typings.awsSdk.connectMod.LexBot]
  
  type LexRegion = java.lang.String
  
  type MaxResult10 = scala.Double
  
  type MaxResult100 = scala.Double
  
  type MaxResult1000 = scala.Double
  
  type MaxResult2 = scala.Double
  
  type MaxResult25 = scala.Double
  
  type MaxResult7 = scala.Double
  
  type MediaConcurrencies = js.Array[typings.awsSdk.connectMod.MediaConcurrency]
  
  type NextToken = java.lang.String
  
  type Origin = java.lang.String
  
  type OriginsList = js.Array[typings.awsSdk.connectMod.Origin]
  
  type OutboundCallsEnabled = scala.Boolean
  
  type PEM = java.lang.String
  
  type ParticipantId = java.lang.String
  
  type ParticipantToken = java.lang.String
  
  type Password = java.lang.String
  
  type PhoneNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AF
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
    - typings.awsSdk.awsSdkStrings.BA
    - typings.awsSdk.awsSdkStrings.BW
    - typings.awsSdk.awsSdkStrings.BR
    - typings.awsSdk.awsSdkStrings.IO
    - typings.awsSdk.awsSdkStrings.VG
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
    - typings.awsSdk.awsSdkStrings.CK
    - typings.awsSdk.awsSdkStrings.CR
    - typings.awsSdk.awsSdkStrings.HR
    - typings.awsSdk.awsSdkStrings.CU
    - typings.awsSdk.awsSdkStrings.CW
    - typings.awsSdk.awsSdkStrings.CY
    - typings.awsSdk.awsSdkStrings.CZ
    - typings.awsSdk.awsSdkStrings.CD
    - typings.awsSdk.awsSdkStrings.DK
    - typings.awsSdk.awsSdkStrings.DJ
    - typings.awsSdk.awsSdkStrings.DM
    - typings.awsSdk.awsSdkStrings.DO
    - typings.awsSdk.awsSdkStrings.TL
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
    - typings.awsSdk.awsSdkStrings.PF
    - typings.awsSdk.awsSdkStrings.GA
    - typings.awsSdk.awsSdkStrings.GM
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.DE
    - typings.awsSdk.awsSdkStrings.GH
    - typings.awsSdk.awsSdkStrings.GI
    - typings.awsSdk.awsSdkStrings.GR
    - typings.awsSdk.awsSdkStrings.GL
    - typings.awsSdk.awsSdkStrings.GD
    - typings.awsSdk.awsSdkStrings.GU
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.GG
    - typings.awsSdk.awsSdkStrings.GN
    - typings.awsSdk.awsSdkStrings.GW
    - typings.awsSdk.awsSdkStrings.GY
    - typings.awsSdk.awsSdkStrings.HT
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
    - typings.awsSdk.awsSdkStrings.CI
    - typings.awsSdk.awsSdkStrings.JM
    - typings.awsSdk.awsSdkStrings.JP
    - typings.awsSdk.awsSdkStrings.JE
    - typings.awsSdk.awsSdkStrings.JO
    - typings.awsSdk.awsSdkStrings.KZ
    - typings.awsSdk.awsSdkStrings.KE
    - typings.awsSdk.awsSdkStrings.KI
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
    - typings.awsSdk.awsSdkStrings.AN
    - typings.awsSdk.awsSdkStrings.NC
    - typings.awsSdk.awsSdkStrings.NZ
    - typings.awsSdk.awsSdkStrings.NI
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.NG
    - typings.awsSdk.awsSdkStrings.NU
    - typings.awsSdk.awsSdkStrings.KP
    - typings.awsSdk.awsSdkStrings.MP
    - typings.awsSdk.awsSdkStrings.NO
    - typings.awsSdk.awsSdkStrings.OM
    - typings.awsSdk.awsSdkStrings.PK
    - typings.awsSdk.awsSdkStrings.PW
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
    - typings.awsSdk.awsSdkStrings.CG
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
    - typings.awsSdk.awsSdkStrings.KR
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
    - typings.awsSdk.awsSdkStrings.TG
    - typings.awsSdk.awsSdkStrings.TK
    - typings.awsSdk.awsSdkStrings.TO
    - typings.awsSdk.awsSdkStrings.TT
    - typings.awsSdk.awsSdkStrings.TN
    - typings.awsSdk.awsSdkStrings.TR
    - typings.awsSdk.awsSdkStrings.TM
    - typings.awsSdk.awsSdkStrings.TC
    - typings.awsSdk.awsSdkStrings.TV
    - typings.awsSdk.awsSdkStrings.VI
    - typings.awsSdk.awsSdkStrings.UG
    - typings.awsSdk.awsSdkStrings.UA
    - typings.awsSdk.awsSdkStrings.AE
    - typings.awsSdk.awsSdkStrings.GB
    - typings.awsSdk.awsSdkStrings.US
    - typings.awsSdk.awsSdkStrings.UY
    - typings.awsSdk.awsSdkStrings.UZ
    - typings.awsSdk.awsSdkStrings.VU
    - typings.awsSdk.awsSdkStrings.VA
    - typings.awsSdk.awsSdkStrings.VE
    - typings.awsSdk.awsSdkStrings.VN
    - typings.awsSdk.awsSdkStrings.WF
    - typings.awsSdk.awsSdkStrings.EH
    - typings.awsSdk.awsSdkStrings.YE
    - typings.awsSdk.awsSdkStrings.ZM
    - typings.awsSdk.awsSdkStrings.ZW
    - java.lang.String
  */
  type PhoneNumberCountryCode = typings.awsSdk.connectMod._PhoneNumberCountryCode | java.lang.String
  
  type PhoneNumberCountryCodes = js.Array[typings.awsSdk.connectMod.PhoneNumberCountryCode]
  
  type PhoneNumberId = java.lang.String
  
  type PhoneNumberSummaryList = js.Array[typings.awsSdk.connectMod.PhoneNumberSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TOLL_FREE
    - typings.awsSdk.awsSdkStrings.DID
    - java.lang.String
  */
  type PhoneNumberType = typings.awsSdk.connectMod._PhoneNumberType | java.lang.String
  
  type PhoneNumberTypes = js.Array[typings.awsSdk.connectMod.PhoneNumberType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SOFT_PHONE
    - typings.awsSdk.awsSdkStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = typings.awsSdk.connectMod._PhoneType | java.lang.String
  
  type Prefix = java.lang.String
  
  type Priority = scala.Double
  
  type PromptId = java.lang.String
  
  type PromptName = java.lang.String
  
  type PromptSummaryList = js.Array[typings.awsSdk.connectMod.PromptSummary]
  
  type QueueId = java.lang.String
  
  type QueueName = java.lang.String
  
  type QueueSummaryList = js.Array[typings.awsSdk.connectMod.QueueSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.AGENT
    - java.lang.String
  */
  type QueueType = typings.awsSdk.connectMod._QueueType | java.lang.String
  
  type QueueTypes = js.Array[typings.awsSdk.connectMod.QueueType]
  
  type Queues = js.Array[typings.awsSdk.connectMod.QueueId]
  
  type RoutingProfileDescription = java.lang.String
  
  type RoutingProfileId = java.lang.String
  
  type RoutingProfileName = java.lang.String
  
  type RoutingProfileQueueConfigList = js.Array[typings.awsSdk.connectMod.RoutingProfileQueueConfig]
  
  type RoutingProfileQueueConfigSummaryList = js.Array[typings.awsSdk.connectMod.RoutingProfileQueueConfigSummary]
  
  type RoutingProfileQueueReferenceList = js.Array[typings.awsSdk.connectMod.RoutingProfileQueueReference]
  
  type RoutingProfileSummaryList = js.Array[typings.awsSdk.connectMod.RoutingProfileSummary]
  
  type SecurityKeysList = js.Array[typings.awsSdk.connectMod.SecurityKey]
  
  type SecurityProfileId = java.lang.String
  
  type SecurityProfileIds = js.Array[typings.awsSdk.connectMod.SecurityProfileId]
  
  type SecurityProfileName = java.lang.String
  
  type SecurityProfileSummaryList = js.Array[typings.awsSdk.connectMod.SecurityProfileSummary]
  
  type SecurityToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUM
    - typings.awsSdk.awsSdkStrings.MAX
    - typings.awsSdk.awsSdkStrings.AVG
    - java.lang.String
  */
  type Statistic = typings.awsSdk.connectMod._Statistic | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.KINESIS_VIDEO_STREAM
    - typings.awsSdk.awsSdkStrings.KINESIS_STREAM
    - typings.awsSdk.awsSdkStrings.KINESIS_FIREHOSE
    - java.lang.String
  */
  type StorageType = typings.awsSdk.connectMod._StorageType | java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.connectMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.connectMod.TagValue]
  
  type TagValue = java.lang.String
  
  type ThresholdValue = scala.Double
  
  type Timestamp_ = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SECONDS
    - typings.awsSdk.awsSdkStrings.COUNT
    - typings.awsSdk.awsSdkStrings.PERCENT
    - java.lang.String
  */
  type Unit = typings.awsSdk.connectMod._Unit | java.lang.String
  
  type UserId = java.lang.String
  
  type UserSummaryList = js.Array[typings.awsSdk.connectMod.UserSummary]
  
  type Value = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FROM_AGENT
    - typings.awsSdk.awsSdkStrings.TO_AGENT
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type VoiceRecordingTrack = typings.awsSdk.connectMod._VoiceRecordingTrack | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-08-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.connectMod._apiVersion | java.lang.String
  
  type timestamp = typings.std.Date
}
