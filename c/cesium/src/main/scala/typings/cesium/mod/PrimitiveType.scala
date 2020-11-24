package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveType extends js.Object
@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrimitiveType with Double] = js.native
  
  @js.native
  sealed trait LINES extends PrimitiveType
  /* 1 */ @js.native
  object LINES extends TopLevel[LINES with Double]
  
  @js.native
  sealed trait LINE_LOOP extends PrimitiveType
  /* 2 */ @js.native
  object LINE_LOOP extends TopLevel[LINE_LOOP with Double]
  
  @js.native
  sealed trait LINE_STRIP extends PrimitiveType
  /* 3 */ @js.native
  object LINE_STRIP extends TopLevel[LINE_STRIP with Double]
  
  @js.native
  sealed trait POINTS extends PrimitiveType
  /* 0 */ @js.native
  object POINTS extends TopLevel[POINTS with Double]
  
  @js.native
  sealed trait TRIANGLES extends PrimitiveType
  /* 4 */ @js.native
  object TRIANGLES extends TopLevel[TRIANGLES with Double]
  
  @js.native
  sealed trait TRIANGLE_FAN extends PrimitiveType
  /* 6 */ @js.native
  object TRIANGLE_FAN extends TopLevel[TRIANGLE_FAN with Double]
  
  @js.native
  sealed trait TRIANGLE_STRIP extends PrimitiveType
  /* 5 */ @js.native
  object TRIANGLE_STRIP extends TopLevel[TRIANGLE_STRIP with Double]
}
