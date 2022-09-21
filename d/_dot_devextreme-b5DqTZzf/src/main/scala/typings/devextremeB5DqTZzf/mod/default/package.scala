package typings.devextremeB5DqTZzf.mod.default

import org.scalablytyped.runtime.StringDictionary
import typings.devextremeB5DqTZzf.anon.Compile
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent.Properties
import typings.devextremeB5DqTZzf.mod.DevExpress.core.ComponentFactory
import typings.devextremeB5DqTZzf.mod.DevExpress.globalConfig
import typings.devextremeB5DqTZzf.mod.default.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def config(): globalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[globalConfig]
inline def config(config: globalConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def devices: typings.devextremeB5DqTZzf.mod.DevExpress.DevicesObject = ^.asInstanceOf[js.Dynamic].selectDynamic("devices").asInstanceOf[typings.devextremeB5DqTZzf.mod.DevExpress.DevicesObject]

inline def hideTopOverlay(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTopOverlay")().asInstanceOf[Boolean]

inline def registerComponent[TComponent](name: String, componentClass: ComponentFactory[TComponent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerComponent[TComponent](
  name: String,
  namespace: StringDictionary[
  ComponentFactory[typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent[Properties]]
],
  componentClass: ComponentFactory[TComponent]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTemplateEngine(templateEngineName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setTemplateEngine(templateEngineOptions: Compile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
