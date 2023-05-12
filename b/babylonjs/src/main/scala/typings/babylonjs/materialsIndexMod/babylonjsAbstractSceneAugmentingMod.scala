package typings.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures
      */
    var proceduralTextures: js.Array[
        typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
      ]
  }
  object AbstractScene {
    
    inline def apply(
      proceduralTextures: js.Array[
          typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
        ]
    ): AbstractScene = {
      val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractScene]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
      
      inline def setProceduralTextures(
        value: js.Array[
              typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
            ]
      ): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      inline def setProceduralTexturesVarargs(value: typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
    }
  }
}
