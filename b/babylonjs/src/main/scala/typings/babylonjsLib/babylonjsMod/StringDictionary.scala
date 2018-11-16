package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class implement a typical dictionary using a string as key and the generic type T as value.
     * The underlying implementation relies on an associative array to ensure the best performances.
     * The value can be anything including 'null' but except 'undefined'
     */
@JSImport("babylonjs", "StringDictionary")
@js.native
class StringDictionary[T] ()
  extends babylonjsLib.BABYLONNs.StringDictionary[T]

