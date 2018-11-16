package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kv extends js.Object {
  var consul: Consul = js.native
  /**
           * Delete
           */
  @JSName("del")
  var del_Original: consulLib.Anon_Key = js.native
  @JSName("delete")
  var delete_Original: consulLib.Anon_KeyCallback = js.native
  /**
           * Get
           */
  @JSName("get")
  var get_Original: consulLib.Anon_KeyCallbackOpts = js.native
  /**
           * Keys
           */
  @JSName("keys")
  var keys_Original: consulLib.Anon_KeyCallbackOptsTData = js.native
  /**
           * Set
           */
  @JSName("set")
  var set_Original: consulLib.Anon_KeyValue = js.native
  /**
           * Delete
           */
  def del[TData](key: java.lang.String): Thenable[TData] = js.native
  /**
           * Delete
           */
  def del[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Delete
           */
  def del[TData](opts: consulLib.consulMod.ConsulNs.KvNs.DelOptions): Thenable[TData] = js.native
  /**
           * Delete
           */
  def del[TData](opts: consulLib.consulMod.ConsulNs.KvNs.DelOptions, callback: Callback[TData]): scala.Unit = js.native
  def delete[TData](key: java.lang.String): Thenable[TData] = js.native
  def delete[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def delete[TData](opts: consulLib.consulMod.ConsulNs.KvNs.DeleteOptions): Thenable[TData] = js.native
  def delete[TData](opts: consulLib.consulMod.ConsulNs.KvNs.DeleteOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Get
           */
  def get[TData](key: java.lang.String): Thenable[TData] = js.native
  /**
           * Get
           */
  def get[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Get
           */
  def get[TData](opts: consulLib.consulMod.ConsulNs.KvNs.GetOptions): Thenable[TData] = js.native
  /**
           * Get
           */
  def get[TData](opts: consulLib.consulMod.ConsulNs.KvNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Keys
           */
  def keys[TData](): Thenable[TData] = js.native
  /**
           * Keys
           */
  def keys[TData](callback: Callback[TData]): scala.Unit = js.native
  /**
           * Keys
           */
  def keys[TData](key: java.lang.String): Thenable[TData] = js.native
  /**
           * Keys
           */
  def keys[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Keys
           */
  def keys[TData](opts: consulLib.consulMod.ConsulNs.KvNs.KeysOptions): Thenable[TData] = js.native
  /**
           * Keys
           */
  def keys[TData](opts: consulLib.consulMod.ConsulNs.KvNs.KeysOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: java.lang.String): Thenable[TData] = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: java.lang.String, opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): Thenable[TData] = js.native
  /**
           * Set
           */
  def set[TData](
    key: java.lang.String,
    value: java.lang.String,
    opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions,
    callback: Callback[TData]
  ): scala.Unit = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: nodeLib.Buffer): Thenable[TData] = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: nodeLib.Buffer, callback: Callback[TData]): scala.Unit = js.native
  /**
           * Set
           */
  def set[TData](key: java.lang.String, value: nodeLib.Buffer, opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): Thenable[TData] = js.native
  /**
           * Set
           */
  def set[TData](
    key: java.lang.String,
    value: nodeLib.Buffer,
    opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions,
    callback: Callback[TData]
  ): scala.Unit = js.native
  /**
           * Set
           */
  def set[TData](opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): Thenable[TData] = js.native
  /**
           * Set
           */
  def set[TData](opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions, callback: Callback[TData]): scala.Unit = js.native
}

