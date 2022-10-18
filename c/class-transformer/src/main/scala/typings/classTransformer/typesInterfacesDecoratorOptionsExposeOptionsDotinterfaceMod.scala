package typings.classTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesDecoratorOptionsExposeOptionsDotinterfaceMod {
  
  trait ExposeOptions extends StObject {
    
    /**
      * List of transformation groups this property belongs to. When set,
      * the property will be exposed only when transform is called with
      * one of the groups specified.
      *
      * Example:
      * ```ts
      * instanceToPlain(payload, { groups: ['user'] });
      * ```
      */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Name of property on the target object to expose the value of this property.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * First version where this property should be exposed.
      *
      * Example:
      * ```ts
      * instanceToPlain(payload, { version: 1.0 });
      * ```
      */
    var since: js.UndefOr[Double] = js.undefined
    
    /**
      * Expose this property only when transforming from plain to class instance.
      */
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expose this property only when transforming from class instance to plain object.
      */
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Last version where this property should be exposed.
      *
      * Example:
      * ```ts
      * instanceToPlain(payload, { version: 1.0 });
      * ```
      */
    var until: js.UndefOr[Double] = js.undefined
  }
  object ExposeOptions {
    
    inline def apply(): ExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExposeOptions]
    }
    
    extension [Self <: ExposeOptions](x: Self) {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      inline def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      inline def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      inline def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
      
      inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
}
