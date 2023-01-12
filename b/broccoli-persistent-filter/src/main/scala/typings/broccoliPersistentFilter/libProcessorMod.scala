package typings.broccoliPersistentFilter

import typings.broccoliPersistentFilter.anon.ProcessStringResult
import typings.broccoliPersistentFilter.libDependenciesMod.FSFacade
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Context
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.InstrumentationSchema
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessorMod {
  
  @JSImport("broccoli-persistent-filter/lib/processor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Processor {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def init(ctx: Context): Unit = js.native
    
    /* CompleteClass */
    override def initialDependencies(rootFS: FSFacade, inputEncoding: String): typings.broccoliPersistentFilter.libDependenciesMod.^ = js.native
    
    /* CompleteClass */
    var persistent: Boolean = js.native
    
    /* CompleteClass */
    override def processString(
      ctx: Context,
      contents: String,
      relativePath: String,
      forceInvalidation: Boolean,
      instrumentation: InstrumentationSchema
    ): String | ProcessStringResult | (js.Promise[String | ProcessStringResult]) = js.native
    
    /* CompleteClass */
    var processor: Strategy = js.native
    
    /* CompleteClass */
    override def sealDependencies(dependencies: typings.broccoliPersistentFilter.libDependenciesMod.^): Unit = js.native
    
    /* CompleteClass */
    override def setStrategy(strategy: Strategy): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
  
  trait Processor
    extends StObject
       with Strategy {
    
    var persistent: Boolean
    
    var processor: Strategy
    
    def setStrategy(strategy: Strategy): Unit
  }
  object Processor {
    
    inline def apply(
      init: Context => Unit,
      initialDependencies: (FSFacade, String) => typings.broccoliPersistentFilter.libDependenciesMod.^,
      persistent: Boolean,
      processString: (Context, String, String, Boolean, InstrumentationSchema) => String | ProcessStringResult | (js.Promise[String | ProcessStringResult]),
      processor: Strategy,
      sealDependencies: typings.broccoliPersistentFilter.libDependenciesMod.^ => Unit,
      setStrategy: Strategy => Unit
    ): Processor = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), initialDependencies = js.Any.fromFunction2(initialDependencies), persistent = persistent.asInstanceOf[js.Any], processString = js.Any.fromFunction5(processString), processor = processor.asInstanceOf[js.Any], sealDependencies = js.Any.fromFunction1(sealDependencies), setStrategy = js.Any.fromFunction1(setStrategy))
      __obj.asInstanceOf[Processor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Processor] (val x: Self) extends AnyVal {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: Strategy): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setSetStrategy(value: Strategy => Unit): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1(value))
    }
  }
}
