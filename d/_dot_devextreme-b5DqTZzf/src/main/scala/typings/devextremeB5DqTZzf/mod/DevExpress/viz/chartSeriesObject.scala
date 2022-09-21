package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chartSeriesObject
  extends StObject
     with baseSeriesObject {
  
  /**
    * Returns the name of the value axis of the series.
    */
  var axis: js.UndefOr[String] = js.native
  
  /**
    * The name of the series&apos; barOverlapGroup.
    */
  var barOverlapGroup: js.UndefOr[String] = js.native
  
  /**
    * Gets the argument axis to which the series belongs.
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * Gets the value axis to which the series belongs.
    */
  def getValueAxis(): chartAxisObject = js.native
  
  /**
    * Returns the name of the series pane.
    */
  var pane: js.UndefOr[String] = js.native
  
  /**
    * The name of the series&apos; stack.
    */
  var stack: js.UndefOr[String] = js.native
}
