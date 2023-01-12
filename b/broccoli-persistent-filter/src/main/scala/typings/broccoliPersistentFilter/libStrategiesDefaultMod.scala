package typings.broccoliPersistentFilter

import typings.broccoliPersistentFilter.anon.ProcessStringResult
import typings.broccoliPersistentFilter.libDependenciesMod.FSFacade
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Context
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.InstrumentationSchema
import typings.broccoliPersistentFilter.libStrategiesStrategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStrategiesDefaultMod {
  
  @JSImport("broccoli-persistent-filter/lib/strategies/default", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DefaultStrategy {
    
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def init(ctx: Context): Unit = js.native
    
    /* CompleteClass */
    override def initialDependencies(rootFS: FSFacade, inputEncoding: String): typings.broccoliPersistentFilter.libDependenciesMod.^ = js.native
    
    /* CompleteClass */
    override def processString(ctx: Context, contents: String, relativePath: String): js.Promise[String] = js.native
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
  
  trait DefaultStrategy
    extends StObject
       with Strategy {
    
    def init(): Unit
    
    def processString(ctx: Context, contents: String, relativePath: String): js.Promise[String]
  }
  object DefaultStrategy {
    
    inline def apply(
      init: () => Unit,
      initialDependencies: (FSFacade, String) => typings.broccoliPersistentFilter.libDependenciesMod.^,
      processString: (Context, String, String) => js.Promise[String],
      sealDependencies: typings.broccoliPersistentFilter.libDependenciesMod.^ => Unit
    ): DefaultStrategy = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initialDependencies = js.Any.fromFunction2(initialDependencies), processString = js.Any.fromFunction3(processString), sealDependencies = js.Any.fromFunction1(sealDependencies))
      __obj.asInstanceOf[DefaultStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultStrategy] (val x: Self) extends AnyVal {
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setProcessString(value: (Context, String, String) => js.Promise[String]): Self = StObject.set(x, "processString", js.Any.fromFunction3(value))
    }
  }
}
