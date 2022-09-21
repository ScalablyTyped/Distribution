package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreClient.mod.^
import typings.azureCoreRestPipeline.coreRestPipelineMod.AuthorizeRequestOnChallengeOptions
import typings.azureCoreRestPipeline.coreRestPipelineMod.Pipeline
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelinePolicy
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelineRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def XML_ATTRKEY: /* "$" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XML_ATTRKEY").asInstanceOf[/* "$" */ String]

inline def XML_CHARKEY: /* "_" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XML_CHARKEY").asInstanceOf[/* "_" */ String]

inline def authorizeRequestOnClaimChallenge(onChallengeOptions: AuthorizeRequestOnChallengeOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizeRequestOnClaimChallenge")(onChallengeOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def authorizeRequestOnTenantChallenge(challengeOptions: AuthorizeRequestOnChallengeOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizeRequestOnTenantChallenge")(challengeOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def createClientPipeline(): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeline")().asInstanceOf[Pipeline]
inline def createClientPipeline(options: InternalClientPipelineOptions): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeline")(options.asInstanceOf[js.Any]).asInstanceOf[Pipeline]

inline def createSerializer(): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSerializer")().asInstanceOf[Serializer]
inline def createSerializer(modelMappers: StringDictionary[Any]): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSerializer")(modelMappers.asInstanceOf[js.Any]).asInstanceOf[Serializer]
inline def createSerializer(modelMappers: StringDictionary[Any], isXML: Boolean): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSerializer")(modelMappers.asInstanceOf[js.Any], isXML.asInstanceOf[js.Any])).asInstanceOf[Serializer]
inline def createSerializer(modelMappers: Unit, isXML: Boolean): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSerializer")(modelMappers.asInstanceOf[js.Any], isXML.asInstanceOf[js.Any])).asInstanceOf[Serializer]

inline def deserializationPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")().asInstanceOf[PipelinePolicy]
inline def deserializationPolicy(options: DeserializationPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def deserializationPolicyName: /* "deserializationPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("deserializationPolicyName").asInstanceOf[/* "deserializationPolicy" */ String]

inline def serializationPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("serializationPolicy")().asInstanceOf[PipelinePolicy]
inline def serializationPolicy(options: SerializationPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("serializationPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def serializationPolicyName: /* "serializationPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("serializationPolicyName").asInstanceOf[/* "serializationPolicy" */ String]

type OperationRequest = PipelineRequest

type ParameterPath = String | js.Array[String] | StringDictionary[Any]

type RawResponseCallback = js.Function3[
/* rawResponse */ FullOperationResponse, 
/* flatResponse */ Any, 
/* error */ js.UndefOr[Any], 
Unit]
