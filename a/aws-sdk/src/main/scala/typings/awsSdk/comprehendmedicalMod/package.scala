package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object comprehendmedicalMod {
  type AnyLengthString = java.lang.String
  type AttributeList = js.Array[typings.awsSdk.comprehendmedicalMod.Attribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIGN
    - typings.awsSdk.awsSdkStrings.SYMPTOM
    - typings.awsSdk.awsSdkStrings.DIAGNOSIS
    - typings.awsSdk.awsSdkStrings.NEGATION
    - java.lang.String
  */
  type AttributeName = typings.awsSdk.comprehendmedicalMod._AttributeName | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.comprehendmedicalMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties]
  type EntityList = js.Array[typings.awsSdk.comprehendmedicalMod.Entity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.DOSAGE
    - typings.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typings.awsSdk.awsSdkStrings.FORM
    - typings.awsSdk.awsSdkStrings.FREQUENCY
    - typings.awsSdk.awsSdkStrings.DURATION
    - typings.awsSdk.awsSdkStrings.GENERIC_NAME
    - typings.awsSdk.awsSdkStrings.BRAND_NAME
    - typings.awsSdk.awsSdkStrings.STRENGTH
    - typings.awsSdk.awsSdkStrings.RATE
    - typings.awsSdk.awsSdkStrings.ACUITY
    - typings.awsSdk.awsSdkStrings.TEST_NAME
    - typings.awsSdk.awsSdkStrings.TEST_VALUE
    - typings.awsSdk.awsSdkStrings.TEST_UNITS
    - typings.awsSdk.awsSdkStrings.PROCEDURE_NAME
    - typings.awsSdk.awsSdkStrings.TREATMENT_NAME
    - typings.awsSdk.awsSdkStrings.DATE
    - typings.awsSdk.awsSdkStrings.AGE
    - typings.awsSdk.awsSdkStrings.CONTACT_POINT
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.IDENTIFIER
    - typings.awsSdk.awsSdkStrings.URL
    - typings.awsSdk.awsSdkStrings.ADDRESS
    - typings.awsSdk.awsSdkStrings.PROFESSION
    - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typings.awsSdk.awsSdkStrings.DIRECTION
    - typings.awsSdk.awsSdkStrings.QUALITY
    - typings.awsSdk.awsSdkStrings.QUANTITY
    - java.lang.String
  */
  type EntitySubType = typings.awsSdk.comprehendmedicalMod._EntitySubType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MEDICATION
    - typings.awsSdk.awsSdkStrings.MEDICAL_CONDITION
    - typings.awsSdk.awsSdkStrings.PROTECTED_HEALTH_INFORMATION
    - typings.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
    - typings.awsSdk.awsSdkStrings.ANATOMY
    - java.lang.String
  */
  type EntityType = typings.awsSdk.comprehendmedicalMod._EntityType | java.lang.String
  type Float = scala.Double
  type ICD10CMAttributeList = js.Array[typings.awsSdk.comprehendmedicalMod.ICD10CMAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACUITY
    - typings.awsSdk.awsSdkStrings.DIRECTION
    - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typings.awsSdk.awsSdkStrings.QUALITY
    - typings.awsSdk.awsSdkStrings.QUANTITY
    - java.lang.String
  */
  type ICD10CMAttributeType = typings.awsSdk.comprehendmedicalMod._ICD10CMAttributeType | java.lang.String
  type ICD10CMConceptList = js.Array[typings.awsSdk.comprehendmedicalMod.ICD10CMConcept]
  type ICD10CMEntityCategory = typings.awsSdk.awsSdkStrings.MEDICAL_CONDITION | java.lang.String
  type ICD10CMEntityList = js.Array[typings.awsSdk.comprehendmedicalMod.ICD10CMEntity]
  type ICD10CMEntityType = typings.awsSdk.awsSdkStrings.DX_NAME | java.lang.String
  type ICD10CMTraitList = js.Array[typings.awsSdk.comprehendmedicalMod.ICD10CMTrait]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEGATION
    - typings.awsSdk.awsSdkStrings.DIAGNOSIS
    - typings.awsSdk.awsSdkStrings.SIGN
    - typings.awsSdk.awsSdkStrings.SYMPTOM
    - java.lang.String
  */
  type ICD10CMTraitName = typings.awsSdk.comprehendmedicalMod._ICD10CMTraitName | java.lang.String
  type IamRoleArn = java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUBMITTED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.comprehendmedicalMod._JobStatus | java.lang.String
  type KMSKey = java.lang.String
  type LanguageCode = typings.awsSdk.awsSdkStrings.en | java.lang.String
  type ManifestFilePath = java.lang.String
  type MaxResultsInteger = scala.Double
  type ModelVersion = java.lang.String
  type OntologyLinkingBoundedLengthString = java.lang.String
  type RxNormAttributeList = js.Array[typings.awsSdk.comprehendmedicalMod.RxNormAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOSAGE
    - typings.awsSdk.awsSdkStrings.DURATION
    - typings.awsSdk.awsSdkStrings.FORM
    - typings.awsSdk.awsSdkStrings.FREQUENCY
    - typings.awsSdk.awsSdkStrings.RATE
    - typings.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typings.awsSdk.awsSdkStrings.STRENGTH
    - java.lang.String
  */
  type RxNormAttributeType = typings.awsSdk.comprehendmedicalMod._RxNormAttributeType | java.lang.String
  type RxNormConceptList = js.Array[typings.awsSdk.comprehendmedicalMod.RxNormConcept]
  type RxNormEntityCategory = typings.awsSdk.awsSdkStrings.MEDICATION | java.lang.String
  type RxNormEntityList = js.Array[typings.awsSdk.comprehendmedicalMod.RxNormEntity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BRAND_NAME
    - typings.awsSdk.awsSdkStrings.GENERIC_NAME
    - java.lang.String
  */
  type RxNormEntityType = typings.awsSdk.comprehendmedicalMod._RxNormEntityType | java.lang.String
  type RxNormTraitList = js.Array[typings.awsSdk.comprehendmedicalMod.RxNormTrait]
  type RxNormTraitName = typings.awsSdk.awsSdkStrings.NEGATION | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type String = java.lang.String
  type Timestamp = typings.std.Date
  type TraitList = js.Array[typings.awsSdk.comprehendmedicalMod.Trait]
  type UnmappedAttributeList = js.Array[typings.awsSdk.comprehendmedicalMod.UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-10-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.comprehendmedicalMod._apiVersion | java.lang.String
}
