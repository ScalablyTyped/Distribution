package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMetadataMod {
  
  /**
    * Deletes the metadata entry from the target object with the provided key.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata entry was found and deleted; otherwise, false.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.deleteMetadata("custom:annotation", Example);
    * ```
    */
  /* was `typeof core.Reflect.deleteMetadata` */
  @JSImport("core-js/library/fn/reflect/es7/delete-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object): Boolean = js.native
  @JSImport("core-js/library/fn/reflect/es7/delete-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
  @JSImport("core-js/library/fn/reflect/es7/delete-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
}
