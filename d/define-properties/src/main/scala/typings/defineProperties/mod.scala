package typings.defineProperties

import typings.std.Partial
import typings.std.Record
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Defines new properties in `map` as non-enumerable if they don't already
    * exist on `object`.
    *
    * @param object The object to define non-enumerable properties on.
    * @param map The map of newly defined properties.
    * @param predicates The optional predicates map, return `true` to override existing properties on `object`.
    */
  inline def apply[M /* <: js.Object */](`object`: js.Object, map: M & ThisType[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[M /* <: js.Object */](
    `object`: js.Object,
    map: M & ThisType[js.Any],
    predicates: Partial[Record[/* keyof M */ String, js.Function0[Boolean]]]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], map.asInstanceOf[js.Any], predicates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("define-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether the current environment correctly supports property descriptors.
    */
  @JSImport("define-properties", "supportsDescriptors")
  @js.native
  val supportsDescriptors: Boolean = js.native
}
