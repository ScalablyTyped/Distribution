package typings.babylonjs.materialsTexturesKtx2decoderTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceTextureFormat extends StObject
@JSImport("babylonjs/Materials/Textures/ktx2decoderTypes", "SourceTextureFormat")
@js.native
object SourceTextureFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceTextureFormat & Double] = js.native
  
  @js.native
  sealed trait ETC1S
    extends StObject
       with SourceTextureFormat
  /* 0 */ val ETC1S: typings.babylonjs.materialsTexturesKtx2decoderTypesMod.SourceTextureFormat.ETC1S & Double = js.native
  
  @js.native
  sealed trait UASTC4x4
    extends StObject
       with SourceTextureFormat
  /* 1 */ val UASTC4x4: typings.babylonjs.materialsTexturesKtx2decoderTypesMod.SourceTextureFormat.UASTC4x4 & Double = js.native
}
