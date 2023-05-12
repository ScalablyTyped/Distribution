package typings.awsSdkUtilDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.awsSdkUtilDynamodb.distTypesUnmarshallMod.unmarshallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConvertToNativeMod {
  
  @JSImport("@aws-sdk/util-dynamodb/dist-types/convertToNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToNative(data: AttributeValue): NativeAttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToNative")(data.asInstanceOf[js.Any]).asInstanceOf[NativeAttributeValue]
  inline def convertToNative(data: AttributeValue, options: unmarshallOptions): NativeAttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToNative")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NativeAttributeValue]
}
