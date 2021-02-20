package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waveBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/waveBlock", "WaveBlock")
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
  sealed trait WaveBlockKind extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/waveBlock", "WaveBlockKind")
  @js.native
  object WaveBlockKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WaveBlockKind with Double] = js.native
    
    /** SawTooth */
    @js.native
    sealed trait SawTooth extends WaveBlockKind
    /* 0 */ val SawTooth: typings.babylonjs.waveBlockMod.WaveBlockKind.SawTooth with Double = js.native
    
    /** Square */
    @js.native
    sealed trait Square extends WaveBlockKind
    /* 1 */ val Square: typings.babylonjs.waveBlockMod.WaveBlockKind.Square with Double = js.native
    
    /** Triangle */
    @js.native
    sealed trait Triangle extends WaveBlockKind
    /* 2 */ val Triangle: typings.babylonjs.waveBlockMod.WaveBlockKind.Triangle with Double = js.native
  }
}
