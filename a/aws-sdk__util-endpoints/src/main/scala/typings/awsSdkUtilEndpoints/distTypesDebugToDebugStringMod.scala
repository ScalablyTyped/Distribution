package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesLibGetAttrMod.GetAttrValue
import typings.awsSdkUtilEndpoints.distTypesTypesEndpointRuleObjectMod.EndpointObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDebugToDebugStringMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/debug/toDebugString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDebugString(input: FunctionReturn | GetAttrValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDebugString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDebugString(input: EndpointParameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDebugString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDebugString(input: EndpointV2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDebugString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDebugString(input: EndpointObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDebugString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDebugString(input: FunctionObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDebugString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
