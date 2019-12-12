package typings.cassandraDashDriver.libTypesMod.types

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.libTypesMod.types.consistencies.all
import typings.cassandraDashDriver.libTypesMod.types.consistencies.any
import typings.cassandraDashDriver.libTypesMod.types.consistencies.eachQuorum
import typings.cassandraDashDriver.libTypesMod.types.consistencies.localOne
import typings.cassandraDashDriver.libTypesMod.types.consistencies.localQuorum
import typings.cassandraDashDriver.libTypesMod.types.consistencies.localSerial
import typings.cassandraDashDriver.libTypesMod.types.consistencies.one
import typings.cassandraDashDriver.libTypesMod.types.consistencies.quorum
import typings.cassandraDashDriver.libTypesMod.types.consistencies.serial
import typings.cassandraDashDriver.libTypesMod.types.consistencies.three
import typings.cassandraDashDriver.libTypesMod.types.consistencies.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait consistencies extends js.Object

@JSImport("cassandra-driver/lib/types", "types.consistencies")
@js.native
object consistencies extends js.Object {
  @js.native
  sealed trait all extends consistencies
  
  @js.native
  sealed trait any extends consistencies
  
  @js.native
  sealed trait eachQuorum extends consistencies
  
  @js.native
  sealed trait localOne extends consistencies
  
  @js.native
  sealed trait localQuorum extends consistencies
  
  @js.native
  sealed trait localSerial extends consistencies
  
  @js.native
  sealed trait one extends consistencies
  
  @js.native
  sealed trait quorum extends consistencies
  
  @js.native
  sealed trait serial extends consistencies
  
  @js.native
  sealed trait three extends consistencies
  
  @js.native
  sealed trait two extends consistencies
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
  /* 0x05 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 0x00 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 0x07 */ @js.native
  object eachQuorum extends TopLevel[eachQuorum with Double]
  
  /* 0x0a */ @js.native
  object localOne extends TopLevel[localOne with Double]
  
  /* 0x06 */ @js.native
  object localQuorum extends TopLevel[localQuorum with Double]
  
  /* 0x09 */ @js.native
  object localSerial extends TopLevel[localSerial with Double]
  
  /* 0x01 */ @js.native
  object one extends TopLevel[one with Double]
  
  /* 0x04 */ @js.native
  object quorum extends TopLevel[quorum with Double]
  
  /* 0x08 */ @js.native
  object serial extends TopLevel[serial with Double]
  
  /* 0x03 */ @js.native
  object three extends TopLevel[three with Double]
  
  /* 0x02 */ @js.native
  object two extends TopLevel[two with Double]
  
}

