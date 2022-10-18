package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksConditionalBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/conditionalBlock", "ConditionalBlock")
  @js.native
  open class ConditionalBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ConditionalBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the first operand component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second operand component
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the condition applied by the block
      */
    var condition: ConditionalBlockConditions = js.native
    
    /**
      * Gets the value to return if condition is false
      */
    def `false`: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value to return if condition is true
      */
    def `true`: NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  sealed trait ConditionalBlockConditions extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/conditionalBlock", "ConditionalBlockConditions")
  @js.native
  object ConditionalBlockConditions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConditionalBlockConditions & Double] = js.native
    
    /** Logical And */
    @js.native
    sealed trait And
      extends StObject
         with ConditionalBlockConditions
    /* 8 */ val And: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.And & Double = js.native
    
    /** Equal */
    @js.native
    sealed trait Equal
      extends StObject
         with ConditionalBlockConditions
    /* 0 */ val Equal: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.Equal & Double = js.native
    
    /** GreaterOrEqual */
    @js.native
    sealed trait GreaterOrEqual
      extends StObject
         with ConditionalBlockConditions
    /* 5 */ val GreaterOrEqual: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.GreaterOrEqual & Double = js.native
    
    /** GreaterThan */
    @js.native
    sealed trait GreaterThan
      extends StObject
         with ConditionalBlockConditions
    /* 3 */ val GreaterThan: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.GreaterThan & Double = js.native
    
    /** LessOrEqual */
    @js.native
    sealed trait LessOrEqual
      extends StObject
         with ConditionalBlockConditions
    /* 4 */ val LessOrEqual: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.LessOrEqual & Double = js.native
    
    /** LessThan */
    @js.native
    sealed trait LessThan
      extends StObject
         with ConditionalBlockConditions
    /* 2 */ val LessThan: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.LessThan & Double = js.native
    
    /** NotEqual */
    @js.native
    sealed trait NotEqual
      extends StObject
         with ConditionalBlockConditions
    /* 1 */ val NotEqual: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.NotEqual & Double = js.native
    
    /** Logical Or */
    @js.native
    sealed trait Or
      extends StObject
         with ConditionalBlockConditions
    /* 7 */ val Or: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.Or & Double = js.native
    
    /** Logical Exclusive OR */
    @js.native
    sealed trait Xor
      extends StObject
         with ConditionalBlockConditions
    /* 6 */ val Xor: typings.babylonjs.materialsNodeBlocksConditionalBlockMod.ConditionalBlockConditions.Xor & Double = js.native
  }
}
