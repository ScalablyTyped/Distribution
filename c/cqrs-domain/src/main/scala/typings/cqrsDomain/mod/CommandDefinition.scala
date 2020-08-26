package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region Domain itself
@js.native
trait CommandDefinition extends js.Object {
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[String] = js.native
  /**
    * optional, default is 'aggregate.id'
    * if an aggregate id is not defined in the command, the command handler will create a new aggregate instance
    */
  var aggregateId: js.UndefOr[String] = js.native
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[String] = js.native
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[String] = js.native
  /**
    * optional, if defined theses values will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[String] = js.native
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * optional, but recommended
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * optional, if defined the command handler will check if the command can be handled
    * if you want the command to be handled in a secure/transactional way pass a revision value that matches the current aggregate revision
    */
  var revision: js.UndefOr[String] = js.native
  /**
    * optional, if defined the command handler will search for a handle that matches command name and version number
    */
  var version: js.UndefOr[String] = js.native
}

object CommandDefinition {
  @scala.inline
  def apply(): CommandDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandDefinition]
  }
  @scala.inline
  implicit class CommandDefinitionOps[Self <: CommandDefinition] (val x: Self) extends AnyVal {
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
    def setAggregate(value: String): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setAggregateId(value: String): Self = this.set("aggregateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateId: Self = this.set("aggregateId", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

