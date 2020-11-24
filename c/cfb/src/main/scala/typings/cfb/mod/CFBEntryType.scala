package typings.cfb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CFBEntryType extends js.Object
@JSImport("cfb", "CFB$EntryType")
@js.native
object CFBEntryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFBEntryType with Double] = js.native
  
  @js.native
  sealed trait lockbytes extends CFBEntryType
  /* 3 */ @js.native
  object lockbytes extends TopLevel[lockbytes with Double]
  
  @js.native
  sealed trait property extends CFBEntryType
  /* 4 */ @js.native
  object property extends TopLevel[property with Double]
  
  @js.native
  sealed trait root extends CFBEntryType
  /* 5 */ @js.native
  object root extends TopLevel[root with Double]
  
  @js.native
  sealed trait storage extends CFBEntryType
  /* 1 */ @js.native
  object storage extends TopLevel[storage with Double]
  
  @js.native
  sealed trait stream extends CFBEntryType
  /* 2 */ @js.native
  object stream extends TopLevel[stream with Double]
  
  @js.native
  sealed trait unknown extends CFBEntryType
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
}
