package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.MapTypeId.aerial
import typings.bingmaps.Microsoft.Maps.MapTypeId.birdseye
import typings.bingmaps.Microsoft.Maps.MapTypeId.canvasDark
import typings.bingmaps.Microsoft.Maps.MapTypeId.canvasLight
import typings.bingmaps.Microsoft.Maps.MapTypeId.grayscale
import typings.bingmaps.Microsoft.Maps.MapTypeId.mercator
import typings.bingmaps.Microsoft.Maps.MapTypeId.ordnanceSurvey
import typings.bingmaps.Microsoft.Maps.MapTypeId.road
import typings.bingmaps.Microsoft.Maps.MapTypeId.streetside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeId extends js.Object

@JSGlobal("Microsoft.Maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  /** The aerial map type which uses top-down satellite & airplane imagery. */
  @js.native
  sealed trait aerial extends MapTypeId
  
  /** High resolution aerial imagery taken at 45 degrees to the ground, from 4 different directions. */
  @js.native
  sealed trait birdseye extends MapTypeId
  
  /** A darker version of the road maps. */
  @js.native
  sealed trait canvasDark extends MapTypeId
  
  /** A lighter version of the road maps which also has some of the details such as hill shading disabled. */
  @js.native
  sealed trait canvasLight extends MapTypeId
  
  /** A grayscale version of the road maps. */
  @js.native
  sealed trait grayscale extends MapTypeId
  
  /** Displays a blank canvas that uses the mercator map project. It basically removed the base maps layer. */
  @js.native
  sealed trait mercator extends MapTypeId
  
  /** Ordnance survey map type (en-gb only). */
  @js.native
  sealed trait ordnanceSurvey extends MapTypeId
  
  /** Road map type. */
  @js.native
  sealed trait road extends MapTypeId
  
  /** Provides streetside panoramas from the street level. */
  @js.native
  sealed trait streetside extends MapTypeId
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeId with Double] = js.native
  /* 0 */ @js.native
  object aerial extends TopLevel[aerial with Double]
  
  /* 1 */ @js.native
  object birdseye extends TopLevel[birdseye with Double]
  
  /* 2 */ @js.native
  object canvasDark extends TopLevel[canvasDark with Double]
  
  /* 3 */ @js.native
  object canvasLight extends TopLevel[canvasLight with Double]
  
  /* 4 */ @js.native
  object grayscale extends TopLevel[grayscale with Double]
  
  /* 5 */ @js.native
  object mercator extends TopLevel[mercator with Double]
  
  /* 6 */ @js.native
  object ordnanceSurvey extends TopLevel[ordnanceSurvey with Double]
  
  /* 7 */ @js.native
  object road extends TopLevel[road with Double]
  
  /* 8 */ @js.native
  object streetside extends TopLevel[streetside with Double]
  
}

