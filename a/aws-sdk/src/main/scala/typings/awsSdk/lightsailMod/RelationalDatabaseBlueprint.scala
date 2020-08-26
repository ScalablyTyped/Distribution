package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseBlueprint extends js.Object {
  /**
    * The ID for the database blueprint.
    */
  var blueprintId: js.UndefOr[String] = js.native
  /**
    * The database software of the database blueprint (for example, MySQL).
    */
  var engine: js.UndefOr[RelationalDatabaseEngine] = js.native
  /**
    * The description of the database engine for the database blueprint.
    */
  var engineDescription: js.UndefOr[String] = js.native
  /**
    * The database engine version for the database blueprint (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version for the database blueprint.
    */
  var engineVersionDescription: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the engine version is the default for the database blueprint.
    */
  var isEngineDefault: js.UndefOr[Boolean] = js.native
}

object RelationalDatabaseBlueprint {
  @scala.inline
  def apply(): RelationalDatabaseBlueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBlueprint]
  }
  @scala.inline
  implicit class RelationalDatabaseBlueprintOps[Self <: RelationalDatabaseBlueprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlueprintId(value: String): Self = this.set("blueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintId: Self = this.set("blueprintId", js.undefined)
    @scala.inline
    def setEngine(value: RelationalDatabaseEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineDescription(value: String): Self = this.set("engineDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineDescription: Self = this.set("engineDescription", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setEngineVersionDescription(value: String): Self = this.set("engineVersionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersionDescription: Self = this.set("engineVersionDescription", js.undefined)
    @scala.inline
    def setIsEngineDefault(value: Boolean): Self = this.set("isEngineDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEngineDefault: Self = this.set("isEngineDefault", js.undefined)
  }
  
}

