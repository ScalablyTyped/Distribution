package typings.chaiArrays

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-arrays", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def array(`val`: js.Array[js.Any]): Unit = js.native
        def array(`val`: js.Array[js.Any], msg: String): Unit = js.native
        
        def containing(`val`: js.Array[js.Any], value: js.Any): Unit = js.native
        def containing(`val`: js.Array[js.Any], value: js.Any, msg: String): Unit = js.native
        
        def containingAllOf(`val`: js.Array[js.Any], values: js.Array[js.Any]): Unit = js.native
        def containingAllOf(`val`: js.Array[js.Any], values: js.Array[js.Any], msg: String): Unit = js.native
        
        def containingAnyOf(`val`: js.Array[js.Any], values: js.Array[js.Any]): Unit = js.native
        def containingAnyOf(`val`: js.Array[js.Any], values: js.Array[js.Any], msg: String): Unit = js.native
        
        def equalTo(`val`: js.Array[js.Any], array: js.Array[js.Any]): Unit = js.native
        def equalTo(`val`: js.Array[js.Any], array: js.Array[js.Any], msg: String): Unit = js.native
        
        def ofSize(`val`: js.Array[js.Any], size: Double): Unit = js.native
        def ofSize(`val`: js.Array[js.Any], size: Double, msg: String): Unit = js.native
        
        def sorted(`val`: js.Array[js.Any]): Unit = js.native
        def sorted(`val`: js.Array[js.Any], msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def array(): Assertion = js.native
        
        def containing(value: js.Any): Assertion = js.native
        
        def containingAllOf(values: js.Array[js.Any]): Assertion = js.native
        
        def containingAnyOf(values: js.Array[js.Any]): Assertion = js.native
        
        def equalTo(arr: js.Array[js.Any]): Assertion = js.native
        
        def ofSize(size: Double): Assertion = js.native
        
        def sorted(): Assertion = js.native
      }
    }
  }
}
