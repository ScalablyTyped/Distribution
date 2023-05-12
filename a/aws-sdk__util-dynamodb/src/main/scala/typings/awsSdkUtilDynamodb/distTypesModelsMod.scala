package typings.awsSdkUtilDynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkUtilDynamodb.anon.Instantiable
import typings.node.bufferMod.global.Buffer
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.Blob
import typings.std.File
import typings.std.InstanceType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  type NativeAttributeBinary = js.typedarray.ArrayBuffer | Blob | Buffer | js.typedarray.DataView | File | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NativeAttributeValue = @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeScalarAttributeValue | {[key: string] : @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeValue} | std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeValue> | std.Set<number | bigint | @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NumberValue | string | @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeBinary | undefined> | std.InstanceType<{new (args : ...any): any}>
  }}}
  to avoid circular code involving: 
  - @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb/dist-types/models.NativeAttributeValue
  */
  type NativeAttributeValue = NativeScalarAttributeValue | StringDictionary[Any] | js.Array[Any] | (Set[js.UndefOr[Double | js.BigInt | NumberValue | String | NativeAttributeBinary]]) | InstanceType[Instantiable]
  
  type NativeScalarAttributeValue = js.UndefOr[
    Null | Boolean | Double | NumberValue | js.BigInt | NativeAttributeBinary | String
  ]
  
  trait NumberValue extends StObject {
    
    val value: String
  }
  object NumberValue {
    
    inline def apply(value: String): NumberValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
