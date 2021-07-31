package typings.coffeeify

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("coffeeify", JSImport.Namespace)
  @js.native
  val ^ : Coffeeify = js.native
  
  type Callback = js.Function2[/* error */ ParseError, /* compiled */ String, Unit]
  
  @js.native
  trait Coffeeify extends StObject {
    
    def apply(file: String): ThroughStream = js.native
    
    def compile(file: String, data: String, callback: Callback): Unit = js.native
    
    def isCoffee(file: String): Boolean = js.native
    
    def isLiterate(file: String): Boolean = js.native
    
    var sourceMap: Boolean = js.native
  }
  
  @js.native
  trait ParseError
    extends StObject
       with Error
       with Instantiable3[/* error */ js.Any, /* src */ String, /* file */ String, ParseError] {
    
    var annotated: String = js.native
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  
  type _To = Coffeeify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Coffeeify = ^
}
