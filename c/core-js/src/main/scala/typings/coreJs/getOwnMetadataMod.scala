package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOwnMetadataMod {
  
  /**
    * Gets the metadata value for the provided metadata key on the target object.
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
    *  result = Reflect.getOwnMetadata("custom:annotation", Example);
    * ```
    */
  /* was `typeof core.Reflect.getOwnMetadata` */
  @JSImport("core-js/library/fn/reflect/es7/get-own-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object): js.Any = js.native
  @JSImport("core-js/library/fn/reflect/es7/get-own-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
  @JSImport("core-js/library/fn/reflect/es7/get-own-metadata", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
}
