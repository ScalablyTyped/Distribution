package typings.checkMoreTypes

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("check-more-types", JSImport.Namespace)
  @js.native
  val ^ : CheckModeTypes = js.native
  
  @js.native
  trait CheckModeTypes extends Predicates {
    
    var not: Predicates = js.native
  }
  
  @js.native
  trait Predicates extends StObject {
    
    def defined(s: js.Any): Boolean = js.native
    @JSName("defined")
    var defined_Original: predicate = js.native
    
    def empty(s: js.Any): Boolean = js.native
    @JSName("empty")
    var empty_Original: predicate = js.native
    
    def fn(s: js.Any): Boolean = js.native
    @JSName("fn")
    var fn_Original: predicate = js.native
    
    def number(s: js.Any): Boolean = js.native
    @JSName("number")
    var number_Original: predicate = js.native
    
    def `object`(s: js.Any): Boolean = js.native
    @JSName("object")
    var object_Original: predicate = js.native
    
    // for now, should be curried functions
    var oneOf: js.Any = js.native
    
    var schema: js.Any = js.native
    
    def unemptyString(s: js.Any): Boolean = js.native
    @JSName("unemptyString")
    var unemptyString_Original: predicate = js.native
    
    def webUrl(s: js.Any): Boolean = js.native
    @JSName("webUrl")
    var webUrl_Original: predicate = js.native
  }
  
  type _To = CheckModeTypes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CheckModeTypes = ^
  
  type predicate = js.Function1[/* s */ js.Any, Boolean]
}
