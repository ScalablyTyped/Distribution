package typings.typescriptNn5FuAjk

import typings.std.StaticRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent
  extends StObject
     with UIEvent {
  
  val data: java.lang.String | Null = js.native
  
  val dataTransfer: DataTransfer | Null = js.native
  
  def getTargetRanges(): Array[StaticRange] = js.native
  
  val inputType: java.lang.String = js.native
  
  val isComposing: scala.Boolean = js.native
}
