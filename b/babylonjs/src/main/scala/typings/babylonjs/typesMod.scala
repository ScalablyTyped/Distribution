package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DataArray = js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  type DeepImmutable[T] = DeepImmutableObject[T] | DeepImmutableArray[Any] | T
  
  /** @hidden */
  @js.native
  trait DeepImmutableArray[T]
    extends StObject
       with ReadonlyArray[DeepImmutable[T]]
  
  type DeepImmutableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: babylonjs.babylonjs/types.DeepImmutable<T[K]>}
    */ typings.babylonjs.babylonjsStrings.DeepImmutableObject & TopLevel[T]
  
  type FloatArray = js.Array[Double] | js.typedarray.Float32Array
  
  type Immutable[T] = js.Array[Any] | T
  
  type IndicesArray = js.Array[Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array
  
  type Nullable[T] = T | Null
  
  /**
    * Alias type for primitive types
    * @ignorenaming
    */
  type Primitive = js.UndefOr[Null | Boolean | String | Double | js.Function | Element]
  
  type double = Double
  
  type float = Double
  
  type int = Double
}
