package typings.babyparse

import org.scalablytyped.runtime.Shortcut
import typings.babyparse.BabyParse.ParseConfig
import typings.babyparse.BabyParse.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("babyparse", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /**
    * On Papa there are actually more classes exposed
    * but none of them are officially documented
    * Since we can interact with the Parser from one of the callbacks
    * I have included the API for this class.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("babyparse", "Parser")
  @js.native
  class Parser protected ()
    extends StObject
       with typings.babyparse.BabyParse.Parser {
    def this(config: ParseConfig) = this()
    
    // Sets the abort flag
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    // Gets the cursor position
    /* CompleteClass */
    override def getCharIndex(): Double = js.native
    
    // Parses the input
    /* CompleteClass */
    override def parse(input: String): js.Any = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
