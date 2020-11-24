package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/waveBlock", JSImport.Namespace)
@js.native
object waveBlockMod extends js.Object {
  
  @js.native
  class WaveBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new WaveBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the kibnd of wave to be applied by the block
      */
    var kind: WaveBlockKind = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  sealed trait WaveBlockKind extends js.Object
  @js.native
  object WaveBlockKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WaveBlockKind with Double] = js.native
    
    /** SawTooth */
    @js.native
    sealed trait SawTooth extends WaveBlockKind
    /* 0 */ @js.native
    object SawTooth extends TopLevel[SawTooth with Double]
    
    /** Square */
    @js.native
    sealed trait Square extends WaveBlockKind
    /* 1 */ @js.native
    object Square extends TopLevel[Square with Double]
    
    /** Triangle */
    @js.native
    sealed trait Triangle extends WaveBlockKind
    /* 2 */ @js.native
    object Triangle extends TopLevel[Triangle with Double]
  }
}
