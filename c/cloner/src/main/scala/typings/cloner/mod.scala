package typings.cloner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object deep {
    
    /**
      * Will loop over all own keys and deeply copy (copy by value) them to a new object.
      *
      * Preserves inheritance and is recursion aware, meaning it shouldn't fail with recursive properties.
      * @param [obj] The object to copy.
      */
    @JSImport("cloner", "deep.copy")
    @js.native
    def copy[T](obj: T): T = js.native
    
    /**
      * Preserves what's already in the target and merges all own keys found in one or more passed sources.
      *
      * Properties are merged by value.
      * @param [target] Destination object for merged properties.
      * @param [sources] Source object(s) for properties to merge.
      */
    @JSImport("cloner", "deep.merge")
    @js.native
    def merge(target: js.Any, sources: js.Any*): js.Any = js.native
  }
  
  object shallow {
    
    /**
      * Will loop over all own keys and shallow copy (copy by reference) them to a new object.
      *
      * Preserves inheritance and is recursion aware, meaning it shouldn't fail with recursive properties.
      * @param [obj] The object to copy.
      */
    @JSImport("cloner", "shallow.copy")
    @js.native
    def copy[T](obj: T): T = js.native
    
    /**
      * Preserves what's already in the target and merges all own keys found in one or more passed sources.
      *
      * Properties are merged by reference.
      * @param [target] Destination object for merged properties.
      * @param [sources] Source object(s) for properties to merge.
      */
    @JSImport("cloner", "shallow.merge")
    @js.native
    def merge(target: js.Any, sources: js.Any*): js.Any = js.native
  }
}
