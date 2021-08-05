package typings.chaiLike

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.chaiLike.mod.ChaiLike.ChaiLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-like", JSImport.Namespace)
  @js.native
  val ^ : ChaiLike = js.native
  
  object ChaiLike {
    
    @js.native
    trait ChaiLike extends ChaiPlugin {
      
      def clearPlugins(): Unit = js.native
      
      def extend(plugin: Plugin): Unit = js.native
    }
    
    trait Plugin extends StObject {
      
      def assert(`object`: js.Any, expected: js.Any): Boolean
      
      def `match`(`object`: js.Any, expected: js.Any): Boolean
    }
    object Plugin {
      
      inline def apply(assert: (js.Any, js.Any) => Boolean, `match`: (js.Any, js.Any) => Boolean): Plugin = {
        val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
        __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
        __obj.asInstanceOf[Plugin]
      }
      
      extension [Self <: Plugin](x: Self) {
        
        inline def setAssert(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
        
        inline def setMatch(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      }
    }
  }
  
  type _To = ChaiLike
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiLike = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def like(expected: js.Any): Unit = js.native
      }
    }
  }
}
