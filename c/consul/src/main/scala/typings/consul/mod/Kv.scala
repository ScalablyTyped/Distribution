package typings.consul.mod

import typings.consul.mod.Kv.DelOptions
import typings.consul.mod.Kv.DeleteOptions
import typings.consul.mod.Kv.GetOptions
import typings.consul.mod.Kv.KeysOptions
import typings.consul.mod.Kv.SetOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kv extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Delete
    */
  def del[TData](key: String): Thenable[TData] = js.native
  /**
    * Delete
    */
  def del[TData](key: String, callback: Callback[TData]): Unit = js.native
  /**
    * Delete
    */
  def del[TData](opts: DelOptions): Thenable[TData] = js.native
  /**
    * Delete
    */
  def del[TData](opts: DelOptions, callback: Callback[TData]): Unit = js.native
  
  def delete[TData](key: String): Thenable[TData] = js.native
  def delete[TData](key: String, callback: Callback[TData]): Unit = js.native
  def delete[TData](opts: DeleteOptions): Thenable[TData] = js.native
  def delete[TData](opts: DeleteOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Get
    */
  def get[TData](key: String): Thenable[TData] = js.native
  /**
    * Get
    */
  def get[TData](key: String, callback: Callback[TData]): Unit = js.native
  /**
    * Get
    */
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  /**
    * Get
    */
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Keys
    */
  def keys[TData](): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](callback: Callback[TData]): Unit = js.native
  def keys[TData](key: String): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](key: String, callback: Callback[TData]): Unit = js.native
  def keys[TData](opts: KeysOptions): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](opts: KeysOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Set
    */
  def set[TData](key: String, value: String): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, callback: Callback[TData]): Unit = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, opts: SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  def set[TData](key: String, value: Buffer): Thenable[TData] = js.native
  def set[TData](key: String, value: Buffer, callback: Callback[TData]): Unit = js.native
  def set[TData](key: String, value: Buffer, opts: SetOptions): Thenable[TData] = js.native
  def set[TData](key: String, value: Buffer, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Set
    */
  def set[TData](opts: SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](opts: SetOptions, callback: Callback[TData]): Unit = js.native
}
object Kv {
  
  trait DelOptions
    extends StObject
       with CommonOptions {
    
    var cas: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var recurse: js.UndefOr[Boolean] = js.undefined
  }
  object DelOptions {
    
    inline def apply(key: String): DelOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelOptions]
    }
    
    extension [Self <: DelOptions](x: Self) {
      
      inline def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      inline def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
  
  type DeleteOptions = DelOptions
  
  trait GetOptions
    extends StObject
       with CommonOptions {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var recurse: js.UndefOr[Boolean] = js.undefined
    
    @JSName("wait")
    var wait_FGetOptions: js.UndefOr[String] = js.undefined
  }
  object GetOptions {
    
    inline def apply(key: String): GetOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      inline def setWait_(value: String): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait KeysOptions
    extends StObject
       with CommonOptions {
    
    var key: String
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object KeysOptions {
    
    inline def apply(key: String): KeysOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeysOptions]
    }
    
    extension [Self <: KeysOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait SetOptions
    extends StObject
       with CommonOptions {
    
    var acquire: js.UndefOr[String] = js.undefined
    
    var cas: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var key: String
    
    var release: js.UndefOr[String] = js.undefined
    
    var value: String | Buffer
  }
  object SetOptions {
    
    inline def apply(key: String, value: String | Buffer): SetOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetOptions]
    }
    
    extension [Self <: SetOptions](x: Self) {
      
      inline def setAcquire(value: String): Self = StObject.set(x, "acquire", value.asInstanceOf[js.Any])
      
      inline def setAcquireUndefined: Self = StObject.set(x, "acquire", js.undefined)
      
      inline def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      inline def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
