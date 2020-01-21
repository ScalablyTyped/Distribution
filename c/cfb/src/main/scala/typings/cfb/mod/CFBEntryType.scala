package typings.cfb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFBEntryType extends js.Object

@JSImport("cfb", "CFB$EntryType")
@js.native
object CFBEntryType extends js.Object {
  @js.native
  sealed trait lockbytes extends CFBEntryType
  
  @js.native
  sealed trait property extends CFBEntryType
  
  @js.native
  sealed trait root extends CFBEntryType
  
  @js.native
  sealed trait storage extends CFBEntryType
  
  @js.native
  sealed trait stream extends CFBEntryType
  
  @js.native
  sealed trait unknown extends CFBEntryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFBEntryType with Double] = js.native
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

