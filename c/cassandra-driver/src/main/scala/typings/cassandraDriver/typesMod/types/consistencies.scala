package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait consistencies extends js.Object
@JSImport("cassandra-driver/lib/types", "types.consistencies")
@js.native
object consistencies extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
  
  @js.native
  sealed trait all extends consistencies
  /* 0x05 */ @js.native
  object all extends TopLevel[all with Double]
  
  @js.native
  sealed trait any extends consistencies
  /* 0x00 */ @js.native
  object any extends TopLevel[any with Double]
  
  @js.native
  sealed trait eachQuorum extends consistencies
  /* 0x07 */ @js.native
  object eachQuorum extends TopLevel[eachQuorum with Double]
  
  @js.native
  sealed trait localOne extends consistencies
  /* 0x0a */ @js.native
  object localOne extends TopLevel[localOne with Double]
  
  @js.native
  sealed trait localQuorum extends consistencies
  /* 0x06 */ @js.native
  object localQuorum extends TopLevel[localQuorum with Double]
  
  @js.native
  sealed trait localSerial extends consistencies
  /* 0x09 */ @js.native
  object localSerial extends TopLevel[localSerial with Double]
  
  @js.native
  sealed trait one extends consistencies
  /* 0x01 */ @js.native
  object one extends TopLevel[one with Double]
  
  @js.native
  sealed trait quorum extends consistencies
  /* 0x04 */ @js.native
  object quorum extends TopLevel[quorum with Double]
  
  @js.native
  sealed trait serial extends consistencies
  /* 0x08 */ @js.native
  object serial extends TopLevel[serial with Double]
  
  @js.native
  sealed trait three extends consistencies
  /* 0x03 */ @js.native
  object three extends TopLevel[three with Double]
  
  @js.native
  sealed trait two extends consistencies
  /* 0x02 */ @js.native
  object two extends TopLevel[two with Double]
}
