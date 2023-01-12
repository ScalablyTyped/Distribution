package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTypesMod {
  
  trait HelperStepsProps extends StObject {
    
    var index: Double
    
    var length: Double
    
    def onFinish(): Any
    
    def onNext(): Any
    
    def onPrev(): Any
  }
  object HelperStepsProps {
    
    inline def apply(index: Double, length: Double, onFinish: () => Any, onNext: () => Any, onPrev: () => Any): HelperStepsProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev))
      __obj.asInstanceOf[HelperStepsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperStepsProps] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: () => Any): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnNext(value: () => Any): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      inline def setOnPrev(value: () => Any): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    }
  }
}
