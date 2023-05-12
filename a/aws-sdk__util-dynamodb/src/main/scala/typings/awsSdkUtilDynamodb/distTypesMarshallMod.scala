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
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeBinary
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarshallMod {
  
  @JSImport("@aws-sdk/util-dynamodb/dist-types/marshall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  trait marshallOptions extends StObject {
    
    /**
      * Whether to convert typeof object to map attribute.
      */
    var convertClassInstanceToMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to automatically convert empty strings, blobs, and sets to `null`
      */
    var convertEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove undefined values while marshalling.
      */
    var removeUndefinedValues: js.UndefOr[Boolean] = js.undefined
  }
  object marshallOptions {
    
    inline def apply(): marshallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[marshallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: marshallOptions] (val x: Self) extends AnyVal {
      
      inline def setConvertClassInstanceToMap(value: Boolean): Self = StObject.set(x, "convertClassInstanceToMap", value.asInstanceOf[js.Any])
      
      inline def setConvertClassInstanceToMapUndefined: Self = StObject.set(x, "convertClassInstanceToMap", js.undefined)
      
      inline def setConvertEmptyValues(value: Boolean): Self = StObject.set(x, "convertEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setConvertEmptyValuesUndefined: Self = StObject.set(x, "convertEmptyValues", js.undefined)
      
      inline def setRemoveUndefinedValues(value: Boolean): Self = StObject.set(x, "removeUndefinedValues", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefinedValuesUndefined: Self = StObject.set(x, "removeUndefinedValues", js.undefined)
    }
  }
}
