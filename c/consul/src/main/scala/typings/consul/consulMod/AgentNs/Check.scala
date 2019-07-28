package typings.consul.consulMod.AgentNs

import typings.consul.Fn_CallbackIdOptsDeregisterOptions
import typings.consul.Fn_CallbackIdOptsFailOptions
import typings.consul.Fn_CallbackIdOptsPassOptions
import typings.consul.Fn_CallbackIdOptsString
import typings.consul.Fn_CallbackOptsListOptionsTData
import typings.consul.Fn_CallbackOptsRegisterOptions
import typings.consul.consulMod.AgentNs.CheckNs.DeregisterOptions
import typings.consul.consulMod.AgentNs.CheckNs.FailOptions
import typings.consul.consulMod.AgentNs.CheckNs.ListOptions
import typings.consul.consulMod.AgentNs.CheckNs.PassOptions
import typings.consul.consulMod.AgentNs.CheckNs.RegisterOptions
import typings.consul.consulMod.AgentNs.CheckNs.WarnOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Consul
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Check extends js.Object {
  var consul: Consul = js.native
  /**
    * Deregister a local check
    */
  @JSName("deregister")
  var deregister_Original: Fn_CallbackIdOptsDeregisterOptions = js.native
  /**
    * Mark a local test as critical
    */
  @JSName("fail")
  var fail_Original: Fn_CallbackIdOptsFailOptions = js.native
  /**
    * Returns the checks the local agent is managing
    */
  @JSName("list")
  var list_Original: Fn_CallbackOptsListOptionsTData = js.native
  /**
    * Mark a local test as passing
    */
  @JSName("pass")
  var pass_Original: Fn_CallbackIdOptsPassOptions = js.native
  /**
    * Registers a new local check
    */
  @JSName("register")
  var register_Original: Fn_CallbackOptsRegisterOptions = js.native
  /**
    * Mark a local test as warning
    */
  @JSName("warn")
  var warn_Original: Fn_CallbackIdOptsString = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](id: String): Thenable[TData] = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](opts: DeregisterOptions): Thenable[TData] = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](opts: DeregisterOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](id: String): Thenable[TData] = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](opts: FailOptions): Thenable[TData] = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](opts: FailOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](id: String): Thenable[TData] = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](opts: PassOptions): Thenable[TData] = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](opts: PassOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Registers a new local check
    */
  def register[TData](opts: RegisterOptions): Thenable[TData] = js.native
  /**
    * Registers a new local check
    */
  def register[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](id: String): Thenable[TData] = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](opts: WarnOptions): Thenable[TData] = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](opts: WarnOptions, callback: Callback[TData]): Unit = js.native
}

