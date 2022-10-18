package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksTrigonometryBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/trigonometryBlock", "TrigonometryBlock")
  @js.native
  open class TrigonometryBlock protected () extends NodeMaterialBlock {
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
    /* 2 */ val Abs: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Abs & Double = js.native
    
    /** Arc cosinus */
    @js.native
    sealed trait ArcCos
      extends StObject
         with TrigonometryBlockOperations
    /* 12 */ val ArcCos: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.ArcCos & Double = js.native
    
    /** Arc sinus */
    @js.native
    sealed trait ArcSin
      extends StObject
         with TrigonometryBlockOperations
    /* 13 */ val ArcSin: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.ArcSin & Double = js.native
    
    /** Arc tangent */
    @js.native
    sealed trait ArcTan
      extends StObject
         with TrigonometryBlockOperations
    /* 11 */ val ArcTan: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.ArcTan & Double = js.native
    
    /** Ceiling */
    @js.native
    sealed trait Ceiling
      extends StObject
         with TrigonometryBlockOperations
    /* 7 */ val Ceiling: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Ceiling & Double = js.native
    
    /** Cos */
    @js.native
    sealed trait Cos
      extends StObject
         with TrigonometryBlockOperations
    /* 0 */ val Cos: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Cos & Double = js.native
    
    /** To degrees (from radians) */
    @js.native
    sealed trait Degrees
      extends StObject
         with TrigonometryBlockOperations
    /* 17 */ val Degrees: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Degrees & Double = js.native
    
    /** Exp */
    @js.native
    sealed trait Exp
      extends StObject
         with TrigonometryBlockOperations
    /* 3 */ val Exp: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Exp & Double = js.native
    
    /** Exp2 */
    @js.native
    sealed trait Exp2
      extends StObject
         with TrigonometryBlockOperations
    /* 4 */ val Exp2: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Exp2 & Double = js.native
    
    /** Floor */
    @js.native
    sealed trait Floor
      extends StObject
         with TrigonometryBlockOperations
    /* 6 */ val Floor: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Floor & Double = js.native
    
    /** Fraction */
    @js.native
    sealed trait Fract
      extends StObject
         with TrigonometryBlockOperations
    /* 14 */ val Fract: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Fract & Double = js.native
    
    /** Log */
    @js.native
    sealed trait Log
      extends StObject
         with TrigonometryBlockOperations
    /* 9 */ val Log: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Log & Double = js.native
    
    /** To radians (from degrees) */
    @js.native
    sealed trait Radians
      extends StObject
         with TrigonometryBlockOperations
    /* 16 */ val Radians: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Radians & Double = js.native
    
    /** Round */
    @js.native
    sealed trait Round
      extends StObject
         with TrigonometryBlockOperations
    /* 5 */ val Round: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Round & Double = js.native
    
    /** Sign */
    @js.native
    sealed trait Sign
      extends StObject
         with TrigonometryBlockOperations
    /* 15 */ val Sign: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Sign & Double = js.native
    
    /** Sin */
    @js.native
    sealed trait Sin
      extends StObject
         with TrigonometryBlockOperations
    /* 1 */ val Sin: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Sin & Double = js.native
    
    /** Square root */
    @js.native
    sealed trait Sqrt
      extends StObject
         with TrigonometryBlockOperations
    /* 8 */ val Sqrt: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Sqrt & Double = js.native
    
    /** Tangent */
    @js.native
    sealed trait Tan
      extends StObject
         with TrigonometryBlockOperations
    /* 10 */ val Tan: typings.babylonjs.materialsNodeBlocksTrigonometryBlockMod.TrigonometryBlockOperations.Tan & Double = js.native
  }
}
