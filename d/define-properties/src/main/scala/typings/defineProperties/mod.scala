package typings.defineProperties

import typings.std.Partial
import typings.std.Record
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("define-properties", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Defines new properties in `map` as non-enumerable if they don't already
    * exist on `object`.
    *
    * @param object The object to define non-enumerable properties on.
    * @param map The map of newly defined properties.
    * @param predicates The optional predicates map, return `true` to override existing properties on `object`.
    */
  def apply[M /* <: js.Object */](`object`: js.Object, map: M with ThisType[_]): Unit = js.native
  def apply[M /* <: js.Object */](
    `object`: js.Object,
    map: M with ThisType[_],
    predicates: Partial[Record[/* keyof M */ String, js.Function0[Boolean]]]
  ): Unit = js.native
  
  /**
    * Whether the current environment correctly supports property descriptors.
    */
  val supportsDescriptors: Boolean = js.native
}
