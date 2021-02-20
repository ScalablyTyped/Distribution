package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudsearchMod {
  
  type APIVersion_ = java.lang.String
  
  type ARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.minimal
    - typings.awsSdk.awsSdkStrings.light
    - typings.awsSdk.awsSdkStrings.full_
    - java.lang.String
  */
  type AlgorithmicStemming = typings.awsSdk.cloudsearchMod._AlgorithmicStemming | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ar_
    - typings.awsSdk.awsSdkStrings.bg_
    - typings.awsSdk.awsSdkStrings.ca_
    - typings.awsSdk.awsSdkStrings.cs_
    - typings.awsSdk.awsSdkStrings.da
    - typings.awsSdk.awsSdkStrings.de_
    - typings.awsSdk.awsSdkStrings.el
    - typings.awsSdk.awsSdkStrings.en_
    - typings.awsSdk.awsSdkStrings.es_
    - typings.awsSdk.awsSdkStrings.eu_
    - typings.awsSdk.awsSdkStrings.fa
    - typings.awsSdk.awsSdkStrings.fi_
    - typings.awsSdk.awsSdkStrings.fr_
    - typings.awsSdk.awsSdkStrings.ga_
    - typings.awsSdk.awsSdkStrings.gl_
    - typings.awsSdk.awsSdkStrings.he
    - typings.awsSdk.awsSdkStrings.hi
    - typings.awsSdk.awsSdkStrings.hu_
    - typings.awsSdk.awsSdkStrings.hy
    - typings.awsSdk.awsSdkStrings.id__
    - typings.awsSdk.awsSdkStrings.it_
    - typings.awsSdk.awsSdkStrings.ja_
    - typings.awsSdk.awsSdkStrings.ko
    - typings.awsSdk.awsSdkStrings.lv_
    - typings.awsSdk.awsSdkStrings.mul
    - typings.awsSdk.awsSdkStrings.nl_
    - typings.awsSdk.awsSdkStrings.no_
    - typings.awsSdk.awsSdkStrings.pt_
    - typings.awsSdk.awsSdkStrings.ro_
    - typings.awsSdk.awsSdkStrings.ru_
    - typings.awsSdk.awsSdkStrings.sv_
    - typings.awsSdk.awsSdkStrings.th_
    - typings.awsSdk.awsSdkStrings.tr_
    - typings.awsSdk.awsSdkStrings.`zh-Hans`
    - typings.awsSdk.awsSdkStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = typings.awsSdk.cloudsearchMod._AnalysisSchemeLanguage | java.lang.String
  
  type AnalysisSchemeStatusList = js.Array[typings.awsSdk.cloudsearchMod.AnalysisSchemeStatus]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudsearchMod.ClientApiVersions
  
  type DomainId = java.lang.String
  
  type DomainName = java.lang.String
  
  type DomainNameList = js.Array[typings.awsSdk.cloudsearchMod.DomainName]
  
  type DomainNameMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchMod.APIVersion_]
  
  type DomainStatusList = js.Array[typings.awsSdk.cloudsearchMod.DomainStatus]
  
  type Double = scala.Double
  
  type DynamicFieldName = java.lang.String
  
  type DynamicFieldNameList = js.Array[typings.awsSdk.cloudsearchMod.DynamicFieldName]
  
  type ExpressionStatusList = js.Array[typings.awsSdk.cloudsearchMod.ExpressionStatus]
  
  type ExpressionValue = java.lang.String
  
  type FieldName = java.lang.String
  
  type FieldNameCommaList = java.lang.String
  
  type FieldNameList = js.Array[typings.awsSdk.cloudsearchMod.FieldName]
  
  type FieldValue = java.lang.String
  
  type IndexFieldStatusList = js.Array[typings.awsSdk.cloudsearchMod.IndexFieldStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.int
    - typings.awsSdk.awsSdkStrings.double_
    - typings.awsSdk.awsSdkStrings.literal
    - typings.awsSdk.awsSdkStrings.text_
    - typings.awsSdk.awsSdkStrings.date_
    - typings.awsSdk.awsSdkStrings.latlon
    - typings.awsSdk.awsSdkStrings.`int-array`
    - typings.awsSdk.awsSdkStrings.`double-array`
    - typings.awsSdk.awsSdkStrings.`literal-array`
    - typings.awsSdk.awsSdkStrings.`text-array`
    - typings.awsSdk.awsSdkStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = typings.awsSdk.cloudsearchMod._IndexFieldType | java.lang.String
  
  type InstanceCount = scala.Double
  
  type Long = scala.Double
  
  type MaximumPartitionCount = scala.Double
  
  type MaximumReplicationCount = scala.Double
  
  type MultiAZ = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RequiresIndexDocuments
    - typings.awsSdk.awsSdkStrings.Processing_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = typings.awsSdk.cloudsearchMod._OptionState | java.lang.String
  
  type PartitionCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.searchDotm1Dotsmall
    - typings.awsSdk.awsSdkStrings.searchDotm1Dotlarge
    - typings.awsSdk.awsSdkStrings.searchDotm2Dotxlarge
    - typings.awsSdk.awsSdkStrings.searchDotm2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.searchDotm3Dotmedium
    - typings.awsSdk.awsSdkStrings.searchDotm3Dotlarge
    - typings.awsSdk.awsSdkStrings.searchDotm3Dotxlarge
    - typings.awsSdk.awsSdkStrings.searchDotm3Dot2xlarge
    - java.lang.String
  */
  type PartitionInstanceType = typings.awsSdk.cloudsearchMod._PartitionInstanceType | java.lang.String
  
  type PolicyDocument = java.lang.String
  
  type SearchInstanceType = java.lang.String
  
  type ServiceUrl = java.lang.String
  
  type StandardName = java.lang.String
  
  type StandardNameList = js.Array[typings.awsSdk.cloudsearchMod.StandardName]
  
  type String = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.low__
    - typings.awsSdk.awsSdkStrings.high__
    - java.lang.String
  */
  type SuggesterFuzzyMatching = typings.awsSdk.cloudsearchMod._SuggesterFuzzyMatching | java.lang.String
  
  type SuggesterStatusList = js.Array[typings.awsSdk.cloudsearchMod.SuggesterStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = typings.awsSdk.cloudsearchMod._TLSSecurityPolicy | java.lang.String
  
  type UIntValue = scala.Double
  
  type UpdateTimestamp = typings.std.Date
  
  type Word = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2011-02-01`
    - typings.awsSdk.awsSdkStrings.`2013-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudsearchMod._apiVersion | java.lang.String
}
