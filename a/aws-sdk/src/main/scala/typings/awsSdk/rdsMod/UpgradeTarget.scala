package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AutoUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    Description: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    IsMajorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  ): UpgradeTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoUpgrade)) __obj.updateDynamic("AutoUpgrade")(AutoUpgrade.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IsMajorVersionUpgrade)) __obj.updateDynamic("IsMajorVersionUpgrade")(IsMajorVersionUpgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeTarget]
  }
}

