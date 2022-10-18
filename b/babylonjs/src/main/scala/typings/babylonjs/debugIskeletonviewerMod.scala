package typings.babylonjs

import typings.babylonjs.bonesSkeletonMod.Skeleton
import typings.babylonjs.mathsMathDotcolorMod.Color3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugIskeletonviewerMod {
  
  trait IBoneWeightShaderOptions extends StObject {
    
    /** Colors for Uninfluenced bones */
    var colorBase: js.UndefOr[Color3] = js.undefined
    
    /** Color for 0.75-1 Weight Influence */
    var colorFull: js.UndefOr[Color3] = js.undefined
    
    /** Color for 0.5-0.75 Weight Influence */
    var colorHalf: js.UndefOr[Color3] = js.undefined
    
    /** Color for 0.25-0.5 Weight Influence */
    var colorQuarter: js.UndefOr[Color3] = js.undefined
    
    /** Colors for 0.0-0.25 Weight bones */
    var colorZero: js.UndefOr[Color3] = js.undefined
    
    /** Skeleton to Map */
    var skeleton: Skeleton
    
    /** Color for Zero Weight Influence */
    var targetBoneIndex: js.UndefOr[Double] = js.undefined
  }
  object IBoneWeightShaderOptions {
    
    inline def apply(skeleton: Skeleton): IBoneWeightShaderOptions = {
      val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBoneWeightShaderOptions]
    }
    
    extension [Self <: IBoneWeightShaderOptions](x: Self) {
      
      inline def setColorBase(value: Color3): Self = StObject.set(x, "colorBase", value.asInstanceOf[js.Any])
      
      inline def setColorBaseUndefined: Self = StObject.set(x, "colorBase", js.undefined)
      
      inline def setColorFull(value: Color3): Self = StObject.set(x, "colorFull", value.asInstanceOf[js.Any])
      
      inline def setColorFullUndefined: Self = StObject.set(x, "colorFull", js.undefined)
      
      inline def setColorHalf(value: Color3): Self = StObject.set(x, "colorHalf", value.asInstanceOf[js.Any])
      
      inline def setColorHalfUndefined: Self = StObject.set(x, "colorHalf", js.undefined)
      
      inline def setColorQuarter(value: Color3): Self = StObject.set(x, "colorQuarter", value.asInstanceOf[js.Any])
      
      inline def setColorQuarterUndefined: Self = StObject.set(x, "colorQuarter", js.undefined)
      
      inline def setColorZero(value: Color3): Self = StObject.set(x, "colorZero", value.asInstanceOf[js.Any])
      
      inline def setColorZeroUndefined: Self = StObject.set(x, "colorZero", js.undefined)
      
      inline def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setTargetBoneIndex(value: Double): Self = StObject.set(x, "targetBoneIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetBoneIndexUndefined: Self = StObject.set(x, "targetBoneIndex", js.undefined)
    }
  }
  
  trait ISkeletonMapShaderColorMapKnot extends StObject {
    
    /** Color of the Knot */
    var color: Color3
    
    /** Location of the Knot */
    var location: Double
  }
  object ISkeletonMapShaderColorMapKnot {
    
    inline def apply(color: Color3, location: Double): ISkeletonMapShaderColorMapKnot = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkeletonMapShaderColorMapKnot]
    }
    
    extension [Self <: ISkeletonMapShaderColorMapKnot](x: Self) {
      
      inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISkeletonMapShaderOptions extends StObject {
    
    /** Array of ColorMapKnots that make the gradient must be ordered with knot[i].location < knot[i+1].location*/
    var colorMap: js.UndefOr[js.Array[ISkeletonMapShaderColorMapKnot]] = js.undefined
    
    /** Skeleton to Map */
    var skeleton: Skeleton
  }
  object ISkeletonMapShaderOptions {
    
    inline def apply(skeleton: Skeleton): ISkeletonMapShaderOptions = {
      val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkeletonMapShaderOptions]
    }
    
    extension [Self <: ISkeletonMapShaderOptions](x: Self) {
      
      inline def setColorMap(value: js.Array[ISkeletonMapShaderColorMapKnot]): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setColorMapVarargs(value: ISkeletonMapShaderColorMapKnot*): Self = StObject.set(x, "colorMap", js.Array(value*))
      
      inline def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISkeletonViewerDisplayOptions extends StObject {
    
    /** Length of each local axis */
    var localAxesSize: js.UndefOr[Double] = js.undefined
    
    /** How far down to start tapering the bone spurs */
    var midStep: js.UndefOr[Double] = js.undefined
    
    /** How big is the midStep? */
    var midStepFactor: js.UndefOr[Double] = js.undefined
    
    /** Whether to show local axes or not  */
    var showLocalAxes: js.UndefOr[Boolean] = js.undefined
    
    /** Base for the Sphere Size */
    var sphereBaseSize: js.UndefOr[Double] = js.undefined
    
    /** Ratio for the Sphere Size */
    var sphereFactor: js.UndefOr[Double] = js.undefined
    
    /** The ratio of the sphere to the longest bone in units */
    var sphereScaleUnit: js.UndefOr[Double] = js.undefined
    
    /** Whether a spur should attach its far end to the child bone position */
    var spurFollowsChild: js.UndefOr[Boolean] = js.undefined
  }
  object ISkeletonViewerDisplayOptions {
    
    inline def apply(): ISkeletonViewerDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISkeletonViewerDisplayOptions]
    }
    
    extension [Self <: ISkeletonViewerDisplayOptions](x: Self) {
      
      inline def setLocalAxesSize(value: Double): Self = StObject.set(x, "localAxesSize", value.asInstanceOf[js.Any])
      
      inline def setLocalAxesSizeUndefined: Self = StObject.set(x, "localAxesSize", js.undefined)
      
      inline def setMidStep(value: Double): Self = StObject.set(x, "midStep", value.asInstanceOf[js.Any])
      
      inline def setMidStepFactor(value: Double): Self = StObject.set(x, "midStepFactor", value.asInstanceOf[js.Any])
      
      inline def setMidStepFactorUndefined: Self = StObject.set(x, "midStepFactor", js.undefined)
      
      inline def setMidStepUndefined: Self = StObject.set(x, "midStep", js.undefined)
      
      inline def setShowLocalAxes(value: Boolean): Self = StObject.set(x, "showLocalAxes", value.asInstanceOf[js.Any])
      
      inline def setShowLocalAxesUndefined: Self = StObject.set(x, "showLocalAxes", js.undefined)
      
      inline def setSphereBaseSize(value: Double): Self = StObject.set(x, "sphereBaseSize", value.asInstanceOf[js.Any])
      
      inline def setSphereBaseSizeUndefined: Self = StObject.set(x, "sphereBaseSize", js.undefined)
      
      inline def setSphereFactor(value: Double): Self = StObject.set(x, "sphereFactor", value.asInstanceOf[js.Any])
      
      inline def setSphereFactorUndefined: Self = StObject.set(x, "sphereFactor", js.undefined)
      
      inline def setSphereScaleUnit(value: Double): Self = StObject.set(x, "sphereScaleUnit", value.asInstanceOf[js.Any])
      
      inline def setSphereScaleUnitUndefined: Self = StObject.set(x, "sphereScaleUnit", js.undefined)
      
      inline def setSpurFollowsChild(value: Boolean): Self = StObject.set(x, "spurFollowsChild", value.asInstanceOf[js.Any])
      
      inline def setSpurFollowsChildUndefined: Self = StObject.set(x, "spurFollowsChild", js.undefined)
    }
  }
  
  trait ISkeletonViewerOptions extends StObject {
    
    /** Flag to toggle if the Viewer should use the CPU for animations or not? */
    var computeBonesUsingShaders: Boolean
    
    /** public Display Mode of the Viewer */
    var displayMode: Double
    
    /** Flag to toggle if the Viewer should use the CPU for animations or not? */
    var displayOptions: ISkeletonViewerDisplayOptions
    
    /** Should the system pause animations before building the Viewer? */
    var pauseAnimations: Boolean
    
    /** Should the system return the skeleton to rest before building? */
    var returnToRest: Boolean
    
    /** Flag ignore non weighted bones */
    var useAllBones: Boolean
  }
  object ISkeletonViewerOptions {
    
    inline def apply(
      computeBonesUsingShaders: Boolean,
      displayMode: Double,
      displayOptions: ISkeletonViewerDisplayOptions,
      pauseAnimations: Boolean,
      returnToRest: Boolean,
      useAllBones: Boolean
    ): ISkeletonViewerOptions = {
      val __obj = js.Dynamic.literal(computeBonesUsingShaders = computeBonesUsingShaders.asInstanceOf[js.Any], displayMode = displayMode.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], pauseAnimations = pauseAnimations.asInstanceOf[js.Any], returnToRest = returnToRest.asInstanceOf[js.Any], useAllBones = useAllBones.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkeletonViewerOptions]
    }
    
    extension [Self <: ISkeletonViewerOptions](x: Self) {
      
      inline def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
      
      inline def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      inline def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
      
      inline def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
      
      inline def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
    }
  }
}
