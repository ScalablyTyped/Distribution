package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IModuleOptions
import typings.bingmaps.Microsoft.Maps.IStyleUrl
import typings.bingmaps.global.Microsoft.Maps.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Credentials: String = ^.asInstanceOf[js.Dynamic].selectDynamic("Credentials").asInstanceOf[String]
inline def Credentials_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(x.asInstanceOf[js.Any])

inline def getIsBirdseyeAvailable(
  loc: typings.bingmaps.Microsoft.Maps.Location,
  heading: Double,
  callback: js.Function1[/* isAvailable */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsBirdseyeAvailable")(loc.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def getIsBirdseyeAvailable(
  loc: typings.bingmaps.Microsoft.Maps.Location,
  heading: typings.bingmaps.Microsoft.Maps.Heading,
  callback: js.Function1[/* isAvailable */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsBirdseyeAvailable")(loc.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadModule(moduleName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loadModule(moduleName: String, options: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadModule(moduleName: String, options: IModuleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadModule(moduleName: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loadModule(moduleName: js.Array[String], options: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadModule(moduleName: js.Array[String], options: IModuleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def moduleLoaded(moduleName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleLoaded")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerModule(moduleName: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(moduleName.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerModule(moduleName: String, url: String, styles: IStyleUrl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(moduleName.asInstanceOf[js.Any], url.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
