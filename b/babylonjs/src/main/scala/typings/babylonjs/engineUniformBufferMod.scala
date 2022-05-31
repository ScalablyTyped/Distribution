package typings.babylonjs

import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineUniformBufferMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Bind a specific block at a given index in a specific shader program
        * @param pipelineContext defines the pipeline context to use
        * @param blockName defines the block name
        * @param index defines the index where to bind the block
        */
      def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
      
      /**
        * Bind an uniform buffer to the current webGL context
        * @param buffer defines the buffer to bind
        */
      def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Bind a buffer to the current webGL context at a given location
        * @param buffer defines the buffer to bind
        * @param location defines the index where to bind the buffer
        */
      def bindUniformBufferBase(buffer: DataBuffer, location: Double): Unit = js.native
      
      /**
        * Create a dynamic uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Create an uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Update an existing uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param uniformBuffer defines the target uniform buffer
        * @param elements defines the content to update
        * @param offset defines the offset in the uniform buffer where update should start
        * @param count defines the size of the data to update
        */
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Unit, count: Double): Unit = js.native
    }
  }
}
