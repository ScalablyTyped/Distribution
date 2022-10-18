package typings.cucumberCucumberExpressions

import typings.regexpMatchIndices.typesMod.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcGroupBuilderMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/GroupBuilder", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GroupBuilder
  
  @js.native
  trait GroupBuilder extends StObject {
    
    def add(groupBuilder: GroupBuilder): Unit = js.native
    
    def build(`match`: RegExpExecArray, nextGroupIndex: js.Function0[Double]): typings.cucumberCucumberExpressions.distCjsSrcGroupMod.default = js.native
    
    var capturing: Boolean = js.native
    
    def children: js.Array[GroupBuilder] = js.native
    
    /* private */ val groupBuilders: Any = js.native
    
    def moveChildrenTo(groupBuilder: GroupBuilder): Unit = js.native
    
    def setNonCapturing(): Unit = js.native
    
    var source: String = js.native
  }
}
