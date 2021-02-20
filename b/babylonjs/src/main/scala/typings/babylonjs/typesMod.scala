package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.ReadonlyArray
import typings.std.Uint16Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DataArray = js.Array[Double] | ArrayBuffer | ArrayBufferView
  
  type DeepImmutable[T] = DeepImmutableObject[T] | DeepImmutableArray[js.Any] | T
  
  /** @hidden */
  @js.native
  trait DeepImmutableArray[T] extends ReadonlyArray[DeepImmutable[T]]
  
  type DeepImmutableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: babylonjs.babylonjs/types.DeepImmutable<T[K]>}
    */ typings.babylonjs.babylonjsStrings.DeepImmutableObject with TopLevel[T]
  
  type FloatArray = js.Array[Double] | Float32Array
  
  type Immutable[T] = DeepImmutable[T] | js.Array[js.Any] | T
  
  type IndicesArray = js.Array[Double] | Int32Array | Uint32Array | Uint16Array
  
  type Nullable[T] = T | Null
  
  /**
    * Alias type for primitive types
    * @ignorenaming
    */
  type Primitive = js.UndefOr[Null | Boolean | String | Double | js.Function]
  
  type double = Double
  
  type float = Double
  
  type int = Double
}
