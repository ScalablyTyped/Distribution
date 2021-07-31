package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Credentials: java.lang.String = typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].selectDynamic("Credentials").asInstanceOf[java.lang.String]
@scala.inline
def Credentials_=(x: java.lang.String): scala.Unit = typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(x.asInstanceOf[js.Any])

@scala.inline
def getIsBirdseyeAvailable(
  loc: typings.bingmaps.Microsoft.Maps.Location,
  heading: scala.Double,
  callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]
): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("getIsBirdseyeAvailable")(loc.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def getIsBirdseyeAvailable(
  loc: typings.bingmaps.Microsoft.Maps.Location,
  heading: typings.bingmaps.Microsoft.Maps.Heading,
  callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]
): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("getIsBirdseyeAvailable")(loc.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def loadModule(moduleName: java.lang.String): scala.Unit = typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def loadModule(moduleName: java.lang.String, options: js.Function0[scala.Unit]): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadModule(moduleName: java.lang.String, options: typings.bingmaps.Microsoft.Maps.IModuleOptions): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadModule(moduleName: js.Array[java.lang.String]): scala.Unit = typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def loadModule(moduleName: js.Array[java.lang.String], options: js.Function0[scala.Unit]): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadModule(moduleName: js.Array[java.lang.String], options: typings.bingmaps.Microsoft.Maps.IModuleOptions): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def moduleLoaded(moduleName: java.lang.String): scala.Unit = typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("moduleLoaded")(moduleName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def registerModule(moduleName: java.lang.String, url: java.lang.String): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(moduleName.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def registerModule(
  moduleName: java.lang.String,
  url: java.lang.String,
  styles: typings.bingmaps.Microsoft.Maps.IStyleUrl
): scala.Unit = (typings.bingmaps.global.Microsoft.Maps.^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(moduleName.asInstanceOf[js.Any], url.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
