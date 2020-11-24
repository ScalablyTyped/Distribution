package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object schemasMod {
  
  type Body = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.schemasMod.Blob | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.schemasMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type CodeGenerationStatus = typings.awsSdk.schemasMod._CodeGenerationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTED
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DiscovererState = typings.awsSdk.schemasMod._DiscovererState | java.lang.String
  
  type GetDiscoveredSchemaVersionItemInput = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.schemasMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OpenApi3
    - typings.awsSdk.awsSdkStrings.JSONSchemaDraft4
    - java.lang.String
  */
  type Type = typings.awsSdk.schemasMod._Type | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.schemasMod._apiVersion | java.lang.String
  
  type integer = scala.Double
  
  type listOfDiscovererSummary = js.Array[typings.awsSdk.schemasMod.DiscovererSummary]
  
  type listOfGetDiscoveredSchemaVersionItemInput = js.Array[typings.awsSdk.schemasMod.GetDiscoveredSchemaVersionItemInput]
  
  type listOfRegistrySummary = js.Array[typings.awsSdk.schemasMod.RegistrySummary]
  
  type listOfSchemaSummary = js.Array[typings.awsSdk.schemasMod.SchemaSummary]
  
  type listOfSchemaVersionSummary = js.Array[typings.awsSdk.schemasMod.SchemaVersionSummary]
  
  type listOfSearchSchemaSummary = js.Array[typings.awsSdk.schemasMod.SearchSchemaSummary]
  
  type listOfSearchSchemaVersionSummary = js.Array[typings.awsSdk.schemasMod.SearchSchemaVersionSummary]
  
  type listOfString = js.Array[typings.awsSdk.schemasMod.string]
  
  type long = scala.Double
  
  type string = java.lang.String
  
  type stringMin0Max256 = java.lang.String
  
  type stringMin0Max36 = java.lang.String
  
  type stringMin1Max100000 = java.lang.String
  
  type stringMin20Max1600 = java.lang.String
  
  type timestampIso8601 = typings.std.Date
}
