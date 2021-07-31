package typings.chaiString

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-string", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def containIgnoreCase(`val`: String, exp: String): Unit = js.native
        def containIgnoreCase(`val`: String, exp: String, msg: String): Unit = js.native
        
        def containIgnoreSpaces(`val`: String, exp: String): Unit = js.native
        def containIgnoreSpaces(`val`: String, exp: String, msg: String): Unit = js.native
        
        def endsWith(`val`: String, exp: String): Unit = js.native
        def endsWith(`val`: String, exp: String, msg: String): Unit = js.native
        
        def entriesCount(str: String, substr: String, count: Double): Unit = js.native
        def entriesCount(str: String, substr: String, count: Double, msg: String): Unit = js.native
        
        def equalIgnoreCase(`val`: String, exp: String): Unit = js.native
        def equalIgnoreCase(`val`: String, exp: String, msg: String): Unit = js.native
        
        def equalIgnoreSpaces(`val`: String, exp: String): Unit = js.native
        def equalIgnoreSpaces(`val`: String, exp: String, msg: String): Unit = js.native
        
        def indexOf(str: String, substr: String, index: Double): Unit = js.native
        def indexOf(str: String, substr: String, index: Double, msg: String): Unit = js.native
        
        def notContainIgnoreCase(`val`: String, exp: String): Unit = js.native
        def notContainIgnoreCase(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notContainIgnoreSpaces(`val`: String, exp: String): Unit = js.native
        def notContainIgnoreSpaces(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notEndsWith(`val`: String, exp: String): Unit = js.native
        def notEndsWith(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notEqualIgnoreCase(`val`: String, exp: String): Unit = js.native
        def notEqualIgnoreCase(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notEqualIgnoreSpaces(`val`: String, exp: String): Unit = js.native
        def notEqualIgnoreSpaces(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notPalindrome(`val`: String): Unit = js.native
        def notPalindrome(`val`: String, msg: String): Unit = js.native
        
        def notReverseOf(`val`: String, exp: String): Unit = js.native
        def notReverseOf(`val`: String, exp: String, msg: String): Unit = js.native
        
        def notSingleLine(`val`: String): Unit = js.native
        def notSingleLine(`val`: String, msg: String): Unit = js.native
        
        def notStartsWith(`val`: String, exp: String): Unit = js.native
        def notStartsWith(`val`: String, exp: String, msg: String): Unit = js.native
        
        def palindrome(`val`: String): Unit = js.native
        def palindrome(`val`: String, msg: String): Unit = js.native
        
        def reverseOf(`val`: String, exp: String): Unit = js.native
        def reverseOf(`val`: String, exp: String, msg: String): Unit = js.native
        
        def singleLine(`val`: String): Unit = js.native
        def singleLine(`val`: String, msg: String): Unit = js.native
        
        def startsWith(`val`: String, exp: String): Unit = js.native
        def startsWith(`val`: String, exp: String, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def containIgnoreCase(expected: String): Assertion = js.native
        def containIgnoreCase(expected: String, msg: String): Assertion = js.native
        
        def containIgnoreSpaces(expected: String): Assertion = js.native
        def containIgnoreSpaces(expected: String, msg: String): Assertion = js.native
        
        def endWith(expected: String): Assertion = js.native
        def endWith(expected: String, message: String): Assertion = js.native
        
        def endsWith(expected: String): Assertion = js.native
        def endsWith(expected: String, message: String): Assertion = js.native
        
        def entriesCount(substr: String, expected: Double): Assertion = js.native
        def entriesCount(substr: String, expected: Double, message: String): Assertion = js.native
        
        def equalIgnoreCase(expected: String): Assertion = js.native
        def equalIgnoreCase(expected: String, message: String): Assertion = js.native
        
        def equalIgnoreSpaces(expected: String): Assertion = js.native
        def equalIgnoreSpaces(expected: String, message: String): Assertion = js.native
        
        def indexOf(str: String, substr: String, index: Double): Assertion = js.native
        def indexOf(str: String, substr: String, index: Double, msg: String): Assertion = js.native
        
        def palindrome(): Assertion = js.native
        def palindrome(message: String): Assertion = js.native
        
        def reverseOf(): Assertion = js.native
        def reverseOf(message: String): Assertion = js.native
        
        def singleLine(): Assertion = js.native
        def singleLine(message: String): Assertion = js.native
        
        def startWith(expected: String): Assertion = js.native
        def startWith(expected: String, message: String): Assertion = js.native
        
        def startsWith(expected: String): Assertion = js.native
        def startsWith(expected: String, message: String): Assertion = js.native
      }
    }
  }
}
