package typings.connectMemcached

import typings.connectMemcached.anon.FnCall
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import typings.memcached.mod.Location
import typings.memcached.mod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(expressSession: FnCall): Any = ^.asInstanceOf[js.Dynamic].apply(expressSession.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("connect-memcached", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("connect-memcached", "MemcachedStore")
  @js.native
  open class MemcachedStore () extends Store {
    def this(options: MemcachedSessionOptions) = this()
    def this(options: Unit, callback: js.Function1[/* error */ js.Error, Unit]) = this()
    def this(options: MemcachedSessionOptions, callback: js.Function1[/* error */ js.Error, Unit]) = this()
    
    /** Clear all sessions. */
    @JSName("clear")
    def clear_MMemcachedStore(): Unit = js.native
    @JSName("clear")
    def clear_MMemcachedStore(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var client: typings.memcached.mod.^ = js.native
    
    /** Fetch number of sessions. */
    @JSName("length")
    def length_MMemcachedStore(callback: js.Function2[/* err */ Any, /* length */ Double, Unit]): Unit = js.native
    
    /** Refresh the time-to-live for the session with the given `sid`. */
    @JSName("touch")
    def touch_MMemcachedStore(sid: String, session: SessionData): Unit = js.native
    @JSName("touch")
    def touch_MMemcachedStore(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
  }
  
  trait MemcachedSessionOptions
    extends StObject
       with options {
    
    /** Memcached servers locations, can be string, array, hash. */
    var hosts: js.UndefOr[Location] = js.undefined
    
    /**
      * An optional prefix for each memcache key, in case you
      * are sharing your memcached servers with something generating its own keys.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** An optional secret can be used to encrypt/decrypt session contents. */
    var secret: js.UndefOr[String] = js.undefined
    
    /** An optional parameter used for setting the default TTL (in seconds) */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object MemcachedSessionOptions {
    
    inline def apply(): MemcachedSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemcachedSessionOptions]
    }
    
    extension [Self <: MemcachedSessionOptions](x: Self) {
      
      inline def setHosts(value: Location): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
