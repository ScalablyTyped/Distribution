package typings.beanstalkd

import typings.beanstalkd.beanstalkdMod.BeanstalkdJobState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object beanstalkdStrings {
  @js.native
  sealed trait buried extends BeanstalkdJobState
  
  @js.native
  sealed trait call extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait delayed extends BeanstalkdJobState
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait lookup extends js.Object
  
  @js.native
  sealed trait on extends js.Object
  
  @js.native
  sealed trait ready extends BeanstalkdJobState
  
  @js.native
  sealed trait reserved extends BeanstalkdJobState
  
  @js.native
  sealed trait timeout extends js.Object
  
  @js.native
  sealed trait unref extends js.Object
  
  @scala.inline
  def buried: buried = "buried".asInstanceOf[buried]
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def delayed: delayed = "delayed".asInstanceOf[delayed]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def reserved: reserved = "reserved".asInstanceOf[reserved]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def unref: unref = "unref".asInstanceOf[unref]
}

