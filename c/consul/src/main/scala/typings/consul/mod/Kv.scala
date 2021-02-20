package typings.consul.mod

import typings.consul.mod.Kv.DelOptions
import typings.consul.mod.Kv.DeleteOptions
import typings.consul.mod.Kv.GetOptions
import typings.consul.mod.Kv.KeysOptions
import typings.consul.mod.Kv.SetOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DelOptions extends CommonOptions {
    
    var cas: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var recurse: js.UndefOr[Boolean] = js.native
  }
  object DelOptions {
    
    @scala.inline
    def apply(key: String): DelOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelOptions]
    }
    
    @scala.inline
    implicit class DelOptionsMutableBuilder[Self <: DelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
  
  type DeleteOptions = DelOptions
  
  @js.native
  trait GetOptions extends CommonOptions {
    
    var buffer: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var recurse: js.UndefOr[Boolean] = js.native
    
    @JSName("wait")
    var wait_FGetOptions: js.UndefOr[String] = js.native
  }
  object GetOptions {
    
    @scala.inline
    def apply(key: String): GetOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      @scala.inline
      def setWait_(value: String): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  @js.native
  trait KeysOptions extends CommonOptions {
    
    var key: String = js.native
    
    var separator: js.UndefOr[String] = js.native
  }
  object KeysOptions {
    
    @scala.inline
    def apply(key: String): KeysOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeysOptions]
    }
    
    @scala.inline
    implicit class KeysOptionsMutableBuilder[Self <: KeysOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  @js.native
  trait SetOptions extends CommonOptions {
    
    var acquire: js.UndefOr[String] = js.native
    
    var cas: js.UndefOr[String] = js.native
    
    var flags: js.UndefOr[Double] = js.native
    
    var key: String = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var value: String | Buffer = js.native
  }
  object SetOptions {
    
    @scala.inline
    def apply(key: String, value: String | Buffer): SetOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquire(value: String): Self = StObject.set(x, "acquire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireUndefined: Self = StObject.set(x, "acquire", js.undefined)
      
      @scala.inline
      def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
