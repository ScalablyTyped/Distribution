package typings.chaiWebdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Assertion extends StObject {
    
    def count(count: Double): Unit = js.native
    
    def displayed(): Unit = js.native
    
    def enabled(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var immediately: Assertion = js.native
    
    def text(expected: String): Unit = js.native
    def text(expected: js.RegExp): Unit = js.native
    def text(expected: Double): Unit = js.native
    
    def there(): Unit = js.native
    
    def value(expected: String): Unit = js.native
    def value(expected: js.RegExp): Unit = js.native
    def value(expected: Double): Unit = js.native
  }
}
