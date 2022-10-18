package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcGroupMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Group", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Group {
    def this(value: String, start: Double, end: Double, children: js.Array[Group]) = this()
    def this(value: String, start: Double, end: Unit, children: js.Array[Group]) = this()
    def this(value: String, start: Unit, end: Double, children: js.Array[Group]) = this()
    def this(value: String, start: Unit, end: Unit, children: js.Array[Group]) = this()
  }
  
  @js.native
  trait Group extends StObject {
    
    val children: js.Array[Group] = js.native
    
    val end: js.UndefOr[Double] = js.native
    
    val start: js.UndefOr[Double] = js.native
    
    val value: String = js.native
    
    def values: js.Array[String] | Null = js.native
  }
}
