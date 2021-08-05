package typings.cloner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object deep {
    
    @JSImport("cloner", "deep")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Will loop over all own keys and deeply copy (copy by value) them to a new object.
      *
      * Preserves inheritance and is recursion aware, meaning it shouldn't fail with recursive properties.
      * @param [obj] The object to copy.
      */
    inline def copy[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Preserves what's already in the target and merges all own keys found in one or more passed sources.
      *
      * Properties are merged by value.
      * @param [target] Destination object for merged properties.
      * @param [sources] Source object(s) for properties to merge.
      */
    inline def merge(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object shallow {
    
    @JSImport("cloner", "shallow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Will loop over all own keys and shallow copy (copy by reference) them to a new object.
      *
      * Preserves inheritance and is recursion aware, meaning it shouldn't fail with recursive properties.
      * @param [obj] The object to copy.
      */
    inline def copy[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Preserves what's already in the target and merges all own keys found in one or more passed sources.
      *
      * Properties are merged by reference.
      * @param [target] Destination object for merged properties.
      * @param [sources] Source object(s) for properties to merge.
      */
    inline def merge(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
