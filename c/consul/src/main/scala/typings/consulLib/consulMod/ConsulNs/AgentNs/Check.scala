package typings
package consulLib.consulMod.ConsulNs.AgentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Check extends js.Object {
  var consul: consulLib.consulMod.ConsulNs.Consul = js.native
  /**
    * Deregister a local check
    */
  @JSName("deregister")
  var deregister_Original: consulLib.Anon_CallbackIdOptsDeregisterOptions = js.native
  /**
    * Mark a local test as critical
    */
  @JSName("fail")
  var fail_Original: consulLib.Anon_CallbackIdOptsFailOptions = js.native
  /**
    * Returns the checks the local agent is managing
    */
  @JSName("list")
  var list_Original: consulLib.Anon_CallbackOptsListOptionsTData = js.native
  /**
    * Mark a local test as passing
    */
  @JSName("pass")
  var pass_Original: consulLib.Anon_CallbackIdOptsPassOptions = js.native
  /**
    * Registers a new local check
    */
  @JSName("register")
  var register_Original: consulLib.Anon_CallbackOptsRegisterOptions = js.native
  /**
    * Mark a local test as warning
    */
  @JSName("warn")
  var warn_Original: consulLib.Anon_CallbackIdOptsString = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](id: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](id: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.DeregisterOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Deregister a local check
    */
  def deregister[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.DeregisterOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](id: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](id: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.FailOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as critical
    */
  def fail[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.FailOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.ListOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def list[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.ListOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](id: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](id: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.PassOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as passing
    */
  def pass[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.PassOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Registers a new local check
    */
  def register[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.RegisterOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Registers a new local check
    */
  def register[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.RegisterOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](id: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](id: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.WarnOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Mark a local test as warning
    */
  def warn[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.CheckNs.WarnOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

