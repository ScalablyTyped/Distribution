package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFactor extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BlendFactor")
@js.native
object BlendFactor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlendFactor & String] = js.native
  
  @js.native
  sealed trait Constant
    extends StObject
       with BlendFactor
  /* "constant" */ val Constant: typings.babylonjs.webgpuConstantsMod.BlendFactor.Constant & String = js.native
  
  @js.native
  sealed trait Dst
    extends StObject
       with BlendFactor
  /* "dst" */ val Dst: typings.babylonjs.webgpuConstantsMod.BlendFactor.Dst & String = js.native
  
  @js.native
  sealed trait DstAlpha
    extends StObject
       with BlendFactor
  /* "dst-alpha" */ val DstAlpha: typings.babylonjs.webgpuConstantsMod.BlendFactor.DstAlpha & String = js.native
  
  @js.native
  sealed trait One
    extends StObject
       with BlendFactor
  /* "one" */ val One: typings.babylonjs.webgpuConstantsMod.BlendFactor.One & String = js.native
  
  @js.native
  sealed trait OneMinusConstant
    extends StObject
       with BlendFactor
  /* "one-minus-constant" */ val OneMinusConstant: typings.babylonjs.webgpuConstantsMod.BlendFactor.OneMinusConstant & String = js.native
  
  @js.native
  sealed trait OneMinusDst
    extends StObject
       with BlendFactor
  /* "one-minus-dst" */ val OneMinusDst: typings.babylonjs.webgpuConstantsMod.BlendFactor.OneMinusDst & String = js.native
  
  @js.native
  sealed trait OneMinusDstAlpha
    extends StObject
       with BlendFactor
  /* "one-minus-dst-alpha" */ val OneMinusDstAlpha: typings.babylonjs.webgpuConstantsMod.BlendFactor.OneMinusDstAlpha & String = js.native
  
  @js.native
  sealed trait OneMinusSrc
    extends StObject
       with BlendFactor
  /* "one-minus-src" */ val OneMinusSrc: typings.babylonjs.webgpuConstantsMod.BlendFactor.OneMinusSrc & String = js.native
  
  @js.native
  sealed trait OneMinusSrcAlpha
    extends StObject
       with BlendFactor
  /* "one-minus-src-alpha" */ val OneMinusSrcAlpha: typings.babylonjs.webgpuConstantsMod.BlendFactor.OneMinusSrcAlpha & String = js.native
  
  @js.native
  sealed trait Src
    extends StObject
       with BlendFactor
  /* "src" */ val Src: typings.babylonjs.webgpuConstantsMod.BlendFactor.Src & String = js.native
  
  @js.native
  sealed trait SrcAlpha
    extends StObject
       with BlendFactor
  /* "src-alpha" */ val SrcAlpha: typings.babylonjs.webgpuConstantsMod.BlendFactor.SrcAlpha & String = js.native
  
  @js.native
  sealed trait SrcAlphaSaturated
    extends StObject
       with BlendFactor
  /* "src-alpha-saturated" */ val SrcAlphaSaturated: typings.babylonjs.webgpuConstantsMod.BlendFactor.SrcAlphaSaturated & String = js.native
  
  @js.native
  sealed trait Zero
    extends StObject
       with BlendFactor
  /* "zero" */ val Zero: typings.babylonjs.webgpuConstantsMod.BlendFactor.Zero & String = js.native
}
