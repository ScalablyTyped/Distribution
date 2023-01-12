package typings.cacheManagerIoredis

import typings.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterOptions
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClusterConfig extends StObject {
    
    var clusterConfig: ClusterOptions
    
    var max: js.UndefOr[Double] = js.undefined
    
    var store: RedisStoreConstructor
  }
  object ClusterConfig {
    
    inline def apply(clusterConfig: ClusterOptions, store: RedisStoreConstructor): ClusterConfig = {
      val __obj = js.Dynamic.literal(clusterConfig = clusterConfig.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClusterConfig] (val x: Self) extends AnyVal {
      
      inline def setClusterConfig(value: ClusterOptions): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var store: RedisStoreConstructor
  }
  object Max {
    
    inline def apply(store: RedisStoreConstructor): Max = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
