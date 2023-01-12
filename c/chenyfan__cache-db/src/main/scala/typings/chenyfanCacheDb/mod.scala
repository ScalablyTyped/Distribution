package typings.chenyfanCacheDb

import typings.chenyfanCacheDb.chenyfanCacheDbStrings.arrayBuffer
import typings.chenyfanCacheDb.chenyfanCacheDbStrings.blob
import typings.chenyfanCacheDb.chenyfanCacheDbStrings.json
import typings.chenyfanCacheDb.chenyfanCacheDbStrings.text
import typings.std.Blob
import typings.std.FormData
import typings.std.ReadableStream
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chenyfan/cache-db", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CacheDB {
    def this(namespace: String) = this()
    def this(namespace: String, prefix: String) = this()
    def this(namespace: Unit, prefix: String) = this()
  }
  
  @js.native
  trait CacheDB extends StObject {
    
    def delete(key: String): js.Promise[Boolean] = js.native
    
    var namespace: String = js.native
    
    var prefix: String = js.native
    
    def read(key: String): js.Promise[ReadMethodData] = js.native
    def read(key: String, config: Config): js.Promise[ReadMethodData] = js.native
    
    def write(key: String, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: String, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
    def write(key: Boolean, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: Boolean, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
    def write(key: Double, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: Double, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
  }
  
  trait Config extends StObject {
    
    var `type`: json | arrayBuffer | blob | text | String
  }
  object Config {
    
    inline def apply(`type`: json | arrayBuffer | blob | text | String): Config = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setType(value: json | arrayBuffer | blob | text | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadMethodData = js.Object | js.typedarray.ArrayBuffer | Blob | String | Null
  
  type WriteValue = ReadableStream[Any] | Blob | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | FormData | URLSearchParams | String
}
