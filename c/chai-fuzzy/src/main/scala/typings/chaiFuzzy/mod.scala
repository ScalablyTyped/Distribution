package typings.chaiFuzzy

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-fuzzy", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        /**
          * Check the first level of the container for a value like the one provided.
          */
        def containOneLike(actual: js.Any, expected: js.Any): Unit = js.native
        def containOneLike(actual: js.Any, expected: js.Any, message: String): Unit = js.native
        
        /**
          * Check that the given javascript object is like the JSON-ified expected
          * value. Useful for checking stringification and parsing of an object.
          */
        def jsonOf(actual: js.Any, expected: js.Any): Unit = js.native
        def jsonOf(actual: js.Any, expected: js.Any, message: String): Unit = js.native
        
        /**
          * Compare object attributes and values rather than checking to see if
          * they're the same reference.
          */
        def like(actual: js.Any, expected: js.Any): Unit = js.native
        def like(actual: js.Any, expected: js.Any, message: String): Unit = js.native
        
        /**
          * Check the first level of the container for a value like the one provided.
          */
        def notContainOneLike(actual: js.Any, expected: js.Any): Unit = js.native
        def notContainOneLike(actual: js.Any, expected: js.Any, message: String): Unit = js.native
        
        /**
          * Check that the given javascript object is like the JSON-ified expected
          * value. Useful for checking stringification and parsing of an object.
          */
        def notJsonOf(actual: js.Any, expected: js.Any): Unit = js.native
        def notJsonOf(actual: js.Any, expected: js.Any, message: String): Unit = js.native
        
        /**
          * Compare object attributes and values rather than checking to see if
          * they're the same reference.
          */
        def notLike(actual: js.Any, expected: js.Any): Unit = js.native
        def notLike(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        /**
          * Check the first level of the container for a value like the one provided.
          */
        def containOneLike(expected: js.Any): Assertion = js.native
        def containOneLike(expected: js.Any, message: String): Assertion = js.native
        
        /**
          * Check that the given javascript object is like the JSON-ified expected
          * value. Useful for checking stringification and parsing of an object.
          */
        def jsonOf(expected: js.Any): Assertion = js.native
        def jsonOf(expected: js.Any, message: String): Assertion = js.native
        
        /**
          * Compare object attributes and values rather than checking to see if
          * they're the same reference.
          */
        def like(expected: js.Any): Assertion = js.native
        def like(expected: js.Any, message: String): Assertion = js.native
        
        /**
          * Check the first level of the container for a value like the one provided.
          */
        def notContainOneLike(expected: js.Any): Assertion = js.native
        def notContainOneLike(expected: js.Any, message: String): Assertion = js.native
        
        /**
          * Check that the given javascript object is like the JSON-ified expected
          * value. Useful for checking stringification and parsing of an object.
          */
        def notJsonOf(expected: js.Any): Assertion = js.native
        def notJsonOf(expected: js.Any, message: String): Assertion = js.native
        
        /**
          * Compare object attributes and values rather than checking to see if
          * they're the same reference.
          */
        def notLike(expected: js.Any): Assertion = js.native
        def notLike(expected: js.Any, message: String): Assertion = js.native
      }
    }
  }
}
