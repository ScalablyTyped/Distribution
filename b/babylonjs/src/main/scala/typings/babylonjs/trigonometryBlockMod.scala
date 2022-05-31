package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: Double): js.UndefOr[TrigonometryBlockOperations & Double] = js.native
    
    /** Abs */
    @js.native
    sealed trait Abs
      extends StObject
         with TrigonometryBlockOperations
    /* 2 */ val Abs: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Abs & Double = js.native
    
    /** Arc cosinus */
    @js.native
    sealed trait ArcCos
      extends StObject
         with TrigonometryBlockOperations
    /* 12 */ val ArcCos: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcCos & Double = js.native
    
    /** Arc sinus */
    @js.native
    sealed trait ArcSin
      extends StObject
         with TrigonometryBlockOperations
    /* 13 */ val ArcSin: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcSin & Double = js.native
    
    /** Arc tangent */
    @js.native
    sealed trait ArcTan
      extends StObject
         with TrigonometryBlockOperations
    /* 11 */ val ArcTan: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.ArcTan & Double = js.native
    
    /** Ceiling */
    @js.native
    sealed trait Ceiling
      extends StObject
         with TrigonometryBlockOperations
    /* 7 */ val Ceiling: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Ceiling & Double = js.native
    
    /** Cos */
    @js.native
    sealed trait Cos
      extends StObject
         with TrigonometryBlockOperations
    /* 0 */ val Cos: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Cos & Double = js.native
    
    /** To degrees (from radians) */
    @js.native
    sealed trait Degrees
      extends StObject
         with TrigonometryBlockOperations
    /* 17 */ val Degrees: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Degrees & Double = js.native
    
    /** Exp */
    @js.native
    sealed trait Exp
      extends StObject
         with TrigonometryBlockOperations
    /* 3 */ val Exp: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Exp & Double = js.native
    
    /** Exp2 */
    @js.native
    sealed trait Exp2
      extends StObject
         with TrigonometryBlockOperations
    /* 4 */ val Exp2: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Exp2 & Double = js.native
    
    /** Floor */
    @js.native
    sealed trait Floor
      extends StObject
         with TrigonometryBlockOperations
    /* 6 */ val Floor: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Floor & Double = js.native
    
    /** Fraction */
    @js.native
    sealed trait Fract
      extends StObject
         with TrigonometryBlockOperations
    /* 14 */ val Fract: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Fract & Double = js.native
    
    /** Log */
    @js.native
    sealed trait Log
      extends StObject
         with TrigonometryBlockOperations
    /* 9 */ val Log: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Log & Double = js.native
    
    /** To radians (from degrees) */
    @js.native
    sealed trait Radians
      extends StObject
         with TrigonometryBlockOperations
    /* 16 */ val Radians: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Radians & Double = js.native
    
    /** Round */
    @js.native
    sealed trait Round
      extends StObject
         with TrigonometryBlockOperations
    /* 5 */ val Round: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Round & Double = js.native
    
    /** Sign */
    @js.native
    sealed trait Sign
      extends StObject
         with TrigonometryBlockOperations
    /* 15 */ val Sign: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sign & Double = js.native
    
    /** Sin */
    @js.native
    sealed trait Sin
      extends StObject
         with TrigonometryBlockOperations
    /* 1 */ val Sin: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sin & Double = js.native
    
    /** Square root */
    @js.native
    sealed trait Sqrt
      extends StObject
         with TrigonometryBlockOperations
    /* 8 */ val Sqrt: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Sqrt & Double = js.native
    
    /** Tangent */
    @js.native
    sealed trait Tan
      extends StObject
         with TrigonometryBlockOperations
    /* 10 */ val Tan: typings.babylonjs.trigonometryBlockMod.TrigonometryBlockOperations.Tan & Double = js.native
  }
}
