package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorCurves extends StObject {
  
  /* private */ var _dirty: js.Any = js.native
  
  /* private */ var _globalCurve: js.Any = js.native
  
  /* private */ var _globalDensity: js.Any = js.native
  
  /* private */ var _globalExposure: js.Any = js.native
  
  /* private */ var _globalHue: js.Any = js.native
  
  /* private */ var _globalSaturation: js.Any = js.native
  
  /* private */ var _highlightsCurve: js.Any = js.native
  
  /* private */ var _highlightsDensity: js.Any = js.native
  
  /* private */ var _highlightsExposure: js.Any = js.native
  
  /* private */ var _highlightsHue: js.Any = js.native
  
  /* private */ var _highlightsSaturation: js.Any = js.native
  
  /* private */ var _midtonesCurve: js.Any = js.native
  
  /* private */ var _midtonesDensity: js.Any = js.native
  
  /* private */ var _midtonesExposure: js.Any = js.native
  
  /* private */ var _midtonesHue: js.Any = js.native
  
  /* private */ var _midtonesSaturation: js.Any = js.native
  
  /* private */ var _negativeCurve: js.Any = js.native
  
  /* private */ var _positiveCurve: js.Any = js.native
  
  /* private */ var _shadowsCurve: js.Any = js.native
  
  /* private */ var _shadowsDensity: js.Any = js.native
  
  /* private */ var _shadowsExposure: js.Any = js.native
  
  /* private */ var _shadowsHue: js.Any = js.native
  
  /* private */ var _shadowsSaturation: js.Any = js.native
  
  /* private */ var _tempColor: js.Any = js.native
  
  /**
    * Returns the class name
    * @returns The class name
    */
  def getClassName(): String = js.native
  
  /**
    * Returns color grading data based on a hue, density, saturation and exposure value.
    * @param filterHue The hue of the color filter.
    * @param filterDensity The density of the color filter.
    * @param saturation The saturation.
    * @param exposure The exposure.
    * @param result The result data container.
    */
  /* private */ var getColorGradingDataToRef: js.Any = js.native
  
  /**
    * Gets the global Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def globalDensity: Double = js.native
  /**
    * Sets the global Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def globalDensity_=(value: Double): Unit = js.native
  
  /**
    * Gets the global Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def globalExposure: Double = js.native
  /**
    * Sets the global Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def globalExposure_=(value: Double): Unit = js.native
  
  /**
    * Gets the global Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def globalHue: Double = js.native
  /**
    * Sets the global Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def globalHue_=(value: Double): Unit = js.native
  
  /**
    * Gets the global Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def globalSaturation: Double = js.native
  /**
    * Sets the global Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def globalSaturation_=(value: Double): Unit = js.native
  
  /**
    * Gets the highlights Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def highlightsDensity: Double = js.native
  /**
    * Sets the highlights Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def highlightsDensity_=(value: Double): Unit = js.native
  
  /**
    * Gets the highlights Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def highlightsExposure: Double = js.native
  /**
    * Sets the highlights Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def highlightsExposure_=(value: Double): Unit = js.native
  
  /**
    * Gets the highlights Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def highlightsHue: Double = js.native
  /**
    * Sets the highlights Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def highlightsHue_=(value: Double): Unit = js.native
  
  /**
    * Gets the highlights Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def highlightsSaturation: Double = js.native
  /**
    * Sets the highlights Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def highlightsSaturation_=(value: Double): Unit = js.native
  
  /**
    * Gets the midtones Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def midtonesDensity: Double = js.native
  /**
    * Sets the midtones Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def midtonesDensity_=(value: Double): Unit = js.native
  
  /**
    * Gets the midtones Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def midtonesExposure: Double = js.native
  /**
    * Sets the midtones Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def midtonesExposure_=(value: Double): Unit = js.native
  
  /**
    * Gets the midtones Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def midtonesHue: Double = js.native
  /**
    * Sets the midtones Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def midtonesHue_=(value: Double): Unit = js.native
  
  /**
    * Gets the midtones Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def midtonesSaturation: Double = js.native
  /**
    * Sets the midtones Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def midtonesSaturation_=(value: Double): Unit = js.native
  
  /**
    * Serializes the current color curve instance to a json representation.
    * @return a JSON representation
    */
  def serialize(): js.Any = js.native
  
  /**
    * Gets the shadows Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def shadowsDensity: Double = js.native
  /**
    * Sets the shadows Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  def shadowsDensity_=(value: Double): Unit = js.native
  
  /**
    * Gets the shadows Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def shadowsExposure: Double = js.native
  /**
    * Sets the shadows Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  def shadowsExposure_=(value: Double): Unit = js.native
  
  /**
    * Gets the shadows Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def shadowsHue: Double = js.native
  /**
    * Sets the shadows Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  def shadowsHue_=(value: Double): Unit = js.native
  
  /**
    * Gets the shadows Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def shadowsSaturation: Double = js.native
  /**
    * Sets the shadows Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  def shadowsSaturation_=(value: Double): Unit = js.native
}
