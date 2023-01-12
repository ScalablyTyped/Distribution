package typings.broccoliPersistentFilter

import typings.broccoliPersistentFilter.anon.ProcessStringResult
import typings.broccoliPersistentFilter.libDependenciesMod.FSFacade
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Context
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.InstrumentationSchema
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStrategiesPersistentMod {
  
  @JSImport("broccoli-persistent-filter/lib/strategies/persistent", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PersistentStrategy {
    
    /* CompleteClass */
    override def cacheKey(ctx: Context): String = js.native
    
    /* CompleteClass */
    override def init(ctx: Context): Unit = js.native
    
    /* CompleteClass */
    override def initialDependencies(rootFS: FSFacade, inputEncoding: String): typings.broccoliPersistentFilter.libDependenciesMod.^ = js.native
    
    /* CompleteClass */
    override def processString(
      ctx: Context,
      contents: String,
      relativePath: String,
      forceInvalidation: Boolean,
      instrumentation: InstrumentationSchema
    ): String | ProcessStringResult | (js.Promise[String | ProcessStringResult]) = js.native
    
    /* CompleteClass */
    override def sealDependencies(dependencies: typings.broccoliPersistentFilter.libDependenciesMod.^): Unit = js.native
  }
  
  trait IPersistentStrategy
    extends StObject
       with Strategy {
    
    var _cache: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncDiskCache */ Any
      ] = js.undefined
    
    var _syncCache: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SyncDiskCache */ Any
      ] = js.undefined
    
    def cacheKey(ctx: Context): String
  }
  object IPersistentStrategy {
    
    inline def apply(
      cacheKey: Context => String,
      init: Context => Unit,
      initialDependencies: (FSFacade, String) => typings.broccoliPersistentFilter.libDependenciesMod.^,
      processString: (Context, String, String, Boolean, InstrumentationSchema) => String | ProcessStringResult | (js.Promise[String | ProcessStringResult]),
      sealDependencies: typings.broccoliPersistentFilter.libDependenciesMod.^ => Unit
    ): IPersistentStrategy = {
      val __obj = js.Dynamic.literal(cacheKey = js.Any.fromFunction1(cacheKey), init = js.Any.fromFunction1(init), initialDependencies = js.Any.fromFunction2(initialDependencies), processString = js.Any.fromFunction5(processString), sealDependencies = js.Any.fromFunction1(sealDependencies))
      __obj.asInstanceOf[IPersistentStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPersistentStrategy] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: Context => String): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      inline def set_cache(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncDiskCache */ Any
      ): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
      
      inline def set_cacheUndefined: Self = StObject.set(x, "_cache", js.undefined)
      
      inline def set_syncCache(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SyncDiskCache */ Any
      ): Self = StObject.set(x, "_syncCache", value.asInstanceOf[js.Any])
      
      inline def set_syncCacheUndefined: Self = StObject.set(x, "_syncCache", js.undefined)
    }
  }
  
  trait PersistentStrategy
    extends StObject
       with IPersistentStrategy
  object PersistentStrategy {
    
    inline def apply(
      cacheKey: Context => String,
      init: Context => Unit,
      initialDependencies: (FSFacade, String) => typings.broccoliPersistentFilter.libDependenciesMod.^,
      processString: (Context, String, String, Boolean, InstrumentationSchema) => String | ProcessStringResult | (js.Promise[String | ProcessStringResult]),
      sealDependencies: typings.broccoliPersistentFilter.libDependenciesMod.^ => Unit
    ): PersistentStrategy = {
      val __obj = js.Dynamic.literal(cacheKey = js.Any.fromFunction1(cacheKey), init = js.Any.fromFunction1(init), initialDependencies = js.Any.fromFunction2(initialDependencies), processString = js.Any.fromFunction5(processString), sealDependencies = js.Any.fromFunction1(sealDependencies))
      __obj.asInstanceOf[PersistentStrategy]
    }
  }
}
