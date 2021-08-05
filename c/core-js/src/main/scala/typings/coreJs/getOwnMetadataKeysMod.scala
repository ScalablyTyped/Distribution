package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOwnMetadataKeysMod {
  
  /**
    * Gets the unique metadata keys defined on the target object.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getOwnMetadataKeys(Example);
    * ```
    */
  /* was `typeof core.Reflect.getOwnMetadataKeys` */
  inline def apply(target: Object): Array[js.Any] = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
  inline def apply(target: Object, targetKey: java.lang.String): Array[js.Any] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
  inline def apply(target: Object, targetKey: js.Symbol): Array[js.Any] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
  
  @JSImport("core-js/library/fn/reflect/es7/get-own-metadata-keys'", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
