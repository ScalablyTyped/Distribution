package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  def dateFormat(date: js.Date): String = js.native
  
  def defaultColors(): js.Array[String] | Config = js.native
  def defaultColors(colors: js.Array[String]): js.Array[String] | Config = js.native
  
  var disableTransitions: Boolean = js.native
}
