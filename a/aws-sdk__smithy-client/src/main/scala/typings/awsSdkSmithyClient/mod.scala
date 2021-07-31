package typings.awsSdkSmithyClient

import typings.awsSdkSmithyClient.clientMod.SmithyResolvedConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/smithy-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@aws-sdk/smithy-client", "LazyJsonString")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromObject(`object`: js.Any): typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkSmithyClient.lazyJsonMod.LazyJsonString]
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
    extends StObject
       with typings.std.String {
    def this(arg: js.Any) = this()
  }
  
  @scala.inline
  def dateToUtcString(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToUtcString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def extendedEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extendedEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getArrayIfSingleItem[T](mayBeArray: T): T | js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrayIfSingleItem")(mayBeArray.asInstanceOf[js.Any]).asInstanceOf[T | js.Array[T]]
  
  @scala.inline
  def getValueFromTextNode(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromTextNode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def splitEvery(value: String, delimiter: String, numDelimiters: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitEvery")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], numDelimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
