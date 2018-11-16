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
  
  val lockbytes: lockbytes with java.lang.String = js.native
  val property: property with java.lang.String = js.native
  val root: root with java.lang.String = js.native
  val storage: storage with java.lang.String = js.native
  val stream: stream with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  @JSName("CFB$EntryType")
  def apply(value: java.lang.String): js.UndefOr[cfbLib.cfbMod.CFB$EntryType with java.lang.String] = js.native
}

