package typings.cacheManagerIoredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cacheManagerIoredisStrings {
  @js.native
  sealed trait master extends js.Object
  
  @js.native
  sealed trait redis extends js.Object
  
  @js.native
  sealed trait slave extends js.Object
  
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
}

