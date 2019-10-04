package typings.concurrently

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object concurrentlyStrings {
  @js.native
  sealed trait command extends js.Object
  
  @js.native
  sealed trait failure extends js.Object
  
  @js.native
  sealed trait first extends js.Object
  
  @js.native
  sealed trait index extends js.Object
  
  @js.native
  sealed trait last extends js.Object
  
  @js.native
  sealed trait name extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait pid extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait time extends js.Object
  
  @scala.inline
  def command: command = "command".asInstanceOf[command]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def pid: pid = "pid".asInstanceOf[pid]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
}

