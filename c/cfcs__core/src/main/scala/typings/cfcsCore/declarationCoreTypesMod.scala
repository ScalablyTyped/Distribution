package typings.cfcsCore

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationCoreTypesMod {
  
  type ExtractNever[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends never? never : P}[keyof T] */ js.Any
  ]
  
  trait Ref[T] extends StObject {
    
    var current: js.UndefOr[T | Null] = js.undefined
    
    var value: js.UndefOr[T | Null] = js.undefined
  }
  object Ref {
    
    inline def apply[T](): Ref[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[T]]
    }
    
    extension [Self <: Ref[?], T](x: Self & Ref[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
