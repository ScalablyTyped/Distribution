package typings.browserfs.keyValueFilesystemMod

import typings.browserfs.browserfsStrings.readonly
import typings.browserfs.browserfsStrings.readwrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncKeyValueStore extends js.Object {
  
  def beginTransaction(`type`: String): SyncKeyValueROTransaction = js.native
  /**
    * Begins a new read-only transaction.
    */
  @JSName("beginTransaction")
  def beginTransaction_readonly(`type`: readonly): SyncKeyValueROTransaction = js.native
  /**
    * Begins a new read-write transaction.
    */
  @JSName("beginTransaction")
  def beginTransaction_readwrite(`type`: readwrite): SyncKeyValueRWTransaction = js.native
  
  /**
    * Empties the key-value store completely.
    */
  def clear(): Unit = js.native
  
  /**
    * The name of the key-value store.
    */
  def name(): String = js.native
}
