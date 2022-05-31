package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderCodeCursor extends StObject {
  
  /* private */ var _lines: js.Any = js.native
  
  def canRead: Boolean = js.native
  
  def currentLine: String = js.native
  
  var lineIndex: Double = js.native
  
  def lines_=(value: js.Array[String]): Unit = js.native
}
