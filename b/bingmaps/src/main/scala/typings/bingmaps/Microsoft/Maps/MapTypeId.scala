package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeId extends StObject
@JSGlobal("Microsoft.Maps.MapTypeId")
@js.native
object MapTypeId extends StObject {
  
  /** The aerial map type which uses top-down satellite & airplane imagery. */
  @js.native
  sealed trait aerial
    extends StObject
       with MapTypeId
  
  /** High resolution aerial imagery taken at 45 degrees to the ground, from 4 different directions. */
  @js.native
  sealed trait birdseye
    extends StObject
       with MapTypeId
  
  /** A darker version of the road maps. */
  @js.native
  sealed trait canvasDark
    extends StObject
       with MapTypeId
  
  /** A lighter version of the road maps which also has some of the details such as hill shading disabled. */
  @js.native
  sealed trait canvasLight
    extends StObject
       with MapTypeId
  
  /** A grayscale version of the road maps. */
  @js.native
  sealed trait grayscale
    extends StObject
       with MapTypeId
  
  /** Displays a blank canvas that uses the mercator map project. It basically removed the base maps layer. */
  @js.native
  sealed trait mercator
    extends StObject
       with MapTypeId
  
  /** Ordnance survey map type (en-gb only). */
  @js.native
  sealed trait ordnanceSurvey
    extends StObject
       with MapTypeId
  
  /** Road map type. */
  @js.native
  sealed trait road
    extends StObject
       with MapTypeId
  
  /** Provides streetside panoramas from the street level. */
  @js.native
  sealed trait streetside
    extends StObject
       with MapTypeId
}
