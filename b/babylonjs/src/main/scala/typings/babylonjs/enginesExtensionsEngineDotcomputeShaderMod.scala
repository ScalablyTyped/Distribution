package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.IndexInGroupEntries
import typings.babylonjs.computeComputeEffectMod.ComputeEffect
import typings.babylonjs.computeComputeEffectMod.IComputeEffectCreationOptions
import typings.babylonjs.computeIcomputecontextMod.IComputeContext
import typings.babylonjs.computeIcomputepipelinecontextMod.IComputePipelineContext
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotcomputeShaderMod {
  
  @js.native
  sealed trait ComputeBindingType extends StObject
  @JSImport("babylonjs/Engines/Extensions/engine.computeShader", "ComputeBindingType")
  @js.native
  object ComputeBindingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComputeBindingType & Double] = js.native
    
    @js.native
    sealed trait Sampler
      extends StObject
         with ComputeBindingType
    /* 5 */ val Sampler: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.Sampler & Double = js.native
    
    @js.native
    sealed trait StorageBuffer
      extends StObject
         with ComputeBindingType
    /* 3 */ val StorageBuffer: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.StorageBuffer & Double = js.native
    
    @js.native
    sealed trait StorageTexture
      extends StObject
         with ComputeBindingType
    /* 1 */ val StorageTexture: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.StorageTexture & Double = js.native
    
    @js.native
    sealed trait Texture
      extends StObject
         with ComputeBindingType
    /* 0 */ val Texture: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.Texture & Double = js.native
    
    @js.native
    sealed trait TextureWithoutSampler
      extends StObject
         with ComputeBindingType
    /* 4 */ val TextureWithoutSampler: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.TextureWithoutSampler & Double = js.native
    
    @js.native
    sealed trait UniformBuffer
      extends StObject
         with ComputeBindingType
    /* 2 */ val UniformBuffer: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.UniformBuffer & Double = js.native
  }
  
  type ComputeBindingList = StringDictionary[IndexInGroupEntries]
  
  trait ComputeBindingLocation extends StObject {
    
    var binding: Double
    
    var group: Double
  }
  object ComputeBindingLocation {
    
    inline def apply(binding: Double, group: Double): ComputeBindingLocation = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeBindingLocation]
    }
    
    extension [Self <: ComputeBindingLocation](x: Self) {
      
      inline def setBinding(value: Double): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
  
  type ComputeBindingMapping = StringDictionary[ComputeBindingLocation]
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @internal */
      def _deleteComputePipelineContext(pipelineContext: IComputePipelineContext): Unit = js.native
      
      /** @internal */
      def _executeWhenComputeStateIsCompiled(pipelineContext: IComputePipelineContext, action: js.Function0[Unit]): Unit = js.native
      
      /** @internal */
      def _prepareComputePipelineContext(
        pipelineContext: IComputePipelineContext,
        computeSourceCode: String,
        rawComputeSourceCode: String,
        defines: Nullable[String],
        entryPoint: String
      ): Unit = js.native
      
      /** @internal */
      def _rebuildComputeEffects(): Unit = js.native
      
      /** @internal */
      def _releaseComputeEffect(effect: ComputeEffect): Unit = js.native
      
      /**
        * Gets a boolean indicating if all created compute effects are ready
        * @returns true if all effects are ready
        */
      def areAllComputeEffectsReady(): Boolean = js.native
      
      /**
        * Dispatches a compute shader
        * @param effect The compute effect
        * @param context The compute context
        * @param bindings The list of resources to bind to the shader
        * @param x The number of workgroups to execute on the X dimension
        * @param y The number of workgroups to execute on the Y dimension
        * @param z The number of workgroups to execute on the Z dimension
        * @param bindingsMapping list of bindings mapping (key is property name, value is binding location)
        */
      def computeDispatch(effect: ComputeEffect, context: IComputeContext, bindings: ComputeBindingList, x: Double): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Double,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Unit,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Double,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Unit,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      
      /**
        * Creates a new compute context
        * @returns the new context
        */
      def createComputeContext(): js.UndefOr[IComputeContext] = js.native
      
      /**
        * Creates a new compute effect
        * @param baseName Name of the effect
        * @param options Options used to create the effect
        * @returns The new compute effect
        */
      def createComputeEffect(baseName: Any, options: IComputeEffectCreationOptions): ComputeEffect = js.native
      
      /**
        * Creates a new compute pipeline context
        * @returns the new pipeline
        */
      def createComputePipelineContext(): IComputePipelineContext = js.native
      
      /**
        * Forces the engine to release all cached compute effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
        */
      def releaseComputeEffects(): Unit = js.native
    }
  }
}
