package typings.classTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesDecoratorOptionsExcludeOptionsDotinterfaceMod {
  
  trait ExcludeOptions extends StObject {
    
    /**
      * Expose this property only when transforming from plain to class instance.
      */
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expose this property only when transforming from class instance to plain object.
      */
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeOptions {
    
    inline def apply(): ExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExcludeOptions] (val x: Self) extends AnyVal {
      
      inline def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      inline def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      inline def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      inline def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
    }
  }
}
