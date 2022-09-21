package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureUsage extends StObject
@JSGlobal("BABYLON.TextureUsage")
@js.native
object TextureUsage extends StObject {
  
  @js.native
  sealed trait CopyDst
    extends StObject
       with TextureUsage
  
  @js.native
  sealed trait CopySrc
    extends StObject
       with TextureUsage
  
  @js.native
  sealed trait RenderAttachment
    extends StObject
       with TextureUsage
  
  @js.native
  sealed trait StorageBinding
    extends StObject
       with TextureUsage
  
  @js.native
  sealed trait TextureBinding
    extends StObject
       with TextureUsage
}
