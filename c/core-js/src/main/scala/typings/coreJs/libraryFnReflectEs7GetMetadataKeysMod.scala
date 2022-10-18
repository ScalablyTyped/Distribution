package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnReflectEs7GetMetadataKeysMod {
  
  /**
    * Gets the metadata keys defined on the target object or its prototype chain.
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
    *  result = Reflect.getMetadataKeys(Example);
    * ```
    */
  /* was `typeof core.Reflect.getMetadataKeys` */
  inline def apply(target: Object): Array[Any] = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
  inline def apply(target: Object, targetKey: java.lang.String): Array[Any] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  inline def apply(target: Object, targetKey: js.Symbol): Array[Any] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  
  @JSImport("core-js/library/fn/reflect/es7/get-metadata-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
