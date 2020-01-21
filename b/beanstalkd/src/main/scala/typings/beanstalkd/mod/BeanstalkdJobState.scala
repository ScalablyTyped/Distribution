package typings.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.beanstalkd.beanstalkdStrings.ready
  - typings.beanstalkd.beanstalkdStrings.delayed
  - typings.beanstalkd.beanstalkdStrings.reserved
  - typings.beanstalkd.beanstalkdStrings.buried
*/
trait BeanstalkdJobState extends js.Object

object BeanstalkdJobState {
  @scala.inline
  def buried: typings.beanstalkd.beanstalkdStrings.buried = this.cast("buried")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delayed: typings.beanstalkd.beanstalkdStrings.delayed = this.cast("delayed")
  @scala.inline
  def ready: typings.beanstalkd.beanstalkdStrings.ready = this.cast("ready")
  @scala.inline
  def reserved: typings.beanstalkd.beanstalkdStrings.reserved = this.cast("reserved")
}

