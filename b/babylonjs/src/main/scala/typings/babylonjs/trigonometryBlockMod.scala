package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trigonometryBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/trigonometryBlock", "TrigonometryBlock")
  @js.native
  class TrigonometryBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new TrigonometryBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the operation applied by the block
      */
    var operation: TrigonometryBlockOperations = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  sealed trait TrigonometryBlockOperations extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/trigonometryBlock", "TrigonometryBlockOperations")
  @js.native
  object TrigonometryBlockOperations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TrigonometryBlockOperations with Double] = js.native
    
    /** Abs */
    @js.native
    sealed trait Abs extends TrigonometryBlockOperations
    /* 2 */ val Abs: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Abs with Double = js.native
    
    /** Arc cosinus */
    @js.native
    sealed trait ArcCos extends TrigonometryBlockOperations
    /* 12 */ val ArcCos: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcCos with Double = js.native
    
    /** Arc sinus */
    @js.native
    sealed trait ArcSin extends TrigonometryBlockOperations
    /* 13 */ val ArcSin: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcSin with Double = js.native
    
    /** Arc tangent */
    @js.native
    sealed trait ArcTan extends TrigonometryBlockOperations
    /* 11 */ val ArcTan: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcTan with Double = js.native
    
    /** Ceiling */
    @js.native
    sealed trait Ceiling extends TrigonometryBlockOperations
    /* 7 */ val Ceiling: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Ceiling with Double = js.native
    
    /** Cos */
    @js.native
    sealed trait Cos extends TrigonometryBlockOperations
    /* 0 */ val Cos: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Cos with Double = js.native
    
    /** To degrees (from radians) */
    @js.native
    sealed trait Degrees extends TrigonometryBlockOperations
    /* 17 */ val Degrees: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Degrees with Double = js.native
    
    /** Exp */
    @js.native
    sealed trait Exp extends TrigonometryBlockOperations
    /* 3 */ val Exp: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Exp with Double = js.native
    
    /** Exp2 */
    @js.native
    sealed trait Exp2 extends TrigonometryBlockOperations
    /* 4 */ val Exp2: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Exp2 with Double = js.native
    
    /** Floor */
    @js.native
    sealed trait Floor extends TrigonometryBlockOperations
    /* 6 */ val Floor: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Floor with Double = js.native
    
    /** Fraction */
    @js.native
    sealed trait Fract extends TrigonometryBlockOperations
    /* 14 */ val Fract: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Fract with Double = js.native
    
    /** Log */
    @js.native
    sealed trait Log extends TrigonometryBlockOperations
    /* 9 */ val Log: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Log with Double = js.native
    
    /** To radians (from degrees) */
    @js.native
    sealed trait Radians extends TrigonometryBlockOperations
    /* 16 */ val Radians: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Radians with Double = js.native
    
    /** Round */
    @js.native
    sealed trait Round extends TrigonometryBlockOperations
    /* 5 */ val Round: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Round with Double = js.native
    
    /** Sign */
    @js.native
    sealed trait Sign extends TrigonometryBlockOperations
    /* 15 */ val Sign: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sign with Double = js.native
    
    /** Sin */
    @js.native
    sealed trait Sin extends TrigonometryBlockOperations
    /* 1 */ val Sin: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sin with Double = js.native
    
    /** Square root */
    @js.native
    sealed trait Sqrt extends TrigonometryBlockOperations
    /* 8 */ val Sqrt: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sqrt with Double = js.native
    
    /** Tangent */
    @js.native
    sealed trait Tan extends TrigonometryBlockOperations
    /* 10 */ val Tan: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Tan with Double = js.native
  }
}
