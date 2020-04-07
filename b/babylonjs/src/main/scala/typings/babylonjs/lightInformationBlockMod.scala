package typings.babylonjs

import typings.babylonjs.lightMod.Light
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Vertex/lightInformationBlock", JSImport.Namespace)
@js.native
object lightInformationBlockMod extends js.Object {
  @js.native
  class LightInformationBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new LightInformationBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    var _lightColorUniformName: js.Any = js.native
    var _lightDataUniformName: js.Any = js.native
    var _lightTypeDefineName: js.Any = js.native
    /**
      * Gets or sets the light associated with this block
      */
    var light: Nullable[Light] = js.native
    /**
      * Gets the direction output component
      */
    def color(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the direction output component
      */
    def direction(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the direction output component
      */
    def intensity(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the world position input component
      */
    def worldPosition(): NodeMaterialConnectionPoint = js.native
  }
  
}

