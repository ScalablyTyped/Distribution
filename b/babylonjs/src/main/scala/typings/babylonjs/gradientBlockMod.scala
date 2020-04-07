package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/gradientBlock", JSImport.Namespace)
@js.native
object gradientBlockMod extends js.Object {
  @js.native
  class GradientBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new GradientBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    var _writeColorConstant: js.Any = js.native
    /**
      * Gets or sets the list of color steps
      */
    var colorSteps: js.Array[GradientBlockColorStep] = js.native
    /**
      * Gets the gradient input component
      */
    def gradient(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output(): NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  class GradientBlockColorStep protected () extends js.Object {
    /**
      * Creates a new GradientBlockColorStep
      * @param step defines a value indicating which step this color is associated with (between 0 and 1)
      * @param color defines the color associated with this step
      */
    def this(
      /**
      * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
      */
    step: Double,
      /**
      * Gets or sets the color associated with this step
      */
    color: Color3
    ) = this()
    /**
      * Gets or sets the color associated with this step
      */
    var color: Color3 = js.native
    /**
      * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
      */
    var step: Double = js.native
  }
  
}

