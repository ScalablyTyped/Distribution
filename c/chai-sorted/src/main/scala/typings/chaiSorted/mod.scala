package typings.chaiSorted

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiSorted.anon.Descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-sorted", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        var ascending: Assertion = js.native
        
        def ascendingBy(key: String): Assertion = js.native
        
        var descending: Assertion = js.native
        
        def descendingBy(key: String): Assertion = js.native
        
        def sorted(): Assertion = js.native
        def sorted(options: Descending): Assertion = js.native
        
        def sortedBy(key: String): Assertion = js.native
        def sortedBy(key: String, options: Descending): Assertion = js.native
      }
    }
  }
}
