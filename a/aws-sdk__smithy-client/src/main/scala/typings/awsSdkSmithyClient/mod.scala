package typings.awsSdkSmithyClient

import typings.awsSdkSmithyClient.clientMod.SmithyResolvedConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/smithy-client", "Client")
  @js.native
  class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
    extends typings.awsSdkSmithyClient.clientMod.Client[HandlerOptions, ClientInput, ClientOutput, ResolvedClientConfiguration] {
    def this(config: ResolvedClientConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/smithy-client", "Command")
  @js.native
  abstract class Command[Input /* <: ClientInput */, Output /* <: ClientOutput */, ResolvedClientConfiguration, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */] ()
    extends typings.awsSdkSmithyClient.commandMod.Command[Input, Output, ResolvedClientConfiguration, ClientInput, ClientOutput]
  
  @JSImport("@aws-sdk/smithy-client", "LazyJsonString")
  @js.native
  class LazyJsonString ()
    extends typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString
  /* static members */
  object LazyJsonString {
    
    @JSImport("@aws-sdk/smithy-client", "LazyJsonString.fromObject")
    @js.native
    def fromObject(`object`: js.Any): typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString = js.native
  }
  
  @JSImport("@aws-sdk/smithy-client", "SENSITIVE_STRING")
  @js.native
  val SENSITIVE_STRING: /* "***SensitiveInformation***" */ String = js.native
  
  @JSImport("@aws-sdk/smithy-client", "StringWrapper")
  @js.native
  val StringWrapper: typings.awsSdkSmithyClient.lazyJsonMod.StringWrapper = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@aws-sdk/smithy-client", "StringWrapper")
  @js.native
  class StringWrapperCls protected ()
    extends typings.std.String {
    def this(arg: js.Any) = this()
  }
  
  @JSImport("@aws-sdk/smithy-client", "dateToUtcString")
  @js.native
  def dateToUtcString(date: Date): String = js.native
  
  @JSImport("@aws-sdk/smithy-client", "extendedEncodeURIComponent")
  @js.native
  def extendedEncodeURIComponent(str: String): String = js.native
  
  @JSImport("@aws-sdk/smithy-client", "getArrayIfSingleItem")
  @js.native
  def getArrayIfSingleItem[T](mayBeArray: T): T | js.Array[T] = js.native
  
  @JSImport("@aws-sdk/smithy-client", "getValueFromTextNode")
  @js.native
  def getValueFromTextNode(obj: js.Any): js.Any = js.native
  
  @JSImport("@aws-sdk/smithy-client", "splitEvery")
  @js.native
  def splitEvery(value: String, delimiter: String, numDelimiters: Double): js.Array[String] = js.native
}
