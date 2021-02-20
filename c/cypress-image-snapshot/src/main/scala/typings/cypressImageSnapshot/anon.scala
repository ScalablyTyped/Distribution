package typings.cypressImageSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Counter extends StObject {
    
    var counter: Double = js.native
    
    var currentTestName: String = js.native
    
    var defaultIdentifier: String = js.native
    
    var testPath: String = js.native
  }
  object Counter {
    
    @scala.inline
    def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIdentifier(value: String): Self = StObject.set(x, "defaultIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IncludeAA extends StObject {
    
    val includeAA: js.UndefOr[Boolean] = js.native
    
    val threshold: js.UndefOr[Double] = js.native
  }
  object IncludeAA {
    
    @scala.inline
    def apply(): IncludeAA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeAA]
    }
    
    @scala.inline
    implicit class IncludeAAMutableBuilder[Self <: IncludeAA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeAA(value: Boolean): Self = StObject.set(x, "includeAA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAAUndefined: Self = StObject.set(x, "includeAA", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
