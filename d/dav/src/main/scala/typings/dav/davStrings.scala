package typings.dav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object davStrings {
  @js.native
  sealed trait Partial extends js.Object
  
  @js.native
  sealed trait basic extends js.Object
  
  @js.native
  sealed trait caldav extends js.Object
  
  @js.native
  sealed trait carddav extends js.Object
  
  @js.native
  sealed trait webdav extends js.Object
  
  @scala.inline
  def Partial: Partial = "Partial".asInstanceOf[Partial]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def caldav: caldav = "caldav".asInstanceOf[caldav]
  @scala.inline
  def carddav: carddav = "carddav".asInstanceOf[carddav]
  @scala.inline
  def webdav: webdav = "webdav".asInstanceOf[webdav]
}

