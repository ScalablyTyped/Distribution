package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.miscInterfacesIClipPlanesHolderMod.IClipPlanesHolder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsClipPlaneMaterialHelperMod {
  
  @JSImport("babylonjs/Materials/clipPlaneMaterialHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClipPlaneUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClipPlaneUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def bindClipPlane(effect: Effect, primaryHolder: IClipPlanesHolder, secondaryHolder: IClipPlanesHolder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindClipPlane")(effect.asInstanceOf[js.Any], primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prepareDefinesForClipPlanes(primaryHolder: IClipPlanesHolder, secondaryHolder: IClipPlanesHolder, defines: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareDefinesForClipPlanes")(primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def prepareStringDefinesForClipPlanes(primaryHolder: IClipPlanesHolder, secondaryHolder: IClipPlanesHolder, defines: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStringDefinesForClipPlanes")(primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
