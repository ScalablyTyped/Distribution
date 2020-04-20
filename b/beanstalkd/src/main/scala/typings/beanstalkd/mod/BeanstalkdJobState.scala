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
  def buried: typings.beanstalkd.beanstalkdStrings.buried = "buried".asInstanceOf[typings.beanstalkd.beanstalkdStrings.buried]
  @scala.inline
  def delayed: typings.beanstalkd.beanstalkdStrings.delayed = "delayed".asInstanceOf[typings.beanstalkd.beanstalkdStrings.delayed]
  @scala.inline
  def ready: typings.beanstalkd.beanstalkdStrings.ready = "ready".asInstanceOf[typings.beanstalkd.beanstalkdStrings.ready]
  @scala.inline
  def reserved: typings.beanstalkd.beanstalkdStrings.reserved = "reserved".asInstanceOf[typings.beanstalkd.beanstalkdStrings.reserved]
}

