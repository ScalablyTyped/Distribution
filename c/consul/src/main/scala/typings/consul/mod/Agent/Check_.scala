package typings.consul.mod.Agent

import typings.consul.mod.Agent.Check.DeregisterOptions
import typings.consul.mod.Agent.Check.FailOptions
import typings.consul.mod.Agent.Check.ListOptions
import typings.consul.mod.Agent.Check.PassOptions
import typings.consul.mod.Agent.Check.RegisterOptions
import typings.consul.mod.Agent.Check.WarnOptions
import typings.consul.mod.Callback
import typings.consul.mod.Consul
import typings.consul.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Check_ extends js.Object {
  var consul: Consul = js.native
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

