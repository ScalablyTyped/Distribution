package typings.beanstalkd

import typings.beanstalkd.mod.BeanstalkdJobState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beanstalkdStrings {
  
  @js.native
  sealed trait buried
    extends StObject
       with BeanstalkdJobState
  inline def buried: buried = "buried".asInstanceOf[buried]
  
  @js.native
  sealed trait call extends StObject
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait delayed
    extends StObject
       with BeanstalkdJobState
  inline def delayed: delayed = "delayed".asInstanceOf[delayed]
  
  @js.native
  sealed trait drain extends StObject
  inline def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait lookup extends StObject
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait on extends StObject
  inline def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait ready
    extends StObject
       with BeanstalkdJobState
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait reserved
    extends StObject
       with BeanstalkdJobState
  inline def reserved: reserved = "reserved".asInstanceOf[reserved]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait unref extends StObject
  inline def unref: unref = "unref".asInstanceOf[unref]
}
