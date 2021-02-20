package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.skeletonMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iskeletonviewerMod {
  
  @js.native
  trait IBoneWeightShaderOptions extends StObject {
    
    /** Colors for Uninfluenced bones */
    var colorBase: js.UndefOr[Color3] = js.native
    
    /** Color for 0.75-1 Weight Influence */
    var colorFull: js.UndefOr[Color3] = js.native
    
    /** Color for 0.5-0.75 Weight Influence */
    var colorHalf: js.UndefOr[Color3] = js.native
    
    /** Color for 0.25-0.5 Weight Influence */
    var colorQuarter: js.UndefOr[Color3] = js.native
    
    /** Colors for 0.0-0.25 Weight bones */
    var colorZero: js.UndefOr[Color3] = js.native
    
    /** Skeleton to Map */
    var skeleton: Skeleton = js.native
    
    /** Color for Zero Weight Influence */
    var targetBoneIndex: js.UndefOr[Double] = js.native
  }
  object IBoneWeightShaderOptions {
    
    @scala.inline
    def apply(skeleton: Skeleton): IBoneWeightShaderOptions = {
      val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBoneWeightShaderOptions]
    }
    
    @scala.inline
    implicit class IBoneWeightShaderOptionsMutableBuilder[Self <: IBoneWeightShaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorBase(value: Color3): Self = StObject.set(x, "colorBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBaseUndefined: Self = StObject.set(x, "colorBase", js.undefined)
      
      @scala.inline
      def setColorFull(value: Color3): Self = StObject.set(x, "colorFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorFullUndefined: Self = StObject.set(x, "colorFull", js.undefined)
      
      @scala.inline
      def setColorHalf(value: Color3): Self = StObject.set(x, "colorHalf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorHalfUndefined: Self = StObject.set(x, "colorHalf", js.undefined)
      
      @scala.inline
      def setColorQuarter(value: Color3): Self = StObject.set(x, "colorQuarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorQuarterUndefined: Self = StObject.set(x, "colorQuarter", js.undefined)
      
      @scala.inline
      def setColorZero(value: Color3): Self = StObject.set(x, "colorZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorZeroUndefined: Self = StObject.set(x, "colorZero", js.undefined)
      
      @scala.inline
      def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetBoneIndex(value: Double): Self = StObject.set(x, "targetBoneIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetBoneIndexUndefined: Self = StObject.set(x, "targetBoneIndex", js.undefined)
    }
  }
  
  @js.native
  trait ISkeletonMapShaderColorMapKnot extends StObject {
    
    /** Color of the Knot */
    var color: Color3 = js.native
    
    /** Location of the Knot */
    var location: Double = js.native
  }
  object ISkeletonMapShaderColorMapKnot {
    
    @scala.inline
    def apply(color: Color3, location: Double): ISkeletonMapShaderColorMapKnot = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkeletonMapShaderColorMapKnot]
    }
    
    @scala.inline
    implicit class ISkeletonMapShaderColorMapKnotMutableBuilder[Self <: ISkeletonMapShaderColorMapKnot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISkeletonMapShaderOptions extends StObject {
    
    /** Array of ColorMapKnots that make the gradient must be ordered with knot[i].location < knot[i+1].location*/
    var colorMap: js.UndefOr[js.Array[ISkeletonMapShaderColorMapKnot]] = js.native
    
    /** Skeleton to Map */
    var skeleton: Skeleton = js.native
  }
  object ISkeletonMapShaderOptions {
    
    @scala.inline
    def apply(skeleton: Skeleton): ISkeletonMapShaderOptions = {
      val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkeletonMapShaderOptions]
    }
    
    @scala.inline
    implicit class ISkeletonMapShaderOptionsMutableBuilder[Self <: ISkeletonMapShaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorMap(value: js.Array[ISkeletonMapShaderColorMapKnot]): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      @scala.inline
      def setColorMapVarargs(value: ISkeletonMapShaderColorMapKnot*): Self = StObject.set(x, "colorMap", js.Array(value :_*))
      
      @scala.inline
      def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISkeletonViewerDisplayOptions extends StObject {
    
    /** Length of each local axis */
    var localAxesSize: js.UndefOr[Double] = js.native
    
    /** How far down to start tapering the bone spurs */
    var midStep: js.UndefOr[Double] = js.native
    
    /** How big is the midStep? */
    var midStepFactor: js.UndefOr[Double] = js.native
    
    /** Whether to show local axes or not  */
    var showLocalAxes: js.UndefOr[Boolean] = js.native
    
    /** Base for the Sphere Size */
    var sphereBaseSize: js.UndefOr[Double] = js.native
    
    /** Ratio for the Sphere Size */
    var sphereFactor: js.UndefOr[Double] = js.native
    
    /** The ratio of the sphere to the longest bone in units */
    var sphereScaleUnit: js.UndefOr[Double] = js.native
    
    /** Whether a spur should attach its far end to the child bone position */
    var spurFollowsChild: js.UndefOr[Boolean] = js.native
  }
  object ISkeletonViewerDisplayOptions {
    
    @scala.inline
    def apply(): ISkeletonViewerDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISkeletonViewerDisplayOptions]
    }
    
    @scala.inline
    implicit class ISkeletonViewerDisplayOptionsMutableBuilder[Self <: ISkeletonViewerDisplayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalAxesSize(value: Double): Self = StObject.set(x, "localAxesSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAxesSizeUndefined: Self = StObject.set(x, "localAxesSize", js.undefined)
      
      @scala.inline
      def setMidStep(value: Double): Self = StObject.set(x, "midStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMidStepFactor(value: Double): Self = StObject.set(x, "midStepFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMidStepFactorUndefined: Self = StObject.set(x, "midStepFactor", js.undefined)
      
      @scala.inline
      def setMidStepUndefined: Self = StObject.set(x, "midStep", js.undefined)
      
      @scala.inline
      def setShowLocalAxes(value: Boolean): Self = StObject.set(x, "showLocalAxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLocalAxesUndefined: Self = StObject.set(x, "showLocalAxes", js.undefined)
      
      @scala.inline
      def setSphereBaseSize(value: Double): Self = StObject.set(x, "sphereBaseSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphereBaseSizeUndefined: Self = StObject.set(x, "sphereBaseSize", js.undefined)
      
      @scala.inline
      def setSphereFactor(value: Double): Self = StObject.set(x, "sphereFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphereFactorUndefined: Self = StObject.set(x, "sphereFactor", js.undefined)
      
      @scala.inline
      def setSphereScaleUnit(value: Double): Self = StObject.set(x, "sphereScaleUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphereScaleUnitUndefined: Self = StObject.set(x, "sphereScaleUnit", js.undefined)
      
      @scala.inline
      def setSpurFollowsChild(value: Boolean): Self = StObject.set(x, "spurFollowsChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpurFollowsChildUndefined: Self = StObject.set(x, "spurFollowsChild", js.undefined)
    }
  }
  
  @js.native
  trait ISkeletonViewerOptions extends StObject {
    
    /** Flag to toggle if the Viewer should use the CPU for animations or not? */
    var computeBonesUsingShaders: Boolean = js.native
    
    /** public Display Mode of the Viewer */
    var displayMode: Double = js.native
    
    /** Flag to toggle if the Viewer should use the CPU for animations or not? */
    var displayOptions: ISkeletonViewerDisplayOptions = js.native
    
    /** Should the system pause animations before building the Viewer? */
    var pauseAnimations: Boolean = js.native
    
    /** Should the system return the skeleton to rest before building? */
    var returnToRest: Boolean = js.native
    
    /** Flag ignore non weighted bones */
    var useAllBones: Boolean = js.native
  }
  object ISkeletonViewerOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ISkeletonViewerOptionsMutableBuilder[Self <: ISkeletonViewerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "computeBonesUsingShaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayMode(value: Double): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptions(value: ISkeletonViewerDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseAnimations(value: Boolean): Self = StObject.set(x, "pauseAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnToRest(value: Boolean): Self = StObject.set(x, "returnToRest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAllBones(value: Boolean): Self = StObject.set(x, "useAllBones", value.asInstanceOf[js.Any])
    }
  }
}
