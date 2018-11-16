package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Xnor extends js.Object {
  var and: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
  var nand: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
  var nor: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
  var not: js.Function1[/* bits */ js.Array[_], js.Array[_]]
  var or: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
  var reduceAnd: js.Function1[/* bits */ js.Array[_], _]
  var reduceNand: js.Function1[/* bits */ js.Array[_], _]
  var reduceNor: js.Function1[/* bits */ js.Array[_], _]
  var reduceOr: js.Function1[/* bits */ js.Array[_], _]
  var reduceXnor: js.Function1[/* bits */ js.Array[_], _]
  var reduceXor: js.Function1[/* bits */ js.Array[_], _]
  var toBoolean: js.Function1[/* bits */ js.Array[_], js.Array[scala.Boolean]]
  @JSName("toString")
  var toString_FAnon_Xnor: js.Function3[
    /* bits */ js.Array[_], 
    /* spacing */ js.UndefOr[scala.Double], 
    /* spacer */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  var xnor: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
  var xor: js.Function2[/* bits1 */ js.Array[_], /* bits2 */ js.Array[_], js.Array[_]]
}

