package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasMetadataMod {
  
  /**
    * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.hasMetadata("custom:annotation", Example);
    * ```
    */
  /* was `typeof core.Reflect.hasMetadata` */
  @JSImport("core-js/library/fn/reflect/es7/has-metadata'", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object): Boolean = js.native
  @JSImport("core-js/library/fn/reflect/es7/has-metadata'", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
  @JSImport("core-js/library/fn/reflect/es7/has-metadata'", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
}
