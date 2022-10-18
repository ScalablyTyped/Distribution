package typings.chartist

import typings.chartist.anon.FillHoles
import typings.chartist.distCoreTypesMod.Segment
import typings.chartist.distCoreTypesMod.SegmentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataSegmentsMod {
  
  @JSImport("chartist/dist/core/data/segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData]): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData], options: FillHoles): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
}
