package typings
package consulLib.consulMod

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
  var del_Original: consulLib.Fn_CallbackKeyOptsDelOptions = js.native
  @JSName("delete")
  var delete_Original: consulLib.Fn_CallbackKeyOptsDeleteOptions = js.native
  /**
    * Get
    */
  @JSName("get")
  var get_Original: consulLib.Fn_CallbackKey = js.native
  /**
    * Keys
    */
  @JSName("keys")
  var keys_Original: consulLib.Fn_CallbackKeyOpts = js.native
  /**
    * Set
    */
  @JSName("set")
  var set_Original: consulLib.Fn_CallbackKeyOptsValue = js.native
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
  def del[TData](opts: consulLib.consulMod.KvNs.DelOptions): Thenable[TData] = js.native
  /**
    * Delete
    */
  def del[TData](opts: consulLib.consulMod.KvNs.DelOptions, callback: Callback[TData]): scala.Unit = js.native
  def delete[TData](key: java.lang.String): Thenable[TData] = js.native
  def delete[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def delete[TData](opts: consulLib.consulMod.KvNs.DeleteOptions): Thenable[TData] = js.native
  def delete[TData](opts: consulLib.consulMod.KvNs.DeleteOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def get[TData](opts: consulLib.consulMod.KvNs.GetOptions): Thenable[TData] = js.native
  /**
    * Get
    */
  def get[TData](opts: consulLib.consulMod.KvNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Keys
    */
  def keys[TData](): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](callback: Callback[TData]): scala.Unit = js.native
  def keys[TData](key: java.lang.String): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](key: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def keys[TData](opts: consulLib.consulMod.KvNs.KeysOptions): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](opts: consulLib.consulMod.KvNs.KeysOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def set[TData](key: java.lang.String, value: java.lang.String, opts: consulLib.consulMod.KvNs.SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](
    key: java.lang.String,
    value: java.lang.String,
    opts: consulLib.consulMod.KvNs.SetOptions,
    callback: Callback[TData]
  ): scala.Unit = js.native
  def set[TData](key: java.lang.String, value: nodeLib.Buffer): Thenable[TData] = js.native
  def set[TData](key: java.lang.String, value: nodeLib.Buffer, callback: Callback[TData]): scala.Unit = js.native
  def set[TData](key: java.lang.String, value: nodeLib.Buffer, opts: consulLib.consulMod.KvNs.SetOptions): Thenable[TData] = js.native
  def set[TData](
    key: java.lang.String,
    value: nodeLib.Buffer,
    opts: consulLib.consulMod.KvNs.SetOptions,
    callback: Callback[TData]
  ): scala.Unit = js.native
  /**
    * Set
    */
  def set[TData](opts: consulLib.consulMod.KvNs.SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](opts: consulLib.consulMod.KvNs.SetOptions, callback: Callback[TData]): scala.Unit = js.native
}

