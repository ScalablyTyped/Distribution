package typings.baconjs

import org.scalablytyped.runtime.TopLevel
import typings.baconjs.observableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinetemplateMod {
  
  @JSImport("baconjs/types/combinetemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](template: T): Property[CombinedTemplate[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any]).asInstanceOf[Property[CombinedTemplate[T]]]
  
  type ArrayTemplate[A] = js.Array[A | ObjectTemplate[A]]
  
  type CombinedTemplate[O] = O | ArrayTemplate[Any] | ObjectTemplate[O]
  
  type ObjectTemplate[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends baconjs.baconjs/types/observable.default<infer I>? any : O[K] extends std.Record<any, any>? baconjs.baconjs/types/combinetemplate.ObjectTemplate<O[K]> : O[K] extends std.Array<infer I2>? baconjs.baconjs/types/combinetemplate.ArrayTemplate<any> : O[K]}
    */ typings.baconjs.baconjsStrings.ObjectTemplate & TopLevel[Any]
}
