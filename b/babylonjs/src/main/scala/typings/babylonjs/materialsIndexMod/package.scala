package typings.babylonjs.materialsIndexMod

import typings.babylonjs.materialsIndexMod.^
import typings.babylonjs.materialsMaterialPluginManagerMod.PluginMaterialFactory
import typings.babylonjs.materialsNodeNodeMaterialDecoratorMod.IEditablePropertyOption
import typings.babylonjs.miscInterfacesIClipPlanesHolderMod.IClipPlanesHolder
import typings.babylonjs.typesMod.Nullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def RegisterMaterialPlugin(pluginName: String, factory: PluginMaterialFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterMaterialPlugin")(pluginName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UnregisterAllMaterialPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterAllMaterialPlugins")().asInstanceOf[Unit]

inline def UnregisterMaterialPlugin(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterMaterialPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def addClipPlaneUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClipPlaneUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def bindClipPlane(
  effect: typings.babylonjs.materialsEffectMod.Effect,
  primaryHolder: IClipPlanesHolder,
  secondaryHolder: IClipPlanesHolder
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindClipPlane")(effect.asInstanceOf[js.Any], primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createDetailMapPlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetailMapPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRAnisotropicPlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRAnisotropicPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRBRDFPlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRBRDFPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRClearCoatPlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRClearCoatPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRIridescencePlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRIridescencePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRSheenPlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSheenPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRSubSurfacePlugin(material: typings.babylonjs.materialsMaterialMod.Material): Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSubSurfacePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def editableInPropertyPage(displayName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: Unit, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: String
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: String,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: Unit,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]

inline def prepareDefinesForClipPlanes(primaryHolder: IClipPlanesHolder, secondaryHolder: IClipPlanesHolder, defines: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareDefinesForClipPlanes")(primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def prepareStringDefinesForClipPlanes(primaryHolder: IClipPlanesHolder, secondaryHolder: IClipPlanesHolder, defines: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStringDefinesForClipPlanes")(primaryHolder.asInstanceOf[js.Any], secondaryHolder.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
