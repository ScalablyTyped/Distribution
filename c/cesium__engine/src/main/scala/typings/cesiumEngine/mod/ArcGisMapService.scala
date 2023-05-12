package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcGisMapService {
  
  @JSImport("@cesium/engine", "ArcGisMapService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the default ArcGIS access token.
    */
  @JSImport("@cesium/engine", "ArcGisMapService.defaultAccessToken")
  @js.native
  def defaultAccessToken: String = js.native
  inline def defaultAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAccessToken")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the URL of the ArcGIS World Hillshade tile service.
    */
  @JSImport("@cesium/engine", "ArcGisMapService.defaultWorldHillshadeServer")
  @js.native
  def defaultWorldHillshadeServer: String | Resource = js.native
  inline def defaultWorldHillshadeServer_=(x: String | Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultWorldHillshadeServer")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the URL of the ArcGIS World Imagery tile service.
    */
  @JSImport("@cesium/engine", "ArcGisMapService.defaultWorldImageryServer")
  @js.native
  def defaultWorldImageryServer: String | Resource = js.native
  inline def defaultWorldImageryServer_=(x: String | Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultWorldImageryServer")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the URL of the ArcGIS World Oceans tile service.
    */
  @JSImport("@cesium/engine", "ArcGisMapService.defaultWorldOceanServer")
  @js.native
  def defaultWorldOceanServer: String | Resource = js.native
  inline def defaultWorldOceanServer_=(x: String | Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultWorldOceanServer")(x.asInstanceOf[js.Any])
  
  inline def getDefaultTokenCredit(providedKey: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTokenCredit")(providedKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
