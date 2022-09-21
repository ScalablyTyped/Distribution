package typings.deepFreeze

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](a: js.Array[T]): js.Array[DeepReadonly[T]] = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[DeepReadonly[T]]]
  inline def apply[T /* <: js.Function */](f: T): T = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("deep-freeze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DeepReadonly[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: deep-freeze.deep-freeze.DeepReadonly<T[P]>}
    */ typings.deepFreeze.deepFreezeStrings.DeepReadonly & TopLevel[T]) | T
}
