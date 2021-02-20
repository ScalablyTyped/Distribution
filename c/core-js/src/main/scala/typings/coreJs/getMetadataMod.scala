package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMetadataMod {
  
  /**
    * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getMetadata("custom:annotation", Example);
    * ```
    */
  /* was `typeof core.Reflect.getMetadata` */
  @JSImport("core-js/library/fn/reflect/es7/get-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object): js.Any = js.native
  @JSImport("core-js/library/fn/reflect/es7/get-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
  @JSImport("core-js/library/fn/reflect/es7/get-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
}
