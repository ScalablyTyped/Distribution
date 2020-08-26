package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  /**
    * The component that will be subject to logging.
    */
  var Component: LoggerComponent = js.native
  /**
    * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
  /**
    * The level of the logs.
    */
  var Level: LoggerLevel = js.native
  /**
    * The amount of file space, in KB, to use if the local file system is used for logging purposes.
    */
  var Space: js.UndefOr[integer] = js.native
  /**
    * The type of log output which will be used.
    */
  var Type: LoggerType = js.native
}

object Logger {
  @scala.inline
  def apply(Component: LoggerComponent, Id: string, Level: LoggerLevel, Type: LoggerType): Logger = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setComponent(value: LoggerComponent): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: LoggerLevel): Self = this.set("Level", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LoggerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: integer): Self = this.set("Space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("Space", js.undefined)
  }
  
}

