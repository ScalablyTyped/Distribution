package typings.cfb.cfbMod

import org.scalablytyped.runtime.TopLevel
import typings.cfb.cfbMod.CFB$EntryType.lockbytes
import typings.cfb.cfbMod.CFB$EntryType.property
import typings.cfb.cfbMod.CFB$EntryType.root
import typings.cfb.cfbMod.CFB$EntryType.storage
import typings.cfb.cfbMod.CFB$EntryType.stream
import typings.cfb.cfbMod.CFB$EntryType.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFB$EntryType extends js.Object

@JSImport("cfb", "CFB$EntryType")
@js.native
object CFB$EntryType extends js.Object {
  @js.native
  sealed trait lockbytes extends CFB$EntryType
  
  @js.native
  sealed trait property extends CFB$EntryType
  
  @js.native
  sealed trait root extends CFB$EntryType
  
  @js.native
  sealed trait storage extends CFB$EntryType
  
  @js.native
  sealed trait stream extends CFB$EntryType
  
  @js.native
  sealed trait unknown extends CFB$EntryType
  
  @JSBracketAccess
  @JSName("CFB$EntryType")
  def apply(value: Double): js.UndefOr[CFB$EntryType with Double] = js.native
  /* 3 */ @js.native
  object lockbytes extends TopLevel[lockbytes with Double]
  
  /* 4 */ @js.native
  object property extends TopLevel[property with Double]
  
  /* 5 */ @js.native
  object root extends TopLevel[root with Double]
  
  /* 1 */ @js.native
  object storage extends TopLevel[storage with Double]
  
  /* 2 */ @js.native
  object stream extends TopLevel[stream with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

