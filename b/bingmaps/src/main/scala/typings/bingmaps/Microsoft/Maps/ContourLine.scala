package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContourLine
  extends StObject
     with Polygon {
  
  /** The data value associated with this contour line */
  var contourValue: Double | String = js.native
  
  /** The contour lines that are directly nested inside this contour line */
  var innerContourLines: js.Array[ContourLine] = js.native
  
  /** The outer/parent contour line of this contour */
  var outerContourLine: ContourLine = js.native
}
