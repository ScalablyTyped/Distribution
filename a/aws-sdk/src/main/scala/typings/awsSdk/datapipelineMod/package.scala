package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datapipelineMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.datapipelineMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.REF_EQ
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type OperatorType = typings.awsSdk.datapipelineMod._OperatorType | java.lang.String
  
  type ParameterAttributeList = js.Array[typings.awsSdk.datapipelineMod.ParameterAttribute]
  
  type ParameterObjectList = js.Array[typings.awsSdk.datapipelineMod.ParameterObject]
  
  type ParameterValueList = js.Array[typings.awsSdk.datapipelineMod.ParameterValue]
  
  type PipelineDescriptionList = js.Array[typings.awsSdk.datapipelineMod.PipelineDescription]
  
  type PipelineObjectList = js.Array[typings.awsSdk.datapipelineMod.PipelineObject]
  
  type PipelineObjectMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.datapipelineMod.PipelineObject]
  
  type SelectorList = js.Array[typings.awsSdk.datapipelineMod.Selector]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FINISHED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type TaskStatus = typings.awsSdk.datapipelineMod._TaskStatus | java.lang.String
  
  type ValidationErrors = js.Array[typings.awsSdk.datapipelineMod.ValidationError]
  
  type ValidationWarnings = js.Array[typings.awsSdk.datapipelineMod.ValidationWarning]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-10-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.datapipelineMod._apiVersion | java.lang.String
  
  type attributeNameString = java.lang.String
  
  type attributeValueString = java.lang.String
  
  type cancelActive = scala.Boolean
  
  type errorMessage = java.lang.String
  
  type fieldList = js.Array[typings.awsSdk.datapipelineMod.Field]
  
  type fieldNameString = java.lang.String
  
  type fieldStringValue = java.lang.String
  
  type id = java.lang.String
  
  type idList = js.Array[typings.awsSdk.datapipelineMod.id]
  
  type int = scala.Double
  
  type longString = java.lang.String
  
  type pipelineList = js.Array[typings.awsSdk.datapipelineMod.PipelineIdName]
  
  type stringList = js.Array[java.lang.String]
  
  type tagKey = java.lang.String
  
  type tagList = js.Array[typings.awsSdk.datapipelineMod.Tag]
  
  type tagValue = java.lang.String
  
  type taskId = java.lang.String
  
  type timestamp = typings.std.Date
  
  type validationMessage = java.lang.String
  
  type validationMessages = js.Array[typings.awsSdk.datapipelineMod.validationMessage]
}
