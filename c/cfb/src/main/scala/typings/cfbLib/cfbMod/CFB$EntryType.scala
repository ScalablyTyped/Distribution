package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFB$EntryType extends js.Object

@JSImport("cfb", "CFB$EntryType")
@js.native
object CFB$EntryType extends js.Object {
  @js.native
  sealed trait lockbytes
    extends cfbLib.cfbMod.CFB$EntryType
  
  @js.native
  sealed trait property
    extends cfbLib.cfbMod.CFB$EntryType
  
  @js.native
  sealed trait root
    extends cfbLib.cfbMod.CFB$EntryType
  
  @js.native
  sealed trait storage
    extends cfbLib.cfbMod.CFB$EntryType
  
  @js.native
  sealed trait stream
    extends cfbLib.cfbMod.CFB$EntryType
  
  @js.native
  sealed trait unknown
    extends cfbLib.cfbMod.CFB$EntryType
  
  /* 3 */ val lockbytes: lockbytes with scala.Double = js.native
  /* 4 */ val property: property with scala.Double = js.native
  /* 5 */ val root: root with scala.Double = js.native
  /* 1 */ val storage: storage with scala.Double = js.native
  /* 2 */ val stream: stream with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  @JSName("CFB$EntryType")
  def apply(value: scala.Double): js.UndefOr[cfbLib.cfbMod.CFB$EntryType with scala.Double] = js.native
}

