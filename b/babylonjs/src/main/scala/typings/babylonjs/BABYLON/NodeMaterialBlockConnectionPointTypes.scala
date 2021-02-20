package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeMaterialBlockConnectionPointTypes extends StObject
@JSGlobal("BABYLON.NodeMaterialBlockConnectionPointTypes")
@js.native
object NodeMaterialBlockConnectionPointTypes extends StObject {
  
  /** Detect type based on connection */
  @js.native
  sealed trait AutoDetect extends NodeMaterialBlockConnectionPointTypes
  
  /** Output type that will be defined by input type */
  @js.native
  sealed trait BasedOnInput extends NodeMaterialBlockConnectionPointTypes
  
  /** Color3 */
  @js.native
  sealed trait Color3 extends NodeMaterialBlockConnectionPointTypes
  
  /** Color4 */
  @js.native
  sealed trait Color4 extends NodeMaterialBlockConnectionPointTypes
  
  /** Float */
  @js.native
  sealed trait Float extends NodeMaterialBlockConnectionPointTypes
  
  /** Int */
  @js.native
  sealed trait Int extends NodeMaterialBlockConnectionPointTypes
  
  /** Matrix */
  @js.native
  sealed trait Matrix extends NodeMaterialBlockConnectionPointTypes
  
  /** Custom object */
  @js.native
  sealed trait Object extends NodeMaterialBlockConnectionPointTypes
  
  /** Vector2 */
  @js.native
  sealed trait Vector2 extends NodeMaterialBlockConnectionPointTypes
  
  /** Vector3 */
  @js.native
  sealed trait Vector3 extends NodeMaterialBlockConnectionPointTypes
  
  /** Vector4 */
  @js.native
  sealed trait Vector4 extends NodeMaterialBlockConnectionPointTypes
}
