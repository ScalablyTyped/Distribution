package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defineMetadataMod {
  
  /**
    * Define a unique metadata entry on the target.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param metadataValue A value that contains attached metadata.
    * @param target The target object on which to define metadata.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  Reflect.defineMetadata("custom:annotation", options, Example);
    *
    *  // decorator factory as metadata-producing annotation.
    *  function MyAnnotation(options): ClassDecorator {
    *      return target => Reflect.defineMetadata("custom:annotation", options, target);
    *  }
    * ```
    */
  /* was `typeof core.Reflect.defineMetadata` */
  @scala.inline
  def apply(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("core-js/library/fn/reflect/es7/define-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
