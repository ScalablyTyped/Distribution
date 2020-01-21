package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrimitiveType extends js.Object

@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  @js.native
  sealed trait LINES extends PrimitiveType
  
  @js.native
  sealed trait LINE_LOOP extends PrimitiveType
  
  @js.native
  sealed trait LINE_STRIP extends PrimitiveType
  
  @js.native
  sealed trait POINTS extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLES extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_FAN extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_STRIP extends PrimitiveType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrimitiveType with Double] = js.native
  /* 1 */ @js.native
  object LINES extends TopLevel[LINES with Double]
  
  /* 2 */ @js.native
  object LINE_LOOP extends TopLevel[LINE_LOOP with Double]
  
  /* 3 */ @js.native
  object LINE_STRIP extends TopLevel[LINE_STRIP with Double]
  
  /* 0 */ @js.native
  object POINTS extends TopLevel[POINTS with Double]
  
  /* 4 */ @js.native
  object TRIANGLES extends TopLevel[TRIANGLES with Double]
  
  /* 6 */ @js.native
  object TRIANGLE_FAN extends TopLevel[TRIANGLE_FAN with Double]
  
  /* 5 */ @js.native
  object TRIANGLE_STRIP extends TopLevel[TRIANGLE_STRIP with Double]
  
}

