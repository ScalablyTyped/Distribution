package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeTarget extends js.Object {
  
  /**
    * A value that indicates whether the target version is applied to any source DB instances that have AutoMinorVersionUpgrade set to true.
    */
  var AutoUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of the database engine that a DB instance can be upgraded to.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the upgrade target database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version number of the upgrade target database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether a database engine is upgraded to a major version.
    */
  var IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
}
object UpgradeTarget {
  
  @scala.inline
  def apply(): UpgradeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeTarget]
  }
  
  @scala.inline
  implicit class UpgradeTargetOps[Self <: UpgradeTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoUpgrade(value: Boolean): Self = this.set("AutoUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpgrade: Self = this.set("AutoUpgrade", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setIsMajorVersionUpgrade(value: Boolean): Self = this.set("IsMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMajorVersionUpgrade: Self = this.set("IsMajorVersionUpgrade", js.undefined)
  }
}
