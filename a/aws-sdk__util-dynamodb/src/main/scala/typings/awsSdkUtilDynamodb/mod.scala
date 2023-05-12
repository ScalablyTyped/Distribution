package typings.awsSdkUtilDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BOOLMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BSMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NSMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NULLMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.SMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.SSMember
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.UnknownMember
import typings.awsSdkUtilDynamodb.distTypesMarshallMod.marshallOptions
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeBinary
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.awsSdkUtilDynamodb.distTypesUnmarshallMod.unmarshallOptions
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-dynamodb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToAttr(data: NativeAttributeValue): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToAttr")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
  inline def convertToAttr(data: NativeAttributeValue, options: marshallOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToAttr")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
  
  inline def convertToNative(data: AttributeValue): NativeAttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToNative")(data.asInstanceOf[js.Any]).asInstanceOf[NativeAttributeValue]
  inline def convertToNative(data: AttributeValue, options: unmarshallOptions): NativeAttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToNative")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NativeAttributeValue]
  
  inline def marshall(): NULLMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")().asInstanceOf[NULLMember]
  inline def marshall(data: String): SMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[SMember]
  inline def marshall(data: String, options: marshallOptions): SMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SMember]
  inline def marshall(data: Any): UnknownMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[UnknownMember]
  inline def marshall(data: Any, options: marshallOptions): UnknownMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UnknownMember]
  inline def marshall(data: Boolean): BOOLMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[BOOLMember]
  inline def marshall(data: Boolean, options: marshallOptions): BOOLMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BOOLMember]
  inline def marshall(data: Double): NMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[NMember]
  inline def marshall(data: Double, options: marshallOptions): NMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NMember]
  inline def marshall(data: Null, options: marshallOptions): NULLMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NULLMember]
  inline def marshall(data: NativeAttributeBinary): BMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[BMember]
  inline def marshall(data: NativeAttributeBinary, options: marshallOptions): BMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BMember]
  inline def marshall(data: Set[Double]): NSMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[NSMember]
  inline def marshall(data: Set[Double], options: marshallOptions): NSMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NSMember]
  
  inline def marshall_BSMember(data: Set[NativeAttributeBinary]): BSMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[BSMember]
  inline def marshall_BSMember(data: Set[NativeAttributeBinary], options: marshallOptions): BSMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BSMember]
  
  inline def marshall_L_Array[L /* <: js.Array[NativeAttributeValue] */](data: L): js.Array[AttributeValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[AttributeValue]]
  inline def marshall_L_Array[L /* <: js.Array[NativeAttributeValue] */](data: L, options: marshallOptions): js.Array[AttributeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[AttributeValue]]
  
  inline def marshall_M_Record[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof M ]: @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeValue} */ js.Any */](data: M): Record[String, AttributeValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[Record[String, AttributeValue]]
  inline def marshall_M_Record[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof M ]: @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeValue} */ js.Any */](data: M, options: marshallOptions): Record[String, AttributeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, AttributeValue]]
  
  inline def marshall_SSMember(data: Set[String]): SSMember = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[SSMember]
  inline def marshall_SSMember(data: Set[String], options: marshallOptions): SSMember = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SSMember]
  
  inline def unmarshall(data: Record[String, AttributeValue]): Record[String, NativeAttributeValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[Record[String, NativeAttributeValue]]
  inline def unmarshall(data: Record[String, AttributeValue], options: unmarshallOptions): Record[String, NativeAttributeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, NativeAttributeValue]]
}
