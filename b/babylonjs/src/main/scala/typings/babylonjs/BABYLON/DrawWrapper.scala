package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawWrapper extends StObject {
  
  var defines: Nullable[String | MaterialDefines] = js.native
  
  def dispose(): Unit = js.native
  
  var drawContext: js.UndefOr[IDrawContext] = js.native
  
  var effect: Nullable[Effect] = js.native
  
  var materialContext: js.UndefOr[IMaterialContext] = js.native
  
  def setEffect(effect: Nullable[Effect]): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Unit, resetContext: Boolean): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines]): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines], resetContext: Boolean): Unit = js.native
}
