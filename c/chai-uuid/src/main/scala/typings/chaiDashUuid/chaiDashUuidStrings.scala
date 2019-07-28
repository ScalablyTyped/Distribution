package typings.chaiDashUuid

import typings.chaiDashUuid.chaiDashUuidMod.Global.ChaiNs.UuidVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chaiDashUuidStrings {
  @js.native
  sealed trait Empty extends UuidVersion
  
  @js.native
  sealed trait v1 extends UuidVersion
  
  @js.native
  sealed trait v2 extends UuidVersion
  
  @js.native
  sealed trait v3 extends UuidVersion
  
  @js.native
  sealed trait v4 extends UuidVersion
  
  @js.native
  sealed trait v5 extends UuidVersion
  
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def v1: v1 = "v1".asInstanceOf[v1]
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
  @scala.inline
  def v3: v3 = "v3".asInstanceOf[v3]
  @scala.inline
  def v4: v4 = "v4".asInstanceOf[v4]
  @scala.inline
  def v5: v5 = "v5".asInstanceOf[v5]
}

