package typings.babylonjs

import typings.babylonjs.materialMod.Material
import typings.babylonjs.materialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialPluginFactoryExportMod {
  
  @JSImport("babylonjs/Materials/materialPluginFactoryExport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDetailMapPlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetailMapPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRAnisotropicPlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRAnisotropicPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRBRDFPlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRBRDFPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRClearCoatPlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRClearCoatPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRIridescencePlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRIridescencePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRSheenPlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSheenPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
  
  inline def createPBRSubSurfacePlugin(material: Material): Nullable[MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSubSurfacePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[MaterialPluginBase]]
}
