package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkContourMeasureIterConstructor
  extends StObject
     with /**
  * Creates an SkContourMeasureIter with the given path.
  * @param path
  * @param forceClosed - if path should be forced close before measuring it.
  * @param resScale - controls the precision of the measure. values > 1 increase the
  *                   precision (and possibly slow down the computation).
  */
Instantiable3[
      /* path */ SkPath, 
      /* forceClosed */ Boolean, 
      /* resScale */ Double, 
      SkContourMeasureIter
    ]
