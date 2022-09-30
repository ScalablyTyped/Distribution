package typings.catalog.mod

import typings.catalog.anon.Default
import typings.catalog.mod.^
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DefaultResponsiveSizes: js.Array[ConfigResponsiveSize] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultResponsiveSizes").asInstanceOf[js.Array[ConfigResponsiveSize]]

inline def DefaultTheme: Theme = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultTheme").asInstanceOf[Theme]

inline def configure(config: Config): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def configureJSXRoutes(config: Config): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configureJSXRoutes")(config.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def configureRoutes(config: Config): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRoutes")(config.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def markdown(strings: TemplateStringsArray, interpolations: Any*): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]

inline def pageLoader(f: String): ComponentType[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("pageLoader")(f.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Object]]
inline def pageLoader(f: js.Function0[js.Promise[ComponentType[js.Object] | Default]]): ComponentType[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("pageLoader")(f.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Object]]

inline def render(config: Config, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(config.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
