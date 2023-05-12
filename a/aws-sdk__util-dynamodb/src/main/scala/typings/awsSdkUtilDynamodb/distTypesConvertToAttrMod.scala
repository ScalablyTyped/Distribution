package typings.awsSdkUtilDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue
import typings.awsSdkUtilDynamodb.distTypesMarshallMod.marshallOptions
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConvertToAttrMod {
  
  @JSImport("@aws-sdk/util-dynamodb/dist-types/convertToAttr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToAttr(data: NativeAttributeValue): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToAttr")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
  inline def convertToAttr(data: NativeAttributeValue, options: marshallOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToAttr")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
}
