package typings.awsSdkSmithyClient

import typings.awsSdkSmithyClient.clientMod.SmithyResolvedConfiguration
import typings.awsSdkSmithyClient.defaultsModeMod.DefaultsModeConfigs
import typings.awsSdkSmithyClient.defaultsModeMod.ResolvedDefaultsMode
import typings.awsSdkSmithyClient.exceptionsMod.ServiceExceptionOptions
import typings.awsSdkSmithyClient.objectMappingMod.ObjectMappingInstruction
import typings.awsSdkSmithyClient.objectMappingMod.Value
import typings.awsSdkSmithyClient.objectMappingMod.ValueSupplier
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/smithy-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/smithy-client", "Client")
  @js.native
  open class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
    extends typings.awsSdkSmithyClient.clientMod.Client[HandlerOptions, ClientInput, ClientOutput, ResolvedClientConfiguration] {
    def this(config: ResolvedClientConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/smithy-client", "Command")
  @js.native
  abstract class Command[Input /* <: ClientInput */, Output /* <: ClientOutput */, ResolvedClientConfiguration, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */] ()
    extends typings.awsSdkSmithyClient.commandMod.Command[Input, Output, ResolvedClientConfiguration, ClientInput, ClientOutput]
  
  @JSImport("@aws-sdk/smithy-client", "LazyJsonString")
  @js.native
  open class LazyJsonString ()
    extends typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString
  /* static members */
  object LazyJsonString {
    
    @JSImport("@aws-sdk/smithy-client", "LazyJsonString")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(`object`: Any): typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString]
  }
  
  @JSImport("@aws-sdk/smithy-client", "SENSITIVE_STRING")
  @js.native
  val SENSITIVE_STRING: /* "***SensitiveInformation***" */ String = js.native
  
  @JSImport("@aws-sdk/smithy-client", "ServiceException")
  @js.native
  open class ServiceException protected ()
    extends typings.awsSdkSmithyClient.exceptionsMod.ServiceException {
    def this(options: ServiceExceptionOptions) = this()
  }
  
  @JSImport("@aws-sdk/smithy-client", "StringWrapper")
  @js.native
  val StringWrapper: typings.awsSdkSmithyClient.lazyJsonMod.StringWrapper = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@aws-sdk/smithy-client", "StringWrapper")
  @js.native
  open class StringWrapperCls protected ()
    extends StObject
       with typings.std.String {
    def this(arg: Any) = this()
  }
  
  inline def convertMap(target: Any): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMap")(target.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def dateToUtcString(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToUtcString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decorateServiceException[E /* <: typings.awsSdkSmithyClient.exceptionsMod.ServiceException */](exception: E): E = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateServiceException")(exception.asInstanceOf[js.Any]).asInstanceOf[E]
  inline def decorateServiceException[E /* <: typings.awsSdkSmithyClient.exceptionsMod.ServiceException */](exception: E, additions: Record[String, Any]): E = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateServiceException")(exception.asInstanceOf[js.Any], additions.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def emitWarningIfUnsupportedVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitWarningIfUnsupportedVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def expectBoolean(value: Any): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def expectByte(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectFloat32(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectInt(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectInt32(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectLong(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectNonNull[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")().asInstanceOf[T]
  inline def expectNonNull[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expectNonNull[T](value: T, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def expectNonNull[T](value: Null, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def expectNonNull[T](value: Unit, location: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNonNull")(value.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def expectNumber(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectNumber")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectObject(value: Any): js.UndefOr[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectObject")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  inline def expectShort(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def expectString(value: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectString")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def expectUnion(value: Any): js.UndefOr[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectUnion")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  inline def extendedEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extendedEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getArrayIfSingleItem[T](mayBeArray: T): T | js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrayIfSingleItem")(mayBeArray.asInstanceOf[js.Any]).asInstanceOf[T | js.Array[T]]
  
  inline def getValueFromTextNode(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromTextNode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def handleFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def handleFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseDouble(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseDouble(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def limitedParseFloat32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def limitedParseFloat32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitedParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def loadConfigsForDefaultMode(mode: ResolvedDefaultsMode): DefaultsModeConfigs = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigsForDefaultMode")(mode.asInstanceOf[js.Any]).asInstanceOf[DefaultsModeConfigs]
  
  object logger {
    
    @JSImport("@aws-sdk/smithy-client", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def warn(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def warn(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  inline def map(instructions: Record[String, ObjectMappingInstruction]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(instructions.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def map(
    target: Any,
    filter: js.Function1[/* value */ Any, Boolean],
    instructions: Record[String, ValueSupplier | Value]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def map(target: Any, instructions: Record[String, ObjectMappingInstruction]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseBoolean(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseEpochTimestamp(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEpochTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def parseRfc3339DateTime(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRfc3339DateTime")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def parseRfc7231DateTime(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRfc7231DateTime")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def resolvedPath(
    resolvedPath: String,
    input: Any,
    memberName: String,
    labelValueProvider: js.Function0[js.UndefOr[String]],
    uriLabel: String,
    isGreedyLabel: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvedPath")(resolvedPath.asInstanceOf[js.Any], input.asInstanceOf[js.Any], memberName.asInstanceOf[js.Any], labelValueProvider.asInstanceOf[js.Any], uriLabel.asInstanceOf[js.Any], isGreedyLabel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeFloat(value: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFloat")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def splitEvery(value: String, delimiter: String, numDelimiters: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitEvery")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], numDelimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def strictParseByte(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseByte(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseByte")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseDouble(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseDouble(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseFloat(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseFloat(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseFloat32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseFloat32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseFloat32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseInt(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseInt(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseInt32(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseInt32(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseInt32")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseLong(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseLong(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseLong")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def strictParseShort(value: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def strictParseShort(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strictParseShort")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def throwDefaultError(hasOutputParsedBodyExceptionCtorErrorCode: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDefaultError")(hasOutputParsedBodyExceptionCtorErrorCode.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
