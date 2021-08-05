package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeTarget extends StObject {
  
  /**
    * A value that indicates whether the target version is applied to any source DB instances that have AutoMinorVersionUpgrade set to true.
    */
  var AutoUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the database engine that a DB instance can be upgraded to.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the upgrade target database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the upgrade target database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether a database engine is upgraded to a major version.
    */
  var IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
}
object UpgradeTarget {
  
  inline def apply(): UpgradeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeTarget]
  }
  
  extension [Self <: UpgradeTarget](x: Self) {
    
    inline def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "AutoUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoUpgradeUndefined: Self = StObject.set(x, "AutoUpgrade", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIsMajorVersionUpgrade(value: Boolean): Self = StObject.set(x, "IsMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setIsMajorVersionUpgradeUndefined: Self = StObject.set(x, "IsMajorVersionUpgrade", js.undefined)
  }
}
