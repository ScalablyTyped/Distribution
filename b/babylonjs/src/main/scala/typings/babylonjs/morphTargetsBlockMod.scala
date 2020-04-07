package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Vertex/morphTargetsBlock", JSImport.Namespace)
@js.native
object morphTargetsBlockMod extends js.Object {
  @js.native
  class MorphTargetsBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new MorphTargetsBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    var _repeatableContentAnchor: js.Any = js.native
    /**
      * Gets the normal input component
      */
    def normal(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the normal output component
      */
    def normalOutput(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the position input component
      */
    def position(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the position output component
      */
    def positionOutput(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the tangent input component
      */
    def tangent(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the tangent output component
      */
    def tangentOutput(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the tangent input component
      */
    def uv(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the tangent output component
      */
    def uvOutput(): NodeMaterialConnectionPoint = js.native
  }
  
}

