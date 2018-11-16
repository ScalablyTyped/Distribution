package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait aerial
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** High resolution aerial imagery taken at 45 degrees to the ground, from 4 different directions. */
  @js.native
  sealed trait birdseye
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** A darker version of the road maps. */
  @js.native
  sealed trait canvasDark
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** A lighter version of the road maps which also has some of the details such as hill shading disabled. */
  @js.native
  sealed trait canvasLight
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** A grayscale version of the road maps. */
  @js.native
  sealed trait grayscale
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** Displays a blank canvas that uses the mercator map project. It basically removed the base maps layer. */
  @js.native
  sealed trait mercator
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** Ordnance survey map type (en-gb only). */
  @js.native
  sealed trait ordnanceSurvey
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** Road map type. */
  @js.native
  sealed trait road
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  /** Provides streetside panoramas from the street level. */
  @js.native
  sealed trait streetside
    extends bingmapsLib.MicrosoftNs.MapsNs.MapTypeId
  
  val aerial: aerial with java.lang.String = js.native
  val birdseye: birdseye with java.lang.String = js.native
  val canvasDark: canvasDark with java.lang.String = js.native
  val canvasLight: canvasLight with java.lang.String = js.native
  val grayscale: grayscale with java.lang.String = js.native
  val mercator: mercator with java.lang.String = js.native
  val ordnanceSurvey: ordnanceSurvey with java.lang.String = js.native
  val road: road with java.lang.String = js.native
  val streetside: streetside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.MapTypeId with java.lang.String] = js.native
}

