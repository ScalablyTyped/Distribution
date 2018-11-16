package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/bits", JSImport.Namespace)
@js.native
object bitsMod extends js.Object {
  val and: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
  val default: bitwiseLib.Anon_Xnor = js.native
  val nand: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
  val nor: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
  val not: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], js.Array[bitwiseLib.typesMod.Bit]] = js.native
  val or: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
  val reduceAnd: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val reduceNand: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val reduceNor: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val reduceOr: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val reduceXnor: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val reduceXor: js.Function1[/* bits */ js.Array[bitwiseLib.typesMod.Bit], bitwiseLib.typesMod.Bit] = js.native
  val toBoolean: js.Function1[/* bits */ js.Array[js.Any], js.Array[scala.Boolean]] = js.native
  @JSName("toString")
  val toString_FbitsMod: js.Function3[
    /* bits */ js.Array[js.Any], 
    /* spacing */ js.UndefOr[scala.Double], 
    /* spacer */ js.UndefOr[java.lang.String], 
    java.lang.String
  ] = js.native
  val xnor: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
  val xor: js.Function2[
    /* bits1 */ js.Array[bitwiseLib.typesMod.Bit], 
    /* bits2 */ js.Array[bitwiseLib.typesMod.Bit], 
    js.Array[bitwiseLib.typesMod.Bit]
  ] = js.native
}

