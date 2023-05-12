package typings.cfcsCore

import typings.cfcsCore.declarationReactiveObserverMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveHooksMod {
  
  @JSImport("@cfcs/core/declaration/reactive/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectDependencies(host: Observer[Any]): Detected = ^.asInstanceOf[js.Dynamic].applyDynamic("detectDependencies")(host.asInstanceOf[js.Any]).asInstanceOf[Detected]
  
  inline def endDetectDependencies(): Detected = ^.asInstanceOf[js.Dynamic].applyDynamic("endDetectDependencies")().asInstanceOf[Detected]
  
  inline def getCurrentDetected(): js.UndefOr[Detected] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDetected")().asInstanceOf[js.UndefOr[Detected]]
  
  inline def getDetectedStack(): js.Array[Detected] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetectedStack")().asInstanceOf[js.Array[Detected]]
  
  trait Detected extends StObject {
    
    var host: Observer[Any]
    
    var observers: js.Array[Observer[Any]]
    
    def push(observer: Observer[Any]): Unit
  }
  object Detected {
    
    inline def apply(host: Observer[Any], observers: js.Array[Observer[Any]], push: Observer[Any] => Unit): Detected = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Detected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Detected] (val x: Self) extends AnyVal {
      
      inline def setHost(value: Observer[Any]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: js.Array[Observer[Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversVarargs(value: Observer[Any]*): Self = StObject.set(x, "observers", js.Array(value*))
      
      inline def setPush(value: Observer[Any] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
