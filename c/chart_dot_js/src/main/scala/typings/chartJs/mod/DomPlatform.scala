package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Platform class for charts that can access the DOM and global window/document properties
  * @extends BasePlatform
  */
@js.native
trait DomPlatform
  extends StObject
     with BasePlatform {
  
  /**
    * @param {Chart} chart
    * @param {string} type
    */
  def removeEventListener(chart: Chart, `type`: String): scala.Unit = js.native
}
