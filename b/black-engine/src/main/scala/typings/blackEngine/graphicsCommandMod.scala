package typings.blackEngine

import typings.blackEngine.graphicsCommandTypeMod.GraphicsCommandType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsCommandMod {
  
  @JSImport("black-engine/display/GraphicsCommand", "GraphicsCommand")
  @js.native
  open class GraphicsCommand protected () extends StObject {
    def this(`type`: GraphicsCommandType, data: js.Array[Any]) = this()
    
    var data: js.Array[Any] = js.native
    
    def getBoolean(ix: Double): Boolean = js.native
    
    def getNumber(ix: Double): Double = js.native
    
    def getObject(ix: Double): Any = js.native
    
    def getString(ix: Double): String = js.native
    
    var `type`: GraphicsCommandType = js.native
  }
}
